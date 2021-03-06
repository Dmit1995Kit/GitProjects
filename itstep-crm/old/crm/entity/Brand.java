package org.itstep.crm.entity;

import javax.persistence.*;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT UNSIGNED NOT NULL")
    private Long id;

    @Column(name = "name", columnDefinition = "VARCHAR(255) NOT NULL")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
