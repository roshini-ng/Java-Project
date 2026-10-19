package room;
public class DoubleRoom extends Room{
    String roomType;
    int days;
    public DoubleRoom(String roomType,int days){
        super(roomType);
        this.days=days;
    }
    @Override
    public double calculateRent(int days){
        return (double)(15000*days);
    }
}
