import java.util.ArrayList;

public class Colors extends CustomEnum {

    public static final Colors WHITE;
    public static final Colors BLACK;
    public static final Colors GREY;
    public static final Colors RED;
    public static final Colors GREEN;
    public static final ArrayList<Colors> colorsValues;

    private Colors(String name){
        super(name);
    }

    static {
        WHITE = new Colors("WHITE");
        BLACK = new Colors("BLACK");
        GREY = new Colors("GREY");
        RED = new Colors("RED");
        GREEN = new Colors("GREEN");
        colorsValues = CustomEnum.values();
    }

    public static ArrayList<Colors> values() {
        return colorsValues;
    }
}
