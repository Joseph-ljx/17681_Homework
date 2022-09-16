import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * The shapeSortTest class.
 * @author Joseph Liao The type Circle.
 */

public class ShapeSortTest {
    ArrayList<Shape> result = new ArrayList<Shape>();

    /**
     * Main function.
     * @param args input args.
     */
    public static void main(String args[]) {
        if(args.length == 0){
            return;
        }
        ShapeSortTest sst = new ShapeSortTest();
        sst.sortShapsAsc(sst.addShape(args));
        sst.print();
        System.out.println();
        sst.sortShapsDesc(sst.result);
        sst.print();

    }

    /**
     * This method add the shapes from the args.
     * @param arguments arguments array for input.
     */
    public List<Shape> addShape(String arguments[]){
        int index = 0;
        while(index < arguments.length){
            Shape shape = null;
            String c = arguments[index].substring(0,1);
            int parameter = Integer.parseInt(arguments[index].substring(1, arguments[index].length()));
            switch (c){
                case "C":
                    shape = new Circle(parameter);
                    break;

                case "S":
                    shape = new Square(parameter);
                    break;

                case "H":
                    shape = new Hexagon(parameter);
                    break;

                case "O":
                    shape = new Octagon(parameter);
                    break;

                default:
                    System.out.println("Not an including shape, please try another one");
                    break;
            }
            result.add(shape);
            index++;
        }
        return result;
    }

    /**
     * This method sort the shape list in ascending order.
     * @param list the list to be sorted as input.
     */
    public void sortShapsAsc(List<Shape> list){
        Collections.sort(list, new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if(o1.getArea() < o2.getArea()){
                    return -1;
                } else if(o1.getArea() > o2.getArea()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    /**
     * This method sort the shape list in descending order.
     * @param list the list to be sorted as input.
     */
    public void sortShapsDesc(List<Shape> list){
        Collections.sort(list, (o1, o2) -> {
            if(o1.getArea() < o2.getArea()){
                return 1;
            } else if(o1.getArea() > o2.getArea()) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    /**
     * This method print out the information of the shape list.
     */
    public void print(){
        Iterator<Shape> it = result.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}
