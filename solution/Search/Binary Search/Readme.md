## Binary Search

### Algorithm in Pseudo code


```
def binary_search(list, item)

    first = 0

    last = len(list) - 1

    while first < last do

        middle = (first + last) / 2

        m_item = list[middle]

        if (m_item == item):

              return true

         else:

              if (item < m_item):

                   last = middle - 1

              else:

                   first = middle + 1

     return false
```

