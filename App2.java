package POO;

public class App2 {

    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setModelo("");

        carro.setAno("");

        carro.setCor("");

        carro.setDistancia(200);

        carro.setCombustivel(22);

        

        double consumo = carro.getDistancia() / carro.getCombustivel();

        
        System.out.println(carro.getModelo());

        System.out.println(carro.getCor());

        System.out.println(carro.getAno());

        System.out.println("O consumo do carro foi de: " + consumo + " Km/l");
          
        



    }

    
    
}
