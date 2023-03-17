package com.demo.db4h2.Entity;

import lombok.*;
import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class Stock{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigInteger stockNo;
    private String stockName;
}
