package com.example.s3_videoCloud_backend.service;

import com.example.s3_videoCloud_backend.model.Music;
import com.example.s3_videoCloud_backend.repositories.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    private final IMusicRepository musicRepository;

    @Autowired
    public MusicService(IMusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    public List<Music> getMusics(){
        return musicRepository.findAll();
    }
//
//    public Optional<Music> getProductById(int id){
//        return musicRepository.findById(id);
//    }

//    public void createProduct(Music music){
//        if(music.getTitle() != "" || music.getDescription()!= "") {
//            musicRepository.save(music);
//        }
//    }
//    public void deleteProduct(int productid){
//        boolean exists = musicRepository.existsById(productid);
//        if(!exists){
//            throw new IllegalStateException("Product with id: " + productid + " does not exist");
//        }
//        musicRepository.deleteById(productid);
//    }
//
//    @Transactional
//    public void updateProduct(int id, String Title, String Description, BigDecimal Price, int Discount, String Image) {
//        Music music = musicRepository.findById(id)
//                .orElseThrow(() -> new IllegalStateException("product with id: " + id + " not found!"));
//        if(Title != null &&
//                Title.length() > 0 &&
//                !Objects.equals(music.getTitle(), Title)) {
//            music.setTitle(Title);
//        }
//        if(Description != null &&
//                Description.length() > 0 &&
//                !Objects.equals(music.getDescription(), Description)) {
//            music.setDescription(Description);
//        }
//        if(Price != null &&
//                !Objects.equals(music.getPrice(), Price)) {
//            music.setPrice(Price);
//        }
//        if(     Discount >= 0 && Discount <= 100 &&
//                !Objects.equals(music.getDiscount(), Discount)) {
//            music.setDiscount(Discount);
//        }
//        if(Image != null &&
//                Image.length() > 0 &&
//                !Objects.equals(music.getImage(), Image)) {
//            music.setImage(Image);
//        }
//    }
}
