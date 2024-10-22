package com.example;
import java.util.Vector;

public class Tienda {
	private String _nombreTienda;
	private String _direccion;
	private String _horarioDeAtencion;
	private Empleado _empleados;
	private Producto _productos;
	private Compra _compras;
	public Ciudad _listaTiendas;
	public Vector<Producto> _tienda = new Vector<Producto>();
	public Vector<Empleado> _tiendaAsignada = new Vector<Empleado>();

	public void asignarEmpleado() {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado() {
		throw new UnsupportedOperationException();
	}

	public void consultarEmpleados() {
		throw new UnsupportedOperationException();
	}

	public void agregarProducto() {
		throw new UnsupportedOperationException();
	}

	public void eliminarProducto() {
		throw new UnsupportedOperationException();
	}

	public void registrarCompra() {
		throw new UnsupportedOperationException();
	}

	public void consultarCompras() {
		throw new UnsupportedOperationException();
	}
}