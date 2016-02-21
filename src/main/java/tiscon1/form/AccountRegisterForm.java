package tiscon1.form;

import lombok.Data;
import tiscon1.model.UserPrincipal;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Pattern;

import java.io.Serializable;
import javax.persistence.Column;

import java.util.List;
import java.util.ArrayList;
/**
 * @author kawasima
 */
@Data
public class AccountRegisterForm implements Serializable {
    @Size(min = 1, max = 100)
    @NotNull

    @Column(unique=true)
    private String name;





    @NotNull
    @Pattern(regexp = "^[^0-9][a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[@][a-zA-Z0-9_]+([.][a-zA-Z0-9_]+)*[.][a-zA-Z]{2,4}$", message = "入力形式にマッチしていません")
    private String email;

    @Size(min = 6)
    @NotNull
    private String password;
}
