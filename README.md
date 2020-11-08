# Intellij Plugin for [Charj Lang](https://github.com/charj-lang/charj)

![Build](https://github.com/phodal/intellij-charj/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)

todo:

 - [x] Highlighter
 - [x] fileType
 - [x] lang.parserDefinition
 - [x] lineMarkerProvider
      - [x] `default$main` method
      - [x] `struct` identify
 - [ ] completion.contributor
 - [ ] psi.referenceContributor
 - [ ] lang.refactoringSupport
 - [ ] lang.findUsagesProvider
     - [ ] goto declaration
 - [x] lang.foldingBuilder
 - [ ] lang.psiStructureViewFactory
 - [ ] lang.formatter
 - [ ] codeStyleSettingsProvider
 - [ ] langCodeStyleSettingsProvider
 - [x] lang.commenter

## Documents

### Setup

1. `./gradlew build`

### Update DSL

1. **right click** `.bnf` file and click
    - Generate Parser Code
    - Generate JFlex Code
2. **right click** `.flex` file and click
    - Run JFlex Generator

### Examples

see more in [Charj Demo](https://github.com/charj-lang/charj-demo)

```
pkg examples


import fmt

default$main() {
    fmt.println("hello,world")
}

struct Summary {
  	Name   : string
	FanIn  : int
	FanOut : int
}

struct Hello {
    summary : Summary
}
```

<!-- Plugin description -->
The languages plugins for Charj language. It can highlight code, generate stucture, and others.
<!-- Plugin description end -->
