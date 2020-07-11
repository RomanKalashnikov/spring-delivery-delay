package controller;

import dto.OrderDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@Slf4j
public class OrderController {

    @PostMapping
   public OrderDto create(OrderDto orderDto) {
        return null;
    }

    @GetMapping("/{id}")
    public OrderDto readCourierByID(@PathVariable("id") Long id) {
        return null;
    }

    @GetMapping("/order/{id}")
    public OrderDto getOrderByID(@PathVariable("id") Long orderId) {
        return null;
    }

    @PostMapping("/{id}")
    public OrderDto update(@PathVariable("id") Long id, @RequestBody OrderDto orderDto) {
        return null;
    }
    @PostMapping("/delete/{id}")
    public OrderDto delete(@PathVariable("id") Long id){
        return null;
    }

}
