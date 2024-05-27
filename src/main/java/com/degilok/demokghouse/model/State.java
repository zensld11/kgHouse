package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "state")//cостояние недвижимости
@FieldDefaults(level = AccessLevel.PRIVATE)
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String middle;
    String allGood;
    String euro;
}
