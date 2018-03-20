package kh.collection;

public class CustomVector<T> {
	//수정된 업로드
	private int size;
	private T[] obArr;
	
	public CustomVector(){
		this.obArr = (T[])new Object[10];
	}
	public CustomVector(int capacity){
		this.obArr = (T[])new Object[capacity];
	}
	public int capacity(){
		return obArr.length;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
//		for(int i =0; i<obArr.length; i++){
//			if(obArr[i]==null){
//				return false;
//			}
//		}
//		return true;
		return size==0;
	}
	public void add(T i){
		T[] temp = null;
		if(size()==capacity()){
			temp = obArr;
			obArr = (T[])new Object[temp.length*2];
			for(int j = 0; j<obArr.length; j++){
				obArr[j] = temp[j];
			}
		}
		obArr[size] = i;
		size++;
	}
//		for(int j =size; j<size+1; j++){
//                obArr[j]=i;
//			}
//		size++;
//		}
	public T get(int index){
		if(index <0|| size<=index){
			throw new IndexOutOfBoundsException();
		}
		return obArr[index];
	}
	public int indexOf(T obj){
		int index = -1;
		
		for(int i = 0 ; i<size; i++){
			if(obArr[i].equals(obj)){
				index = i;
				break;
			}
		}
		return index;
	}
	public boolean remove(T obj){
		boolean result = false;
		int index = indexOf(obj);
		if(index !=-1){ 
			obArr[index] = null;
			System.arraycopy(obArr, index+1, obArr, index, size-index-1);
			obArr[size-1] = null;
			size--;
			result = true;
			return result;
		}
		return result;
	}
	public String toString(){
		String result = "";
		for(int i =0; i<size; i++){
			result += obArr[i] +" ";
		}
		return result;
	}
}


