package entity;

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
	
	@Column(name="dateTime")//время события
	private Date date;
	
	@Column(name="devId")//ИД девайса в котором зафиксирована авария
	private String devId;
	
	@Column(name="userId") //ИД юзера (чья смена), может быть 0
	private int userId;
	
	@Column(name="eventId") //ИД события из таблицы
	private int eventId;
	
	@Column(name="val1")//переменная 1
	private int val1;
	
	@Column(name="val2")//переменная 2
	private int val2;
	
	@Column(name="warning")//признак предупроеждения события
	private boolean warning;
	
	@Column(name="alarm") //признак аварийного события
	private boolean alarm;
	
	@Column(name="chDate") //время квитирования
	private Date chDate;
	
//	OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade =CascadeType.PERSIST, orphanRemoval=true)
//	private List<Events> pets;

}

