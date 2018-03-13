package kh.collection;

public class CustomVector {
	private int size;
	private Object[] obArr;
	
	public CustomVector(){
		this.obArr = new Object[10];
	}
	public CustomVector(int capacity){
		this.obArr = new Object[capacity];
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
	public void add(Object i){
		Object[] temp = null;
		if(size()==capacity()){
			temp = obArr;
			obArr = new Object[temp.length*2];
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
	public Object get(int index){
		if(index <0|| size<=index){
			throw new IndexOutOfBoundsException();
		}
		return obArr[index];
	}
	public int indexOf(Object obj){
		int index = -1;
		
		for(int i = 0 ; i<size; i++){
			if(obArr[i].equals(obj)){
				index = i;
				break;
			}
		}
		return index;
	}
	public boolean remove(Object obj){
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


