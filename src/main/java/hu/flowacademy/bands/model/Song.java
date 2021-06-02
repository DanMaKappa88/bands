package hu.flowacademy.bands.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Song {
    @Id
    private String id;
    @ManyToOne
    Album album;
    @ManyToOne
    Band owner;
    private String title;
    private int length;
    private int licensPrice;





}
