package example;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups = "test3", dependsOnGroups = "test2")
public class ThirdTest extends AbstractTransactionalTestNGSpringContextTests {
    @Test
    public void testInsert() {
        new ConfigurableWorker().doWork();
    }
}
