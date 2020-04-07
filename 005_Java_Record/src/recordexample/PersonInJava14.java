package recordexample;

// record -> generates constructors, public get, public set, equals(), hashCode(), toString() during compile time
public record PersonInJava14(String name, String gender, int age) {}
