package webapp.familyTogether.role;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum Permission {

    USERS_READ("users:read"),
    USERS_WRITE("users:write");

    private final String permission;

    public String getPermission() {
        return permission;
    }
}
