/*
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
var showControllersOnly = false;
var seriesFilter = "";
var filtersOnlySampleSeries = true;

/*
 * Add header in statistics table to group metrics by category
 * format
 *
 */
function summaryTableHeader(header) {
    var newRow = header.insertRow(-1);
    newRow.className = "tablesorter-no-sort";
    var cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Requests";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 3;
    cell.innerHTML = "Executions";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 7;
    cell.innerHTML = "Response Times (ms)";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Throughput";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 2;
    cell.innerHTML = "Network (KB/sec)";
    newRow.appendChild(cell);
}

/*
 * Populates the table identified by id parameter with the specified data and
 * format
 *
 */
function createTable(table, info, formatter, defaultSorts, seriesIndex, headerCreator) {
    var tableRef = table[0];

    // Create header and populate it with data.titles array
    var header = tableRef.createTHead();

    // Call callback is available
    if(headerCreator) {
        headerCreator(header);
    }

    var newRow = header.insertRow(-1);
    for (var index = 0; index < info.titles.length; index++) {
        var cell = document.createElement('th');
        cell.innerHTML = info.titles[index];
        newRow.appendChild(cell);
    }

    var tBody;

    // Create overall body if defined
    if(info.overall){
        tBody = document.createElement('tbody');
        tBody.className = "tablesorter-no-sort";
        tableRef.appendChild(tBody);
        var newRow = tBody.insertRow(-1);
        var data = info.overall.data;
        for(var index=0;index < data.length; index++){
            var cell = newRow.insertCell(-1);
            cell.innerHTML = formatter ? formatter(index, data[index]): data[index];
        }
    }

    // Create regular body
    tBody = document.createElement('tbody');
    tableRef.appendChild(tBody);

    var regexp;
    if(seriesFilter) {
        regexp = new RegExp(seriesFilter, 'i');
    }
    // Populate body with data.items array
    for(var index=0; index < info.items.length; index++){
        var item = info.items[index];
        if((!regexp || filtersOnlySampleSeries && !info.supportsControllersDiscrimination || regexp.test(item.data[seriesIndex]))
                &&
                (!showControllersOnly || !info.supportsControllersDiscrimination || item.isController)){
            if(item.data.length > 0) {
                var newRow = tBody.insertRow(-1);
                for(var col=0; col < item.data.length; col++){
                    var cell = newRow.insertCell(-1);
                    cell.innerHTML = formatter ? formatter(col, item.data[col]) : item.data[col];
                }
            }
        }
    }

    // Add support of columns sort
    table.tablesorter({sortList : defaultSorts});
}

$(document).ready(function() {

    // Customize table sorter default options
    $.extend( $.tablesorter.defaults, {
        theme: 'blue',
        cssInfoBlock: "tablesorter-no-sort",
        widthFixed: true,
        widgets: ['zebra']
    });

    var data = {"OkPercent": 100.0, "KoPercent": 0.0};
    var dataset = [
        {
            "label" : "FAIL",
            "data" : data.KoPercent,
            "color" : "#FF6347"
        },
        {
            "label" : "PASS",
            "data" : data.OkPercent,
            "color" : "#9ACD32"
        }];
    $.plot($("#flot-requests-summary"), dataset, {
        series : {
            pie : {
                show : true,
                radius : 1,
                label : {
                    show : true,
                    radius : 3 / 4,
                    formatter : function(label, series) {
                        return '<div style="font-size:8pt;text-align:center;padding:2px;color:white;">'
                            + label
                            + '<br/>'
                            + Math.round10(series.percent, -2)
                            + '%</div>';
                    },
                    background : {
                        opacity : 0.5,
                        color : '#000'
                    }
                }
            }
        },
        legend : {
            show : true
        }
    });

    // Creates APDEX table
    createTable($("#apdexTable"), {"supportsControllersDiscrimination": true, "overall": {"data": [0.9683823529411765, 500, 1500, "Total"], "isController": false}, "titles": ["Apdex", "T (Toleration threshold)", "F (Frustration threshold)", "Label"], "items": [{"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/master/district"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7-0"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/ulb/get?id="], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7-1"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7-1"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/ddo/treasury"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf-1"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7-0"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf-0"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/menu/by-module"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/ulb/get?id=2"], "isController": false}, {"data": [0.4875, 500, 1500, "Test"], "isController": true}, {"data": [0.975, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/employee/attendance/count-daily"], "isController": false}, {"data": [1.0, 500, 1500, "https://test.aadrikainfomedia.com/auth/api/hrms/v1/ddo/get?treasury=Ranchi"], "isController": false}]}, function(index, item){
        switch(index){
            case 0:
                item = item.toFixed(3);
                break;
            case 1:
            case 2:
                item = formatDuration(item);
                break;
        }
        return item;
    }, [[0, 0]], 3);

    // Create statistics table
    createTable($("#statisticsTable"), {"supportsControllersDiscrimination": true, "overall": {"data": ["Total", 640, 0, 0.0, 77.96250000000016, 21, 627, 71.0, 133.89999999999998, 159.0, 194.0, 51.40975178729215, 88.74018495461483, 34.66643907141136], "isController": false}, "titles": ["Label", "#Samples", "FAIL", "Error %", "Average", "Min", "Max", "Median", "90th pct", "95th pct", "99th pct", "Transactions/s", "Received", "Sent"], "items": [{"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf", 40, 0, 0.0, 71.50000000000001, 52, 125, 70.0, 88.5, 107.94999999999999, 125.0, 4.844961240310077, 20.59581667877907, 5.720271620639535], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/master/district", 40, 0, 0.0, 107.17499999999998, 72, 177, 106.0, 125.9, 144.14999999999992, 177.0, 4.861448711716092, 17.01507049100632, 2.297794117647059], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7-0", 40, 0, 0.0, 35.175, 25, 64, 33.0, 46.0, 56.699999999999974, 64.0, 4.902561588429955, 1.0054081382522366, 3.0353750459615148], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/ulb/get?id=", 40, 0, 0.0, 104.34999999999998, 82, 137, 103.0, 123.39999999999999, 132.89999999999998, 137.0, 4.864996351252737, 2.137937849671613, 2.4324981756263684], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7", 40, 0, 0.0, 64.77499999999999, 48, 93, 64.0, 84.6, 88.85, 93.0, 4.888780249327793, 2.382325531654852, 6.1348463089709115], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/dashboard?_rsc=ub0f7-1", 40, 0, 0.0, 29.325, 21, 47, 28.0, 43.8, 45.949999999999996, 47.0, 4.906169508156506, 1.3846513553293265, 3.1190589353612164], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7-1", 40, 0, 0.0, 35.150000000000006, 26, 104, 33.0, 42.699999999999996, 48.0, 104.0, 4.894762604013705, 19.80371237151248, 2.963625795398923], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/ddo/treasury", 40, 0, 0.0, 103.95, 77, 134, 102.0, 116.9, 127.94999999999999, 134.0, 4.860267314702308, 6.474027946537059, 2.282996658566221], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf-1", 40, 0, 0.0, 34.89999999999999, 25, 74, 32.0, 41.9, 62.249999999999936, 74.0, 4.866772113395791, 19.6904656892566, 2.8088499209149536], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7-0", 40, 0, 0.0, 31.6, 24, 48, 31.0, 36.9, 38.949999999999996, 48.0, 4.890573419733464, 1.0029496270937768, 3.018400782491747], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?emp=old&page=2&_rsc=13cuf-0", 40, 0, 0.0, 36.30000000000002, 25, 75, 32.0, 49.9, 51.949999999999996, 75.0, 4.888780249327793, 1.0025818870691763, 2.9504552676607183], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/hrms/ems/onboard?_rsc=ub0f7", 40, 0, 0.0, 67.025, 54, 137, 65.0, 75.69999999999999, 95.99999999999991, 137.0, 4.87388814426709, 20.71878426952601, 5.959089801389058], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/menu/by-module", 40, 0, 0.0, 154.55, 104, 194, 156.5, 168.8, 180.64999999999998, 194.0, 4.829168175781722, 9.41782113968369, 2.556063624290716], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/ulb/get?id=2", 40, 0, 0.0, 105.175, 76, 148, 103.0, 124.5, 126.89999999999999, 148.0, 4.854368932038835, 2.521996359223301, 2.4319250606796117], "isController": false}, {"data": ["Test", 40, 0, 0.0, 1044.95, 926, 1554, 1003.5, 1159.3, 1423.899999999999, 1554.0, 4.083716181725371, 76.07516590096988, 29.12040581929556], "isController": true}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/employee/attendance/count-daily", 40, 0, 0.0, 163.00000000000003, 91, 627, 132.5, 220.89999999999998, 513.6999999999989, 627.0, 4.577182744021055, 2.3690496624327726, 2.3779894724796886], "isController": false}, {"data": ["https://test.aadrikainfomedia.com/auth/api/hrms/v1/ddo/get?treasury=Ranchi", 40, 0, 0.0, 103.45, 74, 124, 102.5, 119.0, 123.79999999999998, 124.0, 4.844961240310077, 6.690210150193798, 2.3278524709302326], "isController": false}]}, function(index, item){
        switch(index){
            // Errors pct
            case 3:
                item = item.toFixed(2) + '%';
                break;
            // Mean
            case 4:
            // Mean
            case 7:
            // Median
            case 8:
            // Percentile 1
            case 9:
            // Percentile 2
            case 10:
            // Percentile 3
            case 11:
            // Throughput
            case 12:
            // Kbytes/s
            case 13:
            // Sent Kbytes/s
                item = item.toFixed(2);
                break;
        }
        return item;
    }, [[0, 0]], 0, summaryTableHeader);

    // Create error table
    createTable($("#errorsTable"), {"supportsControllersDiscrimination": false, "titles": ["Type of error", "Number of errors", "% in errors", "% in all samples"], "items": []}, function(index, item){
        switch(index){
            case 2:
            case 3:
                item = item.toFixed(2) + '%';
                break;
        }
        return item;
    }, [[1, 1]]);

        // Create top5 errors by sampler
    createTable($("#top5ErrorsBySamplerTable"), {"supportsControllersDiscrimination": false, "overall": {"data": ["Total", 640, 0, "", "", "", "", "", "", "", "", "", ""], "isController": false}, "titles": ["Sample", "#Samples", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors"], "items": [{"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}, {"data": [], "isController": false}]}, function(index, item){
        return item;
    }, [[0, 0]], 0);

});
