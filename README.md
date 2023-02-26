# CBDD_sp9
Jenkins, Java

# How to run the test
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags= "smoke"