from typing import List


def sort(s: List[int]) -> None:
    buffer = []
    while not s:
        temp = s.pop()
        while len(buffer) != 0 and buffer[-1] > temp:
            s.append(buffer.pop())
        buffer.append(temp)
    while not s:
        s.append(buffer.pop())

