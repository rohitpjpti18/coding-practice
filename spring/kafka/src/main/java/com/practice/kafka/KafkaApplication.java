package com.practice.kafka;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class KafkaApplication {

	//public static Logger log = LogManager.getLogger(KafkaApplication.class);

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(KafkaApplication.class, args);

		MessageProducer producer = context.getBean(MessageProducer.class);

		producer.sendMessage("Hello, World!");

		//context.close();
	}

	@Bean
	public MessageProducer messageProducer() {
		return new MessageProducer();
	}

	public static class MessageProducer {
		static Logger log = LogManager.getLogger(MessageProducer.class);

		@Autowired
		private KafkaTemplate<String, String> kafkaTemplate;

		@Value(value="${message.topic.name}")
		private String topicName;

		public void sendMessage(String message) throws ExecutionException, InterruptedException {
			log.info("sendMessage");
			CompletableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName, message);
			//SendResult<String, String> value = new SendResult<>();

			log.info("result: {}", future.get());
			future.handle((s, ex) -> {
				if(ex != null) log.info("result: {}", s);
				else log.error("error: {}", ex.getMessage());
				return null;
			});
		}
	}

	public static class MessageConsumer {

	}

}
