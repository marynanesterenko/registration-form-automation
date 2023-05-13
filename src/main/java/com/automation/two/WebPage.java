package com.automation.two;

public class WebPage {

    private boolean isLoggedIn;
    private String username;
    private String password;
    private String errorMessage;

    public boolean navigate(String page) {
        // code to navigate to the specified page
        if (page.equalsIgnoreCase("login")) {
            System.out.println("Navigating to login page");
            return true;
        } else {
            System.out.println("Invalid page");
            return false;
        }
    }

    public boolean enterUsername(String username) {
        // code to enter the username
        this.username = username;
        if (username.length() > 5) {
            System.out.println("Entering username: " + username);
            return true;
        } else {
            System.out.println("Invalid username");
            return false;
        }
    }

    public boolean enterPassword(String password) {
        // code to enter the password
        this.password = password;
        if (password.length() > 8) {
            System.out.println("Entering password: " + password);
            return true;
        } else {
            System.out.println("Invalid password. Password should be at least 8 characters");
            return false;
        }
    }

    public void submit() {
        // code to submit the form
        if (isLoggedIn) {
            System.out.println("Form already submitted, user already logged in");
        } else {
            if (username.length() > 5 && password.length() > 8) {
                System.out.println("Submitting form");
                isLoggedIn = true;
            } else {
                errorMessage = "Username or password incorrect";
            }
        }
    }

    public boolean isLoggedIn() {
        // code to check if the user is logged in
        return isLoggedIn;
    }

    public String getErrorMessage() {
        // code to get the error message
        return errorMessage;
    }

    public boolean logout() {
        // code to logout the user
        if (isLoggedIn) {
            System.out.println("Logging out user");
            isLoggedIn = false;
            return true;
        } else {
            System.out.println("User is not logged in");
            return false;
        }
    }

    public String getLoginStatus() {
        // code to get the login status
        if (isLoggedIn) {
            return "User is logged in";
        } else {
            return "User is not logged in";
        }
    }
}
