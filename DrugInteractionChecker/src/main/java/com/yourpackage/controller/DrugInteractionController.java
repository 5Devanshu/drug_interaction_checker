// DrugInteractionController.java
package com.yourpackage.controller;

import com.yourpackage.service.DrugInteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/drug-interactions")
public class DrugInteractionController {

    @Autowired
    private DrugInteractionService drugInteractionService;

    @GetMapping("/{drugName}")
    public String getDrugInteraction(@PathVariable String drugName) {
        // Call the service to get drug interactions
        return drugInteractionService.getDrugInteraction(drugName);
    }
}
