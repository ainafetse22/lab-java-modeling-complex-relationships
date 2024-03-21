package ironhack.com.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private BigDecimal duration;
    private String location;
    private String title;



}
