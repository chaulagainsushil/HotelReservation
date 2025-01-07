package hotelbookingcom.newproblem.hotelreservation.Services;

import hotelbookingcom.newproblem.hotelreservation.Models.Customer;
import hotelbookingcom.newproblem.hotelreservation.dtos.CustomerDto;
import hotelbookingcom.newproblem.hotelreservation.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<CustomerDto> getAll(  ) {
        List<Customer> customersList = customerRepository.findAll();
        List<CustomerDto> customerDtoList = new ArrayList<>();
        for (Customer customer : customersList) {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustomerID(customer.getCustomerID());
            customerDto.setFirstName(customer.getFirstName());
            customerDto.setLastName(customer.getLastName());
            customerDto.setEmail(customer.getEmail());
            customerDto.setDateOfBirth(customer.getDateOfBirth());
            customerDto.setNationality(customer.getNationality());
            customerDto.setPhoneNumber(customer.getPhoneNumber());
            customerDto.setAddress(customer.getAddress());
            customerDtoList.add(customerDto);


        }
        return customerDtoList;
    }
    public  void  save(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setCustomerID(customerDto.getCustomerID());
        customer.setFirstName(customerDto.getFirstName());
        customer.setLastName(customerDto.getLastName());
        customer.setEmail(customerDto.getEmail());
        customer.setDateOfBirth(customerDto.getDateOfBirth());
        customer.setNationality(customerDto.getNationality());
        customer.setPhoneNumber(customerDto.getPhoneNumber());
        customer.setAddress(customerDto.getAddress());
        customerRepository.save(customer);

    }
}

