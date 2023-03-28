package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문취소 extends AbstractEvent {

    private Long id;

    public 주문취소() {
        super();
    }
}
