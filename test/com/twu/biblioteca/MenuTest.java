package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {
    @Test
    public void shouldShowMenuItem(){
        Menu menu = new Menu();

        assertEquals("1-Quit App\n2-List of available books\n3-Return a book\n4-List of available movies\n",
                menu.showMenu());
    }

    @Test
    public void shouldOKWhenMenuOptionIsValid(){
        Menu menu = new Menu();
        menu.showMenu();
        menu.setSelectedId(1);

        assertEquals(true, menu.isSelectedIdValid());
    }

    @Test
    public void shouldFalseWhenMenuOptionIsInvalid(){
        Menu menu = new Menu();
        menu.showMenu();
        menu.setSelectedId(33);

        assertEquals(false, menu.isSelectedIdValid());
    }

    @Test
    public void shouldShowErrorWhenSelectedOptionIsString(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(false, menu.isMenuInputOK("ssss"));

    }

    @Test
    public void shouldShowErrorWhenSelectedOptionIsInvalid(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(false, menu.isMenuInputOK("6"));

    }

    @Test
    public void shouldReturnTrueWhenSelectedOptionValid(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(true,menu.isMenuInputOK("1"));

    }

    @Test
    public void shouldReturnTrueWhenSelectedOptionValid2(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(true,menu.isMenuInputOK("2"));

    }

    @Test
    public void shouldReturnTrueWhenSelectedOptionValid3(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(true,menu.isMenuInputOK("3"));

    }

    @Test
    public void shouldReturnTrueWhenSelectedOptionValid4(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();

        assertEquals(true,menu.isMenuInputOK("4"));

    }


    @Test
    public void shouldReturnTrueWhenSelectedOptionIs2(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();
        menu.setSelectedId(2);

        assertEquals(false,menu.isQuitApp());

    }


    @Test
    public void shouldReturnFalseWhenSelectedOptionIs1(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();
        menu.setSelectedId(1);

        assertEquals(true,menu.isQuitApp());

    }

    @Test
    public void shouldReturnFalseWhenSelectedOptionIs3(){
        Menu menu = new Menu();
        menu.setPredefinedMenu();
        menu.setSelectedId(3);

        assertEquals(false,menu.isQuitApp());

    }
}
