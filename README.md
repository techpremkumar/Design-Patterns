# Java Design Patterns

A practical Java repository documenting design patterns through small, runnable examples. The goal is to understand the intent behind each pattern, recognize where it fits, and explain the trade-offs during software design and technical interviews.

## Contents

This repository contains 20 learning examples, grouped by the role they play in application design.

### Creational and object construction

| # | Pattern | Example directory |
|---:|---|---|
| 1 | Singleton | [1.Singleton Pattern](./1.Singleton%20Pattern) |
| 2 | Prototype | [4.Prototype Pattern](./4.Prototype%20Pattern) |
| 3 | Builder | [7.Builderpattern](./7.Builderpattern) |
| 4 | Factory / Abstract Factory | [8.AbstractFactory](./8.AbstractFactory) |

### Structural and composition

| # | Pattern / technique | Example directory |
|---:|---|---|
| 5 | Proxy | [2.proxy](./2.proxy) |
| 6 | Adapter | [5.adaptorapattern](./5.adaptorapattern) |
| 7 | Flyweight | [9.FlyweightPattern](./9.FlyweightPattern) |
| 8 | Module | [10.ModulePattern](./10.ModulePattern) |
| 9 | Mixin-style composition | [11.mixinPattern](./11.mixinPattern) |

### Behavioral patterns

| # | Pattern | Example directory |
|---:|---|---|
| 10 | Observer | [3..ObserverExample](./3..ObserverExample) |
| 11 | Strategy | [6.Strategy pattern](./6.Strategy%20pattern) |
| 12 | State | [12.State Pattern](./12.State%20Pattern) |
| 13 | Template Method | [13.Template Method Pattern](./13.Template%20Method%20Pattern) |
| 14 | Command | [14.Command Pattern](./14.Command%20Pattern) |
| 15 | Chain of Responsibility | [15.Chain of Responsibility](./15.Chain%20of%20Responsibility) |

### Application and resilience techniques

| # | Pattern / technique | Example directory |
|---:|---|---|
| 16 | Dependency Injection | [16 – Dependency Injection (DI)](./16%20%E2%80%93%20Dependency%20Injection%20(DI)) |
| 17 | Repository | [17.Repository Pattern](./17.Repository%20Pattern) |
| 18 | Circuit Breaker | [18.circuitBreaker Pattern](./18.circuitBreaker%20Pattern) |
| 19 | Retry | [19.Retry Pattern](./19.Retry%20Pattern) |
| 20 | Middleware pipeline | [20.Middleware Pattern](./20.Middleware%20Pattern) |

> **Terminology note:** This is a curated learning roadmap, not a catalogue of the 23 Gang of Four patterns. Dependency Injection, Repository, Circuit Breaker, Retry, Middleware, Module, and mixin-style composition are architectural or application-level techniques rather than all being GoF patterns. The examples are kept together to make the learning path practical.

## Repository layout

Each numbered directory contains a focused Java example for that topic. Most examples are standalone programs with a `Main` class; a few use a pattern-specific example class.

```text
Design-Patterns/
├── 1.Singleton Pattern/
├── 2.proxy/
├── 3..ObserverExample/
├── ...
├── 20.Middleware Pattern/
├── .gitignore
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) installed
- A terminal or Java IDE such as IntelliJ IDEA or Visual Studio Code

Verify your installation:

```bash
java -version
javac -version
```

## Run an example

Clone the repository:

```bash
git clone https://github.com/techpremkumar/Design-Patterns.git
cd Design-Patterns
```

Move into the pattern directory you want to explore. For example:

```bash
cd "6.Strategy pattern"
javac *.java
java Main
```

For the Singleton example, run its example class instead:

```bash
cd "1.Singleton Pattern"
javac *.java
java SingletonExample
```

Run each example from its own directory. These examples are intentionally independent and are not currently assembled as one Maven or Gradle project.

## How to study each pattern

For each example, try to answer:

1. What design problem does this approach address?
2. What are the key participants and their responsibilities?
3. How do the objects collaborate at runtime?
4. What changes when a new requirement is introduced?
5. What are the trade-offs, limitations, and alternatives?

For interview preparation, practise explaining the problem first, then the design, class relationships, implementation, and trade-offs. Avoid choosing a pattern before understanding the requirement.

## Learning status

- [x] 20 pattern and architecture examples added
- [ ] Add a concise explanation and UML diagram to every pattern directory
- [ ] Add automated compilation/testing for all examples
- [ ] Standardize directory and class naming
- [ ] Remove previously committed generated binaries from Git history/current tree

## Contributing

This is a personal learning repository. Suggestions that improve clarity, correctness, examples, or interview usefulness are welcome. Keep examples small, runnable, and focused on the design problem being demonstrated.

## License

No license is currently specified. Unless a license is added, the repository should be treated as having all rights reserved; reuse permissions are not automatically granted.
