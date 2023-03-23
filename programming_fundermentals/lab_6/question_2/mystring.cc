// programming fundamentals: pointers and arrays
// Question 2
// mystring.cc

#include <iostream>
#include "mystring.h"

int mystd::strcmp(const char *l, const char *r)
{
    const char *l_copy = l;
    const char *r_copy = r;
    while (*l_copy != '\0' || *r_copy != '\0')
    {
        if (*l_copy != *r_copy)
        {
            return *l_copy - *r_copy;
        }
        l_copy++;
        r_copy++;
    }
    return 0;
}

int mystd::strlen(const char *s)
{
    int length = 0;
    const char *s_copy = s;
    while (*s_copy != '\0')
    {
        s_copy++;
        length++;
    }
    return length;
}

char *mystd::strcat(char *l, const char *r)
{
    char *l_copy = l;
    const char *r_copy = r;
    while (*l != '\0')
    {
        l++;
    }
    while (*r_copy != '\0')
    {
        *l = *r_copy;
        r_copy++;
        l++;
    }
    *l = '\0';
    return l_copy;
}

char *mystd::strcpy(char *l, const char *r)
{
    const char *r_copy = r;
    char *l_copy = l;
    while (*r_copy != '\0')
    {
        *l_copy = *r_copy;
        r_copy++;
        l_copy++;
    }
    *l_copy = '\0';
    return l;
}

char *mystd::toupper(char *s)
{
    char *s_copy = s;
    while (*s_copy != '\0')
    {
        int ascii_value = *s_copy;
        ascii_value -= 32;
        *s_copy = ascii_value;
        s_copy++;
    }
    return s;
}