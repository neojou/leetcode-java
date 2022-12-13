## Binary Search

### Algorithm in Pseudo code


```
def binary_search_smaller_range(list, left, right, item)
    if (left >= right):
        return left 

    mid = (left + right)/2
    if (nums[mid] >= item):
        return binary_search_smaller_range(list, left, mid, item)
    else
        return binary_search_smaller_range(list, mid + 1, right, item)


def binary_search(list, item)
    return binary_search_smaller_range(list, 0, list.length, item)

```

