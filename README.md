# gpii-qa-automation
Repository for the GPII QA automation code
# GPII UI Automation
UI Automation is done with Java 8 and the used tool is Sikuli. [More information here](http://sikulix.com/quickstart/) .

Sikuli is based on image recognition and interaction. It's a cross platform tool.

 
At this state the UI Automation is executed only on Windows.
 
It's a Maven project. Used 3rd party dependencies are TestNG, Junit, Extent reports and their versions are as follow : 
- Sikuli v2.0.1
- TesNG  v7.0.0
- Junit v4.12
- Extent Reports v4.0.9


For better understanding which case is failure , which one is passed - a visual report tool (extent reports) is added.

The tests can be run from testng.xml as whole bunch of test cases.
Every single test case can be run from specific class.

i.e Test cases for Task Manager are in TaskManager class and there has a method to run specific case for Task Manager.


### Running the Tests in a VM
Prerequisites: Maven and Java 8 should be installed on Windows.

Ensure that your virtual box is up and running, Windows is turned on, GPII app is up and running then navigate to folder with jar and testng.xml, open command prompt or powershell as an administrator and run the following command: 
```bash
mvn clean compile assembly:single && java -jar target/sik-1.0-SNAPSHOT-jar-with-dependencies.jar testng.xml
```


A HMTL report is generated in the `test-output` subdirectory. Open html report in browser and look for executed test cases.
