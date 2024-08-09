package trabalho;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class prova_1 {


	public static void main(String[] args) throws InterruptedException {
				// método Scanner
			   	Scanner leia = new Scanner(System.in);
			   	
			   	// método ArrayList (lista temporaria) = memoria RAM da prova kkkkkk
			   	ArrayList<String> gabarito = new ArrayList<>();
			   	
			   	// lista permanente = HD do pc
			   	ArrayList<String> gabarito2 = new ArrayList<>();
			   	
////////////////////área onde estar as variaveis/////////////////////////////////////////////
		
		// variaveis das questões (Natanael)
		int p1, p2, p3, p4, p5, nu1, nu2, nu3, nu4, nu5;
		
		// variavel que verifica qual é a questão que o usuario vai resetar (Carlito)
		int q = 0;
		
		// finalizador da prova
		int finau = 0;
		
		// segunda chance
		int resp2 = 0;
				
		// método de delay ou pausa temporária (Carlito)
		long start = System.currentTimeMillis();
				
		// variavel do gabarito (Carlito)
		int gab = 0;
				
		// intenção do usuário (Carlito)
		int inten = 0;
				
		// respostas das questões pro gabarito (Carlito)
		String res1 = "";
		String res2 = "";
		String res3 = "";
		String res4 = "";
		String res5 = "";
		String res6 = "";
		String res7 = "";
		String res8 = "";
		String res9 = "";
		String res10 = "";
//////////////////////////////////////////--CABEÇALHO--/////////////////////////////////////////////////////////////////////////
		
	// estrutura que repete a prova
	for(int abc = 0; abc == 0;) {
		
		finau = 1;
		
		// recebendo o nome do usuário
				System.out.println("Digite o seu nome: ");
				String nome = leia.next();
				
				
				// recebendo a série do usuário
				System.out.println("Digite a sua serie: (1, 2, 3, etc..) ou (0) se for um professor");
				int serie = leia.nextInt();
				
				
				// variavel que recebe a data e hora atual
				LocalDateTime agora = LocalDateTime.now();
				
				// método de formatar a data: dia/mês/ano
				DateTimeFormatter formate_Data = DateTimeFormatter.ofPattern("dd/MM/uuuu");
				String data_formatada = formate_Data.format(agora);
				
				if(serie == 0) {
					
					System.out.println("você que ver os acertos dos alunos? (1) sim ou (2) não, ou qué incerrar a prova? (3)");
					inten = leia.nextInt();
					
					if(inten == 1) {
				
						// mostrando todos os gabaritos
						for(int i = 0; i < gabarito2.size(); i++) {
							System.out.println(gabarito2.get(i));
							
							finau = 0;
						}
						
					}else if(inten == 2) {
						
						// recebendo o nome do usuário
						System.out.println("Digite o seu nome: ");
						nome = leia.next();
						
						
						// recebendo a série do usuário
						System.out.println("Digite a sua serie: ");
						serie = leia.nextInt();
						
						// transformando a serie em string para ser selva
						String serie2 = Integer.toString(serie);
						
						// salvando o nome e a serie do aluno
						gabarito.add("Nome: "+nome+"  Serie: "+serie2+"°");
						
						// printando o cabeçalho pronto, essa parte é pro rafa, assim que ele terminar apaga
						System.out.println("Escola: E.E.PEI Eurípedes Simões de Paula");
						System.out.println("Nome: "+nome+"  Série: "+serie+"º  Data: "+data_formatada);
						
					}else if(inten == 3) {
						
						finau = 0;
						abc = 1;
						
					}else {
						
						System.out.println("esse número:"+inten+" não é uma opção");
						
					}
					
				}else {
				// transformando a serie em string para ser selva
				String serie2 = Integer.toString(serie);
				
				// salvando o nome e a serie do aluno
				gabarito.add("Nome: "+nome+"  Serie: "+serie2+"°");
				
				// printando o cabeçalho pronto, essa parte é pro rafa, assim que ele terminar apaga
				System.out.println("Escola: E.E.PEI Eurípedes Simões de Paula");
				System.out.println("Nome: "+nome+"  Série: "+serie+"º  Data: "+data_formatada);
				
				}
//////////////////////////////////////--Questões--/////////////////////////////////////////////////////////////////

if(finau == 1) {
				
	 for(int i = 0; i == 0;) {
	   	System.out.println("\n(1) Qual é o resultdo de 'c + 2'  e  'a + 4' "
	   			+ "\nSendo: 'c = - 7' e 'a = 8':"
	   			+ "\n\n *************"
	   			+ "\n * [1] - 9 e 4. 	[2] - 5 e 12. *"
	   			+ "\n * [3] - 5 e 11. 	[4] - 2 e 21. *"
	   			+ "\n *************");
	   	p1 = leia.nextInt();
	  
	   	
	   	switch (p1) {
			case 1: {
				
				res1 = "Errou";
				i = 1;
				break;
			}
			case 2: {
				
				res1 = "Acertou";
				i = 1;
				break;
			}
			case 3:{
				res1 = "Errou";
				i = 1;
				break;
			}
			case 4:{
				res1 = "Errou";
				i = 1;
				break;
			}
			default:
				System.out.println("o numero: "+p1+" não foi emcontrado entre as alternativas, tente de nevo");
				i = 0;
			}
	 }
	   	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

			System.out.println("\n(2) Digite o resultado de '4d / 2'"
					+ "\nTendo em vista que 'd = 3':");
			nu1 = leia.nextInt();
			
			
			if (nu1 == 6) {
				res2 = "Acertou";
			} else {
				res2 = "Errou";
			}
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("\n(3) Digite o resultado de '7w * 4'"
					+ "\nTendo em vista que 'w = 5':");
			nu2 = leia.nextInt();
			
			if (nu2 == 140) {
				res3 = "Acertou";
			} else {
				res3 = "Errou";
			}
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("\n(4) Digite o resultado de '6f + 9'"
					+ "\nTendo em vista que 'f = 16':");
			nu3 = leia.nextInt();
			
			if (nu3 == 105) {
				res4 = "Acertou";
			} else {
				res4 = "Errou";
			}
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("\n(5) Digite o resultado de '6f - 3n'"
					+ "\nTendo em vista que 'f = 16' e 'n = 5':");
			nu4 = leia.nextInt();
			
			if (nu4 == 81) {
				res5 = "Acertou";
			} else {
				res5 = "Errou";
			}
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			System.out.println("\n(6) Digite o resultado de '6f - 3n'"
					+ "\nTendo em vista que 'f = 16' e 'n = 50':");
			nu5 = leia.nextInt();
			
			if (nu5 == -54) {
				res6 = "Acertou";
			} else {
				res6 = "Errou";
			}
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
		for(int i = 0; i == 0;) {
			System.out.println("\n(7) Qual o resultdo de 'd - t'  e  'k / 2' "
	   			+ "\nSendo: 'd = 7', 't = 25' 'k = 52"
	   			+ "\n\n **************"
	   			+ "\n * [1]  18 e 26. 	[2]  18 e 12. *"
	   			+ "\n * [3]  7 e 81. 	[4]  16 e 62. *"
	   			+ "\n **************");
	   	p2 = leia.nextInt();
	   	
	   	switch (p2) {
			case 1: {
				res7 = "Acertou";
				i = 1;
				break;
			}
			case 2: {
				res7 = "Errou";
				i = 1;
				break;
			}
			case 3:{
				res7 = "Errou";
				i = 1;
				break;
			}
			case 4:{
				res7 = "Errou";
				i = 1;
				break;
			}
			default:
				System.out.println("o numero: "+p2+" não foi emcontrado entre as alternativas, tente de nevo");
				i = 0;
			}
		}
	   	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
	   	for(int i = 0; i == 0;) {
			System.out.println("\n(8) Você tem 16 anos. Se você tivese nascido"
					+ "\n 4 anos atrás, quantos anos você teria hoje ?"
	   			+ "\n\n ***************"
	   			+ "\n * [1]  20. 		[2]  4.	*"
	   			+ "\n * [3]  12. 		[4]  16.	*"
	   			+ "\n ***************");
	   	p3 = leia.nextInt();
	   		
	   	switch (p3) {
			case 1: {
				res8 = "Errou";
				i = 1;
				break;
			}
			case 2: {
				res8 = "Acertou";
				i = 1;
				break;
			}
			case 3:{
				res8 = "Errou";
				i = 1;
				break;
			}
			case 4:{
				res8 = "Errou";
				i = 1;
				break;
			}
			default:
				System.out.println("o numero: "+p3+" não foi emcontrado entre as alternativas, tente de nevo");
				i = 0;
			}
	   	}
	   	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   	
	   	for(int i = 0; i == 0;) {
			System.out.println("\n(9) Qual o triplo do quadrado da metade de 10 ?"
	   			+ "\n\n ***************"
	   			+ "\n * [1]  15. 		[2]  150.	*"
	   			+ "\n * [3]  25 e 81. 	[4]  75.	*"
	   			+ "\n ***************");
	   	p4 = leia.nextInt();
	   	
	   	switch (p4) {
			case 1: {
				res9 = "Errou";
				i = 1;
				break;
			}
			case 2: {
				res9 = "Errou";
				i = 1;
				break;
			}
			case 3:{
				res9 = "Errou";
				i = 1;
				break;
			}
			case 4:{
				res9 = "Acertou";
				i = 1;
				break;
			}
			default:
				System.out.println("o numero: "+p4+" não foi emcontrado entre as alternativas, tente de nevo");
				i = 0;
			}
	   	}
	   	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	   	
	   	for(int i = 0; i == 0;) {
			System.out.println("\n(10) Quantos pedaços são 1/3 de uma barra de chocolate que tem 15 pedaços ?"
	   			+ "\n\n ***************"
	   			+ "\n * [1]  20. 		[2]  2,5.	*"
	   			+ "\n * [3]  5.  		[4]  15.	*"
	   			+ "\n ***************");
	   	p5 = leia.nextInt();
	   	switch (p5) {
			case 1: {
				res10 = "Errou";
				i = 1;
				break;
			}
			case 2: {
				res10 = "Errou";
				i = 1;
				break;
			}
			case 3:{
				res10 = "Acertou";
				i = 1;
				break;
			}
			case 4:{
				res10 = "Errou";
				i = 1;
				break;
			}
			
			default:
				System.out.println("o numero: "+p5+" não foi emcontrado entre as alternativas, tente de nevo");
				i = 0;
			}
	   	}
////////////////////////////////////////////////////--GABARITO--//////////////////////////////////////////////////////////
	   	
	   	for(int i = 0; i < 1;) {
			
			// pergunta que muda o inten
			System.out.println("você qué salvar a prova? (1 = sim ou 2 = não)");
			inten = leia.nextInt();
			
			
			if( inten == 1){
			    
				// infeite kkkkk (não agrega nada no código, só deixa ele mais bonito)
			    System.out.print("salvando a prova");
			    Thread.sleep(1000);
			    System.out.print(".");
			    Thread.sleep(1000);
			    System.out.print(".");
			    Thread.sleep(1000);
			    System.out.print(".");
			    Thread.sleep(1000);
			    System.out.print(".");
			    Thread.sleep(1000);
			    System.out.print(". \n\n");
			    
			    // salvando as respostas
			    gabarito.add("1) "+res1);
				gabarito.add("2) "+res2);
				gabarito.add("3) "+res3);
				gabarito.add("4) "+res4);
				gabarito.add("5) "+res5);
				gabarito.add("6) "+res6);
				gabarito.add("7) "+res7);
				gabarito.add("8) "+res8);
				gabarito.add("9) "+res9);
			    gabarito.add("10) "+res10+"\n\n");
			    
			    // salvando na lista permanente
			    for(int g = 0; g < gabarito.size(); g++) {
			    	
			    	gabarito2.add(gabarito.get(g));
			    	
			    }
			    
			    // limpando a lista temporaria
			    gabarito.clear();
			    
			    System.out.println("prova salva com sucesso");
			    
			 for(int i2 = 0; i2 < 1;) {
			    System.out.println("você qué ver o seu gabarito? (1 = sim ou 2 = não)");
			    gab = leia.nextInt();
			    if(gab == 1) {
			    	
			    	// mostrando o gabarito
			    	System.out.println(
			    			"gabarito das questões \n"+
			    			"questão 1: "+res1+"\n"+
			    			"questão 2: "+res2+"\n"+
			    			"questão 3: "+res3+"\n"+
			    			"questão 4: "+res4+"\n"+
			    			"questão 5: "+res5+"\n"+
			    			"questão 6: "+res6+"\n"+
			    			"questão 7: "+res7+"\n"+
			    			"questão 8: "+res8+"\n"+
			    			"questão 9: "+res9+"\n"+
			    			"questão 10: "+res10+"\n\n"
			    			);
			    	i2 = 1;
			    	
			    }else if(gab == 2) {
			    	
			    	System.out.println("boa sorte, por favor passe o pc pro proximo aluno \n\n");
			    	i2 = 1;
			    	
			    }else {
			    	
			    	System.out.println("isso não é um valor aceitável");
			    	
			    }
			 }
			    
			    i = 1;
			    
			}else if(inten == 2) {
				
				System.out.println("você qué refazer a prova toda (1) ou qué refazer uma ou mais questões específicas (2)");
				inten = leia.nextInt();
				
				
				
				if(inten == 1) {
					
					// limpando o gabarito temporario pra repreencher com as nova respostas do mesmo usuário
					gabarito.clear();
					 i = 1;
					 
				}else if(inten == 2) {
					
					System.out.println("qual questão você qué refazer? (1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10) ou (11) se você apertou errado");
					q = leia.nextInt();
					
					// refazendo uma única questão, porem se repetir varias vezes vc muda mais de uma
					if(q == 1) {
						
						System.out.println("coloque a resposta aqui: (1, 2, 3 ou 4)");
						resp2 = leia.nextInt();
						if(resp2 == 2) {res1 = "Acertou";}else {res1 = "Errou";}
						
					}else if(q == 2){
						
						System.out.println("coloque a resposta aqui: ");
						resp2 = leia.nextInt();
						if(resp2 == 6) {res2 = "Acertou";}else {res2 = "Errou";}
						
					}else if(q == 3){
						
						System.out.println("coloque a resposta aqui: ");
						resp2 = leia.nextInt();
						if(resp2 == 140) {res3 = "Acertou";}else {res3 = "Errou";}
						
					}else if(q == 4){
						
						System.out.println("coloque a resposta aqui: ");
						resp2 = leia.nextInt();
						if(resp2 == 105) {res4 = "Acertou";}else {res4 = "Errou";}
						
					}else if(q == 5){
						
						System.out.println("coloque a resposta aqui: ");
						resp2 = leia.nextInt();
						if(resp2 == 81) {res5 = "Acertou";}else {res5 = "Errou";}
						
					}else if(q == 6){
						
						System.out.println("coloque a resposta aqui: ");
						resp2 = leia.nextInt();
						if(resp2 == -54) {res6 = "Acertou";}else {res6 = "Errou";}
						
					}else if(q == 7){
						
						System.out.println("coloque a resposta aqui: (1, 2, 3 ou 4)");
						resp2 = leia.nextInt();
						if(resp2 == 1) {res7 = "Acertou";}else {res7 = "Errou";}
						
					}else if(q == 8){
						
						System.out.println("coloque a resposta aqui: (1, 2, 3 ou 4)");
						resp2 = leia.nextInt();
						if(resp2 == 2) {res8 = "Acertou";}else {res8 = "Errou";}
						
					}else if(q == 9){
						
						System.out.println("coloque a resposta aqui: (1, 2, 3 ou 4)");
						resp2 = leia.nextInt();
						if(resp2 == 4) {res9 = "Acertou";}else {res9 = "Errou";}
						
					}else if(q == 10){
						
						System.out.println("coloque a resposta aqui: (1, 2, 3 ou 4)");
						resp2 = leia.nextInt();
						if(resp2 == 3) {res10 = "Acertou";}else {res10 = "Errou";}
						
					}else{
						System.out.println("você quer voltar pro inicio? (0) = sim ou (1) = não");
						i = leia.nextInt();
						
					}
					
					
				}else {
					
					System.out.println("isso não é um valor aceitável");
					
				}
				
				
				
			}else{
				
				System.out.println("isso não é um valor aceitável");
				
			}
			
			
			
			}

	}else {
		
		System.out.println("prova finalizada");
	}
	   	

	}

	leia.close();	
	
	}
	
}
