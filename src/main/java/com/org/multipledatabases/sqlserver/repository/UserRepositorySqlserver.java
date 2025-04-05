package com.org.multipledatabases.sqlserver.repository;

import com.org.multipledatabases.sqlserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorySqlserver extends JpaRepository<User, Long> {
}
