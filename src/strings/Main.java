package strings;

public class Main {
	public static void testFindSimpleGene () {
		String DNA = "SDAWQRFA", DNA1 = "ATGASDQWD", DNA2 = "ATGHJNTAA", DNA3="ATGGGTAA", DNA4="ATGHHHGGGTAA";
		FindingGene gene, gene1, gene2,gene3, gene4;
		gene =new FindingGene();
		System.out.println("DNA has a gene " + gene.findSimpleGene(DNA,0 ,0) );
	
		gene1 = new FindingGene();
		System.out.println("DNA1 has a gene " + gene1.findSimpleGene(DNA1,0 ,0));
		
		gene2 = new FindingGene();
		System.out.println("DNA2 has a gene " + gene2.findSimpleGene(DNA2,0 ,0));
		
		gene3= new FindingGene();
		System.out.println("DNA3 has a gene " + gene3.findSimpleGene(DNA3,0 ,0));
		
		gene4= new FindingGene();
		System.out.println("DNA4 has a gene " + gene4.findSimpleGene(DNA4,0 ,0));
		
	}
	public static void testTwoOccurence () {
		String stringa = "atg", stringb="ctgtatgta";
		FindingGene testOccurence = new FindingGene();
		System.out.println(testOccurence.twoOccurences(stringa, stringb));
		
		
	}
	
	public static void testlastPart() {
		String stringa = "zoo", stringb="forest";
		FindingGene testLastPart = new FindingGene();
		System.out.println(testLastPart.lastPart(stringa, stringb));
		
		
	}
	public static void main (String [] args) {
		//testFindSimpleGene();
		//testTwoOccurence();
		testlastPart();
	}

}
