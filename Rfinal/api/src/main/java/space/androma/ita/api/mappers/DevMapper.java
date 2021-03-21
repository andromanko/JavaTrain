package space.androma.ita.api.mappers;

import java.util.List;
import java.util.stream.Collectors;
import space.androma.ita.api.dto.DevDto;
import space.androma.ita.entities.Dev;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DevMapper {

	public Dev mapDev(DevDto source) {
		return Dev.builder().id(source.getId()).name(source.getName()).build();
	}

	public DevDto mapDevDto(Dev source) {
		return DevDto.builder().id(source.getId()).name(source.getName()).build();
	}

	public List<Dev> mapDevs(List<DevDto> source) {
		return source.stream().map(DevMapper::mapDev).collect(Collectors.toList());
	}

	public List<DevDto> mapDevDtos(List<Dev> source) {
		return source.stream().map(DevMapper::mapDevDto).collect(Collectors.toList());
	}
}
