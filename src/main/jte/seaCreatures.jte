@import java.util.*;
@param ArrayList<String> seaCreatures

<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>

<body>
  <p>My favorite sea creatures are:</p>
  @for(String seaCreature : seaCreatures)
      <li>${seaCreature}</li>
      @endfor

</body>

</html>