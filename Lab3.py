def merge(n, m):

def mergeSort(n, m):
    mid = (n + m) / 2
    if(m - n <= 0):
        return
    else:
        mergeSort(n, mid)
        mergeSort(mid + 1, m)
    merge(n, m)