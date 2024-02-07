def checkPermutationCount(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    count = [0] * 128
    for i in range(len(s)):
        count[ord(s[i])] += 1
        count[ord(t[i])] -= 1

    for j in count:
        if j != 0:
            return False
    return True


def checkPermutationSort(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    return sorted(s) == sorted(t)


def main():
    one = "abcdefg"
    one_equal = "abfgdec"
    one_not_equal = "asbfnc"

    print("counting approach")
    print(checkPermutationCount(one, one_equal))
    print(checkPermutationCount(one, one_not_equal))

    print("sorting approach")
    print()
    print(checkPermutationSort(one, one_equal))
    print(checkPermutationSort(one, one_not_equal))


if __name__ == "__main__":
    main()