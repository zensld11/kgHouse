package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.Heating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeatingRepository extends JpaRepository<Heating, Long> {
}
