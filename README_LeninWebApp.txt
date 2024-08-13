!Lenin Job Order Web
Developed and Designed by Al-Khadeem Abubakar and assisted by Maycee Jade Toribio
An Internship project for Lenin Computer Systems, Inc.

This Web App is still the first prototype exisiting and future errors may occur
in abnormal circumstances. To continually use this Web App, maintenance is highly recommended

The Google Account below will be the main access for the database as well as the sender
for the Job Order Confirmation
-----------------------------------
Google Account:
Email: leninwebApp@gmail.com
Password: LENIN@web99
Mobile Number: 09555883171
LeninWebApp: gpfq stbp onrw vngx
-----------------------------------



TO GET STARTED
<-----HOST----->
There will be two options for the hosting, access through local host run the 
jar file from this project file and run locally. Remember to login the Google Account in 
the local browser to avoid errors in the Email Sending function

Or access the web app through free hosting service through render, which I have 
already setted up and will be accessible through this link https://leninwebapp-48vw.onrender.com
Render Login using Google Account -----

<NOTE> When accessing the free hosting for the web app, it will take time to load since 
its a free hosting at most 5-10 mins give or take, but after loading the first time it will
work properly, after a certain amount of time of inactivity the web app will take time again to load
The free hosting service is accessible through any network and is already ready for usage, 
only problem is the downtime but 5 mins of loading is good enough considering its free

<>
<-----DATABASE----->
Access the database of the web app through mongo db https://www.mongodb.com/
Login using the designated Google Account given above

the database connection is hardcoded into the code as well as the email
that will be used for sending the confirmation code

the credentials for the database connection user:admin password:lenin

<---keep note there is no manipulation of data in the web app 
all manipulation of existing data will be done through the database--->

@MODULES
<-----CREATE USER----->
A user account will be needed to access the JOB ORDER CONFIRMATION Through Email

Fill in the necessary information such as the
-name (reflects on the database as someone who confirmed the job order)
-username (used as a login credential)
-email (!IMPORTANT the email needs to be a valid, 
	any typos in this field will result into a failed JOB ORDER CONFIRMATION)

	!!!When a confirmation Email was not receieved upon creating a Job Order
		Review all the Emails in the Database on the SolutionsConfig Collection
		Make sure that all emails are valid

-password (used as a login credential) 
-role (ADMIN will have access to all buttons in the home page)
      (SOLUTIONS will only have access to Deployment and Release)


<-----ADMIN CONFIG----->
Any Forgotten passwords can be updated through this module

<-----CREATE JOB ORDER----->
!Please Fill in all the necessary information in the Job Order Form 
Review all the information if valid, any abnormalities may result to an Error

Upon creating a job order the JOB ORDER CONFIRMATION will be sent
to all the registered accounts through their designated email.

The one who will click the confirmation link upon logging in their name will be listed in the database
as the one who confirmed the Job Order. When confirming in another device, the user will be directed
to the login page, upon logging in it will go to the home page, to confirm the Job Order click the link again. 
Until it displays the Confirmation that Job Order ... was confirmed on ... and so on

<-----VIEW JOB ORDERS----->
There are 4 Filters all will be filtered by their Project Status, as well as the date issued

PDF downloads can be done through this module, Job Orders that do not have a job code
will proceed with an error when downloading a pdf

!Improvements can be made to filter using serverside instead of client side, this will 
significantly improve the code aswell as the filtering 

If manipulation were to be made this module can be found in ViewingService, 
ViewingControllerfor Java Code, as well as view.html and script.js

<------DEPLOYMENT and RELEASING----->
Upon Confirming the Job Order in the database it will reflect on the Deployment Module
Upon Deployment it will the reflect on the Releasing Module

Both Modules have the same buttons per Job Order except for Deployment and Release
