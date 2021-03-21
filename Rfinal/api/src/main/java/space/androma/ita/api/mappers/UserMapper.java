package space.androma.ita.api.mappers;

import java.util.List;
import java.util.stream.Collectors;

import space.androma.ita.api.dto.UserDto;
import space.androma.ita.entities.User;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UserMapper {

	public User mapUser(UserDto source) {
		return User.builder().id(source.getId()).login(source.getLogin()).info(source.getInfo())
				.password(source.getPassword()).build();
	}

	public UserDto mapUserDto(User source) {
		return UserDto.builder().id(source.getId()).login(source.getLogin()).info(source.getInfo())
				.password(source.getPassword()).build();
	}

	public List<User> mapUsers(List<UserDto> source) {
		return source.stream().map(UserMapper::mapUser).collect(Collectors.toList());
	}

	public List<UserDto> mapUserDtos(List<User> source) {
		return source.stream().map(UserMapper::mapUserDto).collect(Collectors.toList());
	}
}
