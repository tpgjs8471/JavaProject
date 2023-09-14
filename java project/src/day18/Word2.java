package day18;

import java.util.Objects;

public class Word2 implements Comparable{
	private String word;
	private String mean;
	
	public Word2() {};
	public Word2(String word,String mean) {
		this.word=word;
		this.mean=mean;
	}
	
	public void printWord() { //검색단어 출력용
		System.out.println("단어:"+word+" 의미"+mean);
	}
	
	@Override
	public String toString() {
		return "단어:" + word + ", 의미:" + mean+"\r\n";
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mean, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word2 other = (Word2) obj;
		return Objects.equals(mean, other.mean) && Objects.equals(word, other.word);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
