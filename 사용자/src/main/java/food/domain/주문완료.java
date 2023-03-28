package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 주문완료 extends AbstractEvent {

    private Long id;

    public 주문완료() {
        super();
    }
}
