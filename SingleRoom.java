package room;
public class SingleRoom extends Room{
    String roomType;
    int days;
    public SingleRoom(String roomType,int days){
        super(roomType);
        this.days=days;
    }
    @Override
    public double calculateRent(int days){
        return (double)(10000*days);
    }
}
