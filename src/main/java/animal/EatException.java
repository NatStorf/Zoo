package animal;

import javax.swing.*;

public class EatException extends java.lang.Exception {
    public EatException() {
        System.err.println("Еда не подходит!!");
    }}

