package TestKebab;

import kebab.ingredient.*;
import kebab.Assiette;
import kebab.Kebab;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class KebabTest {

    public static final Pain PAIN = new Pain();
    public static final Oignon OIGNON = new Oignon();
    public static final Sauce SAUCE = new Sauce();
    public static final Agneau AGNEAU = new Agneau();
    public static final Tomate TOMATE = new Tomate();
    private static final Salade SALADE = new Salade();
    private static final Crevette CREVETTE = new Crevette();
    private static final Fromage FROMAGE = new Fromage();
    private static final Thon THON = new Thon();

    Kebab kebabAgneau;
    Kebab kebabVegetarien;
    Kebab kebabCrevette;
    Kebab kebabThon;

    @Before
    public void initilisez(){
       kebabAgneau = new Assiette().avec(new Pain()).avec(new Oignon()).avec(new Sauce()).avec(new Agneau()).avec(new Tomate()).confectionnerKebab();
       kebabVegetarien = new Assiette().avec(PAIN).avec(SALADE).avec(TOMATE).avec(OIGNON).avec(SAUCE).confectionnerKebab();
       kebabCrevette = new Assiette().avec(PAIN).avec(TOMATE).avec(OIGNON).avec(CREVETTE).avec(SAUCE).confectionnerKebab();
       kebabThon = new Assiette().avec(PAIN).avec(OIGNON).avec(SAUCE).avec(FROMAGE).avec(TOMATE).avec(THON).confectionnerKebab();
    }

    @Test
    public void un_kebab_contient_bien_tous_les_elements_ajoutes(){
        assertThat(kebabAgneau.listerLesIngredients()).containsExactly(PAIN, OIGNON, SAUCE, AGNEAU, TOMATE);
        assertThat(kebabVegetarien.listerLesIngredients()).containsExactly(PAIN, SALADE, TOMATE, OIGNON, SAUCE);
        assertThat(kebabCrevette.listerLesIngredients()).containsExactly(PAIN, TOMATE, OIGNON, CREVETTE, SAUCE);
        assertThat(kebabThon.listerLesIngredients()).containsExactly(PAIN, OIGNON, SAUCE, FROMAGE, TOMATE, THON);
    }
}
