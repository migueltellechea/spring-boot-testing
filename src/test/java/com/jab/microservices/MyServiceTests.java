package com.jab.microservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyServiceTests {

    @Autowired
    MyService myService;

    @Test
    void myServiceGreetingTest() {
        assertThat(myService!=null);
        assertThat(MyService.greetingMessage.equals(myService.greet()));
    }
}
