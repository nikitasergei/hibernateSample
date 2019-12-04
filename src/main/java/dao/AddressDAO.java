package dao;

import entity.Address;

import java.util.List;

public interface AddressDAO {


    //create
    void add(Address address);

    //update
    void update(Address address);

    //read
    Address getById(Long id);

    List<Address> getAll();

    //delete
    void remove(Address address);


}

