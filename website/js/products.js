var product_data = '{ "products" : ['
	+'{ "id":"1", "thumb": "img/paskal.jpg", "name": "Test Automation in the Real World", "author": "Greg Paskal", "price": 9.99, "description": "Greg Paskal shares some of his best insights learned as a successful test automation engineer. With over 30 years in software development and test engineering, Greg has experience first hand what works and what ends up problematic when implementing test automation across the enterprise. Learn how to take First Steps into Test Automation, ensuring you start with a great foundation. Understand the critical steps of The Automation Evaluation and how this process ensures you’re automating the right things. Discover how Removing The Word Test from Test Automation opens up countless opportunities to get even greater value out of your automation tools and investment. Read about How to Hire an Automation Engineer to ensure you have the right talent to succeed in your automation endeavors." },'
	+'{ "id":"2", "thumb": "img/graham.jpg", "name": "Experiences of Test Automation", "author": "Dorothy Graham and Mark Fewster", "price": 44.09, "description": "Software test automation has moved beyond a luxury to become a necessity. Applications and systems have grown ever larger and more complex, and manual testing simply cannot keep up. As technology changes, and more organizations move into agile development, testing must adapt—and quickly. Test automation is essential, but poor automation is wasteful—how do you know where your efforts will take you?" },'
	+'{ "id":"3", "thumb": "img/crispin.jpg", "name": "Agile Testing", "author": "Lisa Crispin and Janet Gregory", "price": 49.07, "description": "Two of the industry’s most experienced agile testing practitioners and consultants, Lisa Crispin and Janet Gregory, have teamed up to bring you the definitive answers to these questions and many others. In Agile Testing, Crispin and Gregory define agile testing and illustrate the tester’s role with examples from real agile teams. They teach you how to use the agile testing quadrants to identify what testing is needed, who should do it, and what tools might help. The book chronicles an agile software development iteration from the viewpoint of a tester and explains the seven key success factors of agile testing" },'
	+'{ "id":"4", "thumb": "img/whittaker.jpg", "name": "How Google Tests Software", "author": "James A. Whittaker, Jason Arbon, Jeff Carollo", "price": 31.67, "description": "Discover 100% practical, amazingly scalable techniques for analyzing risk and planning tests…thinking like real users…implementing exploratory, black box, white box, and acceptance testing…getting usable feedback…tracking issues…choosing and creating tools…testing “Docs & Mocks,” interfaces, classes, modules, libraries, binaries, services, and infrastructure…reviewing code and refactoring…using test hooks, presubmit scripts, queues, continuous builds, and more. With these techniques, you can transform testing from a bottleneck into an accelerator–and make your whole organization more productive!" },'
	+'{ "id":"5", "thumb": "img/richardson.jpg", "name": "Java For Testers", "author": "Alan Richardson", "price": 29.99, "description": "Discover 100% practical, amazingly scalable techniques for analyzing risk and planning tests…thinking like real users…implementing exploratory, black box, white box, and acceptance testing…getting usable feedback…tracking issues…choosing and creating tools…testing “Docs & Mocks,” interfaces, classes, modules, libraries, binaries, services, and infrastructure…reviewing code and refactoring…using test hooks, presubmit scripts, queues, continuous builds, and more. With these techniques, you can transform testing from a bottleneck into an accelerator–and make your whole organization more productive!" },'
	+'{ "id":"6", "thumb": "img/watson.jpg", "name": "Advanced Selenium in Java", "author": "Paul Watson", "price": 29.99, "description": "The book starts with introduction of Selenium and then dives into key concepts like setting up project in IntelliJ, integration with Junit and TestNG, integration with build tools like Gradle and Maven. You will also learn how to integrate selenium with Cucumber. In the end, you will learn how to run the Selenium tests on CI servers like TeamCity, Bamboo and Jenkins. You will also learn how to work with various types of frameworks like Page object models, Page factory Keyword driven frameworks etc. Book also touches the concepts related to mobile automation using Selenium."},'
	+'{ "id":"7", "thumb": "img/rose.jpg", "name": "The Cucumber for Java Book", "author": "Seb Rose", "price": 34.99, "description": "An authoritative guide that will give you and your team all the knowledge you need to start using Cucumber with confidence."},'
	+'{ "id":"8", "thumb": "img/smart.jpg", "name": "BDD in Action", "author": "John Ferguson Smart", "price": 40.31, "description": "BDD in Action teaches you the Behavior-Driven Development model and shows you how to integrate it into your existing development process. First you\'ll learn how to apply BDD to requirements analysis to define features that focus your development efforts on underlying business goals. Then, you\'ll discover how to automate acceptance criteria and use tests to guide and report on the development process. Along the way, you\'ll apply BDD principles at the coding level to write more maintainable and better documented code." }'
	+']}';


function getProducts(){
	return JSON.parse(product_data);
}



function getQueryVariable(variable)
{
       var query = window.location.search.substring(1);
       var vars = query.split("&");
       for (var i=0;i<vars.length;i++) {
			var pair = vars[i].split("=");
			if(pair[0] == variable){return pair[1];}
       }
       return(false);
}