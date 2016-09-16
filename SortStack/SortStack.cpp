/**
 * Header Files
 */
#include <iostream>
#include <stack>

/**
 * Constants
 */

/**
 * Function Declarations
 */
void sortStack(std::stack<int>, std::stack<int>&);
int main(){
	/*
	 * Write a program to sort a stack in ascending order (biggest
	 * items on top). You may use at most one additional stack to
	 * hold items, but you may not copy the elements into any other
	 * data structure
	 *
	 * Solution Runtime - O(n^2) - 2 while loops depdent on length of stack 
	 * Space Runtime - O(n)
.	 */

	std::stack<int> stack1;
	std::stack<int> stack2;

	stack1.push(5);
	stack1.push(3);
	stack1.push(7);
	stack1.push(1);

	sortStack(stack1, stack2);
	//Print results
	while (stack2.empty() != true) {
		std::cout << stack2.top() << " " << std::endl;
		stack2.pop();
	}
}
void sortStack(std::stack<int> stack1, std::stack<int> &stack2) {

	int temp;
	stack2.push(stack1.top());
	stack1.pop();

	while (stack1.empty() != true) {
		if (stack1.top() >= stack2.top()) {
			stack2.push(stack1.top());
			stack1.pop();
		} else {
			temp = stack1.top();
			stack1.pop();
			while (stack2.empty() != true) {
				if (stack2.top() > temp) {
					stack1.push(stack2.top());
					stack2.pop();
				} else {
					break;
				}
			}
			stack2.push(temp);
		}
	}
}
