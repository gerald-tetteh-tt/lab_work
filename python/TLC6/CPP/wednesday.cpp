#include <iostream>

// call-by-value
// void swap(int a, int b){
//     int tmp = a;
//     a = b;
//     b = tmp;
// }

// call-by-pointer
// void swap(int *a, int *b){
//     // dereferencing the pointer
//     int tmp = *a;
//     *a = *b;
//     *b = tmp;
// }

// call-by-reference
void swap(int &a, int &b){
     int tmp = a;
     a = b;
     b = tmp;
 }

int main(){
    // int number = 7;
    // int *number_ptr = &number;
    // std::cout << "Here is the number : "<< number <<std::endl;
    // std::cout << "Here is the pointer: "<< number_ptr <<std::endl;
    
    // int &number_alias = number;
    // std::cout << "Here is the number alias: "<< number_alias << std::endl;
   
   int val1 = 5;
   int val2 = 8;
   
    swap(val1, val2);
    //swap(4, 8);
    std::cout << "Val1 is " <<val1 << std::endl;
    std::cout << "Val2 is " <<val2 << std::endl;
}