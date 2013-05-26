package org.antenesse.text_parse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
	static int nLines;
	static int nWords;
	static int nChars;
	private static String[] lineArray;

	public static void Parse(String filename) {
		BufferedReader br = null;
		nLines = 0;
		nWords = 0;
		nChars = 0;
		try {
			String currentLine;
			br = new BufferedReader(new FileReader(filename));
			
			while ((currentLine = br.readLine()) != null) {
				nLines++;
				lineArray = currentLine.split(" ");
				nWords += lineArray.length;
				for (int i = 0; i < lineArray.length; i++) {
					nChars += lineArray[i].length();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String filename = "c:\\Users\\cantenesse\\Documents\\junk\\blah.txt";
		Parse(filename);
		System.out.println("Number of lines: " + nLines);
		System.out.println("Number of words: " + nWords);
		System.out.println("Number of characters:" + nChars);
	}
}
