// Programming fundermentals: operators & expressions
// Question 3

#include <iostream>

unsigned int rotate (unsigned int s, unsigned int r)
{
    return (s << r)|(s >> (32-r));
}

int main()
{
    std::cout << sizeof(int) << std::endl;
    std::cout << std::hex << rotate(2,31) << std::endl;
}