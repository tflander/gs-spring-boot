package jpa.codefirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping("/customer")
    public String customer() {
        return "customer";
    }
}
