package food.infra;

import food.config.kafka.KafkaProcessor;
import food.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class 주문현황ViewHandler {

    @Autowired
    private 주문현황Repository 주문현황Repository;
}
