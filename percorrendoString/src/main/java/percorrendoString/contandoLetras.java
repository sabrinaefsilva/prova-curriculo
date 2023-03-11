package percorrendoString;

public class contandoLetras {

	public static void main(String[] args) {

		String mensagem = "A vida é repleta de oportunidades, mas eu preciso assumir a minha responsabilidade e parar de dar desculpas ou achar culpados\r\n"
				+ "para as coisas que só eu posso fazer por mim mesmo.";

		char letra = 'a';
		int contador = 0;

		for (int i = 0; i < mensagem.length(); i++) {

			if (mensagem.charAt(i) == letra) {
				contador++;
			}
			System.out.println("A mensagem possui " + contador + " letras " + letra);

					}
	}
	}

