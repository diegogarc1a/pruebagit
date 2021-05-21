/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import modelo.Lavado;

/**
 *
 * @author Diego
 */
@ManagedBean(name="consultalavadospormes")
@ViewScoped
public class consultaLavadosPorMesBean {

    private String mes="";
    private String año="";
    private List<Lavado> lstlavado = new ArrayList<>();
    
    
     @ManagedProperty("#{ctrldatoslavadosservice}")
     private CtrlDatosLavadosServ lavadosservice;
        
     
     public void llenarLavado(){
         lstlavado = lavadosservice.obtenerListaLavadoPorMes(mes,año);
     }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }


    public List<Lavado> getLstlavado() {
        return lstlavado;
    }

    public void setLstlavado(List<Lavado> lstlavado) {
        this.lstlavado = lstlavado;
    }

    public CtrlDatosLavadosServ getLavadosservice() {
        return lavadosservice;
    }

    public void setLavadosservice(CtrlDatosLavadosServ lavadosservice) {
        this.lavadosservice = lavadosservice;
    }
    
}
