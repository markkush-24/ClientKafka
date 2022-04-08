package com.example.clientkafkaapp.listener;



import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    Logger log = Logger.getLogger(Listener.class.getName());

    @KafkaListener(topics = "${kafka.topic}", containerFactory = "ListenerFactory")
    public void listenKafka(ConsumerRecord<String, String> record, Acknowledgment ack) {
        log.info(record.value());

        if (record.value().equals("id : 1")) {
            log.info(record.value());
            ack.acknowledge();
        }
    }
}
