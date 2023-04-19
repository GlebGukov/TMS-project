package com.example.coursework.models;

import com.example.coursework.security.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor


@Entity(name = "users")
public class UserEntity {

    @Id
    private UUID id;
    @NotNull
    private String login;
    @NotNull
    private String password;
    private String first_name;
    private String last_name;
    @NotNull
    private String email;
    private Boolean status;
    @Enumerated(EnumType.STRING)
    private Role role;

}
