// Programming fundermentals: conditional flow statements and looping constructs
// Question 5

#include <iostream>
#include <string>
#include <sstream>

int main()
{
    int max_length = 0;
    std::string longest_word = "";
    std::string words;
    std::string temp;
    std::getline(std::cin,words,'\n');
    std::stringstream words_stream(words);
    while(std::getline(words_stream,temp,' '))
    {
        if((int) temp.length() > max_length)
        {
            max_length = temp.length();
            longest_word = temp;
        }
    }
    std::cout << "[" << max_length << "] " << longest_word << std::endl;
}