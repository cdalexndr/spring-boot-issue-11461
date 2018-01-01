package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = {Application.class, DummyConfig.class}) //using DummyConfig creates a new context
@Test(groups = "test2", dependsOnGroups = "test1")
public class SecondTest extends AbstractTransactionalTestNGSpringContextTests {
    @Test
    public void testInsert() { }
}
