// Programming fundermentals: intrinsic data types
// Question 4

#include <iostream>
#include <string>

int main()
{
    typedef std::string TenArrayString[10];
    TenArrayString strings;
    int count = 0;
    while(count != 10)
    {
        std::cout << "Please enter a string: ";
        std::cin >> strings[count];
        count++;
    }
    int max_size = 0;
    std::string largest_string;
    for(int i = 0; i < 10; i++)
    {
        
    }
}