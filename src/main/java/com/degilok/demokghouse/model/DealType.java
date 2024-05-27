package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "deal_type")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DealType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String sell;
    String rent;
}