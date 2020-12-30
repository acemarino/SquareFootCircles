import java.util.ArrayList;
import java.lang.Math;
public class Main{
    public static void main(String[] args){

        ArrayList<Double>SquareFeet= new ArrayList<Double>();
        ArrayList<Double>CircleRadii= new ArrayList<Double>();
        
        SquareFeet.add(1000.00);
        SquareFeet.add(2000.00);
        SquareFeet.add(10000.00);
        SquareFeet.add(5000.00);
        SquareFeet.add(15000.00);

        for(int i =0; i <SquareFeet.size();i++){
            double SqRt= Math.sqrt(SquareFeet.get(i));
           CircleRadii.add(SqRt);
        }
        
       new CircleCreate(CircleRadii);

    }
}