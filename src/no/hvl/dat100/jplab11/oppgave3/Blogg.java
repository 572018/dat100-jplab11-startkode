package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	private Innlegg[] innleggstabell;
	private int nesteLedig;
	
	public Blogg() {
		innleggstabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		innleggstabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		return innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
            if (innleggstabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for (int i = 0; i < nesteLedig; i++) {
			if (innleggstabell[i].getId() == innlegg.getId() && innleggstabell [i]!= null) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if(nesteLedig < innleggstabell.length) {
			return true;
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(!finnes(innlegg) && ledigPlass()) {
			innleggstabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		else {
		
		return false;
		}
	}
		
	
	public String toString() {
	     String streng = ""+ nesteLedig+ "\n";
	        for (int i = 0; i < nesteLedig; i++) {
	        	if(innleggstabell [i] != null) {
	        		streng += innleggstabell[i].toString();	
	        	} 
	        }
	        return streng;
	    }

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}