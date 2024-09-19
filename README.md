<a name="readme-top"></a>

[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<div align="center">
  <a href="https://github.com/GarrettCooperDev/Showcase">
    <img src="images/spring-icon.png" alt="Logo" width="80" height="80">
  </a>

<h3 align="center">Garrett Cooper Development Showcase</h3>

  <p align="center">
    <a href="https://github.com/GarrettCooperDev/Showcase"><strong>Explore the docs »</strong></a>
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
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

A simple Java application leveraging the Spring Boot framework to implement a RESTful API with configurations for virtualized deployment into Docker containers within a Kubernetes cluster.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With
* [![Java][java-shield]][java-url]
* [![Maven][maven-shield]][maven-url]
* [![Spring Boot][springboot-shield]][springboot-url]
* [![Docker][docker-shield]][docker-url]
* [![Kubernetes][kubernetes-shield]][kubernetes-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

An IDE such as IntelliJ is recommended for building and running the project, but the same functions can also be run from the command line.

### Prerequisites

For Docker and Kubernetes deployments you will need to install the following:
* [![Docker][docker-shield]][docker-url]
* [![Minikube][minikube-shield]][minikube-install-url]

Recommended:
* [![Postman][postman-shield]][postman-url]

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/GarrettCooperDev/Showcase.git
   ```
2. Use Maven to build the project
   - If you are using an IDE such as IntelliJ use the Maven tool window to run the 'install' command
   - Maven can also be run from the command line
     ```sh
     mvn install
     ```
3. Docker Deployment
    - If you are using an IDE such as IntelliJ, the Dockerfile and compose.yaml files have already been configured 
      and running the application will automatically build a new image and run a Docker container
    - Docker can also be run from the command line
      ```sh
      docker build -t showcase .
      docker run -p 8000:8080 showcase
      ```
4. Kubernetes Deployment using minikube
    - Start the minikube cluster
      ```sh
      minikube start
      ```
    - Push the ConfigMap to the cluster
      ```sh 
      kubectl kubectl apply -f showcase-config.yaml
      ```
    - Push the Secret
      ```sh
      kubectl kubectl apply -f showcase-secret.yaml
      ```
   - Push the showcase.yaml file that contains the configuration for both the Service and the Deployment
     ```sh
     kubectl kubectl apply -f showcase.yaml
     ```
   - The application should now be running in the Kubernetes cluster, get the IP address of the cluster by calling
     ```sh
     minikube ip        
     ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Usage

- Call the API within the docker container
    - Use PostMan to make a GET request to the following URL
      ```sh
      http://localhost:8000
      ```
    - The same request can also be made using curl from the command line
      ```sh
      curl http://localhost:8000
      ```
    - To call the API in the Kubernetes cluster replace http:localhost:8000 with the IP address of the cluster 
      and append the nodePort number 30100

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ROADMAP -->
## Roadmap

- [x] Spring Boot RESTful API
- [x] Docker Containerization
- [x] Kubernetes Deployment
- [ ] Unit Testing with JUnit5 and Mockito
- [ ] Database Access
  - [ ] H2 InMemory Database
  - [ ] PostgreSQL
- [ ] Spring beans and dependency injection

See the [open issues](https://github.com/GarrettCooperDev/Showcase/issues) for a full list of proposed features (and known issues).

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Garrett Cooper - garrettcooperdev@gmail.com

Project Link: [https://github.com/GarrettCooperDev/Showcase](https://github.com/GarrettCooperDev/Showcase)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[minikube-shield]: https://img.shields.io/badge/Minikube-Minikube
[minikube-install-url]: https://minikube.sigs.k8s.io/docs/start/?arch=%2Fmacos%2Fx86-64%2Fstable%2Fbinary+download
[springboot-shield]: https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=Spring&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[docker-shield]: https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://docs.docker.com/engine/install/
[kubernetes-shield]: https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white 
[kubernetes-url]: https://kubernetes.io/docs/setup/
[maven-shield]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white
[maven-url]: https://maven.apache.org/install.html
[java-shield]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[java-url]: https://www.java.com/en/
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/garrettcooperdev
[postman-shield]: https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white
[postman-url]: https://www.postman.com/downloads/
