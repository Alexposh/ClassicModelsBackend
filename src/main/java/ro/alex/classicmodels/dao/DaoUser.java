package ro.alex.classicmodels.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ro.alex.classicmodels.model.User;



@Repository
public interface DaoUser extends CrudRepository<User, Integer>{


    public Optional<User> findByUsernameAndPassword(String username, String password);
    public Optional<User> findByUsername(String username);
//    public List<UserGroup> findByUsersIn(List<User> users);
    public Optional<User> findByEmail(String email);

}