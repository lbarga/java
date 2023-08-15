package br.com.erudio.math;

import org.springframework.web.bind.annotation.PathVariable;

public class SimpleMath {
    public Double sum(@PathVariable Double numberOne,
                      @PathVariable Double numberTwo) {
        return numberOne + numberTwo;
    }


    public Double subtraction(@PathVariable Double numberOne,
                              @PathVariable Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication(@PathVariable Double numberOne,
                                 @PathVariable Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division(@PathVariable Double numberOne,
                           @PathVariable Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double average(@PathVariable Double numberOne,
                          @PathVariable Double numberTwo) {
        return (numberOne + numberTwo) / 2;
    }

    public Double squareRoot(@PathVariable Double numberOne) {
        return Math.sqrt(numberOne);
    }
}
