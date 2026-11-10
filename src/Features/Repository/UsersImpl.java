package Features.Repository;

import Features.Exception.DuplicateUserException;
import Features.Models.Users;
import Features.Services.UsersService;
import Features.UI.ConsoleInput;
import Features.UI.MainMenu;

import java.util.List;

public class UsersImpl implements UsersService {

    @Override
    public void registerUser(List<Users> users) {





    }


    @Override
    public List<Users> getUsers() {
        return List.of();
    }

    @Override
    public Users getUserByID(String Id) {
        return null;
    }

    private void validateUserInput(List<Users> users) throws DuplicateUserException  {
      Users userData = ConsoleInput.enterUserData();

      try {
          users.forEach(user -> {
              if (user.getIdentification().equals(userData.getIdentification()) || user.getEmail().equals(userData.getEmail())) {

              }
          });
      } catch(DuplicateUserException e) {

      }



    }


}
