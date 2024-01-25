from linkedList.python.node import node
from linkedList.python.helper import create_node_from_list
import twoPointerApproach
import frequencyApproach

def main():
    init = [1, 2, 3, 4, 5, 4, 3, 2, 1]
    init2 = [1, 2, 3, 4]
    palindrome = create_node_from_list(init)
    not_palindrome = create_node_from_list(init2)

    print("Two pointer approach")
    ta = twoPointerApproach
    print(ta.is_palindrome(palindrome))
    print(ta.is_palindrome(not_palindrome))
    print("-----")

    fa = frequencyApproach
    print(fa.is_palindrome(palindrome))
    print(fa.is_palindrome(not_palindrome))


if __name__ == "__main__":
    main()