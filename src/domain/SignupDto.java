package domain;

public class SignupDto {
    private String username;
    private String password;
    private String job;

    public SignupDto(String username, String password, String job) {
        this.username = username;
        this.password = password;
        this.job = job;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getjob() {
        return job;
    }
}
