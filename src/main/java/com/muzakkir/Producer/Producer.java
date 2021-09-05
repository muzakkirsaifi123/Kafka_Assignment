package com.muzakkir.Producer;

import com.muzakkir.Student_Data.UserModel;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;
import java.util.Random;

public class Producer {
    public static void main(String[] args){
        // For example 192.168.1.1:9092,192.168.1.2:9092
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092,localhost:9093");
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "com.muzakkir.Serialization.UserSerializer");

        KafkaProducer<String, UserModel> kafkaProducer = new KafkaProducer<>(properties);
        try{
            Random ob = new Random();
            for(int i = 1; i <= 20; i++){
                UserModel user= new UserModel(i,"Muzakkir Saifi",ob.nextInt(80), "B.Tech");

                kafkaProducer.send(new ProducerRecord<String,UserModel>("first", Integer.toString(i),user));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            kafkaProducer.close();
        }
    }
}