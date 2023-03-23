// programming fundamentals: functions and program structure
// Question 1

#include <iostream>

void input(int& first, int& second)
{
    std::cout << "Enter two numbers: ";
    std::cin >> first >> second;
}

int main()
{
    int first, second;
    input(first,second);
    std::cout << first + second << std::endl;
}