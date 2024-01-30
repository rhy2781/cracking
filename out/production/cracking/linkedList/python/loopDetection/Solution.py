from linkedList.python.helper import create_node_from_list, get_kth_node
import twoPointerApproach


def main():
    init = [1, 2, 3, 4, 5]
    n = create_node_from_list(init)
    loop_start = get_kth_node(n, 3)
    end = get_kth_node(n, 5)
    end.next = loop_start

    ta = twoPointerApproach
    print(n)
    print("Loop encountered at " + str(ta.loopDetection(n).data))


if __name__ == "__main__":
    main()
