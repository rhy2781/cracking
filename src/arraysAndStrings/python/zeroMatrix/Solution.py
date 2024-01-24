import recordZeroApproach
from typing import List


def printMatrix(matrix: List[List[int]]):
    for i in range(len(matrix)):
        print("[", end="")
        for j in range(len(matrix[0])):
            print(' {:2}'.format(matrix[i][j]), end="")
        print("]")


def main():
    matrix = [
        [1, 2, 3, 4, 5],
        [6, 7, 8, 0, 10],
        [11, 12, 13, 14, 15],
        [16, 0, 18, 19, 20],
        [21, 22, 23, 24, 25],
        [26, 27, 28, 29, 30]
    ]
    printMatrix(matrix)
    ra = recordZeroApproach
    ra.zeroMatrix(matrix)
    print()
    printMatrix(matrix)


if __name__ == "__main__":
    main()
