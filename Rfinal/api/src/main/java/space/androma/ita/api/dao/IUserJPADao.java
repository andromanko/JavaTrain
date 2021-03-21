package space.androma.ita.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import space.androma.ita.entities.User;

public interface IUserJPADao extends JpaRepository<User, Integer> {

	User findByLogin(String login);
}
