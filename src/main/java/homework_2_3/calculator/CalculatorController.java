package homework_2_3.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/calculator/")
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController (CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping(path= "")
    public String calculator(){
        return calculatorService.calculator();
    }

    @GetMapping (path= "/plus")
    public String calculatorPlus(@RequestParam("num1") Integer plus1,@RequestParam("num2") Integer plus2){
        return calculatorService.calculatorPlus(plus1,plus2);
    }

    @GetMapping (path= "/minus")
    public String calculatorMinus(@RequestParam("num1") Integer minus1,@RequestParam("num2") Integer minus2 ){
        return calculatorService.calculatorMinus(minus1,minus2);
    }

    @GetMapping (path= "/multiply")
    public String calculatorMultiply(@RequestParam("num1") Integer m1,@RequestParam("num2") Integer m2 ){
        return calculatorService.calculatorMultiply(m1,m2);
    }

    @GetMapping (path= "/divide")
    public String calculatorDivide(@RequestParam("num1") Integer d1,@RequestParam("num2") Integer d2 ){
        return calculatorService.calculatorDivide(d1,d2);
    }


}
