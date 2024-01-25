from typing import List


def rotate(matrix: List[List[int]]) -> bool:
    if len(matrix) != len(matrix[0]) or len(matrix) == 0:
        return False

    n = len(matrix)
    for layer in range(0, n // 2):
        last = n - layer - 1
        for i in range(layer, last):
            save = matrix[layer][i]
            offset = i - layer

            # top               # left
            matrix[layer][i] = matrix[last - offset][layer]

            # left                 # bottom
            matrix[last - offset][layer] = matrix[last][last - offset]

            # bottom                        # right
            matrix[last][last - offset] = matrix[i][last]

            # right
            matrix[i][last] = save

    return True
