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
@Table(name="event")
public class Event extends AEntity<Integer> {
	
//	@Column(name="EdateTime")//время события
//	private String EdateTime;
//	
//	@Column(name="edevId")//ИД девайса в котором зафиксирована авария
//	private String edevId;
//	
//	@Column(name="euserId") //ИД юзера (чья смена), может быть 0
//	private int euserId;
//	
//	@Column(name="eeventId") //ИД события из таблицы
//	private int eeventId;
//	
//	@Column(name="evalue1")//переменная 1
//	private int evalue1;
//	
//	@Column(name="evalue2")//переменная 2
//	private int evalue2;
//	
//	@Column(name="ewarning")//признак предупроеждения события
//	private boolean ewarning;
//	
//	@Column(name="ealarm") //признак аварийного события
//	private boolean ealarm;
	
	@Column(name="echDate") //время квитирования
	private String echDate;
	
//	OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade =CascadeType.PERSIST, orphanRemoval=true)
//	private List<Events> pets;

}

