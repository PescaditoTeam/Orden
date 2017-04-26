package elementales;

public class Orden {

	public static void burbujeo(int arreglo[]) {

		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = 0; j < arreglo.length - 1; j++) {
				if (arreglo[j] > arreglo[j + 1]) {
					int tmp = arreglo[j + 1];
					arreglo[j + 1] = arreglo[j];
					arreglo[j] = tmp;
				}
			}
		}
	}

	public static void insercion(int arreglo[]) {

		int p, j;
		int aux;
		for (p = 1; p < arreglo.length; p++) {

			aux = arreglo[p];
			j = p - 1;
			while ((j >= 0) && (aux < arreglo[j])) {
				arreglo[j + 1] = arreglo[j];
				j--;
			}
			arreglo[j + 1] = aux;
		}
	}

	public static void seleccion(int arreglo[]) {

		int i, j, menor, pos, tmp;
		for (i = 0; i < arreglo.length - 1; i++) {
			menor = arreglo[i];
			pos = i;
			for (j = i + 1; j < arreglo.length; j++) {
				if (arreglo[j] < menor) {
					menor = arreglo[j];
					pos = j;
				}
			}
			if (pos != i) {
				tmp = arreglo[i];
				arreglo[i] = arreglo[pos];
				arreglo[pos] = tmp;
			}
		}
	}

	public static void main(String[] args) {

		int[] arreglo = new int[5];

		arreglo[0] = 5;
		arreglo[1] = 4;
		arreglo[2] = 2;
		arreglo[3] = 1;
		arreglo[4] = 3;

		// Orden.burbujeo(arreglo);
		// Orden.insercion(arreglo);
		// Orden.seleccion(arreglo);

		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
