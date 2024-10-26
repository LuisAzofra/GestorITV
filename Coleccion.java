
public class Coleccion<E,Id> implements IColeccion<E,Id> {

	private Nodo<E> head;

	public Coleccion() {
		head = null;
	}

	public void insertar(E item) {
		Nodo<E> last = new Nodo<E>(item,null);

		if(head == null)
			head = last;

		else {
			Nodo<E> copia = head;
			while(copia.next != null)
				copia = copia.next;
			copia.next = last;
		}
	}

	public E buscar(Id id) {
		E result = null;
		
		if(id != null) {
			Nodo<E> copia = head;
			while(copia != null && result == null) {
				if(copia.element instanceof Informe) {
					if(((Informe)(copia.element)).getIdentificador() == (int)id) 
						result = copia.element;
				}
				else {
					if(((Vehiculo)(copia.element)).equals((String)id))
						result = copia.element;
				}

				copia = copia.next;
			}
		}
		
		return result;
	}

	public E get(int indice) {
		E result = null;
		int cont = 0;

		Nodo<E> copia = head;
		while(copia != null && result == null) {
			if(cont == indice) 
				result = copia.element;

			cont++;
			copia = copia.next;
		}

		return result;
	}

	public int numeroDeItems() {
		
		Nodo<E> copia = head;
		int cont = 0;
		
		while(copia != null) {
			cont++;
			copia = copia.next;
		}
		
		return cont;
	}

}