package com.example.s3_videoCloud_backend.controller;


import com.example.s3_videoCloud_backend.VideoCloud;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = VideoCloud.class
)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ActiveProfiles("test")
@TestPropertySource(locations = "classpath:application-test.properties")
class CommentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    @Order(1)
    @Sql("/test-data.sql")
    public void getAllCommentsByUser_api_test() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/comments")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].comment").value("comment"))
                .andReturn();
    }

    @Test
    @Order(2)
    public void shouldGetCommentById() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/comments/details/2")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(2))
                .andExpect(jsonPath("$.comment").value("comment2"))
                .andReturn();
    }


//    @Test
//    @Order(3)
//    public void shouldCreateProduct() throws Exception{
//        mockMvc.perform(MockMvcRequestBuilders.post("/api/products/create")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content("{\"productId\": \"1001\", \"productTitle\": \"Testbike\", \"productDescription\": \"Brand new bike\" }"))
//                .andExpect(MockMvcResultMatchers.status().isCreated())
//                .andExpect(MockMvcResultMatchers.header().exists("Location"))
//                .andExpect(MockMvcResultMatchers.header().string("Location", Matchers.containsString("1001")))
//                .andReturn();
//    }
//    @Test
//    @Order()
//    @Sql("/test-data.sql")
//    public void shouldDeleteProduct() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.delete("/api/comments/delete/1")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .accept(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].title").doesNotExist())
//                .andExpect(status().isOk());
//    }
}