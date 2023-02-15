//LUIS DURAN FLORES - 177406
public class StackYQueue {

	char queue[];
	int MAX = queue.length;
	int tail = queue.length;
	public void queueBasico(char elemento){
		queue[tail] = elemento;
		queue[0] = 0;
		for(tail = queue.length; tail > 0; tail--) {
			queue[tail-1] = queue[tail];	
			}
	}
	
	char Stack[];
	int top = Stack.length;
	int max = Stack.length;
	public void stackBasico(char elemento) {
		if(top == MAX) {
			System.out.println("Stack is empty");
		} else {
			Stack[top] = elemento;
			Stack[0] = 0;
			for(top = Stack.length; top > 0; top--) {
				Stack[top-1] = Stack[top];	
				}
		}
	}
	
	String myString;
	public void invertirCadena(String myString) {
		this.myString = myString;
    	String[] arregloCadenas = myString.split("");
    	
    	for(int posicion = arregloCadenas.length; posicion >= 0; posicion--) {
    		for(int i = 0; i < arregloCadenas.length; i++) {
    			String seleccion = arregloCadenas[i];
    			arregloCadenas[i] = arregloCadenas[posicion];	
    			arregloCadenas[posicion] = seleccion;
    		}
    	}
	}
	
	public void palindromo(String myString) {
		this.myString = myString;
		myString = myString.replace(" ", "");
		String[] arregloCadenas = myString.split("");
    	String[] nuevoArreglo = myString.split("");
    	for(int posicion = arregloCadenas.length; posicion >= 0; posicion--) {
    		for(int i = 0; i < arregloCadenas.length; i++) {
    			String seleccion = arregloCadenas[i];
    			arregloCadenas[i] = arregloCadenas[posicion];	
    			arregloCadenas[posicion] = seleccion;
	        }
    	for(int x = 0; x < arregloCadenas.length; x++) {
    		if(arregloCadenas[x].equals(nuevoArreglo[x])) {
    			System.out.println("El arreglo de su cadena si es un palíndromo");
    		} else {
    			System.out.println("El arreglo de su cadena no es un palíndromo");
    		}
    	}
    }}}