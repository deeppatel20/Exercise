package com.google.collectionexercise.java8practise.cases;

public class Main {
    public static void main(String[] args) {

        //Case 1 = find the duplicate elements in a given collection

       /* List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 80, 80, 80,10);
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates = list.stream().filter(integer -> !uniques.add(integer)).collect(Collectors.toSet());
        System.out.println(uniques);
        System.out.println(duplicates);

        //second way
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Integer> duplicatevalues = collect.entrySet().stream().filter(integerLongEntry -> integerLongEntry.getValue() > 1).map(integerLongEntry -> integerLongEntry.getKey()).collect(Collectors.toSet());
        System.out.println(collect);
        System.out.println(duplicatevalues);

        //Third way
        Set<Integer> collect1 = list.stream().filter(integer -> Collections.frequency(list, integer) > 1).collect(Collectors.toSet());
        System.out.println(collect1);*/

        //Case 2 = example of limit and skip method

       /* List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 80, 80, 80,10);
        list.stream().limit(4).forEach(System.out::println);
        list.stream().skip(5).forEach(System.out::println);*/


        // Case 3 Count the number of occurance of words

        /*String s = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(s.split(" "));
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        System.out.println(map);

        // Count the number of occurance of words in asceding order
        TreeMap<String, Long> collect = list.stream().collect(Collectors.groupingBy(o -> o, TreeMap::new, Collectors.counting()));
        System.out.println(collect);*/


        // Case 4 Find out max, min, sum etc

        /*List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 80, 80, 80,10);
        int max = list.stream().mapToInt(value -> value).summaryStatistics().getMax();
        System.out.println(max);*/

        // Case 5 find out second highest and third highest

        /*List<Integer> list = Arrays.asList(10, 45, 3, 40, 50);
        List<Integer> collect = list.stream().sorted().skip(1).limit(2).collect(Collectors.toList());
        System.out.println(collect);*/

        //Case 6 Convert string into uppercase and get all words
        /*String s = "welcome to code decode and code decode welcome you";
        List<String> list = Arrays.asList(s.split(" "));
        list.stream().sorted((o1, o2) -> o1.length() < o2.length() ? -1 : 1).forEach(System.out::println);
        List<String> collect = list.stream().map(s1 -> s1.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect);*/


    }

}
