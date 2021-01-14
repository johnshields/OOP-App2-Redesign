package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Delta {
	private Collection<Beta> betas = new ArrayList<>();
	private Collection<Epsilon> epsilons = new ArrayList<>();
	private Collection<Zeta> zetas = new ArrayList<>();
	
	public void add(Beta beta) {
		betas.add(beta);
	}
	
	public void add(Epsilon epsilon) {
		epsilons.add(epsilon);
	}

	public void add(Zeta zeta) {
		zetas.add(zeta);
	}

	public void remove(Beta beta) {
		betas.remove(beta);
	}
	
	public void remove(Epsilon epsilon) {
		epsilons.remove(epsilon);
	}

	public void remove(Zeta zeta) {
		zetas.remove(zeta);
	}
	
	public Iterator<Beta> betaIterator(){
		return betas.iterator();
	}

	public Iterator<Epsilon> epsilonIterator(){
		return epsilons.iterator();
	}
	
	public Iterator<Zeta> zetaIterator(){
		return zetas.iterator();
	}
	
	public boolean hasBeta(Beta beta) {
		return betas.contains(beta);
	}

	public boolean hasEpsilon(Epsilon epsilon) {
		return epsilons.contains(epsilon);
	}
	
	public boolean hasZeta(Zeta zeta) {
		return zetas.contains(zeta);
	}
}