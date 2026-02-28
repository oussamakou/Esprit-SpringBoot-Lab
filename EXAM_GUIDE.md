# 🎓 Guide d'Examen - Architecture des SI II (4NIDS6)
> Server port: **9090** | DB port: **3307** | DB name: **springdb**

---

## 💉 L'Injection de Dépendance (DI) — Concept Clé

**Définition simple :** Au lieu de créer toi-même un objet avec `new`, tu **demandes** à Spring de te le fournir. Spring est responsable de la création et de la gestion des objets (appelés **Beans**).

### ❌ Sans DI (mauvaise pratique)
```java
public class BlocServiceImpl {
    // On crée manuellement la dépendance — couplage fort !
    BlocRepository blocRepository = new BlocRepository();
}
```
**Problème :** Si `BlocRepository` change, on doit modifier `BlocServiceImpl`. Difficile à tester.

### ✅ Avec DI par Constructeur (meilleure pratique — ce qu'on utilise dans le projet)
```java
@Service
@AllArgsConstructor  // Lombok génère un constructeur avec tous les champs
public class BlocServiceImpl implements IBlocService {
    // Spring voit ce champ, et l'injecte automatiquement ✅
    BlocRepository blocRepository;
}
```
**Comment ça marche ?**
1. Spring démarre → scanne les classes annotées `@Service`, `@Repository`, `@RestController`.
2. Il crée un **Bean** (instance unique) pour chacune.
3. Quand `BlocServiceImpl` est créé, Spring voit qu'il a besoin d'un `BlocRepository` → il **injecte** automatiquement le Bean `BlocRepository` déjà créé.

### 3 Types d'injection (à connaître pour l'examen)
| Type                 | Syntaxe                               | Recommandé ?                       |
| -------------------- | ------------------------------------- | ---------------------------------- |
| **Par Constructeur** | `@AllArgsConstructor` + champ         | ✅ **Oui** (notre code)             |
| **Par Setter**       | `@Autowired` sur un setter            | ⚠️ Déconseillé                      |
| **Par Champ**        | `@Autowired` directement sur le champ | ⚠️ Déconseillé (difficile à tester) |

---

## 🏗️ Architecture en Couches (The Big Picture)

```
HTTP Request (Postman)
        ↓
  [ Controller ]       → Reçoit la requête HTTP, appelle le Service
        ↓
   [ Service ]         → Contient la logique métier (business logic)
        ↓
  [ Repository ]       → Parle à la base de données (JPA)
        ↓
   [ Database ]        → MySQL
```

---

## 📦 Structure des Packages Créés

```
src/main/java/tn/esprit/springbootlab/
│
├── entities/          → Classes JPA (tables DB)
│   ├── bloc.java
│   ├── chambre.java
│   ├── etudiant.java
│   ├── foyer.java
│   ├── reservation.java
│   ├── universite.java
│   └── typeC.java     (Enum: SIMPLE, DOUBLE, TRIPLE)
│
├── repositories/      → Interfaces JpaRepository (CRUD auto)
│   ├── BlocRepository.java
│   ├── ChambreRepository.java
│   ├── EtudiantRepository.java
│   ├── FoyerRepository.java
│   ├── ReservationRepository.java
│   └── UniversiteRepository.java
│
├── services/          → Business Logic
│   ├── IBlocService.java          (interface)
│   ├── BlocServiceImpl.java       (implémentation)
│   ├── IChambreService.java
│   ├── ChambreServiceImpl.java
│   ├── IEtudiantService.java
│   ├── EtudiantServiceImpl.java
│   ├── IFoyerService.java
│   ├── FoyerServiceImpl.java
│   ├── IReservationService.java
│   ├── ReservationServiceImpl.java
│   ├── IUniversiteService.java
│   └── UniversiteServiceImpl.java
│
└── controllers/       → REST APIs
    ├── BlocRestController.java
    ├── ChambreRestController.java
    ├── EtudiantRestController.java
    ├── FoyerRestController.java
    ├── ReservationRestController.java
    └── UniversiteRestController.java
```

---

## 💡 Annotations Clés à Mémoriser (Récap Final)

| Annotation                                                        | Rôle                            | Package    |
| ----------------------------------------------------------------- | ------------------------------- | ---------- |
| `@Entity`                                                         | Classe = Table BDD              | JPA        |
| `@Id`                                                             | Clé primaire                    | JPA        |
| `@GeneratedValue`                                                 | Auto-incrément                  | JPA        |
| `@ManyToOne`                                                      | Relation N→1                    | JPA        |
| `@OneToMany`                                                      | Relation 1→N                    | JPA        |
| `@ManyToMany`                                                     | Relation N→N                    | JPA        |
| `@OneToOne`                                                       | Relation 1→1                    | JPA        |
| `@Enumerated(EnumType.STRING)`                                    | Enum → String en BDD            | JPA        |
| `@Repository`                                                     | Bean de données                 | Spring     |
| `@Service`                                                        | Bean de service                 | Spring     |
| `@RestController`                                                 | Bean REST Controller            | Spring     |
| `@AllArgsConstructor`                                             | Constructeur all-args (pour DI) | Lombok     |
| `@RequestMapping("/path")`                                        | Chemin de base du controller    | Spring Web |
| `@GetMapping` / `@PostMapping` / `@PutMapping` / `@DeleteMapping` | Méthodes HTTP                   | Spring Web |
| `@PathVariable`                                                   | Variable dans l'URL             | Spring Web |
| `@RequestBody`                                                    | Corps JSON de la requête        | Spring Web |
