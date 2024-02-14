from typing import List
from arraysAndStrings.python.matrix_util import printMatrix


def rotate(matrix: List[List[int]]) -> bool:
    if len(matrix) != len(matrix[0]) or len(matrix) == 0:
        return False

    n = len(matrix)
    for layer in range(0, n // 2):
        last = n - layer - 1
        for i in range(layer, last):
            save = matrix[layer][i]
            offset = i - layer

            matrix[layer][i] = matrix[last - offset][layer]
            matrix[last - offset][layer] = matrix[last][last - offset]
            matrix[last][last - offset] = matrix[i][last]
            matrix[i][last] = save
    return True


def main():
    matrix = [
        [1, 2, 3, 4, 5],
        [6, 7, 8, 9, 10],
        [11, 12, 13, 14, 15],
        [16, 17, 18, 19, 20],
        [21, 22, 23, 24, 25]
    ]
    printMatrix(matrix)
    rotate(matrix)
    printMatrix(matrix)


if __name__ == "__main__":
    main()
