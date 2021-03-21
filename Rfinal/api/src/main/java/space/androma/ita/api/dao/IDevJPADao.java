package space.androma.ita.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import space.androma.ita.entities.Dev;

public interface IDevJPADao extends JpaRepository<Dev, Integer> {

}
