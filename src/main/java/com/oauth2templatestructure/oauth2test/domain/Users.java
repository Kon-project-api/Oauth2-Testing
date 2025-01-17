package com.oauth2templatestructure.oauth2test.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tb_usr")
@lombok.NoArgsConstructor
public class Users {
    @Id
    private Long id;

    @Column(name = "usr_nm", length = 50)
    private String username;

    @Column(name = "pwd", length = 50)
    private String password;

    @Column(name = "em", length = 50)
    private String email;

    @Column(name = "tel", length = 20)
    private String tel;

    @Builder
    public Users(Long id, String username, String password, String email, String tel) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.tel = tel;
    }
}
