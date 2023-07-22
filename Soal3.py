def is_balanced_brackets(s):
    stack = []
    opening_brackets = "({["
    closing_brackets = ")}]"

    for char in s:
        if char in opening_brackets:
            stack.append(char)
        elif char in closing_brackets:
            if not stack:
                return "NO"

            last_opening_bracket = stack.pop()
            if opening_brackets.index(last_opening_bracket) != closing_brackets.index(char):
                return "NO"

    if not stack:
        return "YES"
    else:
        return "NO"

def main():
    try:
        input_string = input("Masukkan string dengan tanda kurung: ")
        result = is_balanced_brackets(input_string)
        print(f"Output: {result}")
    except Exception as e:
        print(f"Error: {str(e)}")

if __name__ == "__main__":
    main()