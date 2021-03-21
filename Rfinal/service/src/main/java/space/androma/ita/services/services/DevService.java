package space.androma.ita.services.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import space.androma.ita.api.dao.IDevDao;
import space.androma.ita.api.dao.IDevJPADao;
import space.androma.ita.api.dto.DevDto;
import space.androma.ita.api.mappers.DevMapper;
import space.androma.ita.api.services.IDevService;
import space.androma.ita.entities.Dev;

@Service
public class DevService implements IDevService {

    @Autowired
    private IDevJPADao devDao;

    @Override
    public DevDto findDev(int id) {
        Dev dev = this.devDao.findById(id).orElse(null);
        return (dev != null ) ? DevMapper.mapDevDto(dev) : null;
    }

    @Override
    @Transactional
    public DevDto createDev(DevDto dev) {
        Dev entity = DevMapper.mapDev(dev);
        return DevMapper.mapDevDto(this.devDao.save(entity));
    }

    @Override
    @Transactional
    public void updateDev(int id, DevDto devDto) {
        Dev dev = this.devDao.findById(id).orElse(null);
        if(dev != null) {
            this.devDao.save(dev);
        }
    }

    @Override
    @Transactional
    public void deleteDev(int id) {
        this.devDao.deleteById(id);
    }

    @Override
    public List<DevDto> getDevs() {
        return DevMapper.mapDevDtos(this.devDao.findAll());
    }
}
