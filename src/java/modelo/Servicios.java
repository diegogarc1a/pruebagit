package modelo;
// Generated 04-27-2021 08:40:30 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Servicios generated by hbm2java
 */
@Entity
@Table(name="servicios"
    ,schema="public"
)
public class Servicios  implements java.io.Serializable {


     private int idservicios;
     private String nombreservicio;
     private Set<Precioservicio> precioservicios = new HashSet<Precioservicio>(0);

    public Servicios() {
    }

	
    public Servicios(int idservicios) {
        this.idservicios = idservicios;
    }
    public Servicios(int idservicios, String nombreservicio, Set<Precioservicio> precioservicios) {
       this.idservicios = idservicios;
       this.nombreservicio = nombreservicio;
       this.precioservicios = precioservicios;
    }
   
     @Id 

    
    @Column(name="idservicios", nullable=false)
    public int getIdservicios() {
        return this.idservicios;
    }
    
    public void setIdservicios(int idservicios) {
        this.idservicios = idservicios;
    }

    
    @Column(name="nombreservicio", length=50)
    public String getNombreservicio() {
        return this.nombreservicio;
    }
    
    public void setNombreservicio(String nombreservicio) {
        this.nombreservicio = nombreservicio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="servicios")
    public Set<Precioservicio> getPrecioservicios() {
        return this.precioservicios;
    }
    
    public void setPrecioservicios(Set<Precioservicio> precioservicios) {
        this.precioservicios = precioservicios;
    }




}


