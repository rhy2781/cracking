from queue import MyQueue


def main():
    q = MyQueue()
    for i in range(4):
        q.push(i)
        print(q)

    print()
    for i in range(4):
        print(q.pop())


if __name__ == "__main__":
    main()