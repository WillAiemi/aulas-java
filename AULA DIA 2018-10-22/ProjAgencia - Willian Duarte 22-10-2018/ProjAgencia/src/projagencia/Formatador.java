package projagencia;

public class Formatador {
    
    private static String adicionador(int tamanho, String caractere){
        String r = "";
        for (int i = 0; i < tamanho; i++) {
            r += caractere;
        }
        return r;
    }
    
    public static String titulo(String titulo){
        int pontos = 62 - titulo.length();
        if (pontos % 2 == 0) {
            pontos /= 2;
            return adicionador(pontos, ":") + titulo + adicionador(pontos, ":");
        } else {
            pontos /= 2;
            return adicionador(pontos, ":") + titulo + adicionador(pontos+1, ":");
        }
    }
    
    public static String espacosToString(String z, int x) {
        int espacos = 55 - x - z.length();
        return adicionador(espacos, " ") + "::";
    }
}
