import random
from time import process_time
from time import perf_counter
import timeit
import matplotlib.pyplot as plt
import numpy as np


def merge(arr, n, mid, m):
    overall_num_comparisons = 0

    if m - n <= 0:
        return

    right_half_index = mid + 1
    left_half_index = n

    while left_half_index <= mid and right_half_index <= m:
        overall_num_comparisons += 1
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
                break

            #
            left_half_index += 1

            temp = arr[right_half_index]
            for i in range(mid, left_half_index, -1):
                arr[i + 1] = arr[i]
            arr[left_half_index] = temp
            left_half_index += 1
            right_half_index += 1
            mid += 1
    return overall_num_comparisons


def mergeSort(arr, n, m):
    mid = (n + m) // 2
    if m - n <= 0:
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

def merge_insertion_sort(arr, first, last, switch_sort_num):
    num_comparison = 0
    # + 1 in both if and else because there is one comparison here in the if statement below
    if last - first > switch_sort_num:
        mid = (first + last) // 2
        num_comparison += merge_insertion_sort(arr, first, mid, switch_sort_num)
        num_comparison += merge_insertion_sort(arr, mid + 1, last, switch_sort_num)
        num_comparison += merge(arr, first, mid, last)
        return num_comparison

    else:
        num_comparison += insertionSort(arr, first, last)
        return num_comparison


# def merge_insertion_sort(arr, first, last, switch_sort_num):
#
#     # + 1 in both if and else because there is one comparison here in the if statement below
#     if last - first > switch_sort_num:
#         mid = (first + last) // 2
#         num_comparison = merge_insertion_sort(arr, first, mid, switch_sort_num)
#         num_comparison += merge_insertion_sort(arr, mid + 1, last, switch_sort_num)
#         return num_comparison + merge(arr, first, mid, last) + 1
#
#     else:
#         return 1 + insertionSort(arr, first, last)


def get_merge_insertion_sort_time(arr, switch_sort_num):
    arr_length = len(arr)
    # arr2 = arr.copy()
    # print(arr)
    #

    # start = perf_counter()
    # merge_insertion_sort(arr, 0, arr_length - 1, switch_sort_num)
    # stop = perf_counter()
    # #
    # time_taken = stop - start
    # print(arr)
    num_comparisons = merge_insertion_sort(arr.copy(), 0, arr_length - 1, switch_sort_num)
    time_taken = min(timeit.repeat(lambda: merge_insertion_sort(arr.copy(), 0, arr_length - 1, switch_sort_num), repeat=5, number=5)) / 5

    # print(arr)

    print("Switch sort num :", + switch_sort_num)
    print("Elapsed time during the whole program in milli seconds:", time_taken * 1000)
    print("Num of Comparisons :", num_comparisons)
    return time_taken


def compare_diff_switch_sort_num(starting_num, ending_num):
    arr = [i for i in range(starting_num, ending_num + 1)]
    # print(arr)
    random.shuffle(arr)

    for S in [0, 2, 4, 6, 8, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 25, 30, 35, 40, 45, 50, 100, 500, 1000]:
        temp_arr = arr.copy()
        # print("Before : ", temp_arr)
        get_merge_insertion_sort_time(temp_arr, S)
        # print("After : ", temp_arr)


compare_diff_switch_sort_num(1, 1000)



#
# ax = plt.subplot(111)
# t1 = np.arange(0.0, 1.0, 0.01)
# for n in [1, 2, 3, 4]:
#     plt.plot(t1, t1**n, label="n=%d" % n)
#
# leg = plt.legend(loc='best', ncol=2, mode="expand", shadow=True, fancybox=True)
# leg.get_frame().set_alpha(0.5)
#
#
# plt.show()

# arr = [x for x in range(1, 1001)]
# random.shuffle(arr)
# print(arr)
# num_comparisons = merge_insertion_sort(arr, 0, 1000 - 1, 0)
# print(arr)
# print(num_comparisons)