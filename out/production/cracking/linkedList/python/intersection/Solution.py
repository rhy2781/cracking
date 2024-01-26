from linkedList.python.helper import create_node_from_list, get_kth_node

def main():
    init = [3, 1, 5, 9, 7, 2, 1]
    init2 = [4, 6]
    init3 = [1, 2, 3, 4, 5]

    longer = create_node_from_list(init)
    shorter = create_node_from_list(init2)
    intersection = get_kth_node(longer, 5)
    print(longer)
    print(shorter)
    print(intersection)


if __name__ =="__main__":
    main()