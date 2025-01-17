public class ScopeVariable {
    // Global variable
    static int variable = 10;

    public static void main(String[] args) {
        // Local variable with the same name as the global variable
        int variable = 20;

        System.out.println("Global Variable: " + ScopeVariable.variable);
        System.out.println("Local Variable: " + variable);
    }
}
