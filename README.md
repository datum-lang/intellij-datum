# Intellij Charj

![Build](https://github.com/phodal/intellij-charj/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/15119-charj.svg)](https://plugins.jetbrains.com/plugin/15119-charj)


todo:

 - [x] Highlighter
 - [x] fileType
 - [x] lang.parserDefinition
 - [ ] lineMarkerProvider
 - [ ] completion.contributor
 - [ ] psi.referenceContributor
 - [ ] lang.refactoringSupport
 - [ ] lang.findUsagesProvider
 - [ ] lang.foldingBuilder
 - [ ] lang.psiStructureViewFactory
 - [ ] lang.formatter
 - [ ] codeStyleSettingsProvider
 - [ ] langCodeStyleSettingsProvider
 - [ ] lang.commenter

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
pkg hello
ABC$func(a: int, b: string) out a: int {
}
ABC$func(a: int)  -> a: int {
    member a: int
    if  a > b   then
        a = b
    elif
        a = b
    end

    if a == b then

    end

    if a == b then

    else

    end
}
```

<!-- Plugin description -->
a languages plugins for Charj
<!-- Plugin description end -->
