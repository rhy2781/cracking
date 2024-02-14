from typing import List
from arraysAndStrings.python.matrix_util import printMatrix


def setRow(matrix: List[List[int]], row: int):
    for j in range(len(matrix[0])):
        matrix[row][j] = 0


def setCol(matrix: List[List[int]], col: int):
    for i in range(len(matrix)):
        matrix[i][col] = 0


def zeroMatrix(matrix: List[List[int]]):
    rows = set()
    cols = set()
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == 0:
                rows.add(i)
                cols.add(i)
    for r in rows:
        setRow(matrix, r)

    for c in cols:
        setCol(matrix, c)


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
    zeroMatrix(matrix)
    printMatrix(matrix)


if __name__ == "__main__":
    main()
