#include <iostream>
#include <iomanip>
#include <cstring>

using namespace std;

// equivalent function prototype
//void printArray(char * ptr)
void printArray(char arr[]){
    cout<< arr[0] <<endl;
    char temp[2];
    // lvalue?
    // char *
    arr = temp;
}

//function that returns a pointer to the local variable, creates compiler warning
char* getName(){
    char first[100];
    cin >> setw(100) >> first;
    char second[100];
    cin >>setw(100) >> second;
    return first;
}


int main(){

    // recap of pointers and addresses
    // int i {5};
    // int *p {&i};
    // int **j {&p};
    // cout<<"This is the p pointer " << p << endl;
    // cout<< "The value the p is pointing at is " << *p << endl;
    // cout<< "The j pointer is " << j <<endl;
    // cout << "The j pointer dereferenced " << *j << endl;
    // cout << "Value of i through the j pointer "<< **j <<endl;

    //character array and pointer to the first element 
    char array [] {"Hello"};
    char *ptr_to_array {array};

    //cout << "Here is my pointer to array "<< ptr_to_array <<endl;
    cout << "Here is my dereferenced pointer to array "<< *ptr_to_array <<endl;

    cout << "Access to 'e' through the array variable "<< array[1] << endl;

    cout << "Access to 'e' through the pointer "<< *(ptr_to_array + 1) <<endl;
    //cout << "Access to 'e' through the pointer not dereferenced "<< ptr_to_array + 1 <<endl;


    // we could reach j throuh the pointer, but it's dangerous!!
    // int i {2}, j{3};
    // int *ptr_to_i {&i};
    // cout << "Dereference pointer -1 " << * (ptr_to_i -1) << endl; 

    //lvalue
    //ptr_to_array = nullptr;
    //array is not an lvalue
    //array[3] = 'x';

    
    printArray(array);

    char *name = getName();
    cout<< name<<endl;
    return 0;
}