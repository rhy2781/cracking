def isSubstring(test: str, original: str) -> bool:
    return test in original


def stringRotation(s: str, t: str) -> bool:
    if len(s) == len(t) and len(s) > 0:
        s1 = s + s
        return isSubstring(t, s1)
    return False


def main():
    print(stringRotation("waterbottle", "erbottlewat"))


if __name__ == "__main__":
    main()
