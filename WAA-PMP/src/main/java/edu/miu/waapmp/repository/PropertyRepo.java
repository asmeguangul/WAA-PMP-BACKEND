package edu.miu.waapmp.repository;

import edu.miu.waapmp.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {
}
