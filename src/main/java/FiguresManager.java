import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class FiguresManager {
    public static void main (String [] args){
        List<Area> figures= new ArrayList<>();
        figures.add(new Triangle(10,6,7));
        figures.add(new Circle(10));
        figures.add(new Rectangle(3,4));
        for (Area element:figures) {
            System.out.println(element.toString());
            System.out.println(String.format("Area %.2f",element.calculateArea()));
        }
    }
}
