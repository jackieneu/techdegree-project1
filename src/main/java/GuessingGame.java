public class GuessingGame {
    public static void main(String[] args) {
     
      Prompter prompter = new Prompter();
      
      Jar jar = new Jar(prompter.nameOfItem(), prompter.maxItems());
      int answer = jar.fill();
      
      prompter.guess(answer);

    }
}
