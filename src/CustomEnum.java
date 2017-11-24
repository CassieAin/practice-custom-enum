import java.util.ArrayList;

public class CustomEnum {
    private final String name;
    private final int ordinal;
    private static ArrayList<CustomEnum> valuesList = new ArrayList<>();

    protected CustomEnum(String name){
        this.name = name;
        this.ordinal = valuesList.size();
        valuesList.add(this);
    }

    public String getName() {
        return name;
    }

    public int ordinal() {
        return ordinal;
    }

    public static ArrayList values(){
        return valuesList;
    }

    public static CustomEnum valueOf(String name){
        if(name == null)
            throw new NullPointerException();
        return valuesList.stream()
                .filter(value -> value.name.equals(name))
                .findFirst().orElse(null);
    }

    @Override
    public boolean equals(Object object){
        return this == object;
    }

    @Override
    public String toString() {
        return name + "";
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    protected final void finalize(){

    }
}
