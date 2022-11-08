# StocksProject
[Spreasheet](https://docs.google.com/spreadsheets/d/1y8LKOmlq90gHdKjhl1jRI42q6csZGaCBbA7QOGITeBI/edit#gid=0)  
[Project guidelines](https://docs.google.com/document/d/1DY8C5utYh9CBOxl1bIG7lVVcYy-JUFf1/edit?usp=sharing&ouid=104368686630953859149&rtpof=true&sd=true)  
  
## How to use github without the application  
1. Open the terminal  
1. cd into the spot you want to place the Project  
1. type in `git clone https://github.com/FwParzy/StocksProject.git`  
1. Congrats you have it on your machine now. Time to talk about the workflow  
  
### Github workflow in the terminal  
1. inside the repo type in `git status` if it gives an error complain to isaac with screenshots  
1. if it didnt give an error type in `git pull origin develop`  
1. Now that we have the newest code we need to create a branch before we start making changes.  
We do this with `git checkout -b 'branch_name'`  
1. Now you code all your work  
1. When you are ready to push your work you would do `git status` to check that you actually changed something. if there is red file names continue  
1. `git add .` to add all your changes  
1. `git commit -m 'your message here'` this lets us know what you changed, for example `git commit -m 'added the stocks class'`  
1. `git push origin 'branch_name` this will send your changes to the repository. Send Isaac a message when you do this. **NEVER PUSH TO DEVELOP LIKE THIS**  
1. Now that your done do `git checkout develop` and `git pull origin develop`  
 
