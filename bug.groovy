```groovy
def myMethod(arg1, arg2 = 10) {
  println "arg1: $arg1, arg2: $arg2"
}

myMethod(5)
myMethod(5, 20)
myMethod(arg2: 30, arg1: 5) // unexpected behavior
```