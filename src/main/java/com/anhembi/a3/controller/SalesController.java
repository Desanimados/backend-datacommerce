package com.anhembi.a3.controller;

import com.anhembi.a3.model.Sales;
import com.anhembi.a3.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sales")
@RequiredArgsConstructor
public class SalesController {

    private final SalesService salesService;

    @GetMapping
    public List<Sales> getAll() {
        return salesService.getAll();
    }
}
