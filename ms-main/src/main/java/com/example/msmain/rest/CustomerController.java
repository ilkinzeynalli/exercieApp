package com.example.msmain.rest;

import com.example.msmain.model.dto.CustomerCreateRequestDto;
import com.example.msmain.model.dto.CustomerDto;
import com.example.msmain.model.dto.CustomerSearchDto;
import com.example.msmain.model.dto.CustomerUpdateRequestDto;
import com.example.msmain.service.ICustomerService;
import com.example.msmain.specification.SearchCustomerCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/customers")
public class CustomerController {

    private final ICustomerService customerService;

    @GetMapping("/search")
    public ResponseEntity<List<CustomerSearchDto>> search(SearchCustomerCriteria customerCriteria, Pageable pageable) {
        return ResponseEntity.ok(customerService.search(customerCriteria, pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable Long id) {
        return ResponseEntity.ok(customerService.getById(id));
    }

    @PostMapping
    public ResponseEntity<CustomerDto> create(@RequestBody @Valid CustomerCreateRequestDto customerCreateRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(customerService.create(customerCreateRequestDto));
    }

    @PutMapping
    public ResponseEntity<CustomerDto> update(@RequestBody @Valid CustomerUpdateRequestDto customerUpdateRequest) {
        return ResponseEntity.ok(customerService.update(customerUpdateRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        customerService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
