package org.quarkus.kafka;


import io.quarkus.kafka.client.serialization.JsonbDeserializer;

public class ProductSerializer extends JsonbDeserializer<Product> {
    public ProductSerializer() {
        super(Product.class);
    }


}
