```groovy
def myMethod(arg1, arg2 = 10) {
  println "arg1: $arg1, arg2: $arg2"
}

myMethod(5)
myMethod(5, 20)
myMethod(5, arg2: 30) // Correct usage of named parameter 
```