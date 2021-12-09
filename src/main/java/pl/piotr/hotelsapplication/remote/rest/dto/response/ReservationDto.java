package pl.piotr.hotelsapplication.remote.rest.dto.response;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private String status;
    private List<RoomDto> rooms;
    private List<PersonDto> person;
}
