package org.mmonti.neo4j.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by mmonti on 4/28/17.
 */
@Data
@NodeEntity
@AllArgsConstructor
@ToString(of = "name")
@EqualsAndHashCode(of = "name")
public class Address {

    @GraphId
    private Long id;
    private String name;

    private Address() {}
}
