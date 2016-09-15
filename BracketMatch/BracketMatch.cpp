#include <iostream>
#include <stack>
#include <unordered_map>

using namespace std;
void bracketMatch(string);

int main(int argc, char* argv[]){
	/*
	 * Match the braces and verify whether all the opening braces have the closing braces in the right order.
	 *
	 * For example:
	 *     Input: [{}]()[{{()}}()]
	 *     Output: Yes
	 *
	 *     Input: [{}]({{()}}()]
	 *     Output: No
	*/
	string input = "[{}]()[{{()}}()]"; //Match
	string input2 = "[{}]({{()}}()]"; //No match

	bracketMatch(input);
	bracketMatch(input2);
	/*
	 * Solution Runtime = O(n) since we are going through the whole string
	 * Space Runtime = O(n) since stack could be filled
	 */
}
void bracketMatch(string input){
	stack<char> opening_symbols;
	unordered_map<char, char> symbolMatch;
	int length = input.length();
	symbolMatch['}'] = '{';
	symbolMatch[')'] = '(';
	symbolMatch[']'] = '[';
	cout << input << endl;
	for(int i = 0; i < length; i++){
		if(input[i] == '[' || input[i] == '{' || input[i] == '('){
			opening_symbols.push(input[i]);
		}
		else{
			if(opening_symbols.top() == symbolMatch[input[i]]){
				opening_symbols.pop();
			}
			else{
				cout << "No Match" << endl;
				return;
			}
		}
	}
	cout << "Match" << endl;
	return;
}