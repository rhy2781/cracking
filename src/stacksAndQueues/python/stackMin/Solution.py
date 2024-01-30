from minStack import minStack


def main():
    m = minStack()
    m.push(10)
    print(m.min())
    m.push(4)
    print(m.min())
    m.push(3)
    print(m.min())
    m.push(1)
    print(m.min())


if __name__ == "__main__":
    main()
