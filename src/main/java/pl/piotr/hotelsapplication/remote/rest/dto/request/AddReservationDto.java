package pl.piotr.hotelsapplication.remote.rest.dto.request;

import pl.piotr.hotelsapplication.remote.rest.dto.response.PersonDto;
import pl.piotr.hotelsapplication.remote.rest.dto.response.RoomReservationDto;

import java.util.List;

public class AddReservationDto {
    private List<RoomReservationDto> hotels;
    private List<PersonDto> person;

    public List<RoomReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<RoomReservationDto> hotels) {
        this.hotels = hotels;
    }

    public List<PersonDto> getPerson() {
        return person;
    }

    public void setPerson(List<PersonDto> person) {
        this.person = person;
    }
}
