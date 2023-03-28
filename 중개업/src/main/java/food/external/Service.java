package food.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;


@FeignClient(name = "매장", url = "${api.url.매장}")
public interface Service {
    @RequestMapping(method= RequestMethod.POST, path="/")
    public void 주문수락(@RequestBody  );
}
