package com.example;
import java.util.Vector;

public class Cliente {
	private String _nombre;
	private String _numeroDeCliente;
	private Compra _historialDeCompras;
	public Vector<Compra> _cliente = new Vector<Compra>();

	public void registrarCompra() {
		throw new UnsupportedOperationException();
	}

	public void consultarHistorialCompras() {
		throw new UnsupportedOperationException();
	}
}