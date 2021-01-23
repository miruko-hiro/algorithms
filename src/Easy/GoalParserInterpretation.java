package Easy;

public class GoalParserInterpretation {
    public String interpret(String command) {
        command = command.replace("()", "o")
                .replace("(", "")
                .replace(")", "");
        return command;
    }

    public static void main(String[] args) {
        var ob = new GoalParserInterpretation();
        String command = "G()(al)";
        System.out.println(ob.interpret(command));
    }
}
