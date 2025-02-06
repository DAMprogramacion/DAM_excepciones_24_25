package ejercicios.ejercicio2;

public class Numero {
    private SistemaNumerico sistemaNumerico;
    private String valor;

    public Numero(SistemaNumerico sistemaNumerico, String valor) throws BinarioException, HexadecimalException {
        if (sistemaNumerico.equals(SistemaNumerico.BINARIO)){
            if (valor.matches("[01]+")) {
                this.sistemaNumerico = sistemaNumerico;
                this.valor = valor;
            } else
                throw new BinarioException();
        }
        if (sistemaNumerico.equals(SistemaNumerico.HEXADECIMAL)){
            if (valor.matches("[0-9a-fA-F]+")) {
                this.sistemaNumerico = sistemaNumerico;
                this.valor = valor;
            } else
                throw new HexadecimalException();
        }

    }

    public SistemaNumerico getSistemaNumerico() {
        return sistemaNumerico;
    }

    public String getValor() {
        return valor;
    }
    public int calcularValorDecimal() {
        switch (sistemaNumerico) {
            case DECIMAL -> {
                return Integer.parseInt(valor);
            }
            case BINARIO -> {
                return calcularValorBinario();
            }
            case HEXADECIMAL -> {
                return calcularValorHexadecimal();
            }
            case OCTAL -> {
                return Integer.parseInt(valor, 8);
            }
            default -> throw new IllegalStateException("Unexpected value: " + sistemaNumerico);
        }

    }

    private int calcularValorHexadecimal() {
        StringBuilder builder = new StringBuilder(valor.toUpperCase()).reverse();
        String valorReverse = builder.toString();
        int suma = 0;
        for (int i = 0; i < valorReverse.length(); i++) {
            if (Character.isDigit(valorReverse.charAt(i)))
                suma += (valorReverse.charAt(i) - 48) * Math.pow(16, i);
            else
            suma += (valorReverse.charAt(i) - 55) * Math.pow(16, i);
        }
        return suma;
    }

    private int calcularValorBinario() {
        StringBuilder builder = new StringBuilder(valor).reverse();
        String valorReverse = builder.toString();
        int suma = 0;
        for (int i = 0; i < valorReverse.length(); i++) {
            if (valorReverse.charAt(i) == '1')
                suma += (int) Math.pow(2, i);
        }
        return suma;
    }

    public static void main(String[] args) throws HexadecimalException, BinarioException {
        Numero numero1 = new Numero(SistemaNumerico.HEXADECIMAL, "10");
        Numero numero2 = new Numero(SistemaNumerico.HEXADECIMAL, "1a0");
        Numero numero3 = new Numero(SistemaNumerico.HEXADECIMAL, "100a");
        Numero numero4 = new Numero(SistemaNumerico.HEXADECIMAL, "100ah");
        System.out.println(numero1.calcularValorHexadecimal() + " debe dar 16");
        System.out.println(numero2.calcularValorHexadecimal() + " debe dar 416");
        System.out.println(numero3.calcularValorHexadecimal() + " debe dar 4106");

    }


}
