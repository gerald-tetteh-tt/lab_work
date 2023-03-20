// Question 3

#include <iostream>

void displayNotDivisibleTable(int number)
{
    int count = 0;
    int loop_idx = 0;
    while (count < 30)
    {
        if((loop_idx % number) != 0)
        {
            count++;
            std::cout << loop_idx << std::endl;
        }
        loop_idx++;
    }
}

void displayMultiplicationTable(int number)
{
    for(int i = 0; i < 20; i++)
    {
        std::cout << i+1 << " x " << number << " = " << number * (i+1) << std::endl;
    }
}

void question3() 
{
    int number;
    std::cout << "Please enter a number: ";
    std::cin >> number;
    if(number % 2 != 0)
    {
        displayNotDivisibleTable(number);
        return;
    }
    displayMultiplicationTable(number);
}

int main()
{
    question3();
}