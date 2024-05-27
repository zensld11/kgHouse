package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exchange")//возможность обмена
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Exchange {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

}
