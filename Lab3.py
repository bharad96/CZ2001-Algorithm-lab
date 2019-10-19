import random
import time
from time import process_time

def merge(arr, n, mid, m):
    if m - n <= 0:
        return

    right_half_index = mid + 1
    left_half_index = n
    num_of_comparisons = 0

    while left_half_index <= mid and right_half_index <= m:
        num_of_comparisons += 1
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
    return num_of_comparisons

def mergeSort(arr, n, m):
    mid = (n + m) // 2
    if(m - n <= 0):
        return 0
    else:
        num = mergeSort(arr, n, mid)
        num += mergeSort(arr, mid + 1, m)
    num +=  merge(arr, n, mid, m)
    return num


# # Simple test to check if merge sort is working
# arr = [i for i in range(20)]
# print(arr)
# random.shuffle(arr)
# print(arr)
# mergeSort(arr, 0, len(arr) - 1)
# print(arr)

def get_merge_sort_time(arr):
    arr_length = len(arr)
    start = time.clock()
    num_of_comparisons = mergeSort(arr, 0, arr_length - 1)
    time_taken = time.clock() - start
    print("Number of Comparisons: " , num_of_comparisons)
    print("Elapsed time during the whole program in miliseconds:", time_taken*1000)


def swap(index1, index2, arr):
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp

def basic_insertionSort(arr):
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

def get_insertion_sort_time(arr):
    arr_length = len(arr)
    start = process_time()
    num_comparisons = basic_insertionSort(arr)
    # print(arr)
    stop = process_time()
    time_taken = stop - start
    print("Elapsed time for insertion sort in seconds:", time_taken)
    return num_comparisons

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
        for j in range(i, first, -1):
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
        num = merge_insertion_sort(arr, first, mid, switch_sort_num)
        num += merge_insertion_sort(arr, mid + 1, last, switch_sort_num)
        return num + merge(arr, first, mid, last)

    else:
        return insertionSort(arr, first, last)

def get_merge_insertion_sort_time(arr, switch_sort_num):
    arr_length = len(arr)
    start = time.clock()
    #start = process_time()
    num_of_comparisons = merge_insertion_sort(arr, 0, arr_length - 1, switch_sort_num)
    # print(arr)
    #stop = process_time()
    time_taken = time.clock() - start
    #time_taken = stop - start
    print("Switch sort num :", + switch_sort_num)
    print("Number of Comparisons: ", num_of_comparisons)
    print("Elapsed time during the whole program in miliseconds:", time_taken*1000)

    return time_taken

def compare_diff_switch_sort_num():
    arr_length = 10000
    print("Array Size :", arr_length)
    arr = [i for i in range(arr_length)]
    random.shuffle(arr)

    #Mergesort Algorithm
    temp_arr = arr.copy();
    get_merge_sort_time(temp_arr);
    print("+-----------------------------------------------------------+")

    #MergeInsertionSort Algorithm
    for i in range(21):
        temp_arr = arr.copy()
        # print("Before : ", temp_arr)
        get_merge_insertion_sort_time(temp_arr, i)
        # print("After : ", temp_arr)

compare_diff_switch_sort_num()

# arr = [i for i in range(1000, 1000001)]
# # print(arr)
# random.shuffle(arr)