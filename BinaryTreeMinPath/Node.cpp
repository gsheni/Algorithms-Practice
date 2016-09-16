#include "Node.h"
#include <cstddef>

Node::Node(){

}
Node::Node(int val){
	data = val;
	left = NULL;
	right = NULL;
}