package hu.flowacademy.bands.controller;

import hu.flowacademy.bands.model.Band;
import hu.flowacademy.bands.model.Genre;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/band")
@RequiredArgsConstructor
public class BandController {

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void save(@RequestBody Band band){
        log.debug("Creating band with Params: {}",band);
    }

    @PutMapping("/{id}")
    public Band update(@PathVariable String id , @RequestBody Band band ){
        log.debug("Updating Band with params {} , {}", id , band);

        return band.toBuilder().id("1").genre(Genre.MEHTAL).bandName("Gerappa").build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable String id){
        log.debug("Deleting user with params {}",id);
    }

    @GetMapping
    public List<Band> findAll(){
        log.debug("Find all bands");
        return  List.of(
                Band.builder()
                        .id("1")
                        .bandName("Valami")
                        .genre(Genre.POP).build(),
                Band.builder()
                        .id("34")
                        .bandName("valami1223")
                        .genre(Genre.REP).build()
        );
    }

    @GetMapping("/{id}")
    public Optional<Band> findOne(@PathVariable String id){
        log.debug("Getting 1 user with id from param {}",id );
        return Optional.of(Band.builder()
                .id("1")
                .bandName("valami")
                .genre(Genre.REP)
                .build());
    }
}
