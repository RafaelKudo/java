import java.util.Scanner;

public class desafioLogin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        boolean senhaOk;

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println(("Insira seu último sobrenome:"));
        String sobrenome = scanner.nextLine();

        String nomeUsuario = (nome.toLowerCase().charAt(0) + "_" + sobrenome.toLowerCase());
        System.out.println(nomeUsuario);

        do{
            System.out.println("Insira uma senha que contenha:\n" +
                    "8 caracteres\n" +
                    "1 letra maiúscula\n" +
                    "1 letra minúscula\n" +
                    "1 caractere especial\n" +
                    "números");
            senha = scanner.nextLine();
            senhaOk = true;
            if (senha.length() < 8) {
                senhaOk = false;
            }
            String maiuscula = "(.*[A-Z].*)";
            if (!senha.matches(maiuscula)) {
                senhaOk = false;
            }
            String minuscula = "(.*[a-z].*)";
            if (!senha.matches(minuscula)) {
                senhaOk = false;
            }
            String numbers = "(.*[0-9].*)";
            if (!senha.matches(numbers)) {
                senhaOk = false;
            }
            String caracterEspecial = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
            if (!senha.matches(caracterEspecial)) {
                senhaOk = false;
            }

            if (senhaOk == true) {
                System.out.println("senha válida");

            }else {
                System.out.println("Senha inválida");
            }
        }while (senhaOk == false);

            System.out.println("Insira nome de usuário: ");
            String usuarioCheck = scanner.nextLine();

            System.out.println("Insira senha: ");
            String senhaCheck = scanner.nextLine();

            if (usuarioCheck.equals(nomeUsuario) && senhaCheck.equals(senha)) {
                System.out.println("Bem vindo!");
            } else {
                 System.out.println("dados Incorretos");
            }

    }
}
