package com.degilok.demokghouse.service.impl;

import com.degilok.demokghouse.repository.RoomCountRepository;
import com.degilok.demokghouse.service.RoomService;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomCountRepository roomCountRepository;

    public RoomServiceImpl(RoomCountRepository roomCountRepository) {
        this.roomCountRepository = roomCountRepository;
    }

}
