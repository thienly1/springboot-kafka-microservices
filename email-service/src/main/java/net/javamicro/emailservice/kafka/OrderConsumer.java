package net.javamicro.emailservice.kafka;

import net.javamicro.basedomains.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order event received in email service->%s", event.toString()));

        //send an email to the customer

    }
}
