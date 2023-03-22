// Programming fundermentals: conditional flow statements and looping constructs
// Question 4

#include <iostream>

int main()
{
    char c;
    std::string reveresed_string;
    std::cout << "Please enter some text: ";
    while(std::cin.get(c))
    {
        if(c == '\n')
        {
            break;  
        }
        reveresed_string = c + reveresed_string;
    }
    std::cout << reveresed_string << std::endl;
}