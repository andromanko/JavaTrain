package space.androma.ita.entities;

import java.util.Date;

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
@Table(name="cdata")
public class CurrentData extends AEntity<Integer> {
	
	@Column(name="eventDT")
	private String eventDateTime;
	
//	@Column(name="vvvar1")
//	private int vvar1;
//	
//	@Column(name="vvvvar2")
//	private int vvar2;
//	
//	@Column(name="vvvvar3")
//	private int vvar3;
//	
//	
//	OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade =CascadeType.PERSIST, orphanRemoval=true)
//	private List<Events> pets;

}

