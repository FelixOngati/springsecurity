package org.fegati.springsec.models;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Created by xenial on 7/12/16.
 */
@Entity
@Table(name = "PERMISSIONS")
public class Permissions  implements GrantedAuthority{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Permissions(){}

    public Permissions(String name){
        this.name = name;
    }

    @Column(unique = true)
    private String name;
    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
