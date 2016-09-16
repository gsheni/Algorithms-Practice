# Define the compiler
CC=g++
# Define the compiler options
CFLAGS=-O2 -Wall -Wextra -Werror -ansi -pedantic
# Define the linker

all: SortStack

SortStack: SortStack.cpp
	$(CC) $(CFLAGS) SortStack.cpp -o SortStack

clean:
	/bin/rm -f SortStack SortStack.o