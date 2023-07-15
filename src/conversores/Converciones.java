package conversores;

import java.text.DecimalFormat;
import pantallas.Pantallas;

public class Converciones {
	public static void Monedas() {
		String[] posiblesValores = {
                "Dolares a Peso Mexicano",//0
                "Euro a Peso Mexicano",//1
                "Libras Esterlinas a Peso Mexicano",//2
                "Yen Japones a Peso Mexicano",//3
                "Won Sur-Coreano a Peso Mexicano",//4
                "Peso Mexicano a Dolares",//5
                "Peso Mexicano a Euro",//6
                "Peso Mexicano a Libras Esterlinas",//7
                "Peso Mexicano a Yen Japones",//8
                "Peso Mexicano a Won Sur-Coreano"//9
        };
        DecimalFormat df = new DecimalFormat("#.##");

        try {

            //llamada a la pantalla para que el usuario ingrese la cantidad
            String cantidad = Pantallas.Entrada("Ingrese la cantidad que desea convertir");
            //llamada  a la pantalla para que el usuario seleccione la conversion
            Object opcionSeleccionada = Pantallas.Selector("Seleccione una opcion", "Conversor Moneda", posiblesValores);

            //conversion respectiva dependiendo la opcion y llamada a la pantalla que muestra el resultado
            if (opcionSeleccionada == posiblesValores[0]) {
                double total = Double.parseDouble(cantidad) * 16.84;
                Pantallas.Message("$" + cantidad + " dolares son $" + df.format(total) + " pesos mexicanos");
            } else if (opcionSeleccionada == posiblesValores[5]) {
                double total = Double.parseDouble(cantidad) / 16.84;
                Pantallas.Message("$" + cantidad + " pesos mexicanos son $" + df.format(total) + " dolares");
            }else if (opcionSeleccionada == posiblesValores[1]) {
                double total = Double.parseDouble(cantidad) * 18.84;
                Pantallas.Message("€" + cantidad + " euros son $" + df.format(total) + " pesos mexicanos");
            }else if (opcionSeleccionada == posiblesValores[6]) {
                double total = Double.parseDouble(cantidad) / 18.84;
                Pantallas.Message("$" + cantidad + " pesos mexicanos son €" + df.format(total) + " euros");
            }else if (opcionSeleccionada == posiblesValores[2]) {
                double total = Double.parseDouble(cantidad) * 21.93;
                Pantallas.Message("£" + cantidad + " libras esterlinas son $" + df.format(total) + " pesos mexicanos");
            }else if (opcionSeleccionada == posiblesValores[7]) {
                double total = Double.parseDouble(cantidad) / 21.93;
                Pantallas.Message("$" + cantidad + " pesos mexicanos son £" + df.format(total) + " libras esterlinas");
            }else if (opcionSeleccionada == posiblesValores[3]) {
                double total = Double.parseDouble(cantidad) * 0.12;
                Pantallas.Message("¥" + cantidad + " yen japones son $" + df.format(total) + " pesos mexicanos");
            }else if (opcionSeleccionada == posiblesValores[8]) {
                double total = Double.parseDouble(cantidad) / 0.12;
                Pantallas.Message("$" + cantidad + " pesos mexicanos son ¥" + df.format(total) + " yen japones");
            }else if (opcionSeleccionada == posiblesValores[4]) {
                double total = Double.parseDouble(cantidad) * 0.013;
                Pantallas.Message("₩" + cantidad + " won sur-corenao son $" + df.format(total) + " pesos mexicanos");
            }else if (opcionSeleccionada == posiblesValores[9]) {
                double total = Double.parseDouble(cantidad) / 0.013;
                Pantallas.Message("$" + cantidad + " pesos mexicanos son ₩" + df.format(total) + " won sur-coreano");
            } else {
                Pantallas.Message("La opcion seleccionada no es valida");
            }


        } catch (NumberFormatException ex) {
            Pantallas.Message("El valor ingresado no es valido");
        } catch (Exception ex) {
            Pantallas.Message("Ha ocurrido el error: \n" + ex);
        }
	}
}
