package Main;

import java.util.Scanner;

import javax.swing.SpinnerNumberModel;

import Implements.CandidatoImpl;

public class Votacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=null;
		int numCandidatos=0;
		int votantes=0;
		int voto=0;
		
		boolean success=false;
		
		CandidatoImpl candidatoImpl=new CandidatoImpl();
		
		while (!success && numCandidatos<1) {
			try {
				System.out.println("Cuantos candidatos sera?");
				scan= new Scanner(System.in);
				numCandidatos=scan.nextInt();
				
				success=true;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Ocurrio un eeror al registrar el numero de candidatos\n"+e.getMessage());
				scan.nextLine();
			}
			
		}
		
		
		for (int i = 0; i < numCandidatos; i++) {
			System.out.println("Ingresa nombre del candidato "+(i+1));
			scan= new Scanner(System.in);
			candidatoImpl.agregarCandidato(scan.nextLine());
		}
		success=false;
		while (!success) {
			try {
				System.out.println("Cuantos votanter habra?");
				scan= new Scanner(System.in);
				votantes=scan.nextInt();
				
				success=true;
			} catch (Exception e) {
				// TODO: handle exception
				System.err.println("Ocurrio un eeror al registrar el numero de votantes\n"+e.getMessage());
				scan.nextLine();
			}
			
		}
		
		
		
		for (int i = 0; i < votantes; i++) {
			
			candidatoImpl.imprCandidatos();
			success=false;
			while (!success) {
				try {
					System.out.println("Ingresa numero del candidato a votar ");
					scan= new Scanner(System.in);
					voto=scan.nextInt();
					
					if(voto<numCandidatos+1)
						candidatoImpl.sumarVoto(voto-1);
					else
						System.out.println("Voto invalidado ya que no coincide con ningun candidato");
					
					success=true;
				} catch (Exception e) {
					// TODO: handle exception
					System.err.println("Ocurrio un eeror al registrar el numero de votantes\n"+e.getMessage());
					scan.nextLine();
				}
				
			}
			
			
		}
		
		candidatoImpl.imprimirVoto();
		
	}

}
