package api.hotel_reservation.HotelApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> allHotels() {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> oneHotelByHotelId(String hotelId) {
        return hotelRepository.findByHotelId(hotelId);
    }
}
