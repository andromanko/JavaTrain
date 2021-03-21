package space.androma.ita.api.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import space.androma.ita.api.dto.UserDto;
import space.androma.ita.api.dto.UserDevIdsDto;

@Service
public interface IUserService {

	UserDto findUser(int id);

	UserDto findUserByLogin(String login);

	UserDto createUser(UserDto user);

	void updateUser(String login, UserDto user, MultipartFile file);

	void deleteUser(int id);

	List<UserDto> getUsers();

	void assingDevToUser(UserDevIdsDto ids);
}
