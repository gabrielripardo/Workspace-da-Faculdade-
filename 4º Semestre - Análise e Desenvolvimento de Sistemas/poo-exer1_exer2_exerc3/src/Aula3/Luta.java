package Aula3;
 // Cada luta: Terá 3 Rounds de lutas eninja2re os dois ninjas, o ninja que ganhar	
// mais rounds	vence a luta e recebe 3 poninja2os. Se impatar cada ninja ganha um poninja2o
public class Luta {
	String iniciarLuta(Ninja ninja1, Ninja ninja2) {
		int winNj1 = 0;
		int winNj2 = 0;
		
		for(int round=1; round<=3; round++){// Sempre que roda o valor do ataque muda
			 
			int comp1 = ninja1.atacar(); // Atualiza o método e busca um novo ataque
			int comp2 = ninja2.atacar();
			
			System.out.println("Round: " + round + " - Ataque do Ninja1: " + comp1);
			System.out.println("Round: " + round+ " - Ataque do Ninja2: " + comp2);
			
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
