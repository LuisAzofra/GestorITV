
public class Nodos4 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode prev = null, valor; 
		ListNode posicion = head;
		for (;posicion != null;) { 
		if(posicion.next == null || posicion.next.val != posicion.val) {
		if(prev == null) { 
		prev = posicion; 
		valor = prev; 
		}
		else { 
		prev.next = posicion; 
		prev = prev.next; 
		}
		posicion = posicion.next; 
		}
		else { 
		ListNode entrada = posicion.next; 
		for(;entrada != null && entrada.val == posicion.val;)
		entrada = entrada.next;
		posicion = entrada; 
		} 
		}
		return valor;
		}
}
