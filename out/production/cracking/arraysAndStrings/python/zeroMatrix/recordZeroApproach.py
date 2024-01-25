from typing import List


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
