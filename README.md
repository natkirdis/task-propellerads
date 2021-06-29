Yandex Search Tests for Propellerads (JUnit + Selenide)
================================
This is a test project to check yandex.ru search results.

### Used instruments 

+ Java 12
+ Selenide 5.22.1
+ Maven 3.6.3
+ JUnit 5.7.1

### Description

To run test with Maven in different browsers type from command line:

```
mvn clean test -P chrome
mvn clean test -P firefox
mvn clean test -P ie
mvn clean test -P edge
```
