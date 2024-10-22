package com.example;
import java.util.Vector;

public class Compra {
	private String _numeroDeCompra;
	private Object _fecha;
	private double _total;
	private String _formaDePago;
	private ProductoCompra _productosComprados;
	public Cliente _historialCompras;
	public Tienda _listaCompras;
	public Vector<ProductoCompra> _compra = new Vector<ProductoCompra>();

	public void agregarProducto() {
		throw new UnsupportedOperationException();
	}

	public void calcularTotal() {
		throw new UnsupportedOperationException();
	}

	public void modificarCompra() {
		throw new UnsupportedOperationException();
	}
}