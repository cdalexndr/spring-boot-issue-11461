package example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestTable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String value;

    protected TestTable() { }

    public TestTable( String value ) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue( String value ) {
        this.value = value;
    }
}
