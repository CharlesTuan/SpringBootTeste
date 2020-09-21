package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usuario", schema="projetospring")
public class Usuario {

	private Long id;
}
