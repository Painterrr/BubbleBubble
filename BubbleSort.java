import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		int tmp;

		System.out.print("enter the value 'n'(n= numbers length): ");
		n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) { // �迭�� �������� �� ä���
			numbers[i] = (int) (Math.random() * n) + 1;

			for (int j = 0; j < i; j++) { // �ߺ� ����
				if (numbers[j] == numbers[i]) {
					i--;
				}
			}
		}

		System.out.println(Arrays.toString(numbers)); // ä���� �迭 ���

		System.out.println("");
		System.out.println("this is bubble sorted numbers");
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < (numbers.length - 1); i++) { // ���� �������
				if (numbers[i] > numbers[i + 1]) {
//				Arrays.sort(numbers);
					tmp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = tmp;
				}
			}
		}

		System.out.println(Arrays.toString(numbers));
	}
}
