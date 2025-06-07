import java.lang.reflect.Array;

@Service
public class BookingService {

    private ArrayList<Cust> custs;

    BookingService() {
        custs = new ArrayList<>(Array.asList(
                new Cust("gg"),
                new Cust("gg1"),
                new Cust("gg2")));
    }

    public boolean addCust(String cust){
        cust=new cust("custName");
        if(cust==null)
        return false;
        else
        {
            custs=addCust(cust);
            return true;
        }
    }

    

}