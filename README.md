## Grade Distribution 

**This is a Grade Distribution exercise from Massive Online Open Course by University of Helsinky**

## About the project

1. This is a student exam grade distribution project by the scores he has entered. 
   Student (user) inputs his scores on exams from 0 to 60. Other scores are not taken in account.
   When the scores are entered, the user enters "-1". This command ends the input from the student.
   The grades for each exam are calculated according to the scores the user has entered.

2. Program then outputs the distribution of the grades which where calculated according to the scores
   the student had entered. Each grade is represented as a String character "*" and is put next to the grade.
   
3. Program outputs the acceptance percentage aswell. 
   "0" grades are not considered when calculating the percentage of acceptance. Calculated: `100 * acceptedGrades / allGrades`
   
   **E.g.**
   - *"Type exam scores, -1 completes: "*
   - **User input:**  34  41  53  36  55  27  43  40  -1
   - **Output:**
       - 5: **
       - 4:
       - 3: ***
       - 2: *
       - 1: *
       - 0: *
       - Acceptance percentage: 87.5

## Grades
- **5**:  *50 to 60pts*
- **4**:  *45 to 49pts*
- **3**:  *40 to 44pts*
- **2**:  *35 to 39pts*
- **1**:  *30 to 34pts*
- **0**:  *0  to 29pts*
      



## Things to be done

- You can make the code more simple( `gradeDistribution()` method uses a lot of loops. It shouldn't use so many. )
- You can style code in a more elegant way
- You can delete the unnessecary lines of code(I believe there could be such lines)

