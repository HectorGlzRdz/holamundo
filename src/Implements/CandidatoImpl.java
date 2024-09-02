package Implements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import Interface.CandidatoInterface;
import Model.Candidatos;

public class CandidatoImpl implements CandidatoInterface{

	List<Candidatos> candiatosList= new ArrayList<Candidatos>();
	Candidatos candidato=null;
	
	@Override
	public void sumarVoto(int candidatoNumber) {
		
		candiatosList.get(candidatoNumber).setVotos();
		
	}

	@Override
	public Integer imprimirVoto() {
		// TODO Auto-generated method stub
		candiatosList.forEach(candidato->System.out.println(candidato));
		
		return null;
	}

	@Override
	public void agregarCandidato(String candidatoName) {
		// TODO Auto-generated method stub
		candidato= new Candidatos(candidatoName);
		candiatosList.add(candidato);
		
	}
	
	public void imprCandidatos() {
		AtomicInteger i=new AtomicInteger(1);
		candiatosList.forEach(candidato->
		System.out.println(i.getAndIncrement()+" "+candidato.getNombre())
		);
	}

}
