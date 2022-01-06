package com.sid.tutorials.spring.module04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.tutorials.spring.module04.storage.DbStorageService;
import com.sid.tutorials.spring.module04.storage.FileStorageService;

@RestController
public class StorageController {

    @Autowired
    private DbStorageService dbStorageService;
    @Autowired
    private FileStorageService fileStorageService;

    @PutMapping("db/storage")
    public int storeInDb(@RequestBody String content) {
        return dbStorageService.store(content);
    }

    @GetMapping("db/storage/{id}")
    public ResponseEntity<String> fetchFromDb(@PathVariable int id) {
        return dbStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("file/storage")
    public int storeInFile(@RequestBody String content) {
        return fileStorageService.store(content);
    }

    @GetMapping("file/storage/{id}")
    public ResponseEntity<String> fetchFromFile(@PathVariable int id) {
        return fileStorageService.fetch(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
