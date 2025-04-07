package com.org.multipledatabases.mongodb.repository;

import com.org.multipledatabases.mongodb.entity.UserAddress;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAddressRepository extends MongoRepository<UserAddress, Long> {
}
