// Intrinsic data types
// Question 1

#include <iostream>

int main()
{
    enum {RED,YELLOW,AMBER=YELLOW, GREEN};
    std::cout << RED << YELLOW << AMBER << GREEN << std::endl;
}