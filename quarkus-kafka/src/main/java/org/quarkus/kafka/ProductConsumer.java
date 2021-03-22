package org.quarkus.kafka;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(ProductConsumer.class);

    @Incoming("product-in")
    public void receive(Record<Long, Product> record) {
        LOG.info("Received record {}", record);
        LOG.info("Received record key {}", record.key());
        LOG.info("Received record value {}", record.value());
    }
}
