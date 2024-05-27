package com.degilok.demokghouse.repository;

import com.degilok.demokghouse.model.RoomCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomCountRepository extends JpaRepository<RoomCount, Long> {
}
