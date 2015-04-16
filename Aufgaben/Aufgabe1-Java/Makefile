#
# Makefile for SLPL interpreter
#

SRCS = Main.java Anweisung.java Ausdruck.java Tabelle.java

all:		Main.class

run:		Main.class
		java Main

Main.class:	$(SRCS)
		javac Main.java

clean:
		rm -f *~

dist-clean:	clean
		rm -f *.class
