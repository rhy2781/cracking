from set_of_stacks import set_stack
from fixed_size_stack import fixed_stack


def main():
    s = set_stack(5)
    for i in range(50):
        s.push(i)
    print(s)

    for i in range(6):
        s.pop()
    print(s)

    for i in range(44):
        s.pop()
    print(s)


if __name__ == "__main__":
    main()
