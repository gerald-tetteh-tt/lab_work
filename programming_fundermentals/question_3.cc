// Question 3

#include <iostream>

void displayNotDivisibleTable(int number)
{
    int count = 1;
    int loop_idx = 0;
    while (count <= 30)
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
    for(int i = 1; i <= 20; i++)
    {
        std::cout << i << " x " << number << " = " << number * (i) << std::endl;
    }
}

void question3() 
{
    int number;
    std::cout << "Please enter a number: ";
    std::cin >> number;
    if(number % 2 == 0)
    {
        displayMultiplicationTable(number);
        return;
    }
    std::cout << "Number is odd";
    displayNotDivisibleTable(number);
}

int main()
{
    question3();
}