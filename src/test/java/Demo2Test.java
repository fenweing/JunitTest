//package com.example.demo;
//
//import com.example.demo.mapper.Mapper;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
////@RunWith(MockitoJUnitRunner.class)
//public class Demo2Test {
//    @MockBean
//    private Mapper mapper;
//    //    @Mock
//    @MockBean
//    private IUserService userService;
//    //    @InjectMocks
//    @Autowired
//    private ServiceImpl service;
//
//    @Before
//    public void before() {
//        when(mapper.get("1")).thenReturn("a");
//        when(userService.getUserName("11")).thenReturn("d");
//
//    }
//
//    @Test
//    public void test1() {
//        String ret = service.get("1");
//        assertEquals("a_d_c", ret);
//        verify(mapper, times(1)).get("1");
////        verify(userService, times(1)).getUserName("11");
//    }
//
//
//}
