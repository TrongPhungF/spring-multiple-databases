package com.org.multipledatabases.oracle.repository;

import com.org.multipledatabases.oracle.entity.ShippingUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingUserRepository extends JpaRepository<ShippingUser, Long> {
}
