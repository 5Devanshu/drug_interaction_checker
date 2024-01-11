// DrugInteractionService.java
package com.yourpackage.service;

import com.yourpackage.model.Drug;
import com.yourpackage.model.Interaction;
import com.yourpackage.repository.DrugRepository;
import com.yourpackage.repository.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInteractionService {

    @Autowired
    private DrugRepository drugRepository;

    @Autowired
    private InteractionRepository interactionRepository;

    public String getDrugInteraction(String drugName) {
        // Business logic to fetch drug interactions
        Drug drug = new Drug();
        drug.setName(drugName);

        // Save the drug to the database
        drugRepository.save(drug);

        // Fetch interactions from the database
        List<Interaction> interactions = interactionRepository.findAll();

        // Process interactions and return a response
        StringBuilder response = new StringBuilder("Interactions for " + drugName + ":\n");
        for (Interaction interaction : interactions) {
            response.append(interaction.getDescription()).append("\n");
        }

        return response.toString();
    }
}
