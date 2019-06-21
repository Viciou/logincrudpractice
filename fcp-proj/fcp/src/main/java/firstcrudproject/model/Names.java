package firstcrudproject.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.security.GeneralSecurityException;
import java.util.List;

@Entity
@Table(name = "names_table")
public class Names {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "names_name")
    private String names_name;

    @NotBlank
    @Column(name = "names_password")
    private String names_password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNames_name() {
        return names_name;
    }

    public void setNames_name(String names_name) {
        this.names_name = names_name;
    }

    public String getNames_password() {
        return names_password;
    }

    public void setNames_password(String names_password) {
        this.names_password = names_password;
    }
}
