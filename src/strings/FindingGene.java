package strings;

public class FindingGene {
	public String findSimpleGene (String dna, int startCodon, int stopCodon) {

		String gene="";
		startCodon = dna.indexOf("ATG");
		if (startCodon == -1) return "";
		stopCodon = dna.indexOf("TAA", startCodon+3);
		if (stopCodon == -1) return "";
		gene = dna.substring(startCodon, stopCodon+3);
		if (gene.length() % 3 == 0) return gene;
		
		
		return "";
	}
	
	public boolean twoOccurences (String stringa, String stringb) {
		
		int occurence =0 , counter=0;
		occurence = stringb.indexOf(stringa);
		while (occurence != -1) {
			counter ++;
			occurence += stringa.length();
			occurence = stringb.indexOf(stringa, occurence);
		}
		if (counter > 1) return true;
		return false;
	}
	
	public String lastPart(String stringa, String stringb) {
		int occurence =0;
		occurence = stringb.indexOf(stringa);
		if (occurence == -1) return stringb;
		occurence += stringa.length();
		stringa = stringb.substring(occurence);
		
		
		return stringa;
	}

}
