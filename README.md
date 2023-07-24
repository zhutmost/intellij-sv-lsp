# Verible SystemVerilog Language Server for Intellij IDEA

![Build](https://github.com/zhutmost/intellij-sv-lsp/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [ ] Get familiar with the [template documentation][template].
- [ ] Adjust the [pluginGroup](./gradle.properties), [plugin ID](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [ ] Adjust the plugin description in `README` (see [Tips][docs:plugin-description])
- [ ] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html?from=IJPluginTemplate).
- [ ] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [ ] Set the `PLUGIN_ID` in the above README badges.
- [ ] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [ ] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

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
So we provide a modified version of this plugin on [GitHub](). You can choose to install this plugin manually:

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


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
