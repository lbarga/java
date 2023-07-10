package br.com.erudio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class MathController {

    @GetMapping("/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable double numberOne,
                      @PathVariable double numberTwo) {
        return numberOne + numberTwo;
    }

}
