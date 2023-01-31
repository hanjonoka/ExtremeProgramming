package fr.oxyl.formation.xp.dao.springdata;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO add more fields and for all others models/entities
@Entity
public class SeanceEntity {

  @Id
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
