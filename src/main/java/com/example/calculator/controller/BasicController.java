package com.example.calculator.controller;

import com.example.calculator.model.ApiResult;
import com.example.calculator.model.ResultBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;


@RestController
@RequestMapping("/basic")
public class BasicController {

   @GetMapping("/add")
   public ApiResult add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {

      BigDecimal result = augend.add(addend);

      return ResultBuilder.getResult(augend + " + " + addend + " = " + result);
   }

   @GetMapping("/subtract")
   public ApiResult subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {

      BigDecimal result = minuent.subtract(subtrahend);

      return ResultBuilder.getResult(minuent + " - " + subtrahend+ " = " + result
      );
   }

   @GetMapping("/multiply")
   public ApiResult multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {

      BigDecimal result = multiplier.multiply(multiplicand);

      return ResultBuilder.getResult(multiplier + " × " + multiplicand + " = " + result);
   }

   @GetMapping("/divide")
   public ApiResult divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {

      if (divisor.compareTo(BigDecimal.ZERO) == 0) {
         return ResultBuilder.getResultFromError("Division par zéro interdite");
      }

      BigDecimal result = dividend.divide(divisor, 2, RoundingMode.HALF_UP);
      return ResultBuilder.getResult(dividend + " ÷ " + divisor + " = " + result);
   }
}
