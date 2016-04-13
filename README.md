Clojure Calculator
==================

Simple Clojure calculator written to learn how to code in Clojure lang.

## Setup

Just run:

```
lein install
```

## Using

```
lein exec core.clj funcname param1 param2 param3 etc
```

## Functions

### Sum

```clj
+ 1 2 ; => 3
+ 8.3 10 100 ; => 118.3
+ -29 -13 ; => -42
```

### Minus

```clj
- 1 2 ; => -1
- 108.3 100 ; => 8.3
- -29 13 ; => -42
```

### Division

```clj
/ 1 2 ; => 2
/ 108.3 100 ; => 1.083
/ -29 13 ; => -2.23
```

### Multiply

```clj
* 1 2 ; => 2
* 108.3 100 ; => 10830.0
* -29 13 ; => -377
```
