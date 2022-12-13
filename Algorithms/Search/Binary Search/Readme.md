## Binary Search

### Algorithm in Pseudo code


```
def binary_search_range(list, left, right, item)
    if (left > right):
        return right + 1
    else if (left == right):
        if (item > list[right]):
            return right + 1
        else
            return right

    mid = (left + right)/2
    bound = list[mid]
    if (target == bound):
        return mid
    else if (target < bound):
        return binary_search_range(list, left, mid - 1, item)
    else
        return binary_search_range(list, mid + 1, right, item)


def binary_search(list, item)
    return binary_search_range(list, 0, list.length - 1, item)

```

