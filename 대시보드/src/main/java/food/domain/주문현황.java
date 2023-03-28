package food.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "주문현황_table")
@Data
public class 주문현황 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
