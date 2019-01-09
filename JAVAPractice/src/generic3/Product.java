package generic3;

public class Product<T,M> {

	private T kind;
	private M model;
	
	
	public T getKind() {return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}


class childProduct<T,M,C> extends Product<T, M>{ 
	//상속 받은 제네릭 타입에 다른 제네릭 타입을 더 추가할 수 있다.
	public C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
//////제네릭 타입 인터페이스////////////////////////////////////
interface Storage<T>{
	public void add(T item, int index);
	public T get(int index);
}

class StorageImpl<T> implements Storage<T>{

	private T[] array;
	
	public StorageImpl(int capacity) {
		this.array = (T[]) new Object[capacity]; //제네릭 타입으로 배열을 생성하려면 이렇게 해야 함.
	}
	

	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}





class Tv{}
