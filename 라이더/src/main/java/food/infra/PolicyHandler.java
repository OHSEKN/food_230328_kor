package food.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import food.config.kafka.KafkaProcessor;
import food.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='배송시작'"
    )
    public void whenever배송시작_배송(@Payload 배송시작 배송시작) {
        배송시작 event = 배송시작;
        System.out.println("\n\n##### listener 배송 : " + 배송시작 + "\n\n");
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='조리완료'"
    )
    public void whenever조리완료_픽업(@Payload 조리완료 조리완료) {
        조리완료 event = 조리완료;
        System.out.println("\n\n##### listener 픽업 : " + 조리완료 + "\n\n");
        // Sample Logic //

    }
}
