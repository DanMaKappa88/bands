package hu.flowacademy.bands.controller;

import hu.flowacademy.bands.model.Album;
import hu.flowacademy.bands.model.Band;
import hu.flowacademy.bands.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/albums")
@RequiredArgsConstructor
public class AlbumController {

    private final AlbumService albumservice;


    @GetMapping
    public List<Album> findAll(){
        return albumservice.findAll();
    }

    @GetMapping("/{id}")
        public Optional<Album> findOne(@PathVariable String id){
        return albumservice.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Album save(@RequestBody Album album){
      return albumservice.save(album);
    }

    @GetMapping("/findAll")
    public List<String> findAllAlbumsByBand(@RequestParam("band") String band){
        return albumservice.findAllAlbumsByBand(band);
    }
/*
    @GetMapping("/findAll/{band}")
    public List<String> findAllAlbumsByBand(@PathVariable String band) String band){
        return albumservice.findAllAlbumsByBand(band);
    }
*/

    @GetMapping("/{id}/details")
    public List<String> findOneDetailed(@PathVariable String id) {
            return  albumservice.findOneDetailed(id);
    }
}
