package api.hotel_reservation.HotelApi;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rooms {
    private String Description;
    private String Type;
    private int BaseRate;
    private String BedOptions;
    private int SleepsCount;
    private boolean SmokingAllowed;
    private List<String> Tags;
}
