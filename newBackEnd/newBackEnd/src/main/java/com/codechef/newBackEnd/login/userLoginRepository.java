package com.codechef.newBackEnd.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userLoginRepository extends JpaRepository<userLogin, String> {
    userLogin findByUSERNAMEAndPASSWORD(String username, String password);
}