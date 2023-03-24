// programming fundamentals: pointers and arrays
// Question 2
// mystring.h

#ifndef MY_STRING
#define MY_STRING

namespace mystd
{
    // Compares the elements of l with r and returns zero if
    // they are all the same, a negative value if l < r
    // and a positive value if l > r
    int strcmp(const char *l, const char *r);
    // Returns the length of s excluding the termination character '\0'
    int strlen(const char *s);
    // Concatenates (appends) r on to the end of l, and returns  l
    char *strcat(char *l, const char *r);
    // Copies the contents of r over the contents of l, and returns l
    char *strcpy(char *l, const char *r);
    // Converts the characters in s to uppercase, and returns s
    char *toupper(char *s);
}

#endif