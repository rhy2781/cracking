from fixed_stack import fixed


def main():
    f = fixed(5)
    print("Testing isEmpty and isFull")
    for i in range(3):
        print("isEmpty:" + str(f.isEmpty(i)) + " isFull:" + str(f.isFull(i)))
    print()

    print("Filling stacks")
    for i in range(15):
        stack = i // 5
        f.push(stack, i)

    print("Testing push when stacks are full")
    for i in range(3):
        try:
            f.push(i, -1)
        except Exception as e:
            print("error: " + str(e))

    print(f)
    print()

    print("Testing pop")
    for i in range(15):
        stack = i // 5
        f.pop(stack)
    print(f)
    print()

    print("Testing pop when stacks are empty")
    for i in range(3):
        try:
            f.pop(i)
        except Exception as e:
            print(e)


if __name__ == "__main__":
    main()
