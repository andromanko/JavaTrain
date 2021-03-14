package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="device")
public class Device extends AEntity<Integer> {
	
	@Column(name="IP")
	private String ip;
	
	@Column(name="addr")
	private byte addr;
	
	@Column(name="driverId")
	private int driverId;
	
//	OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade =CascadeType.PERSIST, orphanRemoval=true)
//	private List<Events> pets;

}

