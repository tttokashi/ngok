package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("文字を入力してください。");

		String str = br.readLine();
		String lower_str = str.toLowerCase();
		String upper_str = str.toUpperCase();

		System.out.println("元の文字列 : " + str);
		System.out.println("小文字へ変換 : " + lower_str);
		System.out.println("大文字へ変換 : " + upper_str);

	}
}
