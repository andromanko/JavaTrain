package habr_2;
import java.util.Random;
public class LList<T> {
	
	private Node _first;
    private int _size;
    
    public LList() {
        _first = null;
        _size = 0;
    }
 
    public int getSize() {
        return _size;
    }
    
    public void add(T data) {
        Node current = _first;

        if (current == null) {
            _first = new Node(data);
            _size++;
            return;
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node(data));
        _size++;
    }
    
    public void add(T[] array) {
        for (T data : array) {
            add(data);
        }
    }
    
    public void remove(T data) {
        Node current = _first;
        Node next = current.getNext();

        if (_first.getData().equals(data)) {
            if (_size == 1) {
                _first.setData(null);
                _size--;
                return;
            }
            _first.setData(null);
            _first = _first.getNext();
            _size--;
            return;
        }
        while (next != null) {
            if (next.getData().equals(data)) {
                current.setNext(next.getNext());
                next = null;
                _size--;
                return;
            }
            current = next;
            next = current.getNext();
        }
    }
    
	public <T> int get(int n)	{
		
		//if (n>size) return null; //exception!!!
		Node current = _first;
		for (int i=0;i < this._size;i++)	{
			current=current.getNext();
		}
		return (int) current.getData();
	}
    
    public static void main(String[] args) {
/*		final Random random = new Random();	//типа включения рандомизатора
		Node node = null;
		node = new Node();
		node.setValue(random.nextInt());
		node.setNext(node);
		//Node link = node;
		Node nodeLast=new Node();
		for (int i=0; i<10;i++) {
			node = new Node();
			node.setValue(random.nextInt());
			nodeLast.setNext(node);
			node.setNext(node);
			nodeLast=node;

			//link=node;		
		}
		//node=link.getNext();
		//node.getNext();
		//здесь нужно закольцевать
		for(;;) {
			System.out.println(node.getValue());
			//блядь так он выводит ПОСЛЕДНИЙ элемент!
			
			if (node.getNext()==null) break;	
			
			node.setNext(node.getNext());
		}*/
		final Random random = new Random();	//типа включения рандомизатора
		LList llist = new LList();
		
		for (int i=0; i<10;i++) {
			llist.add(random.nextInt());
		}
		System.out.println(llist.getSize());
		
		System.out.println(llist.get(3));
		for(;;) {
			//System.out.println(llist.getValue());
			//блядь так он выводит ПОСЛЕДНИЙ элемент!
			
			//if (node.getNext()==null) break;	
			
			//node.setNext(node.getNext());
		}
		
	}
}

