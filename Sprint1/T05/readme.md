Nivell 1
Es pot utilitzar Java exclusivament, o bé la llibreria Apache Commons IO si ho prefereixes.

- Exercici 1
Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.

- Exercici 2
Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F), i la seva última data de modificació.

- Exercici 3
Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.

- Exercici 4
Afegeix la funcionalitat de llegir qualsevol fitxer TXT i mostra el seu contingut per consola.

- Exercici 5
Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.


Nivell 2


- Exercici 1
Executa l'exercici 3 del nivell anterior parametritzant tots els mètodes en un fitxer de configuració.

Pots utilitzar un fitxer Java Properties, o bé la llibreria Apache Commons Configuration si ho prefereixes.

De l'exercici anterior, parametritza el següent:

Directori a llegir.
Nom i directori del fitxer TXT resultant.

Nivell 3
- Exercici 1
Crea una utilitat que encripti i desencripti els fitxers resultants dels nivells anteriors.

Fes servir l'algorisme AES en manera de treball ECB o CBC amb mètode d'ompliment PKCS5Padding. Es pot emprar javax.crypto o bé org.apache.commons.crypto.
