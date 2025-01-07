package hotelbookingcom.newproblem.hotelreservation.controller;

import hotelbookingcom.newproblem.hotelreservation.Services.CustomerService;
import hotelbookingcom.newproblem.hotelreservation.dtos.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustmomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping
    public List<CustomerDto> getAll() {
        return customerService.getAll();
    }
    @PostMapping
    public void save (@RequestBody CustomerDto customerDto) {
        customerService.save(customerDto);
    }

}
