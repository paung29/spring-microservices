package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;
import jakarta.validation.Valid;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    boolean updateAccount( CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}

