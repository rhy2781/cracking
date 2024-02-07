def palindromePermutationCount(s: str) -> bool:
    count = [0] * 26
    for i in s:
        if ord('a') <= ord(i) <= ord('z'):
            count[ord(i) - ord('a')] += 1

    one_limit = False
    for c in count:
        if c % 2 == 1:
            if one_limit:
                return False
            else:
                one_limit = True
    return True


def palindromePermutationBitVector(s: str):
    vector = 0
    for i in s:
        if ord('a') <= ord(i) <= ord('z'):
            shift = 1 << ord(i)
            vector ^= shift
    return (vector & (vector - 1)) == 0


def main():
    not_palindrome = "tacodate"
    palindrome = "tacocat"
    palindrome1 = "ta c %&oc at"

    print("Counting Approach")
    print(palindromePermutationCount(palindrome))
    print(palindromePermutationCount(palindrome1))
    print(palindromePermutationCount(not_palindrome))
    print()

    print("Bit Vector Approach")
    print(palindromePermutationBitVector(palindrome))
    print(palindromePermutationBitVector(palindrome1))
    print(palindromePermutationBitVector(not_palindrome))


if __name__ == "__main__":
    main()
