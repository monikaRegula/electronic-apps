package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helo {

    @GetMapping
    public String main() {
        return "Hello";
    }
}
