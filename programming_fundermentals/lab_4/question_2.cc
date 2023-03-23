// Programming fundermentals: conditional flow statements and looping constructs
// Question 2

#include <iostream>

int main()
{
    int operand_1, operand_2;
    char userOperator;
    std::cout << "Please input two operands: ";
    std::cin >> operand_1 >> operand_2;
    std::cout << "Please input an operator: ";
    std::cin >> userOperator;
    switch (userOperator)
    {
    case '*':
        std::cout << "Multiplying " << operand_1 << " and "
                  << operand_2 << " = " << operand_1 * operand_2 << std::endl;
        break;
    case '+':
        std::cout << "Adding " << operand_1 << " and "
                  << operand_2 << " = " << operand_1 + operand_2 << std::endl;
        break;
    case '/':
        std::cout << "Dividing " << operand_1 << " by "
                  << operand_2 << " = " << operand_1 / operand_2 << std::endl;
        break;
    case '-':
        std::cout << "Subtracting " << operand_2 << " from "
                  << operand_1 << " = " << operand_1 - operand_2 << std::endl;
        break;
    }
}