def triangular_numbers(n):
    result = []
    current_sum = 0
    for i in range(1, n + 1):
        current_sum += i
        result.append(current_sum)
    return result

def main():
    try:
        n = int(input("Masukkan jumlah bilangan dalam deret: "))
        if n < 1:
            print("Masukkan angka lebih besar dari 0!")
        else:
            triangular_sequence = triangular_numbers(n)
            output = "-".join(map(str, triangular_sequence))
            print(f"Output: {output}")
    except ValueError:
        print("Masukkan angka yang valid!")

if __name__ == "__main__":
    main()