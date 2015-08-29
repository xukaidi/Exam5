千万别mvn clean，clean会出错
mvn compile
mvn exec:java -Dexec.mainClass="com.hand.main.MainApp"