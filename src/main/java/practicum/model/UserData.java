package practicum.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserData {
    private String email;
    private String password;
    private String name;
}
