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
        condition = "headers['type']=='주문완료'"
    )
    public void whenever주문완료_주문상태갱신(@Payload 주문완료 주문완료) {
        주문완료 event = 주문완료;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 주문완료 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문배분'"
    )
    public void whenever주문배분_주문상태갱신(@Payload 주문배분 주문배분) {
        주문배분 event = 주문배분;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 주문배분 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='조리시작'"
    )
    public void whenever조리시작_주문상태갱신(@Payload 조리시작 조리시작) {
        조리시작 event = 조리시작;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 조리시작 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문취소'"
    )
    public void whenever주문취소_주문상태갱신(@Payload 주문취소 주문취소) {
        주문취소 event = 주문취소;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 주문취소 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='조리완료'"
    )
    public void whenever조리완료_주문상태갱신(@Payload 조리완료 조리완료) {
        조리완료 event = 조리완료;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 조리완료 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='배송시작'"
    )
    public void whenever배송시작_주문상태갱신(@Payload 배송시작 배송시작) {
        배송시작 event = 배송시작;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 배송시작 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='배송완료'"
    )
    public void whenever배송완료_주문상태갱신(@Payload 배송완료 배송완료) {
        배송완료 event = 배송완료;
        System.out.println(
            "\n\n##### listener 주문상태갱신 : " + 배송완료 + "\n\n"
        );
        // Sample Logic //

    }
}
