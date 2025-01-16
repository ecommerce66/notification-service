package com.om.notificationservice.service;

import com.om.order.event.OrderPlacedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

//    private final JavaMailSender javaMailSender;

    Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

//    public NotificationService(JavaMailSender javaMailSender) {
//        this.javaMailSender = javaMailSender;
//    }

    @KafkaListener( topics = "order-placed",containerFactory = "kafkaListenerContainerFactory")
    public void listen(@Payload OrderPlacedEvent orderPlacedEvent){
        LOGGER.info("Got message from order placed topic {}", orderPlacedEvent);
//        MimeMessagePreparator mimeMessagePreparator = mimeMessage -> {
//            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
//            mimeMessageHelper.setFrom("yourMailAddress");
//            mimeMessageHelper.setTo(orderPlacedEvent.getEmail());
//            mimeMessageHelper.setSubject(String.format("Your order with order number %s is placed successfully", orderPlacedEvent.getOrderNumber()));
//            mimeMessageHelper.setText("""
//                    Hi
//
//                    Your Order with order number %s is now placed successfully.
//
//                    BestRegareds
//                    Om Shop
//                    """,
//                    orderPlacedEvent.getOrderNumber());
//        };
//        try {
//            javaMailSender.send(mimeMessagePreparator);
//            LOGGER.info("Order Notification email sent!!");
//        } catch (MailException mailException){
//            LOGGER.error("Exception occurred while sending mail, {}", mailException.getMessage());
//            throw new RuntimeException("Exception occurred while sending mail", mailException);
//        }
    }
}
