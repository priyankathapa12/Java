//Arithmetic operations ;

class Math {
    private int num1, num2;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    int getNum1() {
        return num1;
    }

    int getNum2() {
        return num2;
    }
}

class Arithmetic extends Math {
    private int result;

    int add() {
        result = getNum1() + getNum2();
        return result;
    }

    int subtract() {
        result = getNum1() - getNum2();
        return result;
    }

    int multiply() {
        result = getNum1() * getNum2();
        return result;
    }

    int divide() {
        if (getNum2() == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        result = getNum1() / getNum2();
        return result;
    }
}

