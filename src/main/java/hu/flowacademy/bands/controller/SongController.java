package hu.flowacademy.bands.controller;

import hu.flowacademy.bands.model.Song;
import hu.flowacademy.bands.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/song")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;

    @GetMapping
    public List<Song> findall(){
        return songService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Song> findOne(@PathVariable String id){
        return songService.findOne();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Song save(@RequestBody Song song){
        return songService.save(song);
    }
}
