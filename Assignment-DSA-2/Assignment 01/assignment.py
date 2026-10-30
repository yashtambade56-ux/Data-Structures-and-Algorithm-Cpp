# Programming Assignment 1 - Two Pointer Technique

# 1. Remove duplicates - Brute Force
def remove_brute():
    arr = [1, 1, 2, 2, 3, 4, 4]
    unique = []

    for num in arr:
        if num not in unique:
            unique.append(num)

    print("Brute Force:", unique)
    print("Count:", len(unique))


# 2. Remove duplicates - Two Pointers
def remove_two_pointers():
    arr = [1, 1, 2, 2, 3, 4, 4]
    k = 1

    for i in range(1, len(arr)):
        if arr[i] != arr[k - 1]:
            arr[k] = arr[i]
            k += 1

    print("Two Pointers:", arr[:k])
    print("Count:", k)


# 3. Pair Sum - Brute Force
def pair_brute():
    arr = [1, 2, 4, 7, 11, 15]
    target = 15

    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == target:
                print("Brute Force Pair:", arr[i], "+", arr[j])
                print("Indices:", i, j)
                return

    print("No pair found")


# 4. Pair Sum - Two Pointers
def pair_two_pointers():
    arr = [1, 2, 4, 7, 11, 15]
    target = 15
    left = 0
    right = len(arr) - 1

    while left < right:
        total = arr[left] + arr[right]

        if total == target:
            print("Two Pointers Pair:", arr[left], "+", arr[right])
            print("Indices:", left, right)
            return
        elif total < target:
            left += 1
        else:
            right -= 1

    print("No pair found")


print("REMOVE DUPLICATES")
remove_brute()
remove_two_pointers()

print("\nPAIR SUM")
pair_brute()
pair_two_pointers()
