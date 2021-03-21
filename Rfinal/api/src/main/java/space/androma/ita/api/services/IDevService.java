package space.androma.ita.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import space.androma.ita.api.dto.DevDto;
import space.androma.ita.api.dto.UserDto;

@Service
public interface IDevService {

	DevDto findDev(int id);

	DevDto createDev(DevDto user);

	void updateDev(int id, DevDto user);

	void deleteDev(int id);

	List<DevDto> getDevs();
}
