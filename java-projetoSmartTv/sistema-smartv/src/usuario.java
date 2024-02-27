public class usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume:" +smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume:" +smartTv.volume);
        
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o Volume:" +smartTv.volume);

        smartTv.aumentarVolume();
        System.out.println("Aumentando o Volume:" +smartTv.volume);

        System.out.println("Tv ligada? " +smartTv.ligada);
        System.out.println("Canal atual:  " +smartTv.canal);
        System.out.println("Volume atual: " +smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Aumentado Canal para: " + smartTv.canal);

        
        smartTv.aumentarCanal();
        System.out.println("Aumentado Canal para: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Diminuindo Canal para:" +smartTv.canal);

        smartTv.mudarCanal(12);
        System.out.println("Canal atual: " +smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " +smartTv.ligada);
    
    }
    
}
