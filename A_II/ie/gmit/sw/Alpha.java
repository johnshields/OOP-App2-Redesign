package ie.gmit.sw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Alpha {
	private final Status status;
	private final Collection<Theta> greekAlpha = new ArrayList<>();
	private final Collection<Beta> betas = new ArrayList<>();

	public Alpha(Status status) {
		this.status = status;
	}

	public void add(Beta beta) {
		switch(status) {
			case Slight, Medium, Low -> betas.add(beta);
			case High, Extreme -> {
				Delta delta = new Delta();
				delta.add(beta);
			}
		}
	}

	public void add(Theta thetas) {
		switch (status) {
			case Slight, Medium, Low -> greekAlpha.add(thetas);
			case High, Extreme -> {
				Delta delta = new Delta();
				delta.add(thetas);
			}
		}
	}

	public Status getStatus() {
		return status;
	}

	public void remove(Beta beta) {
		betas.remove(beta);
	}

	public void remove(Theta thetas) {
		greekAlpha.remove(thetas);

		System.out.println(thetas + "remove beta, epsilon and zeta");
	}

	public Iterator<Beta> betaIterator(){
		return betas.iterator();
	}

	public Iterator<Theta> greekAlphaIterator() {

		System.out.println("iterate beta, epsilon and zeta");
		return greekAlpha.iterator();
	}

}
