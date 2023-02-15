//LUIS DURAN FLORES - 177406
public class MyStack {

	char Stack[];
	int top;
	int MAX = Stack.length;
	
	public char pop() {
		if(top == MAX) {
			System.out.println("Stack is empty");
			return Stack[top];
		} else {
			char ultimo = Stack[top-1];
			Stack[ultimo-1] = 0;
			top--;
			return Stack[ultimo];
		}
	}
	
	char queue[];
	int Max = queue.length;
	int tail;
	public char delete() {
		char primero = queue[0];
		queue[0] = 0;
		for(tail = queue.length; tail > 0; tail--) {
			queue[tail] = queue[tail-1];	
			}
		return primero;
	}
}