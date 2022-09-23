# prospector-pycharm

[![GitHub (pre-)release](https://img.shields.io/github/release/lukaspiatkowski/prospector-pycharm/all.svg?style=plastic)](https://github.com/lukaspiatkowski/prospector-pycharm/releases)
[![Travis](https://img.shields.io/travis/lukaspiatkowski/prospector-pycharm/master.svg?style=plastic)](https://travis-ci.org/lukaspiatkowski/prospector-pycharm)
[![GitHub license](https://img.shields.io/github/license/lukaspiatkowski/prospector-pycharm.svg?style=plastic)](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/LICENSE)
[![Stars](https://img.shields.io/github/stars/lukaspiatkowski/prospector-pycharm.svg?style=social&label=Stars)](https://github.com/lukaspiatkowski/prospector-pycharm/stargazers)

This plugin provides both real-time and on-demand scanning of Python files with Prospector from within PyCharm/IDEA.

**This plugin is a fork of [Pylint-Pycharm](https://github.com/leinardi/pylint-pycharm) and it required only small tweaks to the original code to get it to work, so all kudos go to the original author of Pylint-Pycharm.**

Prospector is a tool to analyse Python code and output information about errors, potential problems, convention violations and complexity.
It brings together the functionality of other Python analysis tools such as Pylint, pycodestyle, McCabe complexity and more.

![prospector plugin screenshot](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/art/prospector-pycharm.png)

## Installation steps

1. In the **Settings/Preferences** dialog (<kbd>CTRL</kbd>+<kbd>Alt</kbd>+<kbd>S</kbd>), click **Plugins**. The [Plugins page](https://www.jetbrains.com/help/pycharm/plugins-settings.html) opens.
2. Click **Browse repositories**.
3. In the [Browse Repositories dialog](https://www.jetbrains.com/help/pycharm/browse-repositories-dialog.html) that opens, right-click on the plugin named **Prospector** and select **Download and Install**.
4. Confirm your intention to download and install the selected plugin.
5. Click **Close**.
6. Click **OK** in the **Settings** dialog and restart PyCharm for the changes to take effect.

## Configuration

The only configuration needed is to set the path to Prospector executable, and only if is not already
inside the PATH environment variable.

To reach the Plugin configuration screen you can open **Settings/Preferences** dialog (<kbd>CTRL</kbd>+<kbd>Alt</kbd>+<kbd>S</kbd>), click **Other Settings** and then **Prospector** or simply click the gear icon from the side bar of the Prospector tool window.

To change the path to your Prospector executable you can either type the path directly or use
the Browse button to open a file selection dialog.

Once you changed the path you should press the Test button to check if the plugin is able to run
the executable.

![plugin settings screenshot](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/art/prospector-settings.png)

### Real-time inspection disabled by default

The plugin real-time inspection is disabled by default as numerous users find running `mix credo` in the background has
a negative impact on their system performance. If you like to try enabling the annotation, you can turn it on:

1. Preferences > Editor > Inspections > Prospector
2. Check "Prospector real-time scan"

### Inspection severity

By default, Prospector message severity is set to Warning. It is possible to change the severity level
by going to **Settings/Preferences** dialog (<kbd>CTRL</kbd>+<kbd>Alt</kbd>+<kbd>S</kbd>) -> **Editor** -> **Inspections** -> **Prospector** -> **Severity**:

![plugin inspection severity screenshot](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/art/prospector-inspection-severity.png)

## Usage

![plugin actions screenshot](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/art/actions1.png)
![plugin actions screenshot](https://github.com/lukaspiatkowski/prospector-pycharm/blob/master/art/actions2.png)

## FAQ

### How can I prevent the code inspection to run on a specific folder?

The easiest way to ignore a specific folder is to mark it as Excluded from PyCharm/IDEA:

1. Open PyCharm/IDEA Settings -> _your project_ -> Project structure
2. Select the directory you want to exclude
3. Click the Excluded button (red folder icon)

More info [here](https://www.jetbrains.com/help/pycharm/configuring-folders-within-a-content-root.html#mark).

### The name of the plugin is `prospector-pycharm`, can I also use it with IntelliJ IDEA?

This plugin officially supports only PyCharm, but it should work also on IntelliJ IDEA
if you have the [Python Community Edition](https://plugins.jetbrains.com/plugin/7322-python-community-edition)
plugin installed. If it does not work, feel free to open a bug on the [issue tracker](https://github.com/lukaspiatkowski/prospector-pycharm/issues).

### I like this plugin, how can I support it?

The best way to support this plugin is to rate it on the [JetBrains Plugin Repository page](https://plugins.jetbrains.com/plugin/20006-prospector) and to star this project on GitHub.
Feedback is always welcome: if you found a bug or would like to suggest a feature,
feel free to open an issue on the [issue tracker](https://github.com/lukaspiatkowski/prospector-pycharm/issues). If your feedback doesn't fall in the previous categories,
you can always leave a comment on the [Plugin Repository page](https://plugins.jetbrains.com/plugin/20006-prospector).

## Acknowledgements

_If I have seen further it is by standing on the shoulders of Giants - Isaac Newton_

Vast majority of the codebase is a fork of [Pylint-Pycharm](https://github.com/leinardi/pylint-pycharm), this codebase includes a very thin layer of changes that enables using it with Prospector.

The Acknowledgements section of Pylint-Pycharm:

A huge thanks:

- to the project [CheckStyle-IDEA](https://github.com/jshiell/checkstyle-idea),
  which code and architecture I have heavily used when developing this plugin.
- to @intgr, for [the contribution to this project](https://github.com/leinardi/pylint-pycharm/pulls?q=is%3Apr+author%3Aintgr) and to [mypy-pycharm](https://github.com/leinardi/mypy-pycharm/pulls?q=is%3Apr+author%3Aintgr)

## License

```
Copyright 2022 Lukasz Piatkowski.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
```
