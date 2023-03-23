// programming fundamentals: functions and program structure
// Question 4

#include <iostream>

void output(char[], int = 0, int = -1);

int main()
{
    char arr[] = "hello there this is a line of text";
    output(arr);
    output(arr, 5);
    output(arr, 6, 10);
}

void output(char arr[], int offset, int length)
{
    arr += offset;
    if (length == -1)
    {
        std::cout << arr << std::endl;
        return;
    }
    while (length > 0)
    {
        std::cout << *arr;
        arr++;
        length--;
    }
    std::cout << std::endl;
}