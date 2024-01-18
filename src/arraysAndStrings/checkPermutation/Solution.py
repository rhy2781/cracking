import frequencyApproach
import sortingApproach

def main():
    fa = frequencyApproach
    one = "abcdefg"
    one_equal = "abfgdec"
    one_not_equal = "asbfnc"
    print(fa.checkPermutation(one, one_equal))
    print(fa.checkPermutation(one, one_not_equal))

    print("------")
    sa = sortingApproach
    print(sa.checkPermutation(one, one_equal))
    print(sa.checkPermutation(one, one_not_equal))


if __name__ == "__main__":
    main()