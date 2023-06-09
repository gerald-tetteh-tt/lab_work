// Programming fundermentals: intrinsic data types
// Question 3

#include <iostream>
#include <string>
#include <sstream>
using namespace std;

void print_word(char * word, int start, int stop)
{
    std::cout << "[" << stop-start << "] ";
    while(stop > start)
    {
        std::cout << word[start];
        start++;
    }
    std::cout << std::endl;
}

// void alternate()
// {
//     string sentence = "Hello-World-I-love-programming-in-c++";
//     string word;
//     stringstream sentence_stream(sentence);

//     while(getline(sentence_stream, word, '-')){
//         cout<<word<<endl;
//     }
// }

int main()
{
    // alternate();
    char c_string[100];
    std::cout << "Enter word: ";
    std::cin >> c_string;
    int start = 0;
    int stop = 1;
    while (c_string[stop-1] != '\0')
    {    
        if(c_string[stop] != '-' && c_string[stop] != '\0')
        {
            stop++;
        }
        else
        {
            print_word(c_string,start,stop);
            stop++;
            start = stop;
        }
    }
}