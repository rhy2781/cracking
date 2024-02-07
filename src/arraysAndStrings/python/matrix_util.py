from typing import List


def printMatrix(matrix: List[List[int]]) -> None:
    for i in range(len(matrix)):
        print("[", end="")
        for j in range(len(matrix[0])):
            print(' {:2}'.format(matrix[i][j]), end="")
        print("]")
    print()
