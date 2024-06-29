package api.hotel_reservation.HotelApi.Repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import api.hotel_reservation.HotelApi.Model.Hotel;

@Repository
public interface HotelRepository extends MongoRepository<Hotel, ObjectId> {

    Optional<Hotel> findByHotelId(String hotelId);

}
