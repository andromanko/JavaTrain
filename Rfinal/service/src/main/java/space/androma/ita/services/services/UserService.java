package space.androma.ita.services.services;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import space.androma.ita.api.dao.IDevJPADao;
import space.androma.ita.api.dao.IUserJPADao;
import space.androma.ita.api.dto.UserDto;
import space.androma.ita.api.dto.UserDevIdsDto;
import space.androma.ita.api.mappers.UserMapper;
import space.androma.ita.api.services.IUserService;
import space.androma.ita.entities.Dev;
import space.androma.ita.entities.Role;
import space.androma.ita.entities.User;
import space.androma.ita.services.utils.LogoFileUploader;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService implements IUserService {

    @Autowired
    private IUserJPADao userJPADao;

    @Autowired
    private IDevJPADao devJPADao;
    
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDto findUser(int id) {
        User user = this.userJPADao.findById(id).orElse(null);
        return (user != null) ? UserMapper.mapUserDto(user) : null;
    }
    
    @Override
    public UserDto findUserByLogin(String login) {
        return UserMapper.mapUserDto(this.userJPADao.findByLogin(login));
    }
        
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = new User();
        user.setLogin(userDto.getLogin());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
//        user.getRoles().add(new Role("ROLE_USER"));
        User savedUser = this.userJPADao.save(user);
        return UserMapper.mapUserDto(savedUser);
    }

    @Override
    public void updateUser(String login, UserDto userDto, MultipartFile file) {
//        User user = this.userJPADao.findById(id).orElse(null);
        User user = this.userJPADao.findByLogin(login);
        if(user != null) {
            user.setLogin(userDto.getLogin());
            user.setInfo(userDto.getInfo());
            this.userJPADao.save(user);
        }
        try {
            LogoFileUploader.updateOrCreateLogo(file, userDto);
        } catch (IOException e) {
            log.error("Failed to upload image. Error message: {}", e.getMessage());
        }
    }

    @Override
    public void deleteUser(int id) {
        this.userJPADao.deleteById(id);
    }

    @Override
    public List<UserDto> getUsers() {
        return UserMapper.mapUserDtos(userJPADao.findAll());
    }

    @Override
    public void assingDevToUser(UserDevIdsDto ids) {
        User user = this.userJPADao.findById(ids.getUserId()).orElse(null);
        Dev dev = this.devJPADao.findById(ids.getDevId()).orElse(null);
        dev.setUser(user);
        this.devJPADao.save(dev);
        log.info("Device assigned to user {}!", user.getLogin());
    }

    
    
    
    
    
    
    
//    @Autowired
//    private IUserDao userDao;
//
//    @Override
//    public UserDto findUser(int id) {
//        User user = this.userDao.get(id);
//        return UserMapper.mapUserDto(user);
//    }
//
//    @Override
//    @Transactional
//    public UserDto createUser(UserDto user) {
//        User entity = UserMapper.mapUser(user);
//        entity.setPets(new ArrayList<>());
//        User savedUser = this.userDao.create(entity);
//        return UserMapper.mapUserDto(savedUser);
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(int id, UserDto user) {
//        User entity = this.userDao.get(id);
//        entity.setFirstName(Optional.ofNullable(user.getFirstName()).orElse("DefaultName"));
//        entity.setSalary(user.getSalary());
//        this.userDao.update(entity);
//    }
//
//    @Override
//    @Transactional
//    public void deleteUser(int id) {
//        User entity = this.userDao.get(id);
//        this.userDao.delete(entity);
//    }
//
//    @Override
//    public List<UserDto> getUsers() {
//        return UserMapper.mapUserDtos(this.userDao.getAll());
//    }
}
