package com.degilok.demokghouse.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "series")//102, 104 и тд
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String serieName;
}
