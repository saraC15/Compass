# Compass
En enkel kompassapp gjord i kursen Avancerad interaktionsdesign.

<h1>Tillvägagångssätt</h1>

Utgick från appen som gjordes i de första stegen i <a href="https://developer.android.com/training/basics/firstapp/index.html">Building Your First App</a>. 

<h2>La till fler sidor till appen</h2>

Använde delar av <a href="https://developer.android.com/training/basics/firstapp/starting-activity.html">Start Another Activity</a> för att skapa nya aktiviteter för kompass och accelerator och lägga till knappar på förstasidan som leder till dessa sidor.

<h2>Visade acceleratorvärden</h2>

Använde exempelklassen från <a href="https://developer.android.com/reference/android/hardware/SensorManager.html">SensorManager (Android.com)</a> som grund. Behövde dock flytta att hämta data till SensorManager och SensorEvent till onCreate för appen annars kraschade med felmeddelandet <code>java.lang.IllegalStateException: System services not available to Activities before onCreate()</code> i Android Monitor då jag klickade på knappen till accelerator-vyn.

Använde <a href="http://www.techrepublic.com/article/pro-tip-create-your-own-magnetic-compass-using-androids-internal-sensors/">Pro tip: Create your own magnetic compass using Android's internal sensors</a> för att se hur man kopplar ihop med layoutelementen och hämtar ny data.

Använde svar från <a href="http://stackoverflow.com/questions/5402637/displays-float-into-text-view">displays float into Text View</a> för att konvertera float-värden så att de kunde visas i en text view.


<h2>Gjorde en kompass</h2>

Använde koden från <a href="http://www.techrepublic.com/article/pro-tip-create-your-own-magnetic-compass-using-androids-internal-sensors/">Pro tip: Create your own magnetic compass using Android's internal sensors</a> för att få kompassen att rotera efter mobilens riktning (genom att man vet accelerometerns värde) och norr (genom att man vet magnetometerns värde).

Jag lade även till ett lågpassfilter från <a href="https://www.built.io/blog/applying-low-pass-filter-to-android-sensor-s-readings">Applying Low Pass Filter to Android Sensor's Readings</a> för att filtrera bort störningar och ändrade i koden så att denna metod användes för att lägga in de nya inputvärdena istället för att bara kopiera över dem direkt som innan.
