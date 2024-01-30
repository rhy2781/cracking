from sortStack import sort


def main():
    stack = []
    values = [1, 20, 93, 43, 23, 75, 54, 55, 723]
    for i in values:
        stack.append(stack)

    print(stack)
    sort(stack)
    print(stack)


if __name__ == "__main__":
    main()
