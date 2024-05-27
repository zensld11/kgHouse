package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.DealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DealTypeRepository extends JpaRepository<DealType, Long> {
}
