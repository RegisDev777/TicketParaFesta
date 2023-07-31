package PrivateFest;

public class candyFest {

	private dadosDoCliente nomeCliente;
	private int TipoDeTicket;
	private String precoDoTicket;
	private int idade;
	private int codigoDoTicket;
	private static int proximoTicket;
    
	public candyFest(int tipoDeTicket, int idade) {
		if (tipoDeTicket <= 0 || TipoDeTicket > 4) {
			throw new IllegalArgumentException("TICKET INVALIDO: " + tipoDeTicket);
		}if (idade < 18) {
			throw new IllegalArgumentException("IDADE INVALIDA " + idade);
		} if (tipoDeTicket <= 0 || TipoDeTicket > 4 || idade < 18) {
			throw new IllegalArgumentException("( ERRO: IDADE // ERRO:TICKET ) VERIFIQUE E TENTE NOVAMENTE");
		}
		
		this.setCodigoDoTicket(proximoTicket++);
		
		switch (tipoDeTicket) {
		case 1:
			precoDoTicket = "1000,00 Reais + Vale 1000,00 Reais Em Bebida";
			System.out.println("=============================================================");
			System.out.println("|                    TICKET DE AREA VIP                     |");
			System.out.println("=============================================================");
			break;
		case 2:
			precoDoTicket = "750,00 + Vale 3 balde de Heineken ";
			System.out.println("=============================================================");
			System.out.println("|                      TICKET DE CAMAROTE                   |");
			System.out.println("=============================================================");
			break;
		case 3:
			precoDoTicket = "500,00 + Vale 1 balde de Heineken ";
			System.out.println("=============================================================");
			System.out.println("|                     TICKET DE FRONTSTAGE                  |");
			System.out.println("=============================================================");
			break;
		case 4:
			precoDoTicket = "300,00 + Vale 1 Garrafa de Red Label ";
			System.out.println("=============================================================");
			System.out.println("|                      TICKET DE PISTA                      |");
			System.out.println("=============================================================");
			break;
		}
	}

	// GETTER IDADE
	public int getIdade() {
		return idade;
	}

	// GETTER E SETTERS DO TIPO DE TICKET
	public String getTipoDeTicket() {
		return precoDoTicket;
	}

	public void setTipoDeTicket(int tipoDeTicket) {
		TipoDeTicket = tipoDeTicket;
	}

	// GETTER E SETTERS DO TICKET DO CLIENTE
	public dadosDoCliente getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(dadosDoCliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	// GET PREÇO DO TICKET
	public String getPrecoDoTicket () {
		return precoDoTicket;
	}

	public String recuperaDadosDoTicket() {
		String dadodoTicket = "| PRECO:" + getPrecoDoTicket() + "        |" + "\n"
				            + "| CODIGO:" +  proximoTicket + "                 SEJA BEM VINDO E SE DIVERTA SZ   |" + "\n"
				            + "|===========================================================|";
		return dadodoTicket;
	}

	public int getCodigoDoTicket() {
		return codigoDoTicket;
	}

	public void setCodigoDoTicket(int codigoDoTicket) {
		this.codigoDoTicket = codigoDoTicket;
	}

}