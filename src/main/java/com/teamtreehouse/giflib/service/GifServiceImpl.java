package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.dao.GifDao;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class GifServiceImpl implements GifService {

    private GifDao gifDao;

    @Autowired
    public GifServiceImpl(GifDao gifDao){
        Assert.notNull(gifDao, "gif can't be null");
        this.gifDao = gifDao;
    }
    @Override
    public List<Gif> findAll() {
        return gifDao.findAll();
    }

    @Override
    public Gif findById(Long id) {
        return gifDao.findById(id);
    }

    @Override
    public void save(Gif gif, MultipartFile file) {
        try {
            gif.setBytes(file.getBytes());
            gifDao.save(gif);
        } catch (IOException e) {
            System.err.println("Unable to get byte array from uploaded file.");
        }
    }

    @Override
    public void delete(Gif gif) {
        gifDao.delete(gif);
    }
}
