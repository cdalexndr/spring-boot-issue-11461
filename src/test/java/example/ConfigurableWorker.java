package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;

import javax.persistence.EntityManager;

@Configurable class ConfigurableWorker {
    @Autowired TestTableRepository testTableRepository;
    @Autowired EntityManager entityManager;

    @Transactional
    public void doWork() {
        TestTable entity = testTableRepository.save( new TestTable( "test" ) );
        Assert.assertTrue( entityManager.contains( entity ) );
    }
}
