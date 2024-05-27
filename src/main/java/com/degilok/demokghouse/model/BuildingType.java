package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "building_type")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BuildingType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String breek;
    String monolit;
    String socket;//панельный
}
