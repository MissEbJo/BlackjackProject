# BlackjackProject

##Description
###Win or bust...the name of the game is Blackjack. Will you make it to 21 first or suffer defeat? 
Object of the game:
Each participant attempts to beat the dealer by getting a count as close to 21 as possible, without going over 21.
How to play:
To start with, the player is dealt two cards that are visible. The dealer is dealt two cards, one that is hidden. 
The player has the option to hit (be dealt one card) or to stand (to not receive a card). The option is hinged on the total value of the cards in the players hand. They have to decide which option could lead them to 21 (BlackJack) or if either option could put them over 21(Bust!).

The program has a Deck class which creates the deck with 52 cards, having four Suits(enums) which have sets of Ranks(enums).
The BlackjackApp calls for the Dealer class to play the game. The Dealer class will shuffle the deck & call the dealer to deal cards to the player & the dealer.
After the initial hands are dealt, the Player call will be called to cycle through the turns of the player, if the player reaches 21 within their turn, the dealer will check the winning conditions. If the player decides to stand, the dealer will have his turn. If the dealer is under 17 points and not over 21, the dealer will hit. If the dealer is over 21, the dealer will stand.



##Lessons Learned
Encapsulation is a easier topic to understand when you understand your variables. When you understand the flow of your project, it's easier to call variables belonging to different classes. 
Having an innate knowledge of Blackjack for this project would have been great as well. With knowing this, watching a couple of hands of Blackjack is very helpful in understanding the logic of the game. 
If you create and initialize an Array List in your method & want to pass this Array List into another method, do not create the Array List again, it will be an empty Array List.
"Code is read more often than written."
Ensure that you know what your code is. Watching random videos on YouTube and attempting to code without understanding what the code means is the path to a serious downfall. 





##Technologies Used
Eclipse, Google, TA session, Java docs