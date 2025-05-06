package runJMeterTest;

import java.io.File;
import java.io.IOException;

import org.apache.jmeter.samplers.SampleSaveConfiguration;
import org.apache.jmeter.report.dashboard.ReportGenerator;
import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jorphan.collections.HashTree;

public class RunJMeterTest {

	public static void main(String[] args) throws Exception {
		/*
		 * File jtlFile = new File("results.jtl");
		 * System.out.println("Working directory: " + new File(".").getAbsolutePath());
		 * System.out.println("JTL file absolute path: " + jtlFile.getAbsolutePath());
		 * System.out.println("File exists? " + jtlFile.exists());
		 * System.out.println("File readable? " + jtlFile.canRead());
		 */

		try {
			// Path to JMeter home
			String jmeterHome = "D:\\Software\\apache-jmeter-5.6.3";
			File jmeterHomeFile = new File(jmeterHome);
			if (!jmeterHomeFile.exists()) {
				throw new IllegalStateException("JMeter home not found at " + jmeterHome);
			}

			// Initialize JMeter Engine
			System.out.println("Initialize JMeter Engine");
			StandardJMeterEngine jmeter = new StandardJMeterEngine();

			// Setup JMeter environment
			System.out.println("Setup JMeter environment");
			JMeterUtils.setJMeterHome(jmeterHome);
			JMeterUtils.loadJMeterProperties(jmeterHome + "\\bin\\jmeter.properties");
			JMeterUtils.initLocale();

			// Load test plan
			System.out.println("Load test plan");
			File testPlan = new File("D:\\Software\\apache-jmeter-5.6.3\\JMeterTests\\sample-testplan.jmx.txt");
			HashTree testPlanTree = SaveService.loadTree(testPlan);

			// Create the SampleSaveConfiguration (used for saving the results)

			SampleSaveConfiguration saveConfig = new SampleSaveConfiguration();
			saveConfig.setTime(true);
			saveConfig.setLatency(true);
			saveConfig.setTimestamp(true);
			saveConfig.setSuccess(true);
			saveConfig.setLabel(true);
			saveConfig.setCode(true);
			saveConfig.setMessage(true);
			saveConfig.setThreadName(true);
			saveConfig.setDataType(true);
			saveConfig.setEncoding(true);
			saveConfig.setAssertions(true);
			saveConfig.setSubresults(true);
			saveConfig.setResponseData(true); // Save full response body
			saveConfig.setSamplerData(true); // Save request data (headers + body)
			saveConfig.setResponseHeaders(true); // Save response headers
			saveConfig.setRequestHeaders(true); // Save request headers
			saveConfig.setBytes(true);
			saveConfig.setSentBytes(true);
			saveConfig.setUrl(true);
			saveConfig.setIdleTime(true);
			saveConfig.setConnectTime(true);

			// Add a listener to save the results to an HTML file
			ResultCollector logger = new ResultCollector();
			logger.setFilename("D:\\Software\\apache-jmeter-5.6.3\\results\\summary.html");
			logger.setSaveConfig(saveConfig);

			// Add the listener to the test plan
			testPlanTree.add(testPlanTree.getArray()[0], logger);

			// Input and output paths
			String jtlFile = "D:\\\\Software\\\\apache-jmeter-5.6.3\\\\results\\\\summary.html"; // Path to the JTL
			// results file
			String outputDir = "D:\\Software\\apache-jmeter-5.6.3\\reports"; // Output directory for the report

			// Run test plan
			System.out.println("Run test plan");
			jmeter.configure(testPlanTree);
			jmeter.run();

			// Generate the report
			ReportGenerator generator = new ReportGenerator(jtlFile, null);
			generator.generate();

			System.out.println("HTML report generated at: " + outputDir);

			System.out.println("JMeter test executed from Java!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
