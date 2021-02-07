Dija - Engineer Recruitment Test
==================================

Thank you for taking the time to do our technical test. 🙂

This test is intended for mobile engineers (iOS/Android).

The challenge consists of two parts:

* [A coding test](#coding-test)
* A pairing session with a Dija engineer. We will add a small feature to your App


## Disclaimer
- Focus on what matters - for our recruitment process we want to focus on real use cases, rather than complex algorithms on a whiteboard.
- Done is better than perfect - we'd rather that you have lightweight solution that ticks most of the boxes than a perfect solution for one of them.
- People who can wear multiple hats - we won't always have a designer or product manager around so you might need to give it a go. Again, we don't expect perfection!
- Readability over performance - the code we write now will probably be rewritten many times. Let's make that easy for the next person!


## Coding Test
The test is to create an App that allow a **Store Manager** to access the incoming orders, see the list of items to be picked, and change the status of an order.

The application should display these informations 

**Orders in the list**
- `order_display_id`
- `created_at`
- `store_name`
- `status` (`to_pick`, `picking`, `packed`, `completed`, `cancelled`)

**Order detail**
- `order_display_id`
- `created_at`
- `store_name`
- `status`
- `line_items`
  - `quantity`
  - `name`
  - `barcode`
  - `shelf_mapping`
  - `image_url`
	
The printed picking list should show
- `order_display_id`
- `created_at`
- `store_name`
- `status`
For each `line_items`
`quantity`, `shelf_mapping` and `name`


API sample responses
- List orders [GET /orders](fixtures/orders-list.json)
- Order detail [GET /orders/1945](fixtures/order-1945.json), [GET /orders/1944](fixtures/order-1944.json), [GET /orders/1943](fixtures/order-1943.json)


### Architecture
Feel free to use any architecture for the App. We will discuss your choice during our pairing session.

### Design
The App is an internal tool. So design should be clean and functional. 🙂 

The app needs to follow the sample design system 

[ image ]

[Figma](Design/design-system.fig)
[PDF](Design/design-system.pdf)


### Task requirements
We believe this task shouldn't take more than **3 hours**, use your time wisely. ⏱

- Please complete the user story below
- Your code should compile and run in one step
- Feel free to use whatever frameworks / libraries / packages you like
- You **must** include tests
- Please avoid including artifacts from your local build; use a relevant `.gitignore`
- Please write a short post to describe the features you built. Imagine you need to share this content with non-technical people in the company. Please add to `README.md` file

### User Story
- As a Store Manager
- I can view the list of orders for as specific store
- So that I know which one needs to be picked and prepared (to_pick)

- When I select an order
- I can see the order detail
- I can change the order status
- I can print the picking list



# How to Submit
Just fork this private repository 🧑‍💻
Create a `README.md` file and add your instructions 📝


#### Thanks for your time 🙏 we look forward to hearing from you! 🚀🚀

----

Inspiration for the test format taken with ❤️ from [JustEat's recruitment test](https://github.com/justeat/JustEat.RecruitmentTest).

