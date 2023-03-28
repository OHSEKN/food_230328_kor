package food.infra;

import food.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "주문현황", path = "주문현황")
public interface 주문현황Repository
    extends PagingAndSortingRepository<주문현황, Long> {}
