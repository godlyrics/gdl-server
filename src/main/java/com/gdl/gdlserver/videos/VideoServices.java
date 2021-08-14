package com.gdl.gdlserver.videos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VideoServices {
    @Autowired
    private VideoRepository repository;

    public ResponseEntity<List<Video>> getInstruments() {
        return null;
    }

    public ResponseEntity<Video> addVideo(Video video) {
        return null;
    }

    public ResponseEntity<Video> updateVideo(Video video) {
        return null;
    }

    public ResponseEntity<Video> deleteVideo(String id) {
        return null;
    }
}
