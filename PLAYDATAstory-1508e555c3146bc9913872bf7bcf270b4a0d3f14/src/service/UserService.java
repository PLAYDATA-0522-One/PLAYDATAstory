package service;

import domain.SignupDto;
import repository.UserRepository;

public class UserService {
    private static UserService service;

    public static UserService getInstance() {
        if (service == null) service = new UserService();
        return service;
    }

    public boolean login(String id, String password) {
        return new UserRepository().login(id, password);
    }

    public void signup(SignupDto dto) {
        new UserRepository().insertUsers(dto);
    }

    public static String returnid(String id)
    {
        return id;
    }

}
