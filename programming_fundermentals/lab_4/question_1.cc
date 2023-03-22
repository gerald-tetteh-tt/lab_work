// Programming fundermentals: conditional flow statements and looping constructs
// Question 1

#include <iostream>

int main()
{
    int max_length = 37;
    char input_line[]{"Hello there my friend.\nHow are you ?"};
    int i = 0;
    int count = 0;
    while(i < max_length)
    {
        if(input_line[i] == '?') ++count;
        i++;
    }
}