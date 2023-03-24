// programming fundamentals: functions and program structure
// Question 3

#include <iostream>

void output(char[]);
void output(char[], int);
void output(char[], int, int);

int main()
{
    char arr[] = "hello there this is a line of text";
    output(arr);
    output(arr, 5);
    output(arr, 6, 10);
    output(arr, 6, -1);
}

void output(char arr[])
{
    while (*arr != '\0')
    {
        std::cout << *arr;
        arr++;
    }
    std::cout << std::endl;
}
void output(char arr[], int offset)
{
    arr += offset;
    while (*arr != '\0')
    {
        std::cout << *arr;
        arr++;
    }
    std::cout << std::endl;
}
void output(char arr[], int offset, int length)
{
    if (length == -1)
    {
        return output(arr, offset);
    }
    arr += offset;
    while (length > 0)
    {
        std::cout << *arr;
        arr++;
        length--;
    }
    std::cout << std::endl;
}