<h1># Cucumber-BDD-Automation-Framework</h1>
<h2>Behavior Driven Development Cucumber - Selenium based automation framework including Allure reports</h2>

<h2>This framework contains sample code containing:</h2>
	<ul><li>2 feature (feature file)</li></ul>
	<ul><li>2 Scenarios</li>
	<li>(Scenario Outline examples)Login to facebook.Username and Password should be on a variable we can change.Post status Hello World</li>
	<li>Post the review and verify the same</li></ul>
	  

<h2>Steps to run at your system:</h2>
	<ul>
	<li>import maven project"</li>
	<li>if want to run feature file change the feature Cucumber option in TestRunner.java </li>
	<li>if want to run all test cases Run full project as Maven clean install</li>
	</ul>
	
<h2>Cucumber Reports: Allure Report </h2>
	<ul>
	<li>target\allure-results</li>
	</ul>
	<br>
	
<h2>See configuration in "pom.xml" file</h2>
				
				
<h2>Allure Report:</h2> Allure reports will be generated based on the testcases json files when you'll run maven Run As "-e clean install". 
<h3>Add this Allure dependency in pom.xml:</h3>

	<dependency>
		<groupId>ru.yandex.qatools.allure</groupId>
		<artifactId>allure-cucumber-jvm-adaptor</artifactId>
		<version>1.6.2</version>
	</dependency>

	

