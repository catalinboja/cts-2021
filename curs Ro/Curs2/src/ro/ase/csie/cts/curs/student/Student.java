package ro.ase.csie.cts.curs.student;

public class Student {
	
	DatePersonale datePersonale;
	Facultate facultate;

	
	private int[] note;
	
	int getNotaMinima() {
		int min = note[0];
		for(int  nota : note) {
			if(min > nota)
				min = nota;
		}
		return min;
	}
	
	int numarNoteMinime() {
		int nrNote = 0;
		
		//int min = 0;
		//for(int  nota : note) {
		//	if(min > nota)
		//		min = nota;
		//}
		
		int notaMinima = this.getNotaMinima();
		
		for(int nota : note) {
			if(nota == notaMinima) {
				nrNote+=1;
			}
		}
		return nrNote;
	}
}
