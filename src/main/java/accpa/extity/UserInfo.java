package accpa.extity;

import java.io.Serializable;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public class UserInfo implements Serializable {
    private String username;
    private String password;
    private String email;

    public UserInfo(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserInfo() {

    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
