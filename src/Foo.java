import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by LunaFlores on 12/13/16.
 */
public class Foo {
    private int num;
    private String name;

    public Foo() {
       super();
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public boolean equals(Object obj){
        return EqualsBuilder.reflectionEquals(this,obj);
    }

    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
