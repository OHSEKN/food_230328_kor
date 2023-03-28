package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 조리완료 extends AbstractEvent {

    private Long id;

    public 조리완료() {
        super();
    }
}
