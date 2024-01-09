package com.puppoor.stuck.TechStack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TechStackRepository extends JpaRepository<TechStack,Long> {
    List<TechStack> findByServiceType(String serviceType);

//Optional<TechStack> findTechStackbyService(String serviceType);


}
