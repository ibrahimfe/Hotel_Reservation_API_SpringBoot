package api.hotel_reservation.HotelApi;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String StreetAddress;
    private String City;
    private String StateProvince;
    private String PostalCode;
    private String Country;
}
