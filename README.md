<div>
<img src="https://raw.githubusercontent.com/zhutmost/intellij-sv-lsp/main/src/main/resources/META-INF/pluginIcon.svg" alt="Logo" align="left" width="40" height="40"/>
<h1 align="left"> Verible SystemVerilog Language Server for Intellij IDEA </h1>
</div>

![Build](https://github.com/zhutmost/intellij-sv-lsp/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/com.zhutmost.svlsp.svg)](https://plugins.jetbrains.com/plugin/com.zhutmost.svlsp)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/com.zhutmost.svlsp.svg)](https://plugins.jetbrains.com/plugin/com.zhutmost.svlsp)
<!-- Plugin description -->
[Verible](https://github.com/chipsalliance/verible) is a SystemVerilog language server by ChipAlliance, which provides linting and formatting (and quick fixes) for SystemVerilog. This plugin integrates Verible into Intellij IDEA.

## Requirements

### 1. Install Verible

Before starting, you need to download the Verible binary from [its GitHub Release](https://github.com/chipsalliance/verible/releases), and add it to your PATH environment variable.

### 2. Intellij IDEA Ultimate

Only Intellij IDEA Ultimate supports LSP, so you cannot use this plugin with the Community version.

Currently, the language server protocol (LSP) support for Jetbrains IDEs is still in beta (View [JetBrains' Blog](https://blog.jetbrains.com/platform/2023/07/lsp-for-plugin-developers/) for more details).

So this plugin can only support the linting feature by now. We will support the formatting and other features as soon as they are supported by Jetbrains.

### 3. Third-party SystemVerilog Plugin

This plugin does NOT include syntax highlighting. So you need to install another SystemVerilog plugin
`studio.edaphic.sv` from [Jetbrains Marketplace](https://plugins.jetbrains.com/plugin/10695-systemverilog).

However, this plugin is no longer maintained, and it is not compatible with the latest version of Intellij IDEA.
So we provide a modified version of this plugin on [GitHub](https://github.com/zhutmost/intellij-sv-lsp/releases/download/v0.0.1/SystemVerilog.zip). You can choose to install this plugin manually:

<kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>

Although this plugin itself is free, the above third-party plugin and the Intellij IDEA Ultimate version are both paid, so you need to pay for them. You can [apply for free licenses](https://www.jetbrains.com/community/education/#students) for education or open-source proposes.

## Usage

Just add Verible binaries (`verible-verilog-ls`) to your PATH environment variable. Then you can use the linting feature of Verible in Intellij IDEA.

To custom your linting style, you can create a `.rules.verible_lint` file in your project root directory. You can find the linting rules in [Verible Linter Rule List](https://chipsalliance.github.io/verible/verilog_lint.html).

![verible linting demo](https://raw.githubusercontent.com/zhutmost/intellij-sv-lsp/main/img/demo.jpg)

For more usage of Verible, please visit:
- [Verible Linter README](https://github.com/chipsalliance/verible/tree/master/verilog/tools/lint)
- [Verible LSP README](https://github.com/chipsalliance/verible/tree/master/verilog/tools/ls)

<!-- Plugin description end -->
