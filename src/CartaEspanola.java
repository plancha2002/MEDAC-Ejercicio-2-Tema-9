public class CartaEspanola extends CartaGenerica{
    public CartaEspanola() {
    }

    public CartaEspanola(String palo, int numero) {


        if( (palo.equals("Oros") || palo.equals("Espadas") || palo.equals("Copas") || palo.equals("Bastos"))   ){
               setPalo(palo);

        }else{
            String[] palos = new String[4];
            palos[0]="Oros";
            palos[1]="Espadas";
            palos[2]="Copas";
            palos[3]="Bastos";

            int numeroRamdom=(int)(Math.random()*4);

            setPalo(palos[numeroRamdom]);
        }

        if ((numero>=1 && numero<=10)) {
            setNumero(numero);

        }else if (numero<1 && numero >10) {
            int numeroRandom=(int)(Math.random()*10)+1;
            setNumero(numeroRandom);

        }
    }
    @Override
    public String mostrarCarta(){
        String especial="";
        int opcion=0;
        switch (getNumero()){
            case 8:
                especial="Sota";
                opcion++;
                break;
            case 9:
                especial="Caballo";
                opcion++;
                break;
            case 10:
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
