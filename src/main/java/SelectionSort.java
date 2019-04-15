
import java.util.List;

public class SelectionSort {

	private List<Integer> lista;

	public SelectionSort(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getListaOrdenada() {
		this.ordena();
		return lista;
	}

	private void ordena() {

		for (int i = 0; i < lista.size(); i++) {
			
			int eleito = lista.get(i);
			int menor = i;
			
			for (int j = i + 1; j < lista.size(); j++) {
				
				if(lista.get(j) < lista.get(menor)) {
					menor = j;
				}
				
			}
			
			if (menor < eleito) {
				troca(i, menor);
			}
		}

	}

	private void troca(int i, int j) {
		Integer aux = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, aux);
	}

}
