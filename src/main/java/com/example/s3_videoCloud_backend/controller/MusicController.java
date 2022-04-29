package com.example.PIM.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/api/music")
public class MusicController {

   // private final MusicService musicService;

//    @Autowired
//    public MusicController(MusicService musicService) {
//        this.musicService = musicService;
//    }
//
//    @GetMapping
//    public List<Audio> getMusic(){
//        return musicService.getProducts();
//    }

//    @PostMapping
//    public ResponseEntity<String> createProduct(@RequestBody Music music) {
//        musicService.createProduct(music);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body("{ \"id\": "+ music.getId() + " }");
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
//        musicService.deleteProduct(id);
//        return ResponseEntity.status(HttpStatus.OK)
//                .body("{ \"id\": "+ id + " }");
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Music> getProductsById(@PathVariable int id) {
//        return musicService.getProductById(id);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<String> updateProduct(@PathVariable("id") int id, @RequestBody Music music) {
//        musicService.updateProduct(id, music.getTitle(), music.getDescription(), music.getPrice(), music.getDiscount(), music.getImage());
//        return ResponseEntity.status(HttpStatus.OK)
//                .body("{ \"id\": "+ id + " }");
//    }
}
