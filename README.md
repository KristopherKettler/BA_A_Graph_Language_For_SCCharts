# Bachelor Thesis - A Graph Language for SCCharts

## Description
This project was developed as part of my Bachelor's thesis. The implemented editor allows modeling Sequentially Constructive Statecharts (SCChart), a visual programming language for safety-critical reactive systems. It is based on the Cinco Meta Tooling Framework, known for its main feature of fully generating graph-based modeling tools.

The image depicts the data structure of the SCChart language as well as the mapping of these elements onto Cinco's meta graph model elements.
![Mapping of Komponenets of SCCharts to CINCO Components](images/MappingDataStructure.svg)

The core of the editor consists of the *SCChart.mgl* file, where the components are defined, and the *SCChart.style* file, where the visual appearance is specified. Additionally, event hooks are implemented to react to changes when creating SCChart models. The generated models can be transformed into Java or C code using a code generator and the KIELER SCChart Compiler.

## Visuals
Depending on what you are making, it can be a good idea to include screenshots or even a video (you'll frequently see GIFs rather than actual videos). Tools like ttygif can help, but check out Asciinema for a more sophisticated method.

## Installation
Within a particular ecosystem, there may be a common way of installing things, such as using Yarn, NuGet, or Homebrew. However, consider the possibility that whoever is reading your README is a novice and would like more guidance. Listing specific steps helps remove ambiguity and gets people to using your project as quickly as possible. If it only runs in a specific context like a particular programming language version or operating system or has dependencies that have to be installed manually, also add a Requirements subsection.

## Links
Cinco Meta Tooling Suite project page: [https://cinco.scce.info/](https://cinco.scce.info/)

SCChart project page: [https://www.rtsys.informatik.uni-kiel.de/en/archive/kieler](https://www.rtsys.informatik.uni-kiel.de/en/archive/kieler)

## Project status
Completed
