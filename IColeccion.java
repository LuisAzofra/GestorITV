
public class IColeccion {

interface IColeccion<E,Id> {
  /**
    Inserta un elemento en la
    coleccion. 
  */
  void insertar (E item);

  /**
    Busca el elemento cuyo identificador
    se indica como parametro. Es decir:
		post: buscar(id) es null � buscar(id).equals(id) es true 
  */
  E buscar (Id id);
  
  /**
    Obtiene el elemento en la posicion cuyo indice 
    es i siendo el primer nodo el de indice cero.  
  */
  E get (int indice);
  
  /**
    Obtiene el n�mero de elementos.
  */
  int numeroDeItems ();
  
}
}
