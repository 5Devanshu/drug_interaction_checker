// InteractionRepository.java
package com.yourpackage.repository;

import com.yourpackage.model.Interaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteractionRepository extends JpaRepository<Interaction, Long> {
    // Additional query methods if needed
}
