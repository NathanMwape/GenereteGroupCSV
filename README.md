#Projet de Génération de Groupes Aléatoires à partir d'un fichier CSV

Ce projet Java permet de générer aléatoirement des groupes de personnes à partir d'un fichier CSV contenant des données individuelles. Le but est de former des groupes de deux personnes dans chaque groupe.

Fonctionnalités principales

Lecture d'un fichier CSV : Le programme lit un fichier CSV spécifié, qui doit contenir les champs suivants pour chaque personne : numéro, nom, poste, prénom, sexe.

Génération de groupes aléatoires : À partir des données lues du fichier CSV, le programme crée des groupes aléatoires en sélectionnant deux personnes à la fois. Si le nombre total de personnes est impair, un groupe contiendra une seule personne.

Génération d'un fichier CSV de sortie : Le résultat de la génération des groupes est enregistré dans un nouveau fichier CSV de sortie, qui contient les groupes formés avec les champs correspondants pour chaque personne.

Utilisation du projet

Prérequis : Assurez-vous d'avoir Java installé sur votre système.

Clonez ce dépôt : Utilisez la commande git clone pour cloner ce dépôt sur votre machine.

Placez votre fichier CSV d'entrée : Copiez votre fichier CSV contenant les données des personnes dans le répertoire du projet.

Configuration :
Ouvrez le fichier GroupeAleatoireCSV.java et modifiez les variables inputFilePath, outputFilePath et nombreGroupes selon vos besoins.

Exécution du programme : Compilez et exécutez le programme GroupeAleatoireCSV.java. Les groupes générés seront enregistrés dans le fichier CSV de sortie spécifié.

Dépendances:

Ce projet utilise la bibliothèque OpenCSV pour la lecture et l'écriture des fichiers CSV. 
Assurez-vous d'ajouter la bibliothèque OpenCSV à votre projet pour que le code fonctionne correctement.

Remarque
Ce projet est fourni à titre d'exemple et peut être étendu ou modifié selon vos besoins. N'hésitez pas à explorer et à apporter des améliorations à ce projet.

N'oubliez pas de mettre à jour ce fichier README avec les instructions spécifiques à votre projet et de fournir les crédits appropriés pour les bibliothèques tierces utilisées.
