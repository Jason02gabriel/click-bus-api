
# CLIK BUS API CHALLENGE
## API for places list

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)

This project is an API built using **Java, Java Spring**


## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

## Installation

1. Clone the repository:

```bash
git clone https://github.com/Jason02gabriel/click-bus-api.git
```

2. Install dependencies with Maven

## Usage

1. Start the application with Maven
2. The API will be accessible at http://localhost:8080

## API Endpoints
The API provides the following endpoints:

**API CLIK-BUS**
```markdown
POST /places - Create a new place
GET /places - Retrieve all places
GET /places/{id} - Retrieve a place by id
GET /places/search/name? - Retrieve a place by name
GET /places/search/city/city? - Retrieve a places list by city
GET /places/search/state/state? - Retrieve a places list by state
PUT /places/{id} - Update a place
DELETE /places/{id} - Delete a place by id
```

**BODY**
```json
{
  "name": "New Place",
  "city": "Los Angeles",
  "state": "Califórnia"
}
```

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request to the repository.

When contributing to this project, please follow the existing code style, [commit conventions](https://www.conventionalcommits.org/en/v1.0.0/), and submit your changes in a separate branch.





