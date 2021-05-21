/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Diego
 */
@ManagedBean(name="consultaobtenerbalancetrimestral")
@ViewScoped
public class consultaObtenerBalanceTrimestral {
    
    private String trimestre="";
    private String año="";
    private ArrayList lstBalance = new ArrayList<>();
    /**
     * Creates a new instance of consultaObtenerBalanceTrimestral
     */
    @ManagedProperty("#{ctrldatoslavadosservice}")
     private CtrlDatosLavadosServ lavadosservice;
   
    public void llenarBalance(){
        lstBalance = lavadosservice.obtenerBalanceTrimestral(trimestre,año);
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    
    public ArrayList getLstBalance() {
        return lstBalance;
    }

    public void setLstBalance(ArrayList lstBalance) {
        this.lstBalance = lstBalance;
    }

    public CtrlDatosLavadosServ getLavadosservice() {
        return lavadosservice;
    }

    public void setLavadosservice(CtrlDatosLavadosServ lavadosservice) {
        this.lavadosservice = lavadosservice;
    }
    
    
}
