<div align="center">
<img src="https://m.media-amazon.com/images/I/510WmeXkLXL.png"/>
<h3 align="center">Money Conversion</h3>
<p align="center">
A Currency Converter in Java using API
<br/>
<br/>
<a href="https://github.com/helenzina/Money-Conversion"><strong>Explore the docs</strong></a>
</p>
</div>

 ### Built With

This project was built with the following:
- <a href="https://www.java.com/en/">Java</a>.
- <a href="https://www.jetbrains.com/idea/download/?section=windows">IntelliJ Community IDEA</a> for the IDE.
- <a href="https://gluonhq.com/products/scene-builder/">Scene Builder</a> for the GUI application.
- <a href="https://www.alphavantage.co/documentation/">Alpha Vantage API</a> for the real-time conversions.


 ## About The Project
 
<p align="center">
<img src="https://github.com/helenzina/Money-Conversion/blob/main/run.gif"  title="run"/>
</p>

A currency converter is a tool or application that allows users to convert one currency into another based on current exchange rates. Currency converters are widely used for various purposes, such as traveling, e-commerce, financial transactions and education.

## API Implementation

Nowadays, applications which are developed using APIs are very common and easy to implement. Please follow the following steps if you want to use **Alpha Vantage API** to your application:

1. By visiting this <a href="https://www.alphavantage.co/documentation/">link</a>, you will see many services that this API can provide. Under the Table of Contents, we select the desired API, i.e. the **Foreign Exchange Rates (FX)**.

2. Then, we can take a look on the API parameters offered by this service and a few examples to understand how it works. These examples are a demo so in order to use the API, you need to receive a lifetime access <a href="https://www.alphavantage.co/support/#api-key">API key</a>.  

3. Fill the form and start your own application acquiring your own API key! Alpha Vantage API have a restriction of 5 daily free usages so be cautious.

Navigate to the **Usage** section to see the API implementation in code and the application running.



## Getting Started
 
 ### Installation
 
<p>Please follow the following steps for successful installation:</p>

1. Install <a href="https://www.jetbrains.com/idea/download/?section=windows">IntelliJ Community IDEA</a>. 
   
2. Clone the repo
   ```sh
   gh repo clone helenzina/Money-Conversion
   ```

## Features

- **Real-Time Exchange Rates**: Accurate and up-to-date conversion rates sourced from reliable financial data providers (here it's **Alpha Vantage API**).
- **Multiple Currencies**: Support for converting between a wide range of currencies.
- **Historical Data**: Access to past exchange rates for analysis or comparison.
- **User-Friendly Interface**: Easy-to-use interface for quick and efficient conversions.
- **Searching Currency Easily**: Typing the currency abbreviation instead of wasting time looking for it into the dropdowns.

## How To Run

### Using IntelliJ Community IDEA

To run Money Conversion, follow these steps:

1. Open the folder of your local repository in IntelliJ Community IDEA and select a version of JDK for the compiler. 
2. Navigate to **Run > Edit Configurations...** from the menu, and in the **Build and run** category, press **Modify options** and select **Add VM options**.

3. A new textbox labeled **VM options** will now be displayed. Add the path of JavaFX SDK (if doesn't exist, navigate to the troubleshooting section). For example:
   ```sh
   --module-path "C:\Program Files\Java\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml
   ```
4. Open the **Application** class and run the **main** function.


### Using Visual Studio Code

To run Money Conversion, follow these steps:

1. Open the folder of your local repository in Visual Studio Code and make sure you have the **Java** and **JavaFX** extensions installed. 

2. Expand the **RUN CONFIGURATION** category below the project's files and edit **VM Options** by adding the path of JavaFX SDK (if doesn't exist, navigate to the troubleshooting section). For example:
   ```sh
   --module-path "C:\Program Files\Java\javafx-sdk-22\lib" --add-modules javafx.controls,javafx.fxml
   ```
3. Open the **Application** class and run the **main** function.

## Troubleshooting

This project was created using JavaFX. If it doesn't run, place the folder <a href="https://drive.google.com/open?id=1dET8y46h3MsdtlYhXiMdfxxt5jR14l5L&usp=drive_fs">javafx-sdk-22</a> into the Java directory:
   ```sh
   C:\Program Files\Java
   ```

 ## Usage

Here are some examples of the application running:

<table>
  <tr>
    <td>
    GUI
     <img src="https://github.com/helenzina/Money-Conversion/blob/main/gui.png" title="gui"/>
    </td>
    <td>
    A peek of currencies
     <img src="https://github.com/helenzina/Money-Conversion/blob/main/currencies.png" title="currencies"/>
    </td>
    <td>
    A USD to EUR conversion
     <img src="https://github.com/helenzina/Money-Conversion/blob/main/conversion.png" title="conversion"/>
    </td>
</tr>
</table>

 
## Collaborators

<p>This project was developed for the "Programming Methodology" course at International Hellenic University. A special thanks to the following for their contributions and support:</p>
<table>
<tr>

<td align="center">
<a href="https://github.com/helenzina">
<img src="https://avatars.githubusercontent.com/u/128386591?v=4" width="100;" alt="Helen Zina"/><br>
<sub>
<b>Helen Zina (Me)</b>
</sub>
</a>
</td>

<td align="center">
<a href="https://github.com/alk-an">
<img src="https://avatars.githubusercontent.com/u/147655333?v=4" width="100px;" alt="Alkinoos Anastasiadis"/><br>
<sub>
<b>Alkinoos Anastasiadis</b>
</sub>
</a>
</td>

<td align="center">
<a href="https://github.com/LagiokapasDimitrios">
<img src="https://avatars.githubusercontent.com/u/147161663?v=4" width="100px;" alt="Dimitrios Lagiokapas"/><br>
<sub>
<b>Dimitrios Lagiokapas</b>
</sub>
</a>
</td>

<td align="center">
<a href="https://github.com/StylianiMakri">
<img src="https://avatars.githubusercontent.com/u/132708484?v=4" width="100px;" alt="Styliani Makri"/><br>
<sub>
<b>Styliani Makri</b>
</sub>
</a>
</td>

</tr>
</table>

 ## License

Distributed under the MIT License. See the LICENSE file for more information.

 ## Contact
 
If you have any questions or suggestions, feel free to reach out to us:
- Helen Zina - helenz1@windowslive.com
- Project Link: https://github.com/helenzina/Money-Conversion

 ## Acknowledgments

The resources that helped us through this whole process are mentioned in the bibliography of our report.

For more information, read the english version of our report (**report en.pdf**).
