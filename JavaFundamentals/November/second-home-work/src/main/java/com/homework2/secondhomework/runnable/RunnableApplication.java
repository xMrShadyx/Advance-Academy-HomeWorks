package com.homework2.secondhomework.runnable;

import com.homework2.secondhomework.model.Privilege;
import com.homework2.secondhomework.model.User;
import com.homework2.secondhomework.repository.PrivilegesRepository;
import com.homework2.secondhomework.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class RunnableApplication implements CommandLineRunner {

    private final PrivilegesRepository privilegesRepository;
    private final UserRepository userRepository;

    public RunnableApplication(PrivilegesRepository privilegesRepository, UserRepository userRepository) {
        this.privilegesRepository = privilegesRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        setPrivileges("Admin");
        setPrivileges("Moderator");
        setPrivileges("VIP");
        setPrivileges("Customer");

        setUser("Ivan", "Ivanov", "Ivan.Ivanov@gmail.com", 1L);
        setUser("Nikolai", "Kolev", "Kolio.Kolev@gmail.com", 2L);
        setUser("Stamat", "Popov", "S.Popev@gmail.com", 3L);
        setUser("Petur", "Krumov", "K.Petur@gmail.com", 4L);
        setUser("Tosho", "Todorov", "Tosho-Kukata@gmail.com", 4L);
        setUser("Gosho", "Ivanov", "Gosho_Bucata@gmail.com", 4L);
        setUser("Pesho", "Petrov", "Pesho_Peshkata@gmail.com", 4L);
        showAllPrivileges();
        showAllUsers();
    }

    public void setPrivileges(String name) {
        privilegesRepository.save(Privilege.builder()
                .privilegeName(name)
                .build());
    }

    public void showAllPrivileges() {
        List<Privilege> allPrivileges = privilegesRepository.findAll();

        String lineSeparator = "########################################";

        System.out.println(lineSeparator);
        System.out.printf("# There currently %d privileges into database \n\n", privilegesRepository.count());

        for (Privilege privilege : allPrivileges) {
            System.out.println("# ID: " +privilege.getId() + ", Type of privilege: " + privilege.getPrivilegeName());
        }
        System.out.println(lineSeparator);

    }

    public void showAllUsers() {
        List<User> allUsers = userRepository.findAll();


        System.out.printf("# There currently %d users into database \n\n", userRepository.count());

        for (User user : allUsers) {
            System.out.println("# First name: " + user.getFirstName() + ", Last Name: " +
                    user.getLastName() + ", Email: " + user.getEmailAddress() + ", Rank: " + user.getPrivilege().getPrivilegeName());
        }


    }

    public void setUser(String firstName, String lastName, String email, Long privilege_id) {
        userRepository.save(User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .emailAddress(email)
                .privilege(privilegesRepository.findById(privilege_id)
                        .orElseThrow(() -> new RuntimeException("ID not found.")))
                .build());
    }
}
