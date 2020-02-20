# gpii-qa-automation
Repository for the GPII QA automation code
# GPII UI Automation
UI Automation is done with Java 8 and the used tool is Sikuli. More information here -> http://sikulix.com/quickstart/ .
Currently automation code is executed only on Windows but Sikuli is cross platform tool so when the GPII App becane cross platform automation - test cases could be executed on Mac and Linux distribution.
### Running the Tests in a VM
Ensure that your virtual box is up and running, Windows is turned on, GPII app is up and running then navigate to folder with jar , open CMD as an administrator and run the following commmand: 
```bash
mvn clean compile assembly:single && java -jar target/sik-1.0-SNAPSHOT-jar-with-dependencies.jar testng.xml
```
A HMTL report is generated in the `test-output` subdirectory. 
