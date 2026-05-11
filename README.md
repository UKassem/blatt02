Blatt 02 
Aufgabe 1: 

Wenn man eine Datei verändert hat, kann man nicht direkt den Branch wechseln. Ein Checkout ist erst möglich, wenn die Änderungen entweder committet oder zurückgesetzt wurden.

Sobald im master und im end-Branch unterschiedliche Änderungen an derselben Stelle vorgenommen werden, entstehen Merge-Konflikte. Diese konnte ich lösen, indem ich die Konfliktmarkierungen entfernt und die Datei so angepasst habe, dass in beiden Branches nur noch der gemeinsame Inhalt (z. B. „HeroO“) enthalten war. 
Danach habe ich die Änderungen committet und der Konflikt war behoben.

Bei Aufgabe 4 kam es beim Merge zu keiner wirklichen Änderung, da beide Branches bereits denselben Stand hatten. Git meldete daher „Already up to date“.


<!-- pandoc -s -f markdown -t markdown --columns=94 --reference-links=true README.md -->

## About

This represents the student support code for the [Cat-Café task].

## License

This [work] by [Carsten Gips] and [contributors] is licensed under [MIT].

  [Cat-Café task]: https://github.com/Programmiermethoden-CampusMinden/Prog2-Lecture/tree/master/homework
  [work]: https://github.com/Programmiermethoden-CampusMinden/prog2_ybel_catcafe
  [Carsten Gips]: https://github.com/cagix
  [contributors]: https://github.com/Programmiermethoden-CampusMinden/prog2_ybel_catcafe/graphs/contributors
  [MIT]: LICENSE.md
