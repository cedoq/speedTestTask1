//libs


//code
public class Main {
    public static void main(String[] args) {
        double distance = getDistance(1 ,2 ,3 ,4 );
        System.out.println(distance);
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        double dist = 0;
        double cat1 = Math.abs(x1-x2);
        double cat2 = Math.abs(y1-y2);
        dist = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
        return dist;
    }
    }
