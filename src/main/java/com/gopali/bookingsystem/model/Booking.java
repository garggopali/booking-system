import javax.annotation.processing.Generated;


/**
 * @author Gopali
 * @version 1.0
 * @since 07-June-2025
 * @implNote this class is for to connect with database for booking object
 */

@Entity
@Table(Name="booking")
public class Booking{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String customerName;
    
    @Column
    private LocalDate date;
    
    @Column
    private LocalTime startTime;
    
    @Column
    private LocalTime endTime;
    
    @Column(required=null)
    private Long coworkerId; // null in step 1, used from step 3

    Booking(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

     public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

     public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getCoworkerId() {
        return coworkerId;
    }

    public void setCoworkerId(Long coworkerId) {
        this.coworkerId = coworkerId;
    }

}