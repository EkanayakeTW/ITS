/**
 * 
 */
package model;

/**
 * @author Ekanayaketw
 *
 */
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class role {
	
	private int id;
	private String name;
	private Set users;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
	    return id;
	}

	public void setId(int id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	@ManyToMany(mappedBy = "roles")
	public Set getUsers() {
	    return users;
	}

	public void setUsers(Set users) {
	    this.users = users;
	}

}
