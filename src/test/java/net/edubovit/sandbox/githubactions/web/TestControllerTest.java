package net.edubovit.sandbox.githubactions.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestControllerTest {

    @Autowired
    TestController testController;

    @Test
    void hello() {
        assertEquals("Hello, World!", testController.hello());
    }

}