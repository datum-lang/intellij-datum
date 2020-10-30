# Intellij Plugin for [Charj Lang](https://github.com/charj-lang/charj)

![Build](https://github.com/phodal/intellij-charj/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)

todo:

 - [x] Highlighter
 - [x] fileType
 - [x] lang.parserDefinition
 - [ ] lineMarkerProvider
        - for `default$main` method
 - [ ] completion.contributor
 - [ ] psi.referenceContributor
 - [ ] lang.refactoringSupport
 - [ ] lang.findUsagesProvider
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

### DSL design

```
pkg examples

default$compare(int a, int b) {
    if(a > b) {
        return a
    } else {
        return b
    }
}
```

<!-- Plugin description -->
a languages plugins for Charj
<!-- Plugin description end -->
