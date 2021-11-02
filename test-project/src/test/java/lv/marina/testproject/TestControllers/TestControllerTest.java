package lv.marina.testproject.TestControllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class TestControllerTest {

   // @Autowired //we dont need to create an object ourselves, it will also delete it after use
    private TestController controller = new TestController();

    @BeforeEach
    void setUp() {
        System.out.println("Test is starting");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test has ended");
    }

    @Test
    void getTest() {
        assert(controller.getTest().equals("This is test!")) ; //assert we want to be sure that the result equals to this is test
    }

    @Test
    void getAnotherTest() {
        assert (controller.getAnotherTest().contains("responce"));
    }


    @Test
    void calculate() {
        assert (controller.calculate(1))== 6.28;
    }
    @Test
    void calculate2() {
        assert (controller.calculate(99.99999))> 627.9;
        assert (controller.calculate(99.99999))< 628;
    }
}