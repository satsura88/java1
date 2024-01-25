package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.model.repository.impl.UserRepository;

import java.util.Objects;

public class UserView  {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        while (true) {
            String command = UserRepository.prompt(
                    """
                            1. Создать контакт\s
                            2. Просмотреть контакт\s
                            3. Изменить контакт\s
                            4. Просмотреть список контактов\s
                            5. Удалить контакт\s
                            6. Выход\s
                            Введите цифру команды:
                            """);
            if (Objects.equals(command, "6")) return;
            switch (command) {
                case "1":
                    User u = UserRepository.createUser();
                    userController.saveUser(u);
                    break;
                case "2":
                    String id = UserRepository.prompt("User ID: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "3":
                    String userId = UserRepository.prompt("Enter user id: ");
                    userController.updateUser(userId, UserRepository.createUser());
                    break;

                case "4":
                    System.out.println(userController.readAll());
                    break;
                case "5":
                    String deleteUserId = UserRepository.prompt("Enter user the id you want to delete: ");
                    userController.deleteUser(Long.valueOf(deleteUserId));
                    break;
            }
        }
    }
}
