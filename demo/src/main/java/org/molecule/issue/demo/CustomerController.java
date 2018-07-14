package org.molecule.issue.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * @author Dong Zhuming
 */
@RestController
@RequestMapping("/api")
public class CustomerController {

    @PostMapping("/customer")
    public ResponseEntity<Void> createCustomer(Customer customer) throws Exception {
        return ResponseEntity.created(new URI("/api/customer/1")).build();
    }

}
