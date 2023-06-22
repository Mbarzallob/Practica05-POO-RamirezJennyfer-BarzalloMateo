/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Disco;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCantante {

    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCantante(CantanteDAO cantanteDAO) {
        this.cantanteDAO = cantanteDAO;
    }

    public void agregarCantante(Cantante cantante) {
        this.cantante = cantante;
        cantanteDAO.create(cantante);
    }

    public Cantante buscarCantante(int codigo) {
        this.cantante = cantanteDAO.read(codigo);
        return cantante;
    }

    public Cantante buscarCantantePorDisco(String nombreDisco) {
        this.cantante = cantanteDAO.buscarPorDisco(nombreDisco);
        return cantante;
    }

    public boolean actualizarCantante(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscarCantante(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.update(cantante);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCantante(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscarCantante(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.delete(cantante);
            return true;
        } else {
            return false;
        }

    }

    public List<Cantante> listar() {
        return cantanteDAO.findAll();
    }

    public void ingresarDisco(Cantante cantante, Disco disco) {
        this.cantante = cantante;
        this.cantante.agregarDisco(disco);
        cantanteDAO.update(this.cantante);
    }

    public Disco buscarDisco(Cantante cantante, int codigo) {
        this.cantante = cantante;
        return this.cantante.buscarDisco(codigo);
    }

    public void eliminarDisco(Cantante cantante, Disco disco) {
        this.cantante = cantante;
        this.cantante.eliminarDisco(disco);
        cantanteDAO.update(this.cantante);
    }

    public void actualizarDisco(Cantante cantante, Disco disco) {
        this.cantante = cantante;
        this.cantante.actualizarDisco(disco);
        cantanteDAO.update(this.cantante);
    }

    public List<Disco> listarDiscos(Cantante cantante) {
        this.cantante = cantante;
        return this.cantante.listarDiscos();
    }
}
