package com.alirza.microservices.currencyconversionservice.controllers;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alirza.microservices.currencyconversionservice.bean.CurrencyConversion;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		return new CurrencyConversion(1000L, from, to, BigDecimal.ONE, quantity, BigDecimal.ONE, "");

	}
}
