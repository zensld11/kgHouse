package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room_count")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomCount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String roomCount;
}
