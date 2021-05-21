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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,schema="public"
)
public class Cliente  implements java.io.Serializable {


     private String duicliente;
     private String nombrecliente;
     private String apellidocliente;
     private String direccioncliente;
     private String telefonocliente;
     private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>(0);

    public Cliente() {
    }

	
    public Cliente(String duicliente) {
        this.duicliente = duicliente;
    }
    public Cliente(String duicliente, String nombrecliente, String apellidocliente, String direccioncliente, String telefonocliente, Set<Vehiculo> vehiculos) {
       this.duicliente = duicliente;
       this.nombrecliente = nombrecliente;
       this.apellidocliente = apellidocliente;
       this.direccioncliente = direccioncliente;
       this.telefonocliente = telefonocliente;
       this.vehiculos = vehiculos;
    }
   
     @Id 

    
    @Column(name="duicliente", nullable=false, length=10)
    public String getDuicliente() {
        return this.duicliente;
    }
    
    public void setDuicliente(String duicliente) {
        this.duicliente = duicliente;
    }

    
    @Column(name="nombrecliente", length=50)
    public String getNombrecliente() {
        return this.nombrecliente;
    }
    
    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    
    @Column(name="apellidocliente", length=50)
    public String getApellidocliente() {
        return this.apellidocliente;
    }
    
    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    
    @Column(name="direccioncliente", length=100)
    public String getDireccioncliente() {
        return this.direccioncliente;
    }
    
    public void setDireccioncliente(String direccioncliente) {
        this.direccioncliente = direccioncliente;
    }

    
    @Column(name="telefonocliente", length=9)
    public String getTelefonocliente() {
        return this.telefonocliente;
    }
    
    public void setTelefonocliente(String telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    public Set<Vehiculo> getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }




}


