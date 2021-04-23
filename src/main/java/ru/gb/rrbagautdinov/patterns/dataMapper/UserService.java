package ru.gb.rrbagautdinov.patterns.dataMapper;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser() {
        userRepository.findUserById();
    }
}
