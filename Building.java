public class Building implements Comparable{
    
    int SquareFeet;
    int radius;

    public Building(int SqFt, int r){
        SquareFeet=SqFt;
        radius=r;
    }

    void setSquareFeet(int S){
        SquareFeet = S;
    }
    void setRadius(int R){
        radius=R;
    }

    int getSquareFeet(){
        return SquareFeet;
    }

    int getRadius(){
        return radius;
    }

    @Override
    public int compareTo(Object compareBuilding){
        int value =((Building)compareBuilding).getSquareFeet();
        return this.SquareFeet-value;
        
    }
}
