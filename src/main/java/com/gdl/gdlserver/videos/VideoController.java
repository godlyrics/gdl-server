package com.gdl.gdlserver.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoServices services;

    @GetMapping
    public ResponseEntity<List<Video>> getInstruments() {
        return services.getInstruments();
    }

    @PostMapping
    public ResponseEntity<Video> addVideo(@RequestBody @Valid Video video) {
        return services.addVideo(video);
    }

    @PutMapping
    public ResponseEntity<Video> updateVideo(@RequestBody @Valid Video video) {
        return services.updateVideo(video);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Video> deleteVideo(@PathVariable String id) {
        return services.deleteVideo(id);
    }
}
