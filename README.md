# serenity-allure

This is a sample project which combine Serenity BDD Framework https://github.com/serenity-bdd with Allure reporting http://allure.qatools.ru/.

Pre-requisite:
Install maven and git

To generate Allure report, please perform following steps:
```
$ git clone git@github.com:fergadipa/serenity-allure.git
$ cd serenity-allure
$ mvn clean test
$ mvn site
```

To see report, run ```mvn jetty:run``` in your current folder, please wait until `Started Jetty Server` appeared then open browser ```http://localhost:8080```
