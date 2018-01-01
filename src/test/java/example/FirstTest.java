package example;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
@Test(groups = "test1")
public class FirstTest extends AbstractTransactionalTestNGSpringContextTests {
    @Test
    public void testInsert() { }
}
