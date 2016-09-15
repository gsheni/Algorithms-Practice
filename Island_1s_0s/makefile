# Define the compiler
CC=g++
# Define the compiler options
CFLAGS=-O2 -Wall -ansi -pedantic -std=c++11 -g
# Define the linker

all: DistinctIslands

DistinctIslands: DistinctIslands.cpp
	$(CC) $(CFLAGS) DistinctIslands.cpp -o DistinctIslands

clean:
	/bin/rm -f DistinctIslands DistinctIslands.o