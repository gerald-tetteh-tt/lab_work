// programming fundamentals: functions and program structure
// Question 2

#include <iostream>

void output(int);
void output(char);
void output(float);
void output(long);
void output(std::string);

int main()
{
    std::string myname = "Gerald Addo-Tetteh";
    // output(3.14); ambiguos
    output("hi there");
    output(myname);
}

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