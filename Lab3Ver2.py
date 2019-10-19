import random
from time import process_time
from time import perf_counter
import timeit
import matplotlib.pyplot as plt
import numpy as np


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

    if last - first > switch_sort_num:
        mid = (first + last) // 2
        merge_insertion_sort(arr, first, mid, switch_sort_num)
        merge_insertion_sort(arr, mid + 1, last, switch_sort_num)
        merge(arr, first, mid, last)

    else:
        insertionSort(arr, first, last)


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

    time_taken = min(timeit.repeat(lambda: merge_insertion_sort(arr.copy(), 0, arr_length - 1, switch_sort_num), repeat=5, number=5)) / 5

    # print(arr)

    print("Switch sort num :", + switch_sort_num)
    print("Elapsed time during the whole program in milli seconds:", time_taken * 1000)

    return time_taken


def compare_diff_switch_sort_num(starting_num, ending_num):
    arr = [i for i in range(starting_num, ending_num + 1)]
    # print(arr)
    random.shuffle(arr)

    for S in [0, 2, 4, 6, 8, 10, 15, 20, 50, 100, 1000, 2000]:
        temp_arr = arr.copy()
        # print("Before : ", temp_arr)
        get_merge_insertion_sort_time(temp_arr, S)
        # print("After : ", temp_arr)


compare_diff_switch_sort_num(1, 2000)



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