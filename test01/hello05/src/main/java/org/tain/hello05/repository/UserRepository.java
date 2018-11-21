package org.tain.hello05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tain.hello05.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
