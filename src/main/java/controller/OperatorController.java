package controller;

import dto.OperatorDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operators")
@Slf4j
public class OperatorController {

    @PostMapping
    public OperatorDto create(OperatorDto OperatorDto) {
        return null;
    }

    @GetMapping("/{id}")
    public OperatorDto readOperatorByID(@PathVariable("id") Long id) {
        return null;
    }

    @GetMapping("/order/{id}")
    public OperatorDto getOrderByID(@PathVariable("id") Long orderId) {
        return null;
    }

    @PostMapping("/{id}")
    public OperatorDto update(@PathVariable("id") Long id, @RequestBody OperatorDto operatorDto) {
        return null;
    }

    @PostMapping("/delete/{id}")
    public OperatorDto delete(@PathVariable("id") Long id) {
        return null;
    }

}
