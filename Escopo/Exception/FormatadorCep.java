public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String novoCep = formatarCep("23765045");
            System.out.println("O CEP selecionado é: " + novoCep);

        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep deve conter 8 dígitos! ");
        }    
    }
    

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
