package ro.alex.classicmodels.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@Table(name = "users")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String email;

	private String password;

//	@Lob
//	private String token;

	private String username;
	
	
//	@Lob
//	private String image;
	
	
	@Column(name="is_active")
	private Integer isActive;


	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getToken() {
//		return this.token;
//	}
//
//	public void setToken(String token) {
//		this.token = token;
//	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

//	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//	private List<BillUserJoinTable> relationships = new ArrayList<>();

//	public void addRelationship(BillProduct billProduct) {
//		BillUserJoinTable relationship = new BillUserJoinTable(billProduct, this);
//		relationships.add(relationship);
//		billProduct.getRelationship().add(relationship);
//	}

//	public List<BillUserJoinTable> getRelationships() {
//		return relationships;
//	}
//
//	public void setRelationships(List<BillUserJoinTable> relationships) {
//		this.relationships = relationships;
//	}

	
	
//	public void removeTag(Tag tag) {
//		for (Iterator<PostTag> iterator = tags.iterator(); iterator.hasNext();) {
//			PostTag postTag = iterator.next();
//
//			if (postTag.getPost().equals(this) && postTag.getTag().equals(tag)) {
//				iterator.remove();
//				postTag.getTag().getPosts().remove(postTag);
//				postTag.setPost(null);
//				postTag.setTag(null);
//			}
//		}
//	}

}