// DrugRepository.java
package com.yourpackage.repository;

import com.yourpackage.model.Drug;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrugRepository extends JpaRepository<Drug, Long> {
    // Additional query methods if needed
}
