import random

def merge(arr, n, m):
    if m - n <= 0:
        return

    mid = (n + m) // 2
    right_half_index = mid + 1
    left_half_index = n

    while left_half_index <= mid and right_half_index <= m:
        if arr[left_half_index] < arr[right_half_index]:
            left_half_index += 1

        elif arr[right_half_index] < arr[left_half_index]:
            temp = arr[right_half_index]
            for i in range(mid, left_half_index - 1, -1):
                arr[i + 1] = arr[i]
            arr[left_half_index] = temp
            left_half_index += 1
            right_half_index += 1
            mid += 1

        else:
            # if last elements then break
            if left_half_index == mid and right_half_index == m:
                break;

            #
            left_half_index += 1

            temp = arr[right_half_index]
            for i in range(mid, left_half_index, -1):
                arr[i + 1] = arr[i]
            arr[left_half_index] = temp
            left_half_index += 1
            right_half_index += 1
            mid += 1

# arr = [2, 4, 3, 5]
# print(arr)
# merge(arr, 0, 3)
# print(arr)

def mergeSort(arr, n, m):
    mid = (n + m) // 2
    if(m - n <= 0):
        return
    else:
        mergeSort(arr, n, mid)
        mergeSort(arr, mid + 1, m)
    merge(arr, n, m)

def swap(index1, index2, arr):
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp

def insertionSort(arr):
    num_of_comparisons = 0
    for i in range(1, len(arr)):
        for j in range(i, 0, -1):
            # print(i, j)
            num_of_comparisons += 1
            if arr[j] < arr[j - 1]:
                # print(arr, num_of_comparisons)
                swap(j, j - 1, arr)
                # print(arr)
            else:
                break

    return num_of_comparisons


# # Simple test to check if merge sort is working
# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# mergeSort(arr, 0, len(arr) - 1)
# print(arr)


# # Simple test to check if insertion sort is working
# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# num_comparisons = insertionSort(arr)
# print(arr, num_comparisons)