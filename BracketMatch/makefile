# Define the compiler
CC=g++
# Define the compiler options
CFLAGS=-O2 -Wall -ansi -pedantic -std=c++11
# Define the linker

all: BracketMatch

BracketMatch: BracketMatch.cpp
	$(CC) $(CFLAGS) BracketMatch.cpp -o BracketMatch

clean:
	/bin/rm -f BracketMatch BracketMatch.o