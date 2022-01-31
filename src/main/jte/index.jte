@import java.util.*
@param ArrayList<String> items


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>Hello visitor!</p>

    @for(String item : items)
    <li>${item}</li>
    @endfor

</body>
</html>