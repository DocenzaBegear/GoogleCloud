package it.begear.GC.service;

import it.begear.GC.dao.LudotecaDao;
import it.begear.GC.entity.Ludoteca;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class LudotecaServiceImpl implements LudotecaService {

    @Resource
    LudotecaDao ludoDao;

    @Override
    public List<Ludoteca> findAll() {
        return ludoDao.findAll();
    }

}
