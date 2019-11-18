package xyz.ieden.spring.boot.example.web.jackson.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

/**
 * @author lianghongwei01
 * @version 1.0.1
 * @date 2019/11/15 17:40
 */
@Configuration
public class JacksonParseConfig {

//    @Bean
//    @Primary
//    @ConditionalOnMissingBean(ObjectMapper.class)
//    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
//        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//        final SerializerProvider serializerProvider = objectMapper.getSerializerProvider();
//
////        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
////            @Override
////            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
////
////                if (Number.class.isAssignableFrom(o.getClass())) {
////                    jsonGenerator.writeNumber(0);
////                }
////                jsonGenerator.writeString("");
////            }
////        });
//        return objectMapper;
//    }

}
