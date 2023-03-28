package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class 배송시작 extends AbstractEvent {

    private Long id;
}
