package PrivateFest;

public class teste {
   public static void main(String[] args) {
	  
	  //TIPO DE TICKET 
	  candyFest candyRegis = new candyFest(1,20);
	  
	 //DADOS DO CLIENTE
	 // ticketCliente regis = new ticketCliente();
	  dadosDoCliente regis = new dadosDoCliente();
	  regis.setNome("REGIS DA SILVA REIS");
	  regis.setCpf("508.802.128-37");
	  regis.setEmail("REGISBALE289@GMAIL.COM");
	  
      System.out.println(regis.recuperaDados());
	  System.out.println(candyRegis.recuperaDadosDoTicket());
   }

}
