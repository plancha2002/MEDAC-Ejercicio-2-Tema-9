public class CartaFrancesa extends CartaGenerica {
    public CartaFrancesa() {
    }

    public CartaFrancesa(String palo, int numero) {
        if ((palo.equals("Corazones") || palo.equals("Picas") || palo.equals("Rombos") || palo.equals("Treboles"))) {
            setPalo(palo);

        } else {
            String[] palos = new String[4];
            palos[0] = "Corazones";
            palos[1] = "Picas";
            palos[2] = "Rombos";
            palos[3] = "Treboles";

            int numeroRamdom = (int) (Math.random() * 4);

            setPalo(palos[numeroRamdom]);
        }

        if ((numero >= 1 && numero <= 13)) {
            setNumero(numero);

        } else if (numero < 1 && numero > 13) {
            int numeroRandom = (int) (Math.random() * 13) + 1;
            setNumero(numeroRandom);

        }


    }
    @Override
    public String mostrarCarta(){
        String especial="";
        int opcion=0;
        switch (getNumero()){
            case 11:
                especial="Jota";
                opcion++;
                break;
            case 12:
                especial="Reina";
                opcion++;
                break;
            case 13:
                especial="Rey";
                opcion++;
                break;
            default:
                break;
        }
        if (opcion==0){
            return "La carta es "+getNumero()+" de "+getPalo();
        } else if (opcion!=0) {
            return "La carta es "+especial+" de "+getPalo();
        }else{
            return "error";
        }
    }
}

