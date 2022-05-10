<div id="top"></div>

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/dmjimenezbravo/MASChat">
    <h1 aling="center">MAS Chat</h1>
  </a>

  <p align="center">
    A simple multi-agent chat implementation.
    <br />
    <a href="https://github.com/dmjimenezbravo/MASChat"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/dmjimenezbravo/MASChat/issues">Report Bug</a>
    ·
    <a href="https://github.com/dmjimenezbravo/MASChat/issues">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li>
      <a href="#about-the-mas">About the MAS</a>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

A simple multi-agent chat implementation. This is an example for the "Sistemas Inteligentes" ("Intelligent Systems") subject of the "Grado en Ingeniería Informática" ("Degree in Computer Engineering") degree at the Universidad Politécnica de Madrid (UPM) (Spain).

<p align="right">(<a href="#top">back to top</a>)</p>

### Built With

* [Java](https://www.java.com/).
* [JADE](https://jade.tilab.com/).

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

This project has been developed with the [Eclipse IDE](https://www.eclipse.org/ide/) and Java. Therefore, for the execution of the project we are going to assume that both softwares are installed on the machine.

<p align="right">(<a href="#top">back to top</a>)</p>

### Prerequisites

* [Java](https://www.java.com/).
* [Eclipse IDE](https://www.eclipse.org/ide/).

Although the use of the Eclipse IDE is recommended, any other Java development environment can be used.

<p align="right">(<a href="#top">back to top</a>)</p>

### Installation

To install and test the project, follow these steps:

1. You need to download this repository and import the project into your IDE.
2. Download and import the JADE librarie for Java into your project.
3. Configure the execution of the project, for this in our ide we must specify that the main class of the project is `jade.Boot`. In addition to configure each one of the agents of our MAS it is necessary to include the following arguments to our execution, `-gui UserAgent1:es.upm.si.masChat.UserAgent;UserAgent2:es.upm.si.masChat.UserAgent`. Note that more UserAgent can be included.

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MAS -->
## About the MAS

Here we present the Multi-Agent System (MAS) proposed for this platform. The system is composed of one agent:

<img src="https://github.com/dmjimenezbravo/MASChat/blob/main/Images/MAS.png" alt="Multi-Agent System" width="400"/>

* User agent: it is in charge of interacting with the user and sending the messages to the rest of user agents.

The interactions and exchange of messages in the defined platform are shown below.

<img src="https://github.com/dmjimenezbravo/MASChat/blob/main/Images/JADESniffer.png" alt="JADE Sniffer" width="600"/>

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- USAGE EXAMPLES -->
## Usage

When the project is executed, the following screen is displayed (one per every configured user agent):

<img src="https://github.com/dmjimenezbravo/MASChat/blob/main/Images/ChatWindow.png" alt="Chat window" width="400"/>

This screen allows you to write, send and display the sended and recieved messages.

<img src="https://github.com/dmjimenezbravo/MASChat/blob/main/Images/ChatExchange.png" alt="Messages exchange" width="400"/>

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the GNU General Public License v3.0. See `LICENSE` for more information.

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Diego M. Jiménez Bravo - [@dmjimenezbravo](https://twitter.com/dmjimenezbravo) - dmjimenezbravo@gmail.com

Project Link: [https://github.com/dmjimenezbravo/MASChat](https://github.com/dmjimenezbravo/MASChat)

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* [JADE, Java Agent DEvelopment Framework](https://jade.tilab.com/).

<p align="right">(<a href="#top">back to top</a>)</p>
