// programming fundamentals: functions and program structure
// Question 2

#include <iostream>
#include <string>

#include "question_2.h"

void output(int value)
{
    std::cout << "This is an int: " << value << std::endl;
}
void output(char value)
{
    std::cout << "This is an char: " << value << std::endl;
}
void output(float value)
{
    std::cout << "This is an float: " << value << std::endl;
}
void output(long value)
{
    std::cout << "This is an long: " << value << std::endl;
}
void output(std::string value)
{
    std::cout << "This is an string: " << value << std::endl;
}