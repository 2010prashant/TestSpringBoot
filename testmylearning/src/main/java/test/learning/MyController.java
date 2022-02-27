package test.learning;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/")
    public String test() {
        return "Hello TEST";
    }

    @GetMapping("/user")
    public String user() {
        return "Hello USER";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello ADMIN";
    }


}
