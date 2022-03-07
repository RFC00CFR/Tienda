
package com.tienda.entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // La clase pais es una entidad que va a consultar la tabla pais
@Table (name="paises")
public class Pais implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // duda no aparece en italic
    private long id;
    private String pais;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
