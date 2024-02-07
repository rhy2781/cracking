from typing import List


def sort(s: List[int]) -> None:
    buffer = []

    while s:
        temp = s.pop()
        while len(buffer) != 0 and buffer[-1] > temp:
            s.append(buffer.pop())
        buffer.append(temp)
    while buffer:
        s.append(buffer.pop())


def main():
    stack = []
    values = [1, 20, 93, 43, 23, 75, 54, 55, 723]
    for i in values:
        stack.append(i)

    print(stack)
    sort(stack)
    print(stack)
    print()

    while stack:
        print(stack.pop())



if __name__ == "__main__":
    main()
