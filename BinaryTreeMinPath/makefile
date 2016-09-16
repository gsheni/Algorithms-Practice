# Define the compiler
CC=g++
# Define the compiler options
CFLAGS=-O2 -Wall -Wextra -Werror -ansi -pedantic -std=c++11
# Define the linker

all: BinaryTreeMinPath

BinaryTreeMinPath: BinaryTreeMinPath.o Node.o
	$(CC) $(CFLAGS) -o BinaryTreeMinPath BinaryTreeMinPath.o Node.o

BinaryTreeMinPath.o: BinaryTreeMinPath.cpp Node.h
	$(CC) $(CFLAGS) -c BinaryTreeMinPath.cpp

Node.o: Node.cpp Node.h
	$(CC) $(CFLAGS) -c Node.cpp
clean:
	/bin/rm -f BinaryTreeMinPath BinaryTreeMinPath.o Node Node.o *.gch