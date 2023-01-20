public class Calculator {
    private int operand1;
    private int operand2;
    private char operator;
    private String expression;

    public Calculator() {
        setOperand1(0);
        setOperand2(0);
        setOperator('+');
        setExpression(null);
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public String getExpression() {
        return this.expression;
    }

    //The setExpression method
    public void setExpression(String expression) {
        this.expression = expression;
    }

    //The verify method
    public boolean verify() {
        String expression = getExpression();
        int operand1 = 0, operand2;
        char operator = '+';
        boolean check = false;
        if (expression.contains(" ")) {
            System.out.println("Write the expression");
            String s = "";
            String[] eAx = expression.split(s);
            for (int i = 0; i < eAx.length; i++) {
                if (i == 0) {
                    operand1 = Integer.parseInt(eAx[i]);
                } else if (i == 1) {
                    operator = eAx[i].charAt(0);
                } else if (i == 2) {
                    operand2 = Integer.parseInt(eAx[i]);
                    if (operand2 == 0 && operator == '/') {
                        check = false;
                    } else {
                        System.out.println("Write the expression");
                        setOperand1(operand1);
                        setOperand2(operand2);
                        setOperator(operator);
                        check = true;
                    }
                }
            }
        } else {
            check = false;
        }
        return check;
    }


    //The evaluate method
    public int evaluate() {
        int result = 0;
        switch (this.operator) {
            case '+':
                result = this.operand1 + this.operand2;
                break;
            case '-':
                result = this.operand1 - this.operand2;
                break;
            case '*':
                result = this.operand1 * this.operand2;
                break;
            case '/':
                result = this.operand1 / this.operand2;
                break;
            default:
                result = 0;
        }

        return result;
    }
}
