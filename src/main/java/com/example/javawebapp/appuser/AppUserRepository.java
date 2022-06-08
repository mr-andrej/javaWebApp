package com.example.javawebapp.appuser;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface AppUserRepository {
    Optional<AppUser> findByEmail(String email);
}
