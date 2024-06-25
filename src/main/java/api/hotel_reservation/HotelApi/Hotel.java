package api.hotel_reservation.HotelApi;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "hotel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    @Id
    private ObjectId id;
    private String HotelId;
    private String HotelName;
    private String Description;
    private String Category;
    private String Rating;
    private List<String> Tags;
    private Object Address;
    private List<Rooms> Rooms;

}
