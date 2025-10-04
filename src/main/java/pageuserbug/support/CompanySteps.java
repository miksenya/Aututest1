package pageuserbug.support;

import pageuserbug.client.UserClient;

public class CompanySteps {
    private final UserClient userClient;

    public CompanySteps(UserClient userClient) {
        this.userClient = userClient;
    }

    /** Регистрирует пользователей, если их ещё нет (эндпоинт возвращает 200 и при «уже есть»). */
    public void ensureMembersExist(String owner, String... users) {
        userClient.ensureUser(owner, "Owner QA");
        for (int i = 0; i < users.length; i++) {
            String email = users[i];
            String name  = "User " + (i + 1);
            userClient.ensureUser(email, name);
        }
    }
}
