# DevOps Calculator

Eine interaktive Java-Konsolenanwendung für mathematische Grundrechenarten.

## Features
- Addition, Subtraktion, Multiplikation, Division
- Interaktive Konsolenanwendung
- Vollständig containerisiert mit Docker
- Automatisierte CI/CD Pipeline

### CI/CD Pipeline
1. **CI Pipeline** (`ci.yml`): Build, Test, Docker Image erstellen und zu DockerHub pushen
2. **CD Pipeline** (`cd.yml`): Neuestes Image von DockerHub pullen und deployen

### Workflow ausführen
1. GitHub Repository → **Actions**
2. Workflow auswählen:
   - "Java-CI Pipeline" für Build und Push
   - "Docker-CD Pipeline" für Deployment
3. **"Run workflow"** klicken

Die Anwendung läuft automatisch in der GitHub Actions Umgebung.
