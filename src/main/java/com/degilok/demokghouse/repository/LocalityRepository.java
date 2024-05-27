package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalityRepository  extends JpaRepository<Locality, Long> {
}
