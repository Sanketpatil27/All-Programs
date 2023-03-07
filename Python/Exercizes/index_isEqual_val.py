# Given an array Arr of N positive integers.
# Your task is to find the elements whose value is equal to that of its index value 
# ( Consider 1-based indexing ).

def valueEqualToIndex(arr, n):
        for i in range(n):
            if arr[i] == i+1:
                return i+1
        return -1

        # method 2
        # for i,r in enumerate(arr):
        #     print(i, r)
        #     if (i+1) == arr[i]:
        #         return i+1
            

print(valueEqualToIndex([17, 2, 73, 12, 7], 5))