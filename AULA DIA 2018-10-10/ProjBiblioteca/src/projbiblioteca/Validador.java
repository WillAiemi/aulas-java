package projbiblioteca;
public class Validador {
    public final static boolean checaDatas(int dia, int mes, int ano){
        if ((dia > 0 && dia <= 31 && mes > 0 && mes <= 12) && (((mes == 2) && ((dia <= 28) || ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0) && dia <= 29))) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia <= 30) || (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12))) {
            return true;
        }
        return false;
    }
}
