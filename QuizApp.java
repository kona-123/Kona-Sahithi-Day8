package Day8;

import java.util.*;

//Question class to hold question data
class Question {
 String questionText;
 String[] options;
 int correctOption; // Index starts from 1

 // Constructor
 public Question(String questionText, String[] options, int correctOption) {
     this.questionText = questionText;
     this.options = options;
     this.correctOption = correctOption;
 }

 // Check if selected answer is correct
 public boolean isCorrect(int answer) {
     return answer == correctOption;
 }
}

public class QuizApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Step 1: Create a list of questions
     List<Question> questions = new ArrayList<>();

     questions.add(new Question(
         "What is the capital of India?",
         new String[]{"1. Mumbai", "2. Delhi", "3. Kolkata", "4. Chennai"},
         2
     ));

     questions.add(new Question(
         "Which language is used for Android development?",
         new String[]{"1. Java", "2. Python", "3. HTML", "4. C++"},
         1
     ));

     questions.add(new Question(
         "Which planet is known as the Red Planet?",
         new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Venus"},
         2
     ));

     questions.add(new Question(
         "Who wrote the National Anthem of India?",
         new String[]{"1. Rabindranath Tagore", "2. Mahatma Gandhi", "3. Subhash Chandra Bose", "4. B.R. Ambedkar"},
         1
     ));

     questions.add(new Question(
         "Which element has the chemical symbol ‘O’?",
         new String[]{"1. Gold", "2. Oxygen", "3. Osmium", "4. Oxide"},
         2
     ));

     int score = 0;

     // Step 2: Ask questions in a loop
     for (int i = 0; i < questions.size(); i++) {
         Question q = questions.get(i);

         System.out.println("\nQuestion " + (i + 1) + ": " + q.questionText);
         for (String option : q.options) {
             System.out.println(option);
         }

         System.out.print("Enter your answer (1-4): ");
         int userAnswer = scanner.nextInt();

         if (q.isCorrect(userAnswer)) {
             System.out.println("✅ Correct!");
             score++;
         } else {
             System.out.println("❌ Wrong! The correct answer was option " + q.correctOption);
         }
     }

     // Step 3: Show final score
     System.out.println("\n🎉 Quiz Completed!");
     System.out.println("Your Total Score: " + score + " out of " + questions.size());

     scanner.close();
 }
}

