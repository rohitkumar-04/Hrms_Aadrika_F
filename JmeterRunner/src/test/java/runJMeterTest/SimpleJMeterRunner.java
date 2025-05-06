package runJMeterTest;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jmeter.reporters.Summariser;

import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jorphan.collections.HashTree;

import java.io.File;

public class SimpleJMeterRunner {
	public static void main(String[] args) throws Exception {

		// Set JMeter home path
		String jmeterHome = "D:/Software/apache-jmeter-5.6.3"; // ✅ Change this to your JMeter path

		// Set path to JMX test plan
		String testPlanPath = "D:\\EclipseWorkspace\\JmeterRunner\\plan\\build-web-test-plan.jmx"; // ✅ Change this to your test plan

		// Set path for .jtl results file
		String resultPath = "D:/EclipseWorkspace/JmeterRunner/results/results.jtl"; // ✅ Change this

		// Initialize JMeter environment
		JMeterUtils.setJMeterHome(jmeterHome);
		JMeterUtils.loadJMeterProperties(jmeterHome + "/bin/jmeter.properties");
		JMeterUtils.setProperty("jmeter.save.saveservice.output_format", "csv"); // force CSV
		JMeterUtils.initLocale();

		// Load test plan
		File jmxFile = new File(testPlanPath);
		HashTree testPlanTree = SaveService.loadTree(jmxFile);

		// Initialize JMeter engine
		StandardJMeterEngine jmeter = new StandardJMeterEngine();

		// Add summariser + result collector
		Summariser summariser = new Summariser("summary");
		ResultCollector logger = new ResultCollector(summariser);
		logger.setFilename(resultPath);
		testPlanTree.add(testPlanTree.getArray()[0], logger);

		// Run test
		jmeter.configure(testPlanTree);
		jmeter.run();

		System.out.println("✅ JMeter test executed. Results saved at: " + resultPath);
	}
}
