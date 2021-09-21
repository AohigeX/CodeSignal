package dad.codesignal;

import java.util.Arrays;

public class EdgeOfTheOcean {
	int adjacentElementsProduct(int[] inputArray) {
		int x = 0;
		int num1 = inputArray[x];
		int num2 = inputArray[++x];
		int prod = num1 * num2;

		while (x < inputArray.length - 1) {
			num1 = inputArray[x];
			num2 = inputArray[++x];
			prod = ((num1 * num2) > prod) ? num1 * num2 : prod;
		}

		return prod;
	}

	int shapeArea(int n) {
		return ((n - 1) * (n - 1)) + (n * n);
	}

	int makeArrayConsecutive2(int[] statues) {
		int retorno = 0;
		int[] ordenado = statues;
		int x = 0;

		Arrays.sort(ordenado);

		for (x = 0; x < ordenado.length - 1; x++) {
			retorno += (ordenado[x] - ordenado[x + 1] > 1 || ordenado[x] - ordenado[x + 1] < 1)
					? Math.abs(ordenado[x] - ordenado[x + 1]) - 1
					: 0;
		}

		return retorno;
	}
}
