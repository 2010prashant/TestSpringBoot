package test.learning;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyController {

    /**
     * Getting the gate's agents Detail
     * @return ResponseEntity<PaginationDTO<GateGridDTO>>: gate grid data with pagination`
     */
    @GetMapping("/first")
    public String test() {
        return "Hello";
    }


}
