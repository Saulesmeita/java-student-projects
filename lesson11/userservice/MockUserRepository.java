package lv.javaguru.lesson11.userservice;

public class MockUserRepository extends UserRepository {

    public boolean isMockTriggered = false;

    @Override
    public void save(User user) {
        isMockTriggered = true;
    }
}
