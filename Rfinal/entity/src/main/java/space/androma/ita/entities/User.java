package space.androma.ita.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import space.androma.ita.entities.Dev;
import space.androma.ita.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
//import lombok.extern.slf4j.Slf4j;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder 
@Entity
@Table(name="user")
public class User extends AEntity<Integer> {
	
	@Column(name="ulogin")
	private String ulogin;
	
//	@Column(name="upassword")
//	private String upassword;
//	
//	@Column(name="uinfo")
//	private String uinfo;
	
//	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, orphanRemoval = true)
	    private List<Dev> devs;

//	    @ManyToMany(fetch = FetchType.LAZY)
//	    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	    private Set<Role> roles;
	    
	    public String getLogin() {
	        return ulogin;
	    }

	    public void setLogin(String login) {
	        this.ulogin = login;
	    }

//	    public String getInfo() {
//	        return uinfo;
//	    }
//
//	    public void setInfo(String info) {
//	        this.uinfo = info;
//	    }

	    public List<Dev> getDevs() {
	        return devs;
	    }

	    public void setDevs(List<Dev> devs) {
	        this.devs.clear();
	        this.devs.addAll(devs);
	    }
	    
	    public Set<Role> getRoles() {
	        if (roles == null) {
	            roles = new HashSet<>();
	        }
	        return roles;
	    }

	    public void setRoles(Set<Role> roles) {
	        this.roles = roles;
	    }
	    
//	    public String getPassword() {
//	        return upassword;
//	    }
//
//	    public void setPassword(String password) {
//	        this.upassword = password;
//	    }

}

