public class CadastroPessoalPrompt {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Uso: java CadastroPessoal <nome> <sobrenome> <idade> <altura>");
            return;
        }
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);
        
        System.out.println("Cadastro Pessoal:");
        System.out.println("Nome: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
    }
}
