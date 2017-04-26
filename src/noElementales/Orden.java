package noElementales;

public class Orden {

	public static void shell(int vector[]) {
		int salto, aux, i;
		boolean cambios;
		for (salto = vector.length / 2; salto != 0; salto /= 2) {
			cambios = true;
			while (cambios) {
				cambios = false;
				for (i = salto; i < vector.length; i++)
					if (vector[i - salto] > vector[i]) {
						aux = vector[i];
						vector[i] = vector[i - salto];
						vector[i - salto] = aux;
						cambios = true;
					}
			}
		}
	}

	public static void quickSort(int vector[], int izq, int der) {
		int pivote = vector[izq];
		int i = izq;
		int j = der;
		int aux;

		while (i < j) {
			while (vector[i] <= pivote && i < j)
				i++;
			while (vector[j] > pivote)
				j--; //
			if (i < j) {
				aux = vector[i];
				vector[i] = vector[j];
				vector[j] = aux;
			}
		}
		vector[izq] = vector[j];
		vector[j] = pivote;
		if (izq < j - 1)
			quickSort(vector, izq, j - 1);
		if (j + 1 < der)
			quickSort(vector, j + 1, der);
	}

	public static void fusion(int vector[], int izq, int der) {
		if (izq < der) {
			int m = (izq + der) / 2;
			fusion(vector, izq, m);
			fusion(vector, m + 1, der);
			merge(vector, izq, m, der);
		}
	}

	private static void merge(int vector[], int izq, int m, int der) {
		int i, j, k;
		int[] aux = new int[vector.length];
		for (i = izq; i <= der; i++)
			aux[i] = vector[i];

		i = izq;
		j = m + 1;
		k = izq;
		while (i <= m && j <= der)
			if (aux[i] <= aux[j])
				vector[k++] = aux[i++];
			else
				vector[k++] = aux[j++];
		while (i <= m)
			vector[k++] = aux[i++];
	}
	
	public static void main(String[] args) {
		
		int []arreglo = new int[5];
		
		arreglo[0]=5;
		arreglo[1]=4;
		arreglo[2]=2;
		arreglo[3]=1;
		arreglo[4]=3;
		
		//Orden.shell(arreglo);
		//Orden.quickSort(arreglo, 0, arreglo.length-1);
		//Orden.fusion(arreglo, 0, arreglo.length-1);
		
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		
		
	}

}
