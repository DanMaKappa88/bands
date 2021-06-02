package hu.flowacademy.bands.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class Band {
    @Id
    private String id;
    @Column(nullable = false,unique = true)
    private String bandName ;
    private Genre genre;
}
