package day2;

public class OperatorsPract {
public static void main(String[] args) {
    int x = 4, y = 7;
    double a = 6.4, b = 7.9; //
    double c = 1.0; //

    int sum = x + y; // sum is assigned x+y
                     // = is the assignment operator

    int p = y % 2; // remainder(modulus)
    p = y / 2; // division

    double mult = a * b; // double*double must = double
    x = x - 1; // subtracts 1 from x and assigns it back to x

    int numStudents = 14;

    numStudents = numStudents + 1; // ln 20, 21, 22 both increment numStudents by 1
    numStudents++;
    numStudents += 1;

    numStudents = numStudents - 1; // ln 24, 25, 26 both increment numStudents by 1
    numStudents--;
    numStudents -= 1;

    double temperature = 12.9;
    temperature %= 10; // In addition to += and -= there are also %=, *=, /= etc.
    temperature *= 3;
    temperature /= 2;
}
}