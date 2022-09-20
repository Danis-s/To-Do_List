package com.example.demo.Entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 2, message = "At least 5 characters")
    @Column(name = "username")
    private String username;
    @Size(min = 2, message = "At least 5 characters")
    @Column(name = "password")
    private String password;
    @Transient
    @Column(name = "passwordConfirm")
    private String passwordConfirm;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ToDoListEntity> toDoListEntities;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<RoleEntity> roles;


    public UserEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        if(password == null){
            return "error";
        }
        return password;
    }

    public List<ToDoListEntity> getToDoListEntities() {
        return toDoListEntities;
    }

    public void setToDoListEntities(List<ToDoListEntity> toDoListEntities) {
        this.toDoListEntities = toDoListEntities;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleEntity> roles) {
        this.roles = roles;
    }

    public void setToDoListEntities(ToDoListEntity toDoListEntities1) {
        toDoListEntities.add(toDoListEntities1);
    }

    public void deleteFromToDoListEntities(long id) {
        for(int i = 0; i < toDoListEntities.size(); i++){
            if(toDoListEntities.get(i).getId() == id){
                toDoListEntities.remove(i);
            }
        }
    }
    public String toString() {
        return
                "User: "+ '\''
                        + "name: "
                        + username + ", "
                        + "password:"
                        + password + ", "
                        + "confirmPassword"
                        + passwordConfirm;
    }
}
