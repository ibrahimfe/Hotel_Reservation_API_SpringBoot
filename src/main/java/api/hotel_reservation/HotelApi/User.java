package api.hotel_reservation.HotelApi;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private ObjectId id;
    private String username;
    private String password;
    private String email;

}
