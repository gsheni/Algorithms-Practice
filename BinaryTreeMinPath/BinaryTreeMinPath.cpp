#include <iostream>
#include <vector>
#include <cstddef>
#include "Node.h"
using namespace std;

int min(Node*);
int max(Node*);

int main(){
	/**
	 * 	Find the minimal path from head to leaf
	 *
	 *      Tree
	 *        10
	 *      5     3
	 *   2    1     6
	 *     3
	 *
	 */
	
	Node* root 		= new Node(10);
	root->left 		= new Node(5);
	root->right 		= new Node(3);
	root->left->left 	= new Node(2);
	root->left->right 	= new Node(1);
	root->right->right = new Node(6);
	root->left->left->right = new Node(3);

	/**
	 * Solution Runtime O(n) since each node is visited, DFS
	 * Space Runtime  O(n)
	 */
	std::cout << min(root) << std::endl;
}
int min(Node *ptr) {
    if(ptr->left == NULL && ptr->right == NULL){
    	return ptr->data;
    }
    int left_sum = 0;
    int right_sum = 0;

    if(ptr->left != NULL){
    	left_sum = ptr->data + min(ptr->left);
    } 
    if(ptr->right != NULL){
    	right_sum = ptr->data + min(ptr->right);
    } 

    cout << "left - " << left_sum << " right_sum - " << right_sum << endl;

    if(left_sum == 0){
    	return right_sum;
    }
    if(right_sum == 0){
    	return left_sum;
    }
    if(left_sum > right_sum){
    	return right_sum;
    }
    else{
    	return left_sum;
    }
}
