package publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Articulo {
	private String titulo;
	private List<String> autores;
	private String  filiacion;
	private String  tipo;
	private String lugarPublicado;
	private List<String> palabrasClaves;
	
	public Articulo(String titulo, String filiacion, String tipo, String lugarPublicado) {
		this.titulo = titulo;
		this.autores = new ArrayList<>();
		this.filiacion = filiacion;
		this.tipo = tipo;
		this.lugarPublicado = lugarPublicado;
		this.palabrasClaves = new ArrayList<>();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "titulo=" + titulo
				+ ", autores=" + autores
				+ ", filiacion=" + filiacion 
				+ ", tipo=" + tipo
				+ ", lugarPublicado=" + lugarPublicado 
				+ ", palabrasClaves=" + palabrasClaves;
	}	
}
