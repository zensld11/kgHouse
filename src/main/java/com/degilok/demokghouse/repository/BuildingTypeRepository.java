package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.BuildingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingTypeRepository extends JpaRepository<BuildingType, Long> {
}
