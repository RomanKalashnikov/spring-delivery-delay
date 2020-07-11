package controller;

import dto.BuyerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/buyers")
@Slf4j
public class BuyerController {

    @PostMapping("/create")
    public BuyerDto create(BuyerDto buyerDto) {
        return null;
    }

    @GetMapping("/{id}")
    public BuyerDto readBuyerByID(@PathVariable("id") Long id) {
        return null;
    }

    @GetMapping("/order/{id}")
    public BuyerDto getOrderByID(@PathVariable("id") Long orderId) {
        return null;
    }

    @PostMapping("/update/{id}")
    public BuyerDto update(@PathVariable("id") Long id, @RequestBody BuyerDto buyerDto) {
        return null;
    }

    @PostMapping("/delete/{id}")
    public BuyerDto delete(@PathVariable("id") Long id) {
        return null;
    }


}
