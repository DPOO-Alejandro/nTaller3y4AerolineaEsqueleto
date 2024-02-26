package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta extends Aeropuerto
{
    // TODO completar
	


    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
	
	public String horaSalida;
	public String horaLlegada;
	public String codigoRuta;
	private Aeropuerto origen;
	private Aeropuerto destino;
    
	public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public Ruta(String horaSalida, String horaLlegada, String codigoRuta, Aeropuerto origen, Aeropuerto destino) {
    	this.codigoRuta = codigoRuta;
    	this.horaLlegada = horaLlegada;
    	this.destino = destino;
    	this.origen = origen;
    	this.horaSalida = horaSalida;
    	
    }
    
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

	public String getHoraSalida() {
		return horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public String getCodigoRuta() {
		return codigoRuta;
	}

	public Aeropuerto getOrigen() {
		return origen;
	}

	public Aeropuerto getDestino() {
		return destino;
	}
	
    

    
}