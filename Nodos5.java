
public class Nodos5 {
	public ListNode reverseList(ListNode head) {
		ListNode valor = null;
		ListNode posicion = head;
		ListNode next = null;
		while (posicion != null) {
		next = posicion.next; // me quedo con el siguiente nodo del que estoy situada
		// (antes de cargarme su referencia)
		posicion.next = valor; // el siguiente al posicion, es el nodo valor
		// (el anterior al mio)
		valor = posicion; // actualizo el nodo valor y le apunto al posicion
		posicion = next; // posicion es el nodo siguiente que habíamos guardado antes
		}
		return valor;
		}
}
