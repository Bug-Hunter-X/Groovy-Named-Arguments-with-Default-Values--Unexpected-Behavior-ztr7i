# Groovy Named Arguments with Default Values: Unexpected Behavior

This example demonstrates unexpected behavior when using named arguments with default parameter values in Groovy.  The named argument overrides the default value unexpectedly, deviating from the intuitive behavior that might be expected in other languages.

## Bug Description

The `myMethod` function is defined with a default value for `arg2`.  When calling `myMethod` using named parameters, the default value for `arg2` is overridden even if `arg2` is not explicitly provided in the named parameter list. This can lead to surprising results and errors in larger applications.

## How to Reproduce

Run the provided `bug.groovy` script. Note the output for the third call to `myMethod`.  It will show that `arg2` is 30 instead of the default value 10.

## Solution

The solution involves understanding Groovy's named parameter handling and adjusting code to explicitly handle the default value in the method call if necessary. For better clarity, avoid mixed approaches of positional and named parameters when the method uses default values.