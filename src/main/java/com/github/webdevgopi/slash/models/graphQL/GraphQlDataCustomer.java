package com.github.webdevgopi.slash.models.graphQL;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.github.webdevgopi.slash.models.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@JsonRootName(value = "data")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GraphQlDataCustomer {
    private List<Customer> queryCustomer;
}
