# SoapUIAutomationProject

To Compile and run the java program using command prompt:

PreRequisites:
1.Keep All Jar files in lib folder inside the project
JARS:
1.Jcommander
2.SoapUI 5.6.0 Jar from SmartBear/SoapUI/Bin
3.All Jars SmartBear/SoapUI/lib
Commands :

cd (to project path)
Compile : javac -classpath lib/* -d ./bin ./src/(packagename*)/*.java
Execute : java -cp bin;lib/* org.testng.TestNG testng.xml
