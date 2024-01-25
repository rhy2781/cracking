import frequencyApproach
import bitManipulationApproach


def main():
    fa = frequencyApproach
    not_palindrome = "tacodate"
    palindrome = "tacocat"
    palindrome1 = "ta c %&oc at"

    print(fa.palindromePermutation(not_palindrome))
    print(fa.palindromePermutation(palindrome))
    print(fa.palindromePermutation(palindrome1))

    print("-----")
    ba = bitManipulationApproach
    print(ba.palindromePermutation(not_palindrome))
    print(ba.palindromePermutation(palindrome))
    print(ba.palindromePermutation(palindrome1))


if __name__ == "__main__":
    main()