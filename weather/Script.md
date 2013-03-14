#Step 1

Here is what we initially have before we start the demo:

*	final pom.xml
* 	final test.properties
*	final JBehaveStories.java
*	Pages.java
*	WeatherPage.java
*	index.jsp (final jsp but comment body)
*	web.xml
*	new_orleans_weather.xml

>	mvn verify

#Step 2

Here is what we will add in step 2:

* i_can_get_weather_by_zip.story
* WeatherTest.java
* JBehaveStories.java is updated (maybe this version should be created in step 1)
* pom.xml is updated (maybe this version should be created in step 1)

>	Explain and copy i_can_get_weather_by_zip.story
>	Explain and copy WeatherTest.java
>	mvn verify

#Step 3

Here is what we will add in step 3:

*	TestWeatherRetriever.java
*	WeatherRetriever.java

>	Discuss about the design on the whiteboard - WeatherRetriever and WeatherParser
>	Show Yahoo XML at http://weather.yahooapis.com/forecastrss?p=70112
>	Explain and copy TestWeatherRetriever.java
>	Make compile pass by adding empty WeatherRetriever class (creating the src/main/java folder). Run UT and fail.
>	Copy code of WeatherRetriever and run UT and pass.
>	git add and commit

#Step 4

Here is what we will add in step 4:

*	TestWeatherParser.java
*	WeatherParser.java
*	Weather.java

>	Explain and copy TestWeatherParser.java
>	Make compile pass by adding empty WeatherParser and Weather class. Need to manually add missing methods. Run UT and fail.
>	Copy code of WeatherParser and Weather and run UT and pass.
>	git add and commit

#Step 5

Here is what we will add or update in step 5:

*	index.jsp
*	WeatherPage.java
*	WeatherTest.java

>	uncomment JSP code
>	mvn test jetty:run, manual test
>	Explain and copy WeatherPage.java
>	Explain and copy WeatherTest.java
>	mvn verify
>	git add and commit
>	git push and CI run and pass