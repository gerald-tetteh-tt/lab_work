// programming fundamentals: pointers and arrays
// Question 2
// main file

#include <iostream>
#include "mystring.h"

using namespace std;

int main()
{
    char string[100] = "hello";
    char string_2[100] = "hello";
    char string_3[100] = "minute";
    cout << mystd::strcmp(string, string_2) << endl;
    cout << mystd::strcmp(string, string_3) << endl;
    cout << mystd::strlen(string) << endl;
    cout << mystd::toupper(string) << endl;
}
