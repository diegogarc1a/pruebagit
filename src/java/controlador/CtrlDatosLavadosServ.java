/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import HibernateUtil.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import modelo.Lavado;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Diego
 */
@ManagedBean(name = "ctrldatoslavadosservice")
@ApplicationScoped
public class CtrlDatosLavadosServ {

    private List<Lavado> lstlavados;
    private SessionFactory sf;

    public CtrlDatosLavadosServ() {
        this.sf = HibernateUtil.getSessionFactory();
    }

    public List<Lavado> obtenerListaLavadoPorMes(String mes, String año) {
        Session sesion = this.sf.openSession();
        Query consulta = sesion.createQuery("from Lavado l where month(l.fecha) = " + mes + " and year(l.fecha) =" +año+"");
        lstlavados = consulta.list();
        sesion.close();
        return lstlavados;
    }

    public ArrayList obtenerBalanceTrimestral(String trimestre, String año) {
        ArrayList list = new ArrayList();
        Session sesion = this.sf.openSession();
        Query consulta = sesion.createQuery("select cast(sum(pe.precio)as double)-(select cast(sum(ca.sueldo*3) as double) "
                + "from Empleado e inner join e.cargo as ca) as balancetrismestral from Lavado l inner join l.precioservicio as pe "
                + "where round((month(l.fecha)/3)+0.33) = " +trimestre +" AND year(l.fecha)="+año +"");
        list = (ArrayList) consulta.list();
        sesion.close();
        return list;
    }
    
    public void probarBalance(String trimestre, String año){
        ArrayList prueba = new ArrayList();
        prueba = obtenerBalanceTrimestral(trimestre,año);
        System.out.println(prueba);
    }

    public void probarMetodo(String mes, String año) {
        for (Lavado lavado : obtenerListaLavadoPorMes(mes,año)) {
            System.out.println("EL LAVADO " + lavado.getIdlavado());
        }
    }

    public List<Lavado> getLstlavados() {
        return lstlavados;
    }

    public void setLstlavados(List<Lavado> lstlavados) {
        this.lstlavados = lstlavados;
    }

}
