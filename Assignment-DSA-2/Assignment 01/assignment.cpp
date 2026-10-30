// Programming Assignment 1 - Two Pointer Technique
#include <iostream>
#include <vector>
using namespace std;

// 1. Remove duplicates - Brute Force
void removeBrute() {
    int arr[] = {1, 1, 2, 2, 3, 4, 4};
    int n = 7, uniqueArr[7], k = 0;

    for (int i = 0; i < n; i++) {
        bool found = false;

        for (int j = 0; j < k; j++) {
            if (arr[i] == uniqueArr[j]) {
                found = true;
                break;
            }
        }

        if (!found)
            uniqueArr[k++] = arr[i];
    }

    cout << "Brute Force: ";
    for (int i = 0; i < k; i++)
        cout << uniqueArr[i] << " ";
    cout << "\nCount: " << k << "\n\n";
}

// 2. Remove duplicates - Two Pointers
void removeTwoPointers() {
    int arr[] = {1, 1, 2, 2, 3, 4, 4};
    int n = 7, k = 1;

    for (int i = 1; i < n; i++) {
        if (arr[i] != arr[k - 1]) {
            arr[k] = arr[i];
            k++;
        }
    }

    cout << "Two Pointers: ";
    for (int i = 0; i < k; i++)
        cout << arr[i] << " ";
    cout << "\nCount: " << k << "\n\n";
}

// 3. Pair Sum - Brute Force
void pairBrute() {
    int arr[] = {1, 2, 4, 7, 11, 15};
    int n = 6, target = 15;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (arr[i] + arr[j] == target) {
                cout << "Brute Force Pair: "
                     << arr[i] << " + " << arr[j] << "\n";
                cout << "Indices: " << i << ", " << j << "\n\n";
                return;
            }
        }
    }

    cout << "No pair found\n\n";
}

// 4. Pair Sum - Two Pointers
void pairTwoPointers() {
    int arr[] = {1, 2, 4, 7, 11, 15};
    int n = 6, target = 15;
    int left = 0, right = n - 1;

    while (left < right) {
        int sum = arr[left] + arr[right];

        if (sum == target) {
            cout << "Two Pointers Pair: "
                 << arr[left] << " + " << arr[right] << "\n";
            cout << "Indices: " << left << ", " << right << "\n\n";
            return;
        } else if (sum < target) {
            left++;
        } else {
            right--;
        }
    }

    cout << "No pair found\n\n";
}

int main() {
    cout << "REMOVE DUPLICATES\n";
    removeBrute();
    removeTwoPointers();

    cout << "PAIR SUM\n";
    pairBrute();
    pairTwoPointers();

    return 0;
}
