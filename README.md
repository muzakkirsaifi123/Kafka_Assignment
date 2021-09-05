       Kafka Assignment

In this Assignment producer publish a user message into a Kafka topic and consume it using the Kafka Producer and Consumer APIs. Once the message is consumed from a consumer, it is written into a file named NewStudentData.txt.

Message structure is: User message ===>> {"id":"1","name":"some_name","age":"24","course":"B.Tech."}


Explanation -- If you want to run this code in your system. First make sure you have download the kafka tgz file  and extract it.In the same location you should open a terminal  and execute these commnad one by one in different terminal--

1. bin/zookeeper-server-start.sh config/zookeeper.properties
2. bin/kafka-server-start.sh config/server.properties

After execute these cmd come back to intellij and Run the producer first then after consumer.
check the txt file ( you will get every message in txt file)...
