import java.util.ArrayList;

public class Exercises { 

 public boolean commonEnd(ArrayList < Integer > a, ArrayList < Integer > b) {
  if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
   return false;
  }
  if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1)) {
   return true;
  }
  return false;
 }

 public ArrayList < String > endsMeet(ArrayList < String > values, int n) {
  if (values == null || values.size() < n || n < 0) {
   ArrayList < String > empty = new ArrayList < String > ();
   return empty;
  }
  ArrayList < String > newArray = new ArrayList < String > ();
  for (int i = 0; i < n; i++) {
   newArray.add(values.get(i));
  }
  for (int i = (values.size() - n); i < values.size(); i++) {
   newArray.add(values.get(i));
  }
  return newArray;
 }

 public int difference(ArrayList < Integer > numbers) {
  if (numbers == null || numbers.size() < 1) {
   return -1;
  }

  return Collections.max(numbers) - Collections.min(numbers);
 }

 public double biggest(ArrayList < Double > numbers) {
  if (numbers == null || numbers.size() % 2 == 0 || numbers.size() < 3) {
   return -1;
  }
  for (int i = 0; i < numbers.size(); i++) {
   if (numbers.get(i) < 0) {
    return -1;
   }
  }

  ArrayList < Double > result = new ArrayList < Double > ();
  result.add(numbers.get(0));
  result.add(numbers.get((numbers.size() - 1) / 2));
  result.add(numbers.get(numbers.size() - 1));

  return Collections.max(result);
 }

 public ArrayList < String > middle(ArrayList < String > values) {
  if (values == null || values.size() < 3 || values.size() % 2 == 0) {
   ArrayList < String > empty = new ArrayList < String > ();
   return empty;
  }
  String first = values.get(((values.size() - 1) / 2) - 1);
  String middle = values.get(((values.size() - 1) / 2));
  String last = values.get(((values.size() - 1) / 2) + 1);
  ArrayList < String > result = new ArrayList < String > ();
  result.add(first);
  result.add(middle);
  result.add(last);
  return result;
 }

 public boolean increasing(ArrayList < Integer > numbers) {
  if (numbers == null || numbers.size() < 3) {
   return false;
  }
  for (int i = 1; i < numbers.size() - 1; i++) {
   if ((numbers.get(i - 1) == (numbers.get(i) - 1)) && (numbers.get(i) == (numbers.get(i + 1) - 1))) {
    return true;
   }
  }
  return false;
 }

 public boolean everywhere(ArrayList < Integer > numbers, int x) {
  if (numbers == null || numbers.size() < 1) {
   return false;
  }
  int counter = 0;
  for (int value: numbers) {
   if (value == x) {
    counter++;
   }
  }
  if (counter == numbers.size()) {
   return true;
  }
  counter = 0;
  for (int i = 0; i < 2; i++) {
   for (int j = i; j < numbers.size(); j += 2) {
    if (numbers.get(j) == x) {
     counter++;
    }
   }
   if (numbers.size() % 2 == 1 && numbers.get(0) == x && numbers.get(numbers.size() - 1) == x) {
    if (counter == ((numbers.size() + 1) / 2)) {
     return true;
    }
   } else {
    if (counter == numbers.size() / 2) {
     return true;
    }
   }
  }
  counter = 0;
  for (int i = 0; i < 3; i++) {
   counter = 0;
   for (int j = i; j < numbers.size(); j += 3) {
    if (numbers.get(j) == x) {
     counter++;
    }
   }
   if (counter == numbers.size() / 3) {
    return true;
   }
  }
  return false;
 }

 public boolean consecutive(ArrayList < Integer > numbers) {
  if (numbers == null || numbers.size() < 3) {
   return false;
  }

  for (int i = 0; i < numbers.size() - 2; i++) {
   if ((numbers.get(i) % 2 == 0 && numbers.get(i + 1) % 2 == 0 && numbers.get(i + 2) % 2 == 0) ||
    (numbers.get(i) % 2 == 1 && numbers.get(i + 1) % 2 == 1 && numbers.get(i + 2) % 2 == 1)) {
    return true;
   }
  }

  return false;
 }

 public boolean balance(ArrayList < Integer > numbers) {
  if (numbers == null || numbers.size() < 2) {
   return false;
  }

  for (int i = 0; i < numbers.size() - 1; i++) {
   int firstHalfSum = 0;
   int secondHalfSum = 0;

   for (int j = i; j >= 0; j--) {
    firstHalfSum += numbers.get(j);
   }

   for (int k = i + 1; k < numbers.size(); k++) {
    secondHalfSum += numbers.get(k);
   }

   if (firstHalfSum == secondHalfSum) {
    return true;
   }
  }
  return false;
 }

 public int clumps(ArrayList < String > values) {
  if (values == null) {
   return -1;
  }
  for (int i = 0; i < values.size(); i++) {
   if (values.get(i) == null) {
    return -1;
   }
  }

  boolean clumps = false;
  int count = 0;
  for (int i = 0; i < values.size() - 1; i++) {
   if (values.get(i).equals(values.get(i + 1)) && !clumps) {
    clumps = true;
    count++;
   } else if (!values.get(i).equals(values.get(i + 1))) {
    clumps = false;
   }
  }

  return count;
 }
}
