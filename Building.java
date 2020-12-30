public class Building {
    
    double SquareFeet;
    int radius;

    public Building(double SqFt, int r){
        SquareFeet=SqFt;
        radius=r;
    }

    void setSquareFeet(double S){
        SquareFeet = S;
    }
    void setRadius(int R){
        radius=R;
    }

    double getSquareFeet(){
        return SquareFeet;
    }

    int getRadius(){
        return radius;
    }
}
