# SerenityCucumberTestFramework

- Ensure the dependencies for the below are present in pom.xml
  * serenity-core
  * serenity-cucumber
  * serenity-junit
  * assertJ
  * slf4j-simple
  
- Configure serenity-maven plugin as shown below
  ```
  <plugin>
      <groupId>net.serenity-bdd.maven.plugins</groupId>
      <artifactId>serenity-maven-plugin</artifactId>
      <version>2.0.48</version>
      <executions>
          <execution>
               <id>serenity-reports</id>
               <phase>post-integration-test</phase>
               <goals>
                  <goal>aggregate</goal>
               </goals>
          </execution>
      </executions>
  </plugin>  
  ```
  - You can set the webdriver properties in the `serenity.properties` file as shown below
  ```
  webdriver.driver=chrome
  webdriver.chrome.driver=C:\\drivers\\chromedriver.exe
  chrome.capabilities.acceptSslCerts=true
  chrome.capabilities.handlesAlerts=true
  chrome.capabilities.acceptInsecureCerts=true
  chrome.switches=--headless
  ```
  - use `mvn clean verify` to execute your tests
  - You can see the report in below path 
    > target/site/serenity/index.html
    
 \#BDD \#Serenity \#Cucumber \#SerenityCucumber \#SeleniumWithSerenity
 \#SerenityBDD \#SerenityChromeOptions