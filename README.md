# DevOps Calculator

Eine interaktive Java-Konsolenanwendung für mathematische Grundrechenarten.

## Features
- Addition, Subtraktion, Multiplikation, Division
- HTTP-API für automatisierte Abfragen (via curl)
- CI/CD Pipeline

### CI/CD Pipeline
1. **CI Pipeline** (`ci.yml`): Build, Test, Docker Image erstellen und zu DockerHub pushen
2. **CD Pipeline** (`cd.yml`): Neuestes Image von DockerHub pullen/deployen und via curl     testen

### Workflow ausführen
1. GitHub Repository → **Actions**
2. Workflow auswählen:
   - "Java-CI Pipeline" für Build und Push
   - "Docker-CD Pipeline" für Deployment
3. **"Run workflow"** klicken

Die Anwendung läuft in der GitHub Actions Umgebung.
