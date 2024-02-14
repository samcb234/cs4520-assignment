Github link: https://github.com/samcb234/cs4520-assignment

For this assignment, I split the funcionality into two fragments, the login frangment and the product list fragment.
These two are controlled by a navigation graph that is inflated by the main activity, and opens the app to the login fragment.
The login fragment is responsible for inflating the login_layout.xml layout and adding the onClickListener to the button,
which checks if both the username and password are 'admin', in which case it calls the navigator graph to navigate to the
product list fragment. if the username or password aren't 'admin', the login fragment displays a quick toast to
notify the user that their login is incorrect.

The product list fragment is responsible for initializing the list of products and the recycler view which
is implemented by the product_list_layout.xml layout by assigning it a LinearLayoutManager and a custom ProductAdapter.
The ProductAdapter is responsible for inflating the product_card_layout.xml file in the recycler view, and contains
instructions for updating each component based on the type of product given.

The products are represented by a sealed class called Product, which contains two enum classes: Food and Equipment.
These classes each set the type of the superclass in their constructor, and the adapter uses a when() statement
to determine the image displayed and the background color of the card based on which concrete Product class it is given.

This project can be ran by running it in Android Studio.