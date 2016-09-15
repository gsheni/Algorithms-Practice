/**
 * Header Files
 */
#include <iostream>
#include <vector>
using namespace std;

/**
 * Constants
 */

/**
 * Function Declarations
 */
void distinctIslands(vector<vector<int>>&, int , int );
void check_surroundings(vector<vector<int>>&, int , int, int , int );

int main(int argc, char* argv[]){
	/*
	* Given a 2D array of 1s and 0s, identify
	* the number of distinct islands in the array.
	*     Island = 1s
	*
	*     For example:
	*     {{1, 1, 0, 1},
	*      {0, 1, 0, 0},
	*      {0, 0, 0, 0},
	*      {0, 0, 0, 1}}
	*
	*     Number of islands will be 3
	*/
	int height 	= 4;
	int width 	= 4; 
	vector<vector<int>> land = {
			{1, 1, 0, 1},
			{0, 1, 0, 0},
			{0, 0, 0, 0},
			{0, 0, 0, 1}
	};
	int height2 	= 4;
	int width2 		= 5; 
	vector<vector<int>> land2 = {
			{1, 1, 1, 1, 0},
			{1, 1, 0, 1, 0},
			{1, 1, 0, 0, 0},
			{0, 0, 0, 0, 0}
	};
	int height3 	= 4;
	int width3 		= 5; 
	vector<vector<int>> land3 = {
			{1, 1, 0, 0, 0},
			{1, 1, 0, 0, 0},
			{0, 0, 1, 0, 0},
			{0, 0, 0, 1, 1}
	};
	/**
	 * Depth First Search 
	 * Solution Runtime = O(length * width) since we search each spot
	 * Space Runtime = O(1) nothing really stored, just count variable. 
	 */
	distinctIslands(land, height, width);
	distinctIslands(land2, height2, width2);
	distinctIslands(land3, height3, width3);

}

void distinctIslands(vector<vector<int>>& land, int height, int width){
	int island_count = 0;
	if(height == 0 || width == 0){
		cout << "Not Valid Island" << endl;
		return;
	}

	for(int i = 0 ; i < height ; i++){
		for(int j = 0 ; j < width ; j++){
			if(land[i][j] == 1){
				check_surroundings(land, i, j, height, width);
				island_count++;
			}
		}
	}
	cout << "Disnct Islands " << island_count << endl;
}

void check_surroundings(vector<vector<int>>& land, int i, int j, int height, int width){
	if (i < 0 || j < 0 || i >= height || j >= width || land[i][j] != 1){
		return;
	}
	land[i][j] = 0;

	check_surroundings(land, i-1, j, height, width);
	check_surroundings(land, i+1, j, height, width);
	check_surroundings(land, i, j-1, height, width);
	check_surroundings(land, i, j+1, height, width);
}
