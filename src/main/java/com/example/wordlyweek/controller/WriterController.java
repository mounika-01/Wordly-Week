package com.example.worldyweek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import com.example.worldyweek.model.*;
import com.example.worldyweek.service.WriterJpaService;

@RestController
public class WriterController {

    @Autowired
    private WriterJpaService writerJpaService;

    @GetMapping("/magazines/writers")
    public ArrayList<Writer> getWriters() {
        return writerJpaService.getWriters();
    }

    @GetMapping("/magazines/writers/{writerId}")
    public Writer getWriterbyId(@PathVariable("writerId") int writerId) {
        return writerJpaService.getWriterById(writerId);
    }

    @PostMapping("/magazines/writers")
    public Writer addWriter(@RequestBody Writer writer) {
        return writerJpaService.addWriter(writer);
    }

    @PutMapping("/magazines/writers/{writerid}")
    public Writer updateWriter(@PathVariable("writerId") int writerId, @requestBody Writer writer) {
        return writerJpaService.updateWriter(writerId, writer);
    }

    @Deletemaping("/magazines/writers/{writerId}")
    public void deleteWriter(@PathVariable("writerId") int writerId) {
        writerJpaService.deleteWriter(writerId);
    }

    @GetMapping("/writers/{writeId}/magazines")
    public List<Magazine> getWriteMagazines(@PathVariable("writerId") int writerId) {
        return writerJpaService.getWriteMagazines(writerId);
    }
}
