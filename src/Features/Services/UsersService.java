package Features.Services;

import Features.Models.Users;

import java.util.List;

public interface UsersService {
    public void registerUser(List<Users> users);
    public List<Users> getUsers();
    public Users getUserByID(String Id);
}
