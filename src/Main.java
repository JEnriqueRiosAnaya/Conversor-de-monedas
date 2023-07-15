import conversores.*;
import pantallas.Pantallas;
public class Main {
	 public static void main(String[] args) {
	        //Conversores a seleccionar
	        Object[] posiblesValores = { "Conversor de Monedas"};

	        //captura de errores
	        try {
	            //llamada a la pantalla para seleccionar un conversor, se envia titulo, mensaje y opciones posibles a seleccionar
	            Object opcionSeleccionada = Pantallas.Selector("Conversor", "Seleccione una opcion", posiblesValores);

	            //dependiendo de la opcion se llama al conversor correspondiende
	            if(opcionSeleccionada == posiblesValores[0]) {
	                Converciones.Monedas();
	            }else {
	                Pantallas.Message("La opcion no es valida");
	            }

	            //ventana de desea continuar
	            int opciones = Pantallas.Confirmacion("Conversor", "Desea Continuar");

	            //si desea continuar se vuelve  a llamar la fincion si no se envia el mensa de finalizacion
	            if (opciones == 0) {
	                Main.main(args);
	            } else {
	                Pantallas.Message("Programa finalizado");
	            }

	        } catch (Exception e) {
	            Pantallas.Message("Ha ocurrido el error: \n" + e);
	        }
	    }
}
