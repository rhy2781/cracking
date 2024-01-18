import iterateBackwardsApproach


def main():
    ib = iterateBackwardsApproach
    s = "Mr John Smith       "
    print("[" + s + "]")
    print("[" + ib.URLify(s, 13) + "]")


if __name__ == "__main__":
    main()