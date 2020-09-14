package it.begear.GC.controller;

import it.begear.GC.entity.Ludoteca;
import it.begear.GC.service.LudotecaService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LudotecaController {

    @Resource
    LudotecaService ludotecaService;

    @RequestMapping("/ludoteca")
    public List<Ludoteca> shows() {
        return ludotecaService.findAll();
    }
}
