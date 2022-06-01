package com.example.s3_videoCloud_backend.repositories;

import com.example.s3_videoCloud_backend.VideoCloud;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
class ICommentRepositoryTest {

//    @Autowired
//    private IProductRepository underTest;
//
//    @AfterEach
//    void tearDown(){
//        underTest.deleteAll();
//    }

//    @Sql("/test-data.sql")
//    @Test
//    void itShouldReturnAllProductsByCompanyId_1() {
//        var productsResult = underTest.getProductsByCompanyId(1);
//
//        assertThat(productsResult.get(0).title).isEqualTo("product 1");
//
//    }
}