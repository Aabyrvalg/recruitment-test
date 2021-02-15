Dija - Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test. 🙂

This test is intended for backend engineers.

The challenge consists of two parts:

* [A coding test](#coding-test)
* A pairing session with a Dija engineer. We will add a small feature to your Application


## Disclaimer
- Focus on what matters - for our recruitment process we want to focus on real use cases, rather than complex algorithms on a whiteboard.
- Done is better than perfect - we'd rather that you have lightweight solution that ticks most of the boxes than a perfect solution for one of them.
- People who can wear multiple hats - we won't always have a designer or product manager around so you might need to give it a go. Again, we don't expect perfection!
- Readability over performance - the code we write now will probably be rewritten many times. Let's make that easy for the next person!


# Coding Test
The test is to create an application that will notify a **Store Manager** whenever a new order comes in. Each store 
manager has a slightly different way of working so we would like to offer at least 2 different mediums (e.g. 
email/slack/sms or anything else you can think of!) for them to receive notifications on. This notification should 
allow the store manager to keep an eye on orders coming into the store while working on other tasks. 

The orders will arrive to your application from a shopify webhook. [Example payload](fixtures/shopify-order.json) 
from [shopify documentation](https://shopify.dev/docs/admin-api/rest/reference/events/webhook)

### User Story
As a Store Manager\
I want to know when a new order comes in from Shopify\
So that I know when the store is busy\

As a Store Manager\
I want to have detailed information about items and delivery in the notification\
So I can easily check that orders going out for delivery are correct\

### Platform Choice
We favour Ruby but are happy to accept applications in any language.


### Task requirements
We believe this task shouldn't take more than **3 hours**, use your time wisely. ⏱

- Feel free to use whatever frameworks / libraries / packages you like
- You **must** include tests
- Please avoid including artifacts from your local build; use a relevant `.gitignore`
- Please write a short post to describe the features you built. Imagine you need to share this content with non-technical people in the company. Please add to `README.md` file
- Please also include instructions for setup and running tests.


## How to submit

- Just clone this repository 🧑‍💻
- Add your instructions to a markdown file **Test.md** 📝
- Share your private Github repository with tech-users@dijanow.com

Or simply send us a zip file.


#### Thanks for your time 🙏, we look forward to hearing from you! 🚀🚀

----

Inspiration for the test format taken with ❤️ from [JustEat's recruitment test](https://github.com/justeat/JustEat.RecruitmentTest).

