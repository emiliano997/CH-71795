package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "CLIENT")
public class Client {

  public Client() {}

  public Client(String name, String lastname, int dni) {
    this.name = name;
    this.lastname = lastname;
    this.dni = dni;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Column(name = "NAME")
  @Getter
  @Setter
  private String name;

  @Column(name = "LASTNAME")
  @Getter
  @Setter
  private String lastname;

  @Column(name = "DNI")
  @Getter
  @Setter
  private int dni;

  @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @Getter
  @Setter
  private List<Address> addresses;

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }
}
