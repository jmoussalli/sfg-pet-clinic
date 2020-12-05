package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Package :  guru.springframework.sfgpetclinic.model
 * Created by jerom on 05/12/2020 at 07:54
 */
public class BaseEntity implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
