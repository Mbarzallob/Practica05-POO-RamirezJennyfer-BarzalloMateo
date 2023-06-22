/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.controlador;

import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.dao.CompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICantanteDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.idao.ICompositorDAO;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cancion;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Cantante;
import ec.edu.ups.practica05.ramirezjennyfer.barzallomateo.modelo.Compositor;
import java.util.List;

/**
 *
 * @author SOPORTETICS
 */
public class ControladorCompositor {

    private Compositor compositor;
    private Cantante cantante;

    private ICompositorDAO compositorDAO;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(CompositorDAO compositorDAO, CantanteDAO cantanteDAO) {
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }

    public void agregarCompositor(Compositor compositor) {
        this.compositor = compositor;
        compositorDAO.create(compositor);
    }

    public Compositor buscarCompositor(int codigo) {
        this.compositor = compositorDAO.read(codigo);
        return compositor;
    }

    public Compositor buscarCompositorPorCancion(String nombreCancion) {
        this.compositor = compositorDAO.buscarPorCancion(nombreCancion);
        return compositor;
    }

    public boolean actualizarCompositor(Compositor compositor) {
        Compositor compositorEncontrado = this.buscarCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.update(compositor);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCompositor(Compositor compositor) {
        Compositor compositorEncontrado = this.buscarCompositor(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.delete(compositor);
            return true;
        } else {
            return false;
        }

    }

    public List<Compositor> listar() {
        return compositorDAO.findAll();
    }

    //metodo para cantante
    public void agregarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;

        this.compositor.agregarCliente(this.cantante);
        compositorDAO.update(this.compositor);
    }

    public void eliminarCliente(Compositor compositor, Cantante cantante) {
        this.compositor = compositor;
        this.cantante = cantante;
        this.compositor.eliminarCliente(this.cantante);
        compositorDAO.update(this.compositor);
    }

    public List<Cantante> listarCantantes(Compositor compositor) {

        this.compositor = compositor;
        return this.compositor.listar();
    }

    //metodos para canciones
    public void agregarCancion(Cancion cancion, Compositor compositor) {
        this.compositor = compositor;
        this.compositor.agregarCancion(cancion);
        compositorDAO.update(this.compositor);
    }

    public Cancion buscarCancion(Compositor compositor, int codigo) {
        this.compositor = compositor;
        return this.compositor.buscarCancion(codigo);
    }

    public void eliminarCancion(Compositor compositor, Cancion cancion) {
        this.compositor = compositor;
        this.compositor.eliminarCancion(cancion);
        compositorDAO.update(this.compositor);
    }

    public void actualizarCancion(Compositor compositor, Cancion cancion) {
        this.compositor = compositor;
        this.compositor.actualizarCancion(cancion);
        compositorDAO.update(this.compositor);
    }

    public List<Cancion> listarCanciones(Compositor compositor) {
        this.compositor = compositor;
        return this.compositor.listarCanciones();
    }
}
