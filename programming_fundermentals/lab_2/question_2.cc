// Programming fundermentals:  intrinsic data types
// Question 2

#include <iostream>

int main()
{
    // initialising variables
    int number;
    int* number_pointer = &number;
    int& number_reference = number;
    const int const_int = 0;
    // operations
    number = 5;
    (*number_pointer)++;
    number_reference++;
    std::cout << number << std::endl;
    std::cout << "const int " << const_int << std::endl;
    // literals to decimal
    int hex = 0xf3f2;
    int oct = 0437;
    int char_ = 'a';
    std::cout << hex << std::endl;
    std::cout << oct << std::endl;
    std::cout << char_ << std::endl;
}