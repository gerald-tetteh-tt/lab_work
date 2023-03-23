flags := -Wall -Werror -pedantic

question_2: main.o question_2.o
	g++ main.o question_2.o -o question_2 $(flags)

main.o: main.cc
	g++ -c main.cc $(flags)

question_2.o: question_2.cc
	g++ -c question_2.cc $(flags)

clean:
	rm *.o