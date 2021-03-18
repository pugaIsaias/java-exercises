import java.lang.Math; 

public class LineDistance{
    /**Cree un método que reciba cuatro parámetros (x1, y1) , (x2, y2) , estos parámetros representan
    un punto, usted debe de calcular la distancia entre los dos puntos, para ello puede utilizar la
    siguiente función matemática */

    public static void main(String[] args){
        double x1 = 0;
        double y1 = 0;
        double x2 = 3;
        double y2 = 4;
        System.out.println(lineDistance(x1,y1,x2,y2));
    }

    public static double lineDistance (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
}