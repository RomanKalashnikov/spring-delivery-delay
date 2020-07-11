package controller;

import dto.BuyerDto;
import dto.CourierDto;
import dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couriers")
@Slf4j
public class CourierController {

    @GetMapping
    public List<OrderDto> getAllOrder() {
        return null;
    }

    @PostMapping
    public CourierDto create(BuyerDto CourierDto) {
        return null;
    }

    @GetMapping("/{id}")
    public CourierDto readCourierByID(@PathVariable("id") Long id) {
        return null;
    }

    @GetMapping("/order/{id}")
    public CourierDto getOrderByID(@PathVariable("id") Long orderId) {
        return null;
    }

    @PostMapping("/{id}")
    public CourierDto update(@PathVariable("id") Long id, @RequestBody CourierDto courierDto) {
        return null;
    }

    @PostMapping("/delete/{id}")
    public CourierDto delete(@PathVariable("id") Long id) {
        return null;
    }


}
