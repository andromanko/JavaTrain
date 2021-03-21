package space.androma.ita.dao;

import org.springframework.stereotype.Repository;
import space.androma.ita.api.dao.IDevDao;
import space.androma.ita.entities.Dev;

@Repository
public class DevDao extends AGenericDao<Dev> implements IDevDao {

    public DevDao() {
        super(Dev.class);
    }
}
