package org.quarkus.kafka;

import io.smallrye.reactive.messaging.kafka.Record;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ProductProducer {

    @Inject
    @Channel("product-out")
    Emitter<Record<Long, Product>> recordEmitter;

    public void sendToKafka(Product product) {
        Record<Long, Product> record = Record.of(product.getId(), product);
        recordEmitter.send(record);
    }
}
