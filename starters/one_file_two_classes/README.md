# One File, Two Classes (Experiment)

## Use Cases
This bad idea (2 classes in one file) is a functionality test,
as I thought of a couple narrow reasons why I might want to do this:

- It allows me to write fast iterative code with proper class structure,
without messing around with renaming files, declaring/redeclaring/cleaning
up dependencies, and all the rest of the busywork. Once structure has been
figured out for the most part, classes can be separated into their own files.

- It's great for code challenges where you still wanna practice good
class structure without the hassle of compiling to bytecode.

## Experiment Results
Works for execution, but not compilation.

For most Java programs (any Java program with more than 1 file, each containing
a class, one of which has a `main()`), compliation to bytecode is required for
execution.

```
javac ./folder_containing_2files/*

java main
```
For that scenario, running `java main` without compilation
results in `cannot find symbol` errors.

However, in scenarios where there is only one class (containing your `main()`),
the code can be executed without compilation. While this would fail if the file
references a class in another file, interestingly, use of
java standard library imports seem to work just fine. So do other classes added
within the same file!

## IDE Errors
Writing this in VS Code with a basic `Extension Pack for Java` installed,
it says:

```
The public type Foober must be defined in its own file.
```

Should be defined in its own file? Sure! Reasonable. Must be? LIES! Or at least
OpenJDK begs to differ.

## Next Steps
Chances are there's a practical reason to allow this execution behaviour beyond
the use cases I've raised here. I might go look for them! Not sure. Honestly
this whole experiment has been a tangent...