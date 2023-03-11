import java.util.Scanner;

public class emailESenha {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		String Login = "Sabrina";
		String Senha = "123456789-10";

		System.out.println("Login");
		String login = in.nextLine();

		System.out.println("Senha");
		String senha = in.nextLine();

		if (login.equals(Login) && senha.equals(Senha)) {
			System.out.printf("Usuario %s logado com successo", login);

		} else {
			System.out.println("Login ou senha inválidos!");
		}
	}

}
