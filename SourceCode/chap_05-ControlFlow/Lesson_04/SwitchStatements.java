/*****************************************************************************
 * PROJECT:    Java-101 Comprehensive Programming Course
 * MODULE:     Control Flow
 * LESSON:     5.5 - Switch Statements
 *
 * AUTHOR:     Dr. Saad Laouadi, Ph.D.
 * CREATED:    April 2025
 *
 * Copyright © 2025 Dr. Saad Laouadi. All Rights Reserved.
 * See LICENSE file for complete terms.
 *****************************************************************************/

public class SwitchStatements {
    public static void main(String[] args) {
        // Variables for demonstration
        int dayOfWeek = 3;
        char grade = 'B';
        String fruit = "Apple";

        displayBanner('*', 72);
        System.out.println("SWITCH STATEMENTS DEMONSTRATION");
        System.out.println("==============================");

        // 1. Basic switch statement with int
        System.out.println("\n1. Basic Switch Statement with int");
        System.out.println("   Syntax: switch (expression) { case value: statements; break; ... default: statements; }");
        System.out.println("   Example: Print day of week based on numeric value (1-7)");

        System.out.println("   dayOfWeek = " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
                System.out.println("   Day " + dayOfWeek + " is Sunday");
                break;
            case 2:
                System.out.println("   Day " + dayOfWeek + " is Monday");
                break;
            case 3:
                System.out.println("   Day " + dayOfWeek + " is Tuesday");
                break;
            case 4:
                System.out.println("   Day " + dayOfWeek + " is Wednesday");
                break;
            case 5:
                System.out.println("   Day " + dayOfWeek + " is Thursday");
                break;
            case 6:
                System.out.println("   Day " + dayOfWeek + " is Friday");
                break;
            case 7:
                System.out.println("   Day " + dayOfWeek + " is Saturday");
                break;
            default:
                System.out.println("   Invalid day of week: " + dayOfWeek);
        }

        // 2. Switch without break statements (fall-through)
        System.out.println("\n2. Switch Without Break Statements (Fall-Through)");
        System.out.println("   Example: Categorize days as weekday or weekend");

        System.out.println("   dayOfWeek = " + dayOfWeek);

        switch (dayOfWeek) {
            case 1:
            case 7:
                System.out.println("   Day " + dayOfWeek + " is a weekend day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("   Day " + dayOfWeek + " is a weekday");
                break;
            default:
                System.out.println("   Invalid day of week: " + dayOfWeek);
        }

        // 3. Switch with char
        System.out.println("\n3. Switch with char");
        System.out.println("   Example: Interpret a grade");

        System.out.println("   grade = '" + grade + "'");

        switch (grade) {
            case 'A':
                System.out.println("   Excellent");
                break;
            case 'B':
                System.out.println("   Good");
                break;
            case 'C':
                System.out.println("   Satisfactory");
                break;
            case 'D':
                System.out.println("   Needs Improvement");
                break;
            case 'F':
                System.out.println("   Failing");
                break;
            default:
                System.out.println("   Invalid grade: " + grade);
        }

        // 4. Switch with String (Java 7 and later)
        System.out.println("\n4. Switch with String (Java 7+)");
        System.out.println("   Example: Provide information about a fruit");

        System.out.println("   fruit = \"" + fruit + "\"");

        switch (fruit) {
            case "Apple":
                System.out.println("   Apples are rich in fiber and vitamin C");
                break;
            case "Banana":
                System.out.println("   Bananas are high in potassium");
                break;
            case "Orange":
                System.out.println("   Oranges are a great source of vitamin C");
                break;
            case "Strawberry":
                System.out.println("   Strawberries are packed with antioxidants");
                break;
            default:
                System.out.println("   No information available for " + fruit);
        }

        // 5. Switch with expressions (Java 12+)
        System.out.println("\n5. Switch Expressions (Java 12+)");
        System.out.println("   Example: Get the number of days in a month");

        int month = 2;
        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("   month = " + month + ", year = " + year + ", isLeapYear = " + isLeapYear);

        int daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month: " + month);
        };

        System.out.println("   Days in month " + month + " (year " + year + "): " + daysInMonth);

        // 6. Switch with yield (Java 13+)
        System.out.println("\n6. Switch with yield (Java 13+)");
        System.out.println("   Example: Get the season for a given month");

        String season = switch (month) {
            case 12, 1, 2 -> {
                System.out.println("   Winter months");
                yield "Winter";
            }
            case 3, 4, 5 -> {
                System.out.println("   Spring months");
                yield "Spring";
            }
            case 6, 7, 8 -> {
                System.out.println("   Summer months");
                yield "Summer";
            }
            case 9, 10, 11 -> {
                System.out.println("   Fall months");
                yield "Fall";
            }
            default -> {
                System.out.println("   Invalid month");
                yield "Unknown";
            }
        };

        System.out.println("   Month " + month + " is in " + season);

        // 7. Difference between if-else-if and switch
        System.out.println("\n7. Difference Between if-else-if and Switch");
        System.out.println("   Switch advantages:");
        System.out.println("   - More readable for multiple conditions on same variable");
        System.out.println("   - May be more efficient (compiler can optimize jump table)");
        System.out.println("   - Cases are equality checks only (==)");

        System.out.println("\n   If-else advantages:");
        System.out.println("   - Can check different variables in each condition");
        System.out.println("   - Can use any type of comparison (<, >, !=, etc.)");
        System.out.println("   - Can handle non-constant case values");

        // 8. Enum with switch
        System.out.println("\n8. Enum with Switch");
        System.out.println("   Example: Actions based on traffic light colors");

        TrafficLight light = TrafficLight.YELLOW;
        System.out.println("   Current traffic light: " + light);

        switch (light) {
            case RED:
                System.out.println("   Stop the vehicle");
                break;
            case YELLOW:
                System.out.println("   Prepare to stop");
                break;
            case GREEN:
                System.out.println("   Proceed with caution");
                break;
        }

        // 9. Nesting switch statements
        System.out.println("\n9. Nesting Switch Statements");
        System.out.println("   Example: Student grading system with departments");

        char department = 'A'; // A for Arts, S for Science
        char studentGrade = 'B';

        switch (department) {
            case 'A':
                System.out.println("   Arts Department");
                switch (studentGrade) {
                    case 'A':
                        System.out.println("   Excellent in Arts");
                        break;
                    case 'B':
                        System.out.println("   Good in Arts");
                        break;
                    default:
                        System.out.println("   Passing in Arts");
                }
                break;
            case 'S':
                System.out.println("   Science Department");
                switch (studentGrade) {
                    case 'A':
                        System.out.println("   Excellent in Science");
                        break;
                    case 'B':
                        System.out.println("   Good in Science");
                        break;
                    default:
                        System.out.println("   Passing in Science");
                }
                break;
            default:
                System.out.println("   Unknown Department");
        }

        // 10. Common pitfalls and best practices
        System.out.println("\n10. Common Pitfalls and Best Practices");

        // Forgetting break statements
        System.out.println("    a) Forgetting Break Statements:");
        System.out.println("       - Without break, execution 'falls through' to the next case");
        System.out.println("       - This can be intended (as in weekday/weekend example)");
        System.out.println("       - But more often it's a logic error");

        // Default case placement
        System.out.println("\n    b) Default Case Placement:");
        System.out.println("       - Can be placed anywhere in the switch");
        System.out.println("       - Typically placed last for readability");
        System.out.println("       - Still needs a break statement unless it's the last case");

        // Switch limitations (pre-Java 12)
        System.out.println("\n    c) Switch Limitations (pre-Java 12):");
        System.out.println("       - Case values must be compile-time constants");
        System.out.println("       - Cannot use variables or expressions in case labels");
        System.out.println("       - No ranges in case labels (like case 1-5)");

        // When to use switch
        System.out.println("\n    d) When to Use Switch:");
        System.out.println("       - Multiple distinct values for a single variable");
        System.out.println("       - With enum types (provides compile-time safety)");
        System.out.println("       - When the cases have simple, distinct actions");

        displayBanner('*', 72);
    }

    // Enum for demonstration
    enum TrafficLight {
        RED, YELLOW, GREEN
    }

    // Helper method for formatting output
    static void displayBanner(char c, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
}
