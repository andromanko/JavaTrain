package space.androma.ita.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import space.androma.ita.entities.User;
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
public class Dev extends AEntity<Integer> {
	
	@Column(name="DevName")
	private String DevName;
	
//	@Column(name="type")
//	private String type;
//	
//	@Column(name="IP")
//	private String aypi;
//	
//	@Column(name="addr")
//	private byte addr;
//	
//	@Column(name="port")
//	private short port;
//	
//	@Column(name="driverId")
//	private int driverId;
//	
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private User user;

}

