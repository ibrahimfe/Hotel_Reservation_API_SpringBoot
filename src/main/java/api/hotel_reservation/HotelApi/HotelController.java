package api.hotel_reservation.HotelApi;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
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

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Hotel>> getOneHotel(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Hotel>>(service.oneHotel(id), HttpStatus.OK);

    }
}
