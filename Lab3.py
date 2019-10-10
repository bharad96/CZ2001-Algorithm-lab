import random
from time import process_time


def merge(arr, n, mid, m):
    if m - n <= 0:
        return

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

def mergeSort(arr, n, m):
    mid = (n + m) // 2
    if(m - n <= 0):
        return
    else:
        mergeSort(arr, n, mid)
        mergeSort(arr, mid + 1, m)
    merge(arr, n, mid, m)

# # Simple test to check if merge sort is working
# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# mergeSort(arr, 0, len(arr) - 1)
# print(arr)


def swap(index1, index2, arr):
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp

# def basic_insertionSort(arr):
#     num_of_comparisons = 0
#     for i in range(1, len(arr)):
#         for j in range(i, 0, -1):
#             # print(i, j)
#             num_of_comparisons += 1
#             if arr[j] < arr[j - 1]:
#                 # print(arr, num_of_comparisons)
#                 swap(j, j - 1, arr)
#                 # print(arr)
#             else:
#                 break
#
#     return num_of_comparisons
#
# # Simple test to check if insertion sort is working
# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# num_comparisons = basic_insertionSort(arr)
# print(arr, num_comparisons)

def insertionSort(arr, first, last):
    num_of_comparisons = 0
    for i in range(first + 1, last + 1):
        for j in range(i, first - 1, -1):
            # print(i, j)
            num_of_comparisons += 1
            if arr[j] < arr[j - 1]:
                # print(arr, num_of_comparisons)
                swap(j, j - 1, arr)
                # print(arr)
            else:
                break

    return num_of_comparisons


# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# num_comparisons = insertionSort(arr, 10, len(arr) - 1)
# print(arr, num_comparisons)
#


def merge_insertion_sort(arr, first, last, switch_sort_num):

    if last - first > switch_sort_num:
        mid = (first + last) // 2
        merge_insertion_sort(arr, first, mid, switch_sort_num)
        merge_insertion_sort(arr, mid + 1, last, switch_sort_num)
        merge(arr, first, mid, last)

    else:
        insertionSort(arr, first, last)


start = process_time()

arr_length = 8
# arr = [i for i in range(arr_length)]
arr = [6, 2, 5, 1, 7, 4, 3, 0]
print(arr)
random.shuffle(arr)
print(arr)
merge_insertion_sort(arr, 0, arr_length - 1, 2)
print(arr)


stop = process_time()
print("Elapsed time:", stop, start)

print("Elapsed time during the whole program in seconds:", stop - start)
