package test;

import lombok.Data;

import javax.persistence.*;

@Entity
public @Data
class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "child_property_id")
    private ChildProperty childProperty;

}