//package com.example.s3_videoCloud_backend.service;
//
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//
//@ExtendWith(MockitoExtension.class)
//class CommentServiceTest {
//
//    @Mock
//    private IProductRepository productRepository;
//
//    private ProductService underTest;
//
//    @BeforeEach
//    void SetUp(){
//        underTest = new ProductService(productRepository);
//    }
//
//    @Test
//    void canGetAllProducts(){
//        // when
//        underTest.getProducts();
//        // then
//        verify(productRepository).findAll();
//    }
//}