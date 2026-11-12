
import java.util.HashMap;
import java.util.Map;

public class Location{
    public String Name;
    public String Description;
    public Map<String, Exit> exit;

    public Location(String name, String description){
        this.Name = name;
        this.Description = description;
        this.exit = new HashMap<>();
    }

}