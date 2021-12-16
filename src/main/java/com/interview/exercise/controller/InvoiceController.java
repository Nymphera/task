package com.interview.exercise.controller;


import com.interview.exercise.Service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/invoices")
public class InvoiceController {

    private InvoiceService invoiceService;
}
