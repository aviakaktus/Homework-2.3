package homework_2_3.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String calculator(){
        return "<title>Калькулятор</title>  Добро пожаловать в калькулятор  ";
    }

    public String calculatorPlus(@RequestParam("num1") Integer plus1,@RequestParam("num2") Integer plus2 ){
        if (plus1 ==null || plus2 ==null) return "Введено неверно значение";
        int resPlus = plus1+plus2;
        return "<title>Сложение</title>  Добро пожаловать в сложение <br> " +plus1+" + " +plus2 +" = " + resPlus;
    }

    public String calculatorMinus(@RequestParam("num1") Integer minus1,@RequestParam("num2") Integer minus2 ){
        if (minus1 ==null || minus2 ==null) return "Введено неверно значение";
        int resMinus = minus1 - minus2;
        return "<title>Вычитание</title>  Добро пожаловать в вычитание <br> " +minus1+" - " +minus2 +" = " + resMinus;
    }

    public String calculatorMultiply(@RequestParam("num1") Integer m1,@RequestParam("num2") Integer m2 ){
        if (m1 ==null || m2 ==null) return "Введено неверно значение";
        int resMultiply = m1 * m2;
        return "<title>Умножение</title>  Добро пожаловать в умножение <br> " +m1+" * " +m2 +" = " + resMultiply;
    }

    public String calculatorDivide(@RequestParam("num1") Integer d1,@RequestParam("num2") Integer d2 ){
        if (d1 ==null || d2 ==null) return "Введено неверно значение";
        if (d2 != 0) {
        int resDivide = d1 / d2;
        return "<title>Деление</title>  Добро пожаловать в деление <br> " +d1+" / " + d2 +" = " + resDivide;}
        else {
            return "<title>Деление</title>  На ноль делить нельзя <br> ";
        }
    }
}
