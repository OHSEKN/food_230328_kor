package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 조리시작 extends AbstractEvent {

    private Long id;

    public 조리시작() {
        super();
    }
}
