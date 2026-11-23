# Java Design Patterns

A hands-on Java repository of small examples for learning object-oriented design patterns and application-level design techniques. Each folder focuses on one concept and keeps its implementation independent so it can be explored and executed on its own.

The learning goal is to understand **the problem, the object interactions, and the trade-offs**—not just memorize pattern definitions.

## Pattern index

| # | Pattern / technique | Category |
|---:|---|---|
| 01 | [Singleton](./1.Singleton%20Pattern) | Creational |
| 02 | [Proxy](./2.proxy) | Structural |
| 03 | [Observer](./3..ObserverExample) | Behavioral |
| 04 | [Prototype](./4.Prototype%20Pattern) | Creational |
| 05 | [Adapter](./5.adaptorapattern) | Structural |
| 06 | [Strategy](./6.Strategy%20pattern) | Behavioral |
| 07 | [Builder](./7.Builderpattern) | Creational |
| 08 | [Abstract Factory](./8.AbstractFactory) | Creational |
| 09 | [Flyweight](./9.FlyweightPattern) | Structural |
| 10 | [Module](./10.ModulePattern) | Application organization |
| 11 | [Mixin-style composition](./11.mixinPattern) | Composition technique |
| 12 | [State](./12.State%20Pattern) | Behavioral |
| 13 | [Template Method](./13.Template%20Method%20Pattern) | Behavioral |
| 14 | [Command](./14.Command%20Pattern) | Behavioral |
| 15 | [Chain of Responsibility](./15.Chain%20of%20Responsibility) | Behavioral |
| 16 | [Dependency Injection](./16%20%E2%80%93%20Dependency%20Injection%20(DI)) | Application architecture |
| 17 | [Repository](./17.Repository%20Pattern) | Application architecture |
| 18 | [Circuit Breaker](./18.circuitBreaker%20Pattern) | Resilience |
| 19 | [Retry](./19.Retry%20Pattern) | Resilience |
| 20 | [Middleware](./20.Middleware%20Pattern) | Request pipeline |

> **Scope:** This is a curated 20-topic learning roadmap, not a claim to implement all 23 Gang of Four patterns. Module, mixin-style composition, Dependency Injection, Repository, Circuit Breaker, Retry, and Middleware are included as useful architectural or application-level techniques; they are not all GoF design patterns.

## Repository structure

Each numbered directory contains the Java source for a standalone example. Most examples use a `Main` class; a few use a pattern-specific example class.

```text
Design-Patterns/
├── 1.Singleton Pattern/
├── 2.proxy/
├── 3..ObserverExample/
├── ...
├── 20.Middleware Pattern/
├── .github/
│   └── workflows/
├── .gitignore
└── README.md
```

## Prerequisites

- JDK 17 or later
- A terminal or Java IDE such as IntelliJ IDEA or Visual Studio Code

Verify Java is installed:

```bash
java -version
javac -version
```

## Getting started

Clone the repository:

```bash
git clone https://github.com/techpremkumar/Design-Patterns.git
cd Design-Patterns
```

Choose a pattern directory, compile its source files, and run its example class. For example:

```bash
cd "6.Strategy pattern"
javac *.java
java Main
```

The Singleton example uses `SingletonExample` as its entry point:

```bash
cd "1.Singleton Pattern"
javac *.java
java SingletonExample
```

Run commands from inside the selected pattern directory. The examples are independent; the repository is not currently packaged as a single Maven or Gradle application.

## How to use this repository

For each pattern, practise explaining:

1. **Problem:** What design pressure or recurring problem does it address?
2. **Structure:** Which classes or interfaces participate, and what are their responsibilities?
3. **Collaboration:** How do the objects interact at runtime?
4. **Changeability:** How does the design respond when a new requirement is introduced?
5. **Trade-offs:** What complexity, limitations, or alternatives should be considered?

For interview preparation, structure your explanation as: **problem → design choice → class relationships → implementation → trade-offs**. Choose a pattern only after understanding the requirement.

## Engineering notes

- Keep each example focused and runnable independently.
- Prefer clear class and method names over clever abstractions.
- Add a short problem statement and expected output when expanding an example.
- Generated Java bytecode (`.class`) and IDE-specific files should not be committed.
- Resilience examples are educational starting points; production retry and circuit-breaker implementations need additional concerns such as timeouts, concurrency safety, observability, and retry/idempotency policies.

## Roadmap

- [x] Add 20 pattern and architecture examples
- [x] Add a repository overview and pattern index
- [ ] Add a concise problem statement and UML diagram to each example
- [ ] Add focused unit tests and runtime behavior tests
- [ ] Standardize folder and class naming
- [ ] Remove generated `.class` files already tracked in Git

## License

No license file is currently present. Unless a license is added, the repository should be treated as all rights reserved; reuse permissions are not automatically granted.
