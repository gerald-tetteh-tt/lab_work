// programming fundamentals: pointers and arrays
// Question 1

#include <iostream>

using namespace std;

int main()
{
    string word;
    cout << "Please enter a word: ";
    cin >> word;

    const char *c_string{word.c_str()};
    while (*c_string != '\0')
    {
        cout << *c_string;
        c_string++;
    }
    cout << endl;
}