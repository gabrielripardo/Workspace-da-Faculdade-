package Aula3.copy;
 // Cada luta: Terá 3 Rounds de lutas eninja2re os dois ninjas, o ninja que ganhar	
// mais rounds	vence a luta e recebe 3 poninja2os. Se impatar cada ninja ganha um poninja2o
public class Luta {
	String iniciarLuta(Ninja ninja1, Ninja ninja2) {
		int winNj1 = 0;
		int winNj2 = 0;
		int comp1 = 0;
		int comp2 = 0;
		String nomAtaque1 = "";
		String nomAtaque2 = "";
		System.out.println("\n\n");
		System.out.println("############## "+"Luta: "+ninja1.getNome()+" Vs. "+ninja2.getNome()+" ############");
		
		for(int round=1; round<=3; round++){// Sempre que roda o valor do ataque muda
			comp1 = ninja1.atacar(); // Atualiza o método e busca um novo ataque
			comp2 = ninja2.atacar();
			
			switch(comp1){                  
				case 1: nomAtaque1 = "Terra"; break; 
				case 2: nomAtaque1 = "Vento"; break;
				case 3: nomAtaque1 = "Água"; break;
				case 4: nomAtaque1 = "Fogo"; break;
				case 5: nomAtaque1 = "Raio"; break;
			}
			switch(comp2){
				case 1: nomAtaque2 = "Terra"; break;
				case 2: nomAtaque2 = "Vento"; break;
				case 3: nomAtaque2 = "Água"; break;
				case 4: nomAtaque2 = "Fogo"; break;
				case 5: nomAtaque2 = "Raio"; break;
			}
			
			System.out.println(">>>>>>>>>>> Round: " + round + " <<<<<<<<<<<<");
			System.out.println("| Ninja "+ninja1.getNome() + " Lança ataque: "+nomAtaque1);
			System.out.println("| Ninja "+ninja2.getNome() + " Lança ataque: "+nomAtaque2);
			
			// >>> Ataques vs Ataques << 
			winNj1 = (comp1 == 1 && comp2 == 4 ? winNj1 + 1 : winNj1);
			winNj2 = (comp1 == 4 && comp2 == 1 ? winNj2 + 1 : winNj2);
			//
			winNj1 = (comp1 == 2 && comp2 == 5 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 5 && comp2 == 2 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 3 && comp2 == 4 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 4 && comp2 == 3 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 5 && comp2 == 3 ? winNj1+ 1 : winNj1); 
			winNj2 = (comp1 == 3 && comp2 == 5 ? winNj2+ 1 : winNj2); 
			//
			winNj1 = (comp1 == 4 && comp2 == 5 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 5 && comp2 == 4 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 2 && comp2 == 1 ? winNj1+ 1 : winNj1); 
			winNj2 = (comp1 == 1 && comp2 == 2 ? winNj2+ 1 : winNj2); 
			//
			winNj1 = (comp1 == 1 && comp2 == 3 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 3 && comp2 == 1 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 3 && comp2 == 2 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 2 && comp2 == 3 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 5 && comp2 == 1 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 1 && comp2 == 5 ? winNj2+ 1 : winNj2);
			//
			winNj1 = (comp1 == 4 && comp2 == 2 ? winNj1+ 1 : winNj1);
			winNj2 = (comp1 == 2 && comp2 == 4 ? winNj2+ 1 : winNj2); 
			///////////////////////////////
			String ganhaRound = null;
			if(winNj1 > winNj2){
				ganhaRound = " Ninja "+ninja1.getNome();
			}else if(winNj2 > winNj1){
				ganhaRound = " Ninja "+ninja2.getNome();
			}else{
				ganhaRound = " Empate (Não houve vencedores!)";
			}
			System.out.println("%%%%%%%%%%% Final do Round "+round+" %%%%%%%%%%%");
			System.out.println("??????????Vencedor: "+ganhaRound+"");
			System.out.println("###############################################\n");
		}
		
		// Ganhador da luta
		String winner = null;
		
		if(winNj1 > winNj2){
			ninja1.addPontosVitoria(); 
			winner = ninja1.getNome();
		}else if(winNj1 == winNj2){
			ninja1.addPontosEmpate(); ninja2.addPontosEmpate();
			winner = ninja1.getNome() +" "+ ninja2.getNome();
		}else{
			ninja2.addPontosVitoria();
			winner = ninja2.getNome();
		}
		return winner;
	}
}

/*
 * if(comp1 == 1 && comp2 == 4){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 4 && comp2 == 1){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 2 && comp2 == 5){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 5 && comp2 == 2 ){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 3 && comp2 == 4){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 4 && comp2 == 3){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 5 && comp2 == 3){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 3 && comp2 == 5){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 4 && comp2 == 5){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 5 && comp2 == 4){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 2 && comp2 == 1){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 1 && comp2 == 2){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 1 && comp2 == 3){
				winNj1++;
				System.out.print("comp2++");
			}if(comp1 == 3 && comp2 == 1){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 3 && comp2 == 2){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 2 && comp2 == 3){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 5 && comp2 == 1){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 1 && comp2 == 5){
				winNj2++;
				System.out.print("comp2++");
			}//
			if(comp1 == 4 && comp2 == 2){
				winNj1++;
				System.out.print("comp1++");
			}if(comp1 == 2 && comp2 == 4){
				winNj2++;
				System.out.print("comp2++");
			}//
 */
