# 🧪 Tutoriel de Test des Web Services (Postman)

Ce document explique comment tester les APIs de votre projet Spring Boot avec Postman.

## 🚀 1. Lancer l'Application
Avant de tester, assurez-vous que l'application est en cours d'exécution :
- Dans VS Code / IntelliJ : Run `SpringbootLabApplication.java`
- En ligne de commande : `mvn spring-boot:run`
- **Port par défaut :** `9090` (Configuré dans `application.properties`)

---

## 🛠️ 2. Configuration de Postman

1. **Créer une Collection** : Click sur `Collections` -> `+` -> Nommez-la "Spring Boot Lab".
2. **Créer une Requête** : Click sur `Add a request`.
3. **Méthode HTTP** : Choisissez `GET`, `POST`, `PUT` ou `DELETE` dans le menu déroulant.

---

## 📋 3. Exemples de Tests par Entité

### 🔷 BLOC (`/bloc`)
| Action    | Méthode  | URL                                             | Copier/Coller Body (JSON)                       |
| --------- | -------- | ----------------------------------------------- | ----------------------------------------------- |
| Ajouter   | `POST`   | `http://localhost:9090/bloc/add-bloc`           | `{"nomBloc": "Filiere A", "capaciteBloc": 120}` |
| Lire tous | `GET`    | `http://localhost:9090/bloc/retrieve-all-blocs` | —                                               |
| Supprimer | `DELETE` | `http://localhost:9090/bloc/remove-bloc/1`      | —                                               |

---

### 🔷 CHAMBRE (`/chambre`)
- **Action (Add)**: `POST` `http://localhost:9090/chambre/add-chambre`
- **Body**:
```json
{
  "numeroChambre": 202,
  "typeChambre": "DOUBLE"
}
```

---

### 🔷 ETUDIANT (`/etudiant`)
- **Action (Add)**: `POST` `http://localhost:9090/etudiant/add-etudiant`
- **Body**:
```json
{
  "nomEt": "Ben Salah",
  "prenomEt": "Firas",
  "cin": 14500000,
  "ecole": "ESPRIT",
  "dateNaissance": "2002-11-20"
}
```

---

### 🔷 FOYER (`/foyer`)
- **Action (Add)**: `POST` `http://localhost:9090/foyer/add-foyer`
- **Body**:
```json
{
  "nom": "Foyer El Qods",
  "capaciteFoyer": 300
}
```

---

### 🔷 RESERVATION (`/reservation`)
> ⚠️ Note: L'ID est un String (UUID).
- **Action (Add)**: `POST` `http://localhost:9090/reservation/add-reservation`
- **Body**:
```json
{
  "dateReservation": "2025-02-28",
  "estValide": true
}
```

---

### 🔷 UNIVERSITE (`/universite`)
- **Action (Add)**: `POST` `http://localhost:9090/universite/add-universite`
- **Body**:
```json
{
  "nomUniversite": "ESPRIT EL GHAZALA",
  "adresseUniversite": "Technopole El Ghazala"
}
```

---

## 🚦 4. Vérifier les Résultats

1. **Statut Code** : Vous devez recevoir un `200 OK` (ou `201 Created` pour certains POST).
2. **Base de Données** : Vous pouvez vérifier les données insérées en utilisant `http://localhost:9090/h2-console` (si activé) ou votre client MySQL (Port 3307).
3. **Erreurs Communes** :
   - `404 Not Found` : Vérifiez l'URL et assurez-vous que les controllers sont bien nommés.
   - `400 Bad Request` : Vérifiez la structure de votre JSON (Body).
   - `500 Server Error` : Vérifiez la console de Spring Boot pour voir l'erreur (souvent une contrainte SQL ou un champ manquant).

---
*Astuce d'Examen : Gardez ces URLs prêtes sur une feuille ou un fichier texte le jour de l'examen pratique !*
