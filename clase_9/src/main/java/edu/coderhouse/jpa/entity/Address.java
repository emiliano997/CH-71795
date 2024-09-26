package edu.coderhouse.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ADDRESS")
public class Address {

  public Address () {}

  public Address(String street, int number, int floor, String department, String cp, String location, String state) {
    this.street = street;
    this.number = number;
    this.floor = floor;
    this.department = department;
    this.cp = cp;
    this.location = location;
    this.state = state;
  }

  public Address(String street, int number) {
    this.street = street;
    this.number = number;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private int id;

  @Column(name = "STREET")
  @Getter
  @Setter
  private String street;

  @Column(name = "NUMBER")
  @Getter
  @Setter
  private int number;

  @Column(name = "FLOOR")
  @Getter
  @Setter
  private int floor;

  @Column(name = "DEPARTMENT")
  @Getter
  @Setter
  private String department;

  @Column(name = "CP")
  @Getter
  @Setter
  private String cp;

  @Column(name = "LOCATION")
  @Getter
  @Setter
  private String location;

  @Column(name = "STATE")
  @Getter
  @Setter
  private String state;

  @ManyToOne(fetch = FetchType.LAZY)
  @Getter
  @Setter
  private Client client;

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
