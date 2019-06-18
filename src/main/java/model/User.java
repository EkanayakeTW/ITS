/**
 * 
 */
package model;

import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = "user")
public class User {
	
	private int id;
	private String username;
	private String password;
	private String passwordConfirm;
	private Set roles;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
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

	@Transient
	public String getPasswordConfirm() {
	    return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
	    this.passwordConfirm = passwordConfirm;
	}

	@ManyToMany
	@JoinTable(name = "user_role", 
	joinColumns = @JoinColumn(name = "user_id"), 
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	public Set getRoles() {
	    return roles;
	}

	public void setRoles(Set roles) {
	    this.roles = roles;
	}

}
