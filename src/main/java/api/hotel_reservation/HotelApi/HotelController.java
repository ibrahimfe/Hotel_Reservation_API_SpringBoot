package api.hotel_reservation.HotelApi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hotels")

public class HotelController {
    @Autowired
    private HotelService service;

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return new ResponseEntity<List<Hotel>>(service.allHotels(), HttpStatus.OK);

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Optional<Hotel>> getOneHotelByHotelId(@PathVariable String hotelId) {
        return new ResponseEntity<Optional<Hotel>>(service.oneHotelByHotelId(hotelId), HttpStatus.OK);
    }
}
