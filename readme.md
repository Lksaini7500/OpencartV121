# 🛒 Opencart Automation Framework
> **A robust, scalable SDET-grade E-commerce testing suite.**

This repository contains a professional-grade automation framework designed to validate the end-to-end functionality of the Opencart platform. It is built with a focus on **reusability**, **parallel execution**, and **detailed reporting**.

## 🛠️ Tech Stack & Tools
* **Language:** Java (JDK 11+)
* **Automation:** Selenium WebDriver
* **Test Runner:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)
* **Reporting:** Extent Reports (with failure screenshots)
* **Environment:** Docker & Selenium Grid (Parallel Execution)

## 🏗️ Framework Architecture
The framework follows the **Page Object Model (POM)** to separate the UI actions from the test logic, ensuring high maintainability.

* **`src/main/java`**: Contains Page Objects and reusable Base Utilities.
* **`src/test/java`**: Contains Test Classes and Test Data providers.
* **`testng.xml`**: Configured for cross-browser testing (Chrome, Firefox, Edge).
* **`pom.xml`**: Centralized dependency management.

## ✨ Key Features
* **Parallel Execution:** Configured via TestNG to run multiple tests simultaneously, reducing execution time by ~50%.
* **Dynamic Screenshots:** Integrated listener that captures screenshots automatically only when a test fails.
* **Data-Driven Testing:** Utilizes Excel/Properties files to run the same test with multiple data sets.
* **CI/CD Ready:** Includes a `Dockerfile` for containerized execution and is ready for Jenkins integration.

## 📊 Sample Execution Report
> *[Optional: Insert a screenshot here of your Extent Report dashboard showing green/red bars]*

## 🚀 How to Run
1. Clone the repo: 
   ```bash
   git clone https://github.com/your-username/OpencartV121.git
   ```
2. Navigate to the folder:
   ```bash
   cd OpencartV121
   ```
3. Run the tests via Maven:
   ```bash
   mvn test
   ```
Would you like me to also draft a **LinkedIn post** you can share to announce this project and catch the attention of recruiters in your network?
