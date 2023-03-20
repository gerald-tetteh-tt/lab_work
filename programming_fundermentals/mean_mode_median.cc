// request 5 int's from user and find
// the mean, mode and median of the numbers
#include <iostream>
#include <algorithm>
#include <unordered_map>

int main()
{
    int numbers[5];
    int mode;
    int sum = 0;
    float mean, median;

    std::cout << "Please enter five numbers next" << std::endl;

    for (int i = 0; i < 5; i++)
    {
        std::cout << "Enter number " << i + 1 << ": ";
        std::cin >> numbers[i];
        sum += numbers[i];
    }

    // sort array
    // pass a pointer to the fist and last element +1
    std::sort(numbers, numbers + 5);

    mean = sum / 5;
    // since the total is an odd number
    median = numbers[2];
    // to find mode
    std::unordered_map<int, int> numberCount;
    for (int i = 0; i < 5; i++)
    {
        numberCount[numbers[i]]++;
    }
    // find max occurance
    int maxCount = numberCount[numbers[0]];
    mode = numbers[0];
    for (auto item : numberCount)
    {
        if (maxCount < item.second)
        {
            maxCount = item.second;
            mode = item.first;
        }
    }
    // results
    std::cout << "Mean: " << mean << ", Mode: " << mode << ", Median: " << median << std::endl;
}