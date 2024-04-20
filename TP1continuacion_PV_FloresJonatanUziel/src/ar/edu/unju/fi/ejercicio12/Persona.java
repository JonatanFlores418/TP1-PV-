package ar.edu.unju.fi.ejercicio12;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    private String nombre;
    private Calendar fechaNacimiento;

    public Persona(String nombre, Calendar fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        Calendar hoy = new GregorianCalendar();
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.DAY_OF_YEAR) < fechaNacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    public String obtenerSignoZodiaco() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        int dia = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            return "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            return "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            return "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            return "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            return "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            return "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            return "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            return "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            return "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            return "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            return "Acuario";
        } else {
            return "Piscis";
        }
    }

    public String obtenerEstacion() {
        int mes = fechaNacimiento.get(Calendar.MONTH) + 1;
        switch (mes) {
            case 1:
            case 2:
                return "Verano";
            case 3:
                if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 20) {
                    return "Verano";
                } else {
                    return "Otoño";
                }
            case 4:
            case 5:
                return "Otoño";
            case 6:
                if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
                    return "Otoño";
                } else {
                    return "Invierno";
                }
            case 7:
            case 8:
                return "Invierno";
            case 9:
                if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 22) {
                    return "Invierno";
                } else {
                    return "Primavera";
                }
            case 10:
            case 11:
                return "Primavera";
            case 12:
                if (fechaNacimiento.get(Calendar.DAY_OF_MONTH) <= 21) {
                    return "Primavera";
                } else {
                    return "Verano";
                }
            default:
                return "";
        }
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public Calendar getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(Calendar fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
}
