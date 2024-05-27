package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.Distinct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistinctRepository extends JpaRepository<Distinct, Long> {
}
