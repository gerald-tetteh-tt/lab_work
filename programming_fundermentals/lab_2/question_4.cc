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
    int max_size = strings[0].length();
    std::string largest_string = strings[0];
    for(int i = 1; i < 10; i++)
    {
        int size = strings[i].length();
        if(size > max_size)
        {
            max_size = size;
            largest_string = strings[i];
        }
    }
    std::cout << largest_string << std::endl;
}