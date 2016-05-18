Clojure Calculator
==================

Simple Clojure calculator written to learn how to code in Clojure lang.

## TODO

- [x] Implement tests
- [x] Make use of `namespaces`
- [ ] Allow to execute using a bash script instead calling `lein exec..`

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
+ 1 2 ; => 3.00
+ 8.3 10 100 ; => 118.30
+ -29 -13 ; => -42.00
```

### Minus

```clj
- 1 2 ; => -1.00
- 108.3 100 ; => 8.30
- -29 13 ; => -42.00
```

### Division

```clj
/ 1 2 ; => 0.50
/ 108.3 100 ; => 1.08
/ -29 13 ; => -2.23
```

### Multiply

```clj
\* 1 2 ; => 2.00
\* 108.3 100 ; => 10830.00
\* -29 13 ; => -377.00
```
