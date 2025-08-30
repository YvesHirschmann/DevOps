# DevOps Calculator

## Features
- Addition, Subtraktion, Multiplikation, Division
- HTTP-API für automatisierte Abfragen (via curl)
- CI/CD Pipeline

### HTTP-API Hinweise
**Wichtig:** Das Pluszeichen (`+`) muss in der URL als `%2B` (URL-Encoding) übergeben werden, da es sonst als Leerzeichen interpretiert wird.

**Beispiele:**
# Addition
curl "http://localhost:8080/api/calculator/calculate?a=5&b=3&operation=%2B"
# Subtraktion
curl "http://localhost:8080/api/calculator/calculate?a=5&b=3&operation=-"
# Multiplikation
curl "http://localhost:8080/api/calculator/calculate?a=5&b=3&operation=*"
# Division
curl "http://localhost:8080/api/calculator/calculate?a=5&b=3&operation=/"

### CI/CD Pipeline
**CI (Continuous Integration):**
Die CI-Pipeline baut das Projekt, führt die Tests aus und erstellt ein Docker-Image. Bei Erfolg wird das Image automatisch auf DockerHub hochgeladen. So wird sichergestellt, dass nur getesteter und lauffähiger Code veröffentlicht wird.

**CD (Continuous Deployment):**
Die CD-Pipeline zieht das neueste Docker-Image von DockerHub, startet die Anwendung in einer Container-Umgebung und testet die API automatisiert per curl. Nach dem Testlauf wird die Umgebung wieder bereinigt. So kann die Anwendung nach jedem Update direkt bereitgestellt und überprüft werden.

### Workflow ausführen
1. GitHub Repository → **Actions**
2. Workflow auswählen:
   - "Java-CI Pipeline" für Build und Push
   - "Docker-CD Pipeline" für Deployment und Testing
3. **"Run workflow"** klicken

Die Anwendung läuft in der GitHub Actions Umgebung.
