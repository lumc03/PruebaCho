package models;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CustomerForm {
    private String customerId;
    private String companyName;
    private String email;
    private String phone;
    private String contactName;
    private String contactTitle;
    private String representatives;
    private String address;
    private String country;
    private String city;
    private  String body;

}
