# Arrays

I went back to old topics to thoroughly study and refresh my knowledge. In this repository, these are arrays.
<img width="1229" height="739" alt="arrays index" src="https://github.com/user-attachments/assets/e6ee6807-f56c-49a0-ae2f-629071e4f773" />

---
### რა არის მასივი?
- მასივი არის მონაცემთა სტრუქტურა, რომელიც ინახავს ფიქსირებული ზომის, ერთი ტიპის ელემენტების კოლექციას თანმიმდევრულად მეხსიერებაში.

---
### მასივის დადებითი მხარეები:
- სიჩქარე - უჩქარესი წვდომა O(1) - (მეხსიერებაში თანმიმდევრულად არის განლაგებული);
-  მეხსიერება - მინიმალური overhead - (არ ინახავს დამატებით მეტადატას, გამარტივებული და მარტივად  გამოსაყენებელი);
-  Type Safety - Compile-time-ში მკაცრად ამოწმებს მონაცემთა ტიპებს;
-  Cache-Friendly - CPU cache-ს ეფექტურად იყენებს;


###  მასივის უარყოფითი მხარეები:
- ფიქსირებული ზომა - ვერ გაზრდი/შეამცირებ შექმნის შემდეგ;
- ელემენტების მართვა - არ არის add/remove მეთოდები;
- ArrayIndexOutOfBoundsException - შეცდომის საფრთხე არასწორი ინდექსის მითითებისას;
- Null-ების პრობლემა - Object arrays-ში null შეიძლება გამოიწვიოს NullPointerException;
- წაშლის სირთულე - შუა ელემენტის წაშლა რთულია;

- - - 
### 1. Multidimensional Arrays (მრავალგანზომილებიანი მასივები)

- `int[][] matrix = new int[3][4];` - 2D Array;
- `int[][][] cube = new int[3][3][3];` - 3D Array;
- `int[][] jagged = new int[3][];` -  Jagged Array (არათანაბარი);
  - `jagged[0] = new int[2];`  // პირველ რიგს 2 ელემენტი;
  - `jagged[1] = new int[4];`  // მეორეს 4;
  - `jagged[2] = new int[3];`  // მესამეს 3`;
- - -
### 2. წვდომა (Access)

  `int[] numbers = {10, 20, 30, 40, 50};`

- წაკითხვა

`int first = numbers[0];`      // 10

`int last = numbers[4];`     // 50

- ჩაწერა

`numbers[2] = 100;`  // {10, 20, 100, 40, 50}

- ზომის მიღება

`int length = numbers.length;` // 5

---
### 3. გადარბენა (Iteration)

`int[] numbers = {1, 2, 3, 4, 5};`

- for loop:

`for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}`
- for-each:

`for (int num : numbers) {
    System.out.println(num);
}`

- უკუღმა გადარბენა

`for (int i = numbers.length - 1; i >= 0; i--) {
    System.out.println(numbers[i]);
}`

---
### 4. კოპირება

`int[] original = {1, 2, 3, 4, 5};`

- მეთოდი 1: `System.arraycopy()`

`int[] copy1 = new int[5];`

`System.arraycopy(original, 0, copy1, 0, original.length);`

- მეთოდი 2: `Arrays.copyOf()`

`int[] copy2 = Arrays.copyOf(original, original.length);`

- მეთოდი 3: clone()

`int[] copy3 = original.clone();`

- ნაწილის კოპირება

`int[] partial = Arrays.copyOfRange(original, 1, 4);`  // {2, 3, 4}

---
