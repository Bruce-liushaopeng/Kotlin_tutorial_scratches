class Scratch {



    public static void main(String[] args) {

        AccessLevelModifier levelTester = new AccessLevelModifier();
      //  levelTester.aPrivateField; ->won't work, this can't be access outside of the class
      //  levelTester.aPrivateMethod(); ->won't work, cannot access outside the calss
        String returnedPrivateField = levelTester.aPublicMethod();
        System.out.println("Got to the private field from PublicMethod, field is "+returnedPrivateField);

        levelTester.aProtectedMethod();


        System.out.println("\n****ScoreKeeper Demo***");
        ScoreKeeper scoreKeeper = new ScoreKeeper();
    //    scoreKeeper.playerOneScore = 5; -> this isn't good, it's possible to cheat. This should be private.
    //    scoreKeeper.checkForWinner(); -> This is not good, we shouldn't check winner unless a score changed, this should be private.
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerOneCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();
        scoreKeeper.playerTwoCorrectAnswer();

    }
}

class AccessLevelModifier{
    //add a new line
    //there are 4 lvl of access in java: public, protected, default, private
    //These are shown below from most visible to most restricted.

    public String aPublicField = "This can be access from any class";
    protected String aProtectedField = "This can be access from either class in the same package or a sub-class";//has to be exactly same folder, not sub-folder
    String aDefaultAccessField = "This can be accessed from a class in the same package only(not sub-classes)";
    private String aPrivateField = "This can only be accessed from the same class";


    public String aPublicMethod(){
        System.out.println("In the public method");
        return aPrivateField;
    }
    protected void aProtectedMethod(){
        System.out.println("In the protected method");
        aPrivateMethod();
    }
    private void aPrivateMethod(){
        System.out.println("In the private method");
    }

}

class ScoreKeeper{
    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public void playerOneCorrectAnswer(){
        playerOneScore++;
        System.out.println("player ONE got right " + playerOneScore);
        checkForWinner();

    }
    public void playerTwoCorrectAnswer(){
        playerTwoScore++;
        System.out.println("player ONE got right " + playerTwoScore);
        checkForWinner();

    }

    private void checkForWinner(){
        if (playerOneScore==5){
            System.out.println("Player One Wins!!");
        }

        else if (playerTwoScore == 5){
            System.out.println("Player Two Wins!!");
        }
    }
}