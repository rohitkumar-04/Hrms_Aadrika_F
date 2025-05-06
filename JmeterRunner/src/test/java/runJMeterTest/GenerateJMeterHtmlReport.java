package runJMeterTest;

import java.io.File;

import org.apache.jmeter.report.dashboard.ReportGenerator;
import org.apache.jmeter.util.JMeterUtils;

public class GenerateJMeterHtmlReport {

	public static void main(String[] args) throws Exception {

		String reportOutputDir = "D:/EclipseWorkspace/JmeterRunner/report-output-new";

		// Delete the folder contents if any exist
		File reportDir = new File(reportOutputDir);
		if (reportDir.exists()) {
			File[] files = reportDir.listFiles();
			if (files != null) {
				for (File file : files) {
					if (!file.delete()) {
						System.out.println("Failed to delete: " + file);
					}
				}
			}
		} else {
			reportDir.mkdirs(); // Create directory if it doesn't exist
		}

		String jmeterHome = "D:/Software/apache-jmeter-5.6.3"; // Update this path

		if (!new File(jmeterHome).exists()) {
			throw new IllegalStateException("JMeter home not found at: " + jmeterHome);
		}

		// Setup JMeter environment
		JMeterUtils.setJMeterHome(jmeterHome);
		JMeterUtils.loadJMeterProperties(jmeterHome + "/bin/jmeter.properties");
		JMeterUtils.initLocale();
		System.setProperty("log4j.configurationFile", jmeterHome + "/bin/log4j2.xml");

		// Input JTL file and Output report folder
		String jtlFile = "D:\\Software\\apache-jmeter-5.6.3\\results\\summary.html"; // Update if needed
	

		// Create the report generator
		ReportGenerator generator = new ReportGenerator(jtlFile, null);
		JMeterUtils.setProperty("jmeter.reportgenerator.exporter.html.property.output_dir", reportOutputDir);

		// Generate report
		generator.generate();
		//String reportOutputDir1 = "D:/Software/apache-jmeter-5.6.3/reports";

		System.out.println("✅ HTML report generated at: " + reportOutputDir);
	}

}
