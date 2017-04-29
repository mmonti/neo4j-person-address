package org.mmonti.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by mmonti on 4/28/17.
 */
@Data
@NodeEntity
@AllArgsConstructor
@EqualsAndHashCode(of = "name")
public class Person {

    @GraphId
    private Long id;
    private String name;

    @Relationship(type = "LIVES_IN")
    private ArrayList<Address> addresses = new ArrayList<>();

    private Person() {}

    public void add(final Address address) {
        this.addresses.add(address);
    }
}
