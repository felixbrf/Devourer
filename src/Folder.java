import java.io.Serializable;
import java.util.List;

/**
 * Created by liulongfei on 2016/10/29.
 */
public class Folder implements Serializable {

    private int id;
    private String name;
    private List<Pin> pins;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pin> getPins() {
        return pins;
    }

    public void setPins(List<Pin> pins) {
        this.pins = pins;
    }
}
