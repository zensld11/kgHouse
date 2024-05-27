package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.Complex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexRepository extends JpaRepository<Complex, Long> {
}
