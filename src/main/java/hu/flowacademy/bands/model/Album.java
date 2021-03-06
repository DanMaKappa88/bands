package hu.flowacademy.bands.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Album {

    @Id
    private String id;
    @ManyToOne
    Band owner;
    private String albumName;
    private Date releaseDate;

}
