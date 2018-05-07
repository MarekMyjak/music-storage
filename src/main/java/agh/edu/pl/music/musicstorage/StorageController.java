package agh.edu.pl.music.musicstorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    StorageServices storageServices;

    @PostMapping("files")
    public void publishMusicFile(){
        storageServices.addFileToDatabase();
    }
}
