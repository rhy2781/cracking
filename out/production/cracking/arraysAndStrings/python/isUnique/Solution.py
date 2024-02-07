unique = "1234567890qwertyuiopasdfghjklzxcvbnm,./;'[]-=\\"
notUnique = "qwertyuiopasdfghjklxzcvbnm,l"
notUnique1 = "aazcxvzcxv"
notUnique2 = "asdfcc"

a_z_unique = "abcdefghijklmnopqrstuvwxyz"
a_z_not_unique = "aabcds"
a_z_not_unique1 = "abcdd"
a_z_not_unique2 = "abccd"


def isUniqueBitVector(s: str) -> bool:
    checker = 0
    for i in s:
        if checker & (1 << ord(i)):
            return False
        checker |= (1 << ord(i))
    return True


def isUniqueArray(s: str) -> bool:
    ba = [False] * 128
    for i in s:
        if ba[ord(i)]:
            return False
        ba[ord(i)] = True
    return True


def isUniqueSet(s: str) -> bool:
    st = set()
    for i in s:
        if i in st:
            return False
        st.add(i)
    return True


def main():
    print("Boolean Array Approach")
    print(isUniqueArray(unique))
    print(isUniqueArray(notUnique))
    print(isUniqueArray(notUnique1))
    print(isUniqueArray(notUnique2))
    print()

    print("Set Approach")
    print(isUniqueSet(unique))
    print(isUniqueSet(notUnique))
    print(isUniqueSet(notUnique1))
    print(isUniqueSet(notUnique2))
    print()

    print("Bit Vector Approach")
    print(isUniqueBitVector(a_z_unique))
    print(isUniqueBitVector(a_z_not_unique))
    print(isUniqueBitVector(a_z_not_unique1))
    print(isUniqueBitVector(a_z_not_unique2))


if __name__ == "__main__":
    main()
