import booleanArrayApproach
import setApproach
import bitVectorApproach

unique = "1234567890qwertyuiopasdfghjklzxcvbnm,./;'[]-=\\"
notUnique = "qwertyuiopasdfghjklxzcvbnm,l"
notUnique1 = "aazcxvzcxv"
notUnique2 = "asdfcc"

a_z_unique = "abcdefghijklmnopqrstuvwxyz"
a_z_not_unique = "aabcds"
a_z_not_unique1 = "abcdd"
a_z_not_unique2 = "abccd"


def main():
    ba = booleanArrayApproach
    print(ba.isUnique(unique))
    print(ba.isUnique(notUnique))
    print(ba.isUnique(notUnique1))
    print(ba.isUnique(notUnique2))

    print("------")
    sa = setApproach
    print(sa.isUnique(unique))
    print(sa.isUnique(notUnique))
    print(sa.isUnique(notUnique1))
    print(sa.isUnique(notUnique2))

    print("------")
    bv = bitVectorApproach
    print(bv.isUnique(a_z_unique))
    print(bv.isUnique(a_z_not_unique))
    print(bv.isUnique(a_z_not_unique1))
    print(bv.isUnique(a_z_not_unique2))


if __name__ == "__main__":
    main()
