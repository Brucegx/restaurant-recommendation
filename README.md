## Restaurant Recommendation
Built this web site based on native Javascript and Java. That is just production demo. So I ignored some details and didn't consider its online performance. We will fix its problem the following days and deploy it on better AWS paltform to meet high visits.

At first, there is a login page. If you have account already, it will navigate to main page. If not, we will helps you to sign up and navigate automatically. 

In main page, it will get your localtion at first. If it can't get your geolocation, it will tried to find location through IP. Then it will render a list of restaurants nearby. Favorite stores the list what you like. Recommendation will helps you find best choice based on distance and food categories you choose before. 
****
#### Back End
Since this is a recommendation system which will have heavy calculation I choose Java as back end and used Tomcat v8.0 as container. 


#### Front End
This is my first big project in work. My team leader said using native Javascript will help me understand in depth. During that time, I mocked JQuery and AJAX function. It helps me to understand how them work and why it is so popular. It's necessary to know how data flow works between front end and server side through XMLHttpRequest.

#### Database
This project has two kinds of database. MySQL and MonogoDB. We will have more choices when porject is deployed. In demo, I choose mongoDB as my database. When I deployed on AWS, I used Mongo Lab as remote databse instead of loacl mongoDB.

#### API
We mainly called Yelp API to get restaurant information from Yelp.  

____
As a demo, it is not finished yet. I need to set a cookie or httpsession for session tracing. That is a very important part, because we need login user information. All functions in this web site need user information. 

Beyond this, we also can following things,

1. Refactor it by ReactJS. It is necessary to decouple these functions. 
2. Import pagination.
3. Imporve recommendation algorithm.
4. Security problem. We need do somehing on password when we use Post in login page. Like salting user's password.
5. Deploy a responsive version. 
