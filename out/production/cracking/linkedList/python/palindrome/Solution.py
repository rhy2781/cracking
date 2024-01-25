import reverseApproach
import stackApproach
from linkedList.python.helper import create_node_from_list


def main():
    init = [1, 2, 3, 4, 5, 4, 3, 2, 1]
    init2 = [1, 2, 3, 4, 5]
    palindrome = create_node_from_list(init)
    not_palindrome = create_node_from_list(init2)

    ra = reverseApproach
    print("reverse approach")
    print(ra.is_palindrome(palindrome))
    print(ra.is_palindrome(not_palindrome))
    print("-----")

    sa = stackApproach
    print("stack approach")
    print(sa.is_palindrome(palindrome))
    print(sa.is_palindrome(not_palindrome))

if __name__ == "__main__":
    main()


