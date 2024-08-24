let Input = '';
let firstNumber = '';
let operator = '';

function clearDisplay() {
    
    document.getElementById('display').innerText = '0';
    Input = '';
    operator = '';
    firstNumber = '';
}

function appendNumber(number) {
    
    if (Input.length < 10) {
        Input += number;
        document.getElementById('display').innerText = Input;
    }
}

function Operation(op) {
    
    if (Input !== '') {
        
        firstNumber = Input;
        operator = op;
        Input = '';
    }
}

function calculate() {
    if (Input !== '' && firstNumber !== '') {
        
        let result;
        const num1 = parseFloat(firstNumber);
        const num2 = parseFloat(Input);

        if (operator === '+') {
            result = num1 + num2;
        } 
        else if (operator === '-') {
            result = num1 - num2;
        } 
        else if (operator === '*') {
            result = num1 * num2;
        } 
        else if (operator === '/') {
            result = num1 / num2;
        }

        document.getElementById('display').innerText = result;
        Input = result.toString();
        operator = '';
        firstNumber = '';
    }
}
