package com.lazybears.beartrips.dao;

import com.lazybears.beartrips.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}
