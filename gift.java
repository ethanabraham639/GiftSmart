package windowBuilder.views;

import java.awt.BorderLayout;
import windowBuilder.views.gift;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.awt.event.ActionEvent;


import java.util.ArrayList;
import java.util.Comparator;
public class gift extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Window Builder declarations
	public JPanel contentPane;
	public String modifiedLogo;
	public final ButtonGroup buttonGroup = new ButtonGroup();
	public JTextField txtf_maxgiftprice;
	public final ButtonGroup buttonGroup_1 = new ButtonGroup();
	public static JComboBox<String> comboAge;
	public static JRadioButton rbMale;
	public static JRadioButton rbFemale;
	public JTextField txtf_mingiftprice;
	public static JCheckBox cbSports;
	public static JCheckBox cbClothes;
	public static JCheckBox cbToys;
	public static JCheckBox cbEducation;
	public static JCheckBox cbElectronics;
	public static JCheckBox cbAccesories;
	public static JCheckBox cbHouseItems;
	public JButton btnSearch;
	public static String userAgeRange = "";
	public static String userGender = "";

	
	//gift attribute declarations
	public String name;
	public String gender;
	public String age_range;
	public double price;
	public String type;
	public String link;
	public int score;
	
	
	//Variables
	public static boolean sportsInterest = false;
	public static boolean clothesInterest = false;
	public static boolean toysInterest = false;
	public static boolean educationInterest = false;
	public static boolean electronicsInterest = false;
	public static boolean accesoriesInterest = false;
	public static boolean houseItemsInterest = false;
	public String tempMinGiftPrice;
	public String tempMaxGiftPrice;
	public static double minGiftPrice = 0.0;
	public static double maxGiftPrice = 0.0;
	
	public static ArrayList<gift> gifts = new ArrayList<gift>();
	public static ArrayList<Integer> giftsFinal = new ArrayList<Integer>();
	public static ArrayList<Integer> giftsFinal2 = new ArrayList<Integer>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gift frame = new gift();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		//////////////////////////////////////////Instantiating Objects///////////////////////////////////////////////
		
		//////////////////////////////////////////////////0-4/////////////////////////////////////////////////////////
		
		//Clothes
		gift aG1boysBlanket = new gift("Blanket", "boy", "0-4", 14.97, "clothes", "/0-4_blanket.JPG", 0);

		gift aG1boysSleevedBib = new gift("Sleeved Bib", "boy", "0-4", 22.99, "clothes", "/0-4_sleevedBib.JPG", 0);

		gift aG1boysSocks = new gift("Baby Socks", "boy", "0-4", 9.97, "clothes", "/0-4_babySocks.PNG", 0);

		gift aG1boysHats = new gift("Baby Hats", "boy", "0-4", 7.97, "clothes", "/0-4_babyHats.PNG", 0);

		
		//Educational

		gift aG1boysAlphabetChart = new gift("Alphabet Chart", "boy", "0-4", 7.20, "educational", "/0-4_alphabetChart.PNG", 0);

		gift aG1boysBedtimeStories = new gift("Bedtime Stories", "boy", "0-4", 5.89, "educational", "/0-4_bedtimeStories.PNG", 0);
		
		gift aG1boysPictureBook = new gift("Picture Books", "boy", "0-4", 20.40, "educational", "/0-4_pictureBook.PNG", 0);

		//Toys
		gift aG1boysWalker = new gift("Walker", "boy", "0-4", 56.99, "toys", "/0-4_walker.PNG", 0);

		gift aG1boysStroller = new gift("Stroller", "boy", "0-4", 59.97, "toys", "/0-4_stroller.PNG", 0);

		gift aG1boysExpensiveStroller = new gift("Expensive Stroller", "boy", "0-4", 999.95, "toys", "/0-4_memeStroller.PNG", 0);

		gift aG1boysInfantSeat = new gift("Infant Seat", "boy", "0-4", 47.97, "toys", "/0-4_infantSeat.PNG", 0);

		gift aG1boysCarSeat = new gift("Car Seat", "boy", "0-4", 89.95, "toys", "/0-4_carSeat.PNG", 0);

		gift aG1boysWagon = new gift("Wagon", "boy", "0-4", 105.99, "toys", "/0-4_wagon.PNG", 0);

		gift aG1boysStuffedToy = new gift("Stuffed Toy", "boy", "0-4", 18.99, "toys", "/0-4_stuffedLlama.PNG", 0);

		gift aG1boysTeddyBear = new gift("Teddy Bear", "boy", "0-4", 10.99, "toys", "/0-4_teddyBear.PNG", 0);

		gift aG1boysInstrumentToy = new gift("Toy Instrument", "boy", "0-4", 25.99, "toys", "/0-4_toyPiano.PNG", 0);

		gift aG1boysBeachToys = new gift("Beach Toys", "boy", "0-4", 22.99, "toys", "/0-4_beachToys.PNG", 0);

		//Accessories

		gift aG1boysPacifiers = new gift("Pacifiers", "boy", "0-4", 6.99, "accessories", "/0-4_pacifiers.PNG", 0);


		//0-4 Girls
		//Clothes
		gift aG1girlsBlanket = new gift("Blanket", "girl", "0-4", 14.97, "clothes", "/0-4_blanket.JPG", 0);

		gift aG1girlsSleevedBib = new gift("Sleeved Bib", "girl", "0-4", 22.99, "clothes", "/0-4_sleevedBib.JPG", 0);

		gift aG1girlsSocks = new gift("Baby Socks", "girl", "0-4", 9.97, "clothes", "/0-4_babySocks.PNG", 0);

		gift aG1girlsHats = new gift("Baby Hats", "girl", "0-4", 7.97, "clothes", "/0-4_babyHats.PNG", 0);

		//Educational

		gift aG1girlsAlphabetChart = new gift("Alphabet Chart", "girl", "0-4", 7.20, "educational", "/0-4_alphabetChart.PNG", 0);

		gift aG1girlsBedtimeStories = new gift("Bedtime Stories", "girl", "0-4", 5.89, "educational", "/0-4_bedtimeStories.PNG", 0);
		
		gift aG1girlsPictureBook = new gift("Picture Books", "girl", "0-4", 20.40, "educational", "/0-4_pictureBook.PNG", 0);

		//Toys
		gift aG1girlsWalker = new gift("Walker", "girl", "0-4", 56.99, "toys", "/0-4_walker.PNG", 0);

		gift aG1girlsStroller = new gift("Stroller", "girl", "0-4", 59.97, "toys", "/0-4_stroller.PNG", 0);

		gift aG1girlsExpensiveStroller = new gift("Expensive Stroller", "girl", "0-4", 999.95, "toys", "/0-4_memeStroller.PNG", 0);

		gift aG1girlsInfantSeat = new gift("Infant Seat", "girl", "0-4", 47.97, "toys", "/0-4_infantSeat.PNG", 0);

		gift aG1girlsCarSeat = new gift("Car Seat", "girl", "0-4", 89.95, "toys", "/0-4_carSeat.PNG", 0);

		gift aG1girlsWagon = new gift("Wagon", "girl", "0-4", 105.99, "toys", "/0-4_wagon.PNG", 0);

		gift aG1girlsStuffedToy = new gift("Stuffed Toy", "girl", "0-4", 18.99, "toys", "/0-4_stuffedLlama.PNG", 0);

		gift aG1girlsTeddyBear = new gift("Teddy Bear", "girl", "0-4", 10.99, "toys", "/0-4_teddyBear.PNG", 0);

		gift aG1girlsInstrumentToy = new gift("Toy Instrument", "girl", "0-4", 25.99, "toys", "/0-4_toyPiano.PNG", 0);

		gift aG1girlsBeachToys = new gift("Beach Toys", "girl", "0-4", 22.99, "toys", "/0-4_beachToys.PNG", 0);

		//Accessories

		gift aG1girlsPacifiers = new gift("Pacifiers", "girl", "0-4", 6.99, "accessories", "/0-4_pacifiers.PNG", 0);

		//////////////////////////////////////////////////5-7/////////////////////////////////////////////////////////		
		
		//Electronics
		gift aG2boysWatch = new gift("Watch", "boy", "5-7", 15.97, "electronics", "/5-7_boysWatch.PNG", 0);

		gift aG2boysVtech = new gift("Vtech Toy", "boy", "5-7", 12.59, "electronics", "/5-7_boysVtech.PNG", 0);

		gift aG2boysWalkieTalkie = new gift("Walkie Talkie", "boy", "5-7", 32.99, "electronics", "/5-7_boysWalkieTalkie.PNG", 0);

		//Clothes
		gift aG2boysHats = new gift("Hat", "boy", "5-7", 13.99, "clothes", "/5-7_boysHat.PNG", 0);

		gift aG2boysJackets = new gift("Jacket", "boy", "5-7", 79.99, "clothes", "/5-7_boysJacket.PNG", 0);

		gift aG2boysTShirt = new gift("T-Shirt", "boy", "5-7", 14.68, "clothes", "/5-7_boysT-Shirt.PNG", 0);

		gift aG2boysPJs = new gift("Pajamas" , "boy", "5-7", 12.99, "clothes", "/5-7_boysPJs.PNG", 0);

		gift aG2boysOnesies = new gift("Onesie" , "boy", "5-7", 32.99, "clothes", "/5-7_boysOnesie.PNG", 0);

		//Educational
		gift aG2boysColouringBook = new gift("Colouring Book" , "boy", "5-7", 14.93, "educational", "/5-7_boysColourBooks.PNG", 0);

		gift aG2boysNotebook = new gift("Notebook", "boy", "5-7", 9.99, "educational", "/5-7_boysNotebooks.PNG", 0);

		gift aG2boysPictureBook = new gift("Picture Book", "boy", "5-7", 3.96, "educational", "/5-7_boysPictureBook.PNG", 0);

		gift aG2boysBedtimeStories = new gift("Bedtime Stories", "boy", "5-7", 17.81, "educational", "/5-7_boysBedtimeBooks.PNG", 0);

		//Toys
		gift aG2boysTrain = new gift("Toy Train", "boy", "5-7", 48.50, "toys", "/5-7_boysTrain.PNG", 0);

		gift aG2boysPuzzles = new gift("Puzzles", "boy", "5-7", 34.99, "toys", "/5-7_boysPuzzles.PNG", 0);

		gift aG2boysBicycle = new gift("Bicycle", "boy", "5-7", 200.45, "toys", "/5-7_boysBicycle.PNG", 0);

		gift aG2boysScooter = new gift("Scooter", "boy", "5-7", 63.99, "toys", "/5-7_boysScooter.PNG", 0);

		gift aG2boysLEGO = new gift("LEGO", "boy", "5-7", 21.18, "toys", "/5-7_boysLEGO.PNG", 0);

		gift aG2boysStuffedAnimal = new gift("Stuffed Animal", "boy", "5-7", 48.90, "toys", "/5-7_boysStuffedAnimal.PNG", 0);

		gift aG2boysInflatableTub = new gift("Inflatable Tub", "boy", "5-7", 21.98, "toys", "/5-7_boysInflatableTub.PNG", 0);

		gift aG2boysNerfGun = new gift("Nerf Gun", "boy", "5-7", 4.94, "toys", "/5-7_boysNerfGun.PNG", 0);

		gift aG2boysKineticSand = new gift("Kinetic Sand", "boy", "5-7", 14.99, "toys", "/5-7_boysKineticSand.PNG", 0);

		
		//GIRLS
		
		
		//Electronics
		gift aG2girlsWatch = new gift("Watch", "girl", "5-7", 22.99, "electronics", "/5-7_girlsWatch.PNG", 0);

		gift aG2girlsVtech = new gift("Vtech Toy", "girl", "5-7", 12.59, "electronics", "/5-7_girlsVtech.PNG", 0);

		gift aG2girlsWalkieTalkie = new gift("Walkie Talkie", "girl", "5-7", 32.99, "electronics", "/5-7_girlsWalkieTalkie.PNG", 0);

		//Clothes
		gift aG2girlsScrunchie = new gift("Scrunchie", "girl", "5-7", 12.99, "clothing", "/5-7_girlsScrunchies.PNG", 0);

		gift aG2girlsHat = new gift("Hat", "girl", "5-7", 11.99, "clothing", "/5-7_girlsHats.PNG", 0);

		gift aG2girlsJacket = new gift("Jacket", "girl", "5-7", 30.97, "clothing", "/5-7_girlsJackets.PNG", 0);

		//Accessories
		gift aG2girlsShoes = new gift("Shoes", "girl", "5-7", 32.71, "accessories", "/5-7_girlsShoes.PNG", 0);

		//Education
		gift aG2girlsColouringBook = new gift("Colouring Book", "girl", "5-7", 14.93, "education", "/5-7_girlsColourBooks.PNG", 0);

		gift aG2girlsNotebook = new gift("Notebook", "girl", "5-7", 9.99, "education", "/5-7_girlsNotebooks.PNG", 0);

		gift aG2girlsPictureBook = new gift("Picture Book", "girl", "5-7", 3.96, "education", "/5-7_girlsPictureBook.PNG", 0);

		gift aG2girlsBedtimeStories = new gift("Bedtime Stories", "girl", "5-7", 17.81, "education", "/5-7_girlsBedtimeBooks.PNG", 0);

		gift aG2girlsStickers = new gift("Stickers", "girl", "5-7", 8.99, "education", "/5-7_girlsStickers.PNG", 0);

		gift aG2girlsWatercolourSet = new gift("Watercolour Set", "girl", "5-7", 29.95, "education", "/5-7_girlsWatercolorSet.PNG", 0);

		gift aG2girlsWaterMarkers = new gift("Water Markers", "girl", "5-7", 22.99, "education", "/5-7_girlsWaterMarkers.PNG", 0);
		
		//Toys
		gift aG2girlsBarbies = new gift("Barbies", "girl", "5-7", 21.84, "toys", "/5-7_girlsBarbies.PNG", 0);

		gift aG2girlsPollyPockets = new gift("Polly Pockets", "girl", "5-7", 24.95, "toys", "/5-7_girlsPollyPockets.PNG", 0);

		gift aG2girlsStuffedAnimal = new gift("Stuffed Animal", "girl", "5-7", 48.90, "toys", "/5-7_girlsStuffedAnimal.PNG", 0);

		gift aG2girlsBicycle = new gift("Bicycle", "girl", "5-7", 112.28, "toys", "/5-7_girlsBicycle.PNG", 0);

		gift aG2girlsScooter = new gift("Scooter", "girl", "5-7", 63.99, "toys", "/5-7_girlsScooter.PNG", 0);

		gift aG2girlsPuzzles = new gift("Puzzles", "girl", "5-7", 34.99, "toys", "/5-7_girlsPuzzles.PNG", 0);

		gift aG2girlsLEGO = new gift("LEGO", "girl", "5-7", 21.18, "toys", "/5-7_girlsLEGO.PNG", 0);

		gift aG2girlsKineticSand = new gift("Kinetic Sand", "girl", "5-7", 14.99, "toys", "/5-7_girlsKineticSand.PNG", 0);

		//////////////////////////////////////////////////////////////8-12/////////////////////////////////////////////////////////////////////////////
		
		//BOYS
		
		//Electronics
		gift aG3boysiPad = new gift("iPad", "boy", "8-12", 441.57, "electronics", "/8-12_boysiPad.PNG", 0);

		gift aG3boysElectricToothbrush = new gift("Electric Toothbrush", "boy", "8-12", 24.99, "electronics", "/8-12_boysElectricToothbrush.PNG", 0);

		gift aG3boysArduino = new gift("Arduino Kit", "boy", "8-12", 35.99, "electronics", "/8-12_boysArduino.PNG", 0);

		//Food
		gift aG3boysChocolate = new gift("Chocolate", "boy", "8-12", 26.25, "food", "/8-12_boysChocolate.PNG", 0);

		//Toys
		gift aG3boysMazeBook = new gift("Maze Book", "boy", "8-12", 2.75, "toys", "/8-12_boysCoolBook.PNG", 0);

		gift aG3boysBicycle = new gift("Bicycle", "boy", "8-12", 203.33, "toys", "/8-12_boysBike.PNG", 0);

		gift aG3boysToyCar = new gift("Toy Car", "boy", "8-12", 22.96, "toys", "/8-12_boysToyCar.PNG", 0);

		gift aG3boysActionFigure = new gift("Action Figure", "boy", "8-12", 12.97, "toys", "/8-12_boysActionFigure.PNG", 0);

		gift aG3boysLEGO = new gift("LEGO", "boy", "8-12", 69.99, "toys", "/8-12_boysLEGO.PNG", 0);

		gift aG3boysConnect4 = new gift("Connect 4", "boy", "8-12", 14.97, "toys", "/8-12_boysConnect4.PNG", 0);

		gift aG3boysMonopoly = new gift("Monopoly", "boy", "8-12", 19.93, "toys", "/8-12_boysMonopoly.PNG", 0);

		gift aG3boysUno = new gift("UNO", "boy", "8-12", 6.93, "toys", "/8-12_boysUNO.PNG", 0);

		gift aG3boysSoccerBall = new gift("Soccer Ball", "boy", "8-12", 24.99, "toys", "/8-12_boysSoccerBall.PNG", 0);

		gift aG3boysBasketball = new gift("Basketball", "boy", "8-12", 36.18, "toys", "/8-12_boysBasketball.PNG", 0);

		gift aG3boysSkateboard = new gift("Skateboard", "boy", "8-12", 52.53, "toys", "/8-12_boysSkateboard.PNG", 0);

		gift aG3boysRubiksCube = new gift("Rubik’s Cube", "boy", "8-12", 14.99, "toys", "/8-12_boysRubik’sCube.PNG", 0);

		gift aG3boysPokemonCards = new gift("Pokemon Cards", "boy", "8-12", 17.95, "toys", "/8-12_boysPokemonCards.PNG", 0);

		gift aG3boysNerfGuns = new gift("Nerf Gun", "boy", "8-12", 39.99, "toys", "/8-12_boysNerfGun.PNG", 0);

		//Education
		gift aG3boysHarryPotter = new gift("Harry Potter", "boy", "8-12", 63.30, "education", "/8-12_boysHarryPotter.PNG", 0);

		gift aG3boysMagicTreehouse= new gift("Magic Tree House", "boy", "8-12", 27.64, "education", "/8-12_boysMagicTreehouse.PNG", 0);

		gift aG3boysPercyJackson = new gift("Percy Jackson", "boy", "8-12", 35.00, "education", "/8-12_boysPercyJackson ", 0);

		gift aG3boysWimpyKid = new gift("Diary of a Wimpy Kid", "boy", "8-12", 99.78, "education", "/8-12_boysWimpyKid.PNG", 0);



		//8-12 Girls
		//Electronics
		gift aG3girlsiPad = new gift("iPad", "girl", "8-12", 441.57, "electronics", "/8-12_girlsiPad.PNG", 0);

		gift aG3girlsElectricToothbrush = new gift("Electric Toothbrush", "girl", "8-12", 24.99, "electronics", "/8-12_girlsElectricToothbrush.PNG", 0);

		gift aG3girlsArduino = new gift("Arduino Kit", "boy", "8-12", 35.99, "electronics", "/8-12_girlsArduino.PNG", 0);

		//Food
		gift aG3girlsChocolate = new gift("Chocolate", "girls", "8-12", 26.25, "food", "/8-12_girlsChocolate.PNG", 0);

		//Accessory
		gift aG3girlsScrunchie = new gift("Scrunchie", "girls", "8-12", 12.99, "accessory", "/8-12_girlsScrunchies.PNG", 0);

		gift aG3girlsHairBands = new gift("Hair Bands", "girls", "8-12", 11.88, "accessory", "/8-12_girlsHairbands.PNG", 0);

		gift aG3girlsLipBalm = new gift("Lip Balm", "girls", "8-12", 3.97, "accessory", "/8-12_girlsLipBalm.PNG", 0);

		//Toys
		gift aG3girlsMazeBook = new gift("Maze Book", "girl", "8-12", 2.75, "toys", "/8-12_girlsCoolBook.PNG", 0);

		gift aG3girlsBarbie = new gift("Barbie", "girl", "8-12", 30.54, "toys", "/8-12_girlsBarbie.PNG", 0);

		gift aG3girlsUnicorn = new gift("Unicorn", "girl", "8-12", 21.77, "toys", "/8-12_girlsUnicorn.PNG", 0);

		gift aG3girlsPokemonCards = new gift("Pokemon Cards", "girl", "8-12", 17.95, "toys", "/8-12_girlsPokemonCards.PNG", 0);

		gift aG3girlsLEGO = new gift("LEGO", "girl", "8-12", 13.99, "toys", "/8-12_girlsLEGO.PNG", 0);

		gift aG3girlsSkateboard = new gift("Skateboard", "girl", "8-12", 32.99, "toys", "/8-12_girlsSkateboard.PNG", 0);

		gift aG3girlsSnowGlobes = new gift("Snow Globe", "girl", "8-12", 24.99, "toys", "/8-12_girlsSnowGlobes.PNG", 0);

		gift aG3girlsUNO = new gift("UNO", "girl", "8-12", 6.93, "toys", "/8-12_girlsUNO.PNG", 0);

		gift aG3girlsConnect4 = new gift("Connect 4", "girl", "8-12", 14.97, "toys", "/8-12_girlsConnect4.PNG", 0);

		gift aG3girlsMonopoly = new gift("Monopoly", "girl", "8-12", 19.93, "toys", "/8-12_girlsMonopoly.PNG", 0);

		gift aG3girlsToyCar = new gift("Toy Car", "girl", "8-12", 22.96, "toys", "/8-12_girlsToyCar.PNG", 0);

		//Art Supplies
		gift aG3girlsColouringBook = new gift("Colouring Books", "girl", "8-12", 8.99, "supplies", "/8-12_girlsColorBook.PNG", 0);

		gift aG3girlsGlitter = new gift("Glitter", "girl", "8-12", 9.99, "toys", "/8-12_girlsGlitter.PNG", 0);

		//Books
		gift aG3girlsHarryPotter = new gift("Harry Potter", "girl", "8-12", 63.30, "books", "/8-12_girlsHarryPotter.PNG", 0);

		gift aG3girlsMagicTreeHouse = new gift("Magic Tree House", "girl", "8-12", 27.64, "books", "/8-12_girlsMagicTreehouse.PNG", 0);

		gift aG3girlsPercyJackson = new gift("Percy Jackson", "girl", "8-12", 35.00, "books", "/8-12_girlsHarryPotter.PNG", 0);

		gift aG3girlsWimpyKid = new gift("Diary of a Wimpy Kid", "girl", "8-12", 99.78, "books", "/8-12_girlsWimpyKid.PNG", 0);

		//13-16 Boys
		//Electronics
		gift aG4boysPS4 = new gift("PS4", "boy", "13-16", 374.99, "electronics", "/13-16_boysPS4.PNG", 0);

		gift aG4boysXbox = new gift("Xbox", "boy", "13-16", 314.99, "electronics", "/13-16_boysXbox.PNG", 0);

		gift aG4boysGoogleHome = new gift("Google Home", "boy", "13-16", 49.99, "electronics", "/13-16_boysGoogleHome.PNG", 0);

		gift aG4boysNintendoSwitch = new gift("Nintendo Switch", "boy", "13-16", 399.95, "electronics", "/13-16_boysNintendoSwitch.PNG", 0);

		gift aG4boysHeadphones = new gift("Headphones", "boy", "13-16", 79.99, "electronics", "/13-16_boysHeadphones.PNG", 0);

		gift aG4boysEarbuds = new gift("Earbuds", "boy", "13-16", 16.98, "electronics", "/13-16_boysEarbuds.PNG", 0);

		gift aG4boysLaptop = new gift("Laptop", "boy", "13-16", 369.99, "electronics", "/13-16_boysLaptop.PNG", 0);

		gift aG4boysArduino = new gift("Arduino Kit", "boy", "13-16", 35.99, "electronics", "/13-16_boysArduino.PNG", 0);

		//Clothes
		gift aG4boysHoodie = new gift("Hoodie", "boy", "13-16", 61.87, "clothes", "/13-16_boysHoodie.PNG", 0);

		gift aG4boysShirts = new gift("T-Shirts", "boy", "13-16", 15.99, "clothes", "/13-16_boysT-Shirt.PNG", 0);

		//Accessories
		gift aG4boysShoes = new gift("Shoes", "boy", "13-16", 170.01, "accessories", "/13-16_boysShoes.PNG", 0);

		gift aG4boysScarves = new gift("Scarves", "boy", "13-16", 48.00, "accessories", "/13-16_boysScarf.PNG", 0);

		gift aG4boysSunglasses = new gift("Sunglasses", "boy", "13-16", 24.99, "accessories", "/13-16_boysSunglasses.PNG", 0);

		gift aG4boysChains = new gift("Chains", "boy", "13-16", 21.59, "accessories", "/13-16_boysChains.PNG", 0);

		gift aG4boysHat = new gift("Hat", "boy", "13-16", 13.99, "accessories", "/13-16_boysHat.PNG", 0);

		//Toys
		gift aG4boysHoverboard = new gift("Hoverboard", "boy", "13-16", 199.99, "toys", "/13-16_boysHoverboard.PNG", 0);

		gift aG4boysBasketball = new gift("Basketball", "boy", "13-16", 36.18, "toys", "/13-16_boysBasketball.PNG", 0);

		gift aG4boysTableTennis = new gift("Table Tennis Table", "boy", "13-16", 383.82, "toys", "/13-16_boysTableTennisTable.PNG", 0);

		gift aG4boysBicycle= new gift("Bicycle", "boy", "13-16", 251.72, "toys", "/13-16_boysBicycle.PNG", 0);

		gift aG4boysConnect4 = new gift("Connect 4", "boy", "13-16", 14.97, "toys", "/13-16_boysConnect4.PNG", 0);

		gift aG4boysMonopoly = new gift("Monopoly", "boy", "13-16", 19.93, "toys", "/13-16_boysMonopoly.PNG", 0);

		gift aG4boysUNO = new gift("UNO", "boy", "13-16", 6.93, "toys", "/13-16_boysUNO.PNG", 0);

		//Music
		gift aG4boysPiano = new gift("Piano", "boy", "13-16", 1820.00, "music", "/13-16_boysPiano.PNG", 0);

		gift aG4boysGuitar = new gift("Guitar", "boy", "13-16", 179.99, "music", "/13-16_boysGuitar.PNG", 0);

		//Education
		gift aG4boysPencils = new gift("Pencils", "boy", "13-16", 11.99, "educational", "/13-16_boysPencil.PNG", 0);

		gift aG4boysAlexRider = new gift("Alex Rider", "boy", "13-16", 53.76, "educational", "/13-16_boysAlexRider.PNG", 0);

		gift aG4boysErasable = new gift("Erasable Pens", "boy", "13-16", 26.65, "educational", "/13-16_boysErasablePens.PNG", 0);

		gift aG4boysNotebook = new gift("Notebook", "boy", "13-16", 46.99, "educational:", "/13-16_boysNotebook.PNG", 0);

		//13-16 Girls
		//Electronics
		gift aG4girlsPS4 = new gift("PS4", "girl", "13-16", 374.99, "electronics", "/13-16_girlsPS4.PNG", 0);

		gift aG4girlsXbox = new gift("Xbox", "girl", "13-16", 314.99, "electronics", "/13-16_girlsXbox.PNG", 0);

		gift aG4girlsGoogleHome = new gift("Google Home", "girl", "13-16", 49.99, "electronics", "/13-16_girlsGoogleHome.PNG", 0);

		gift aG4girlsNintendoSwitch = new gift("Nintendo Switch", "girl", "13-16", 399.95, "electronics", "/13-16_girlsNintendoSwitch.PNG", 0);

		gift aG4girlsHeadphones = new gift("Headphones", "girl", "13-16", 79.99, "electronics", "/13-16_girlsHeadphones.PNG", 0);

		gift aG4girlsEarbuds = new gift("Earbuds", "girl", "13-16", 16.98, "electronics", "/13-16_girlsEarbuds.PNG", 0);

		gift aG4girlsLaptop = new gift("Laptop", "girl", "13-16", 369.99, "electronics", "/13-16_girlsLaptop.PNG", 0);

		gift aG4girlsArduino = new gift("Arduino Kit", "girl", "13-16", 35.99, "electronics", "/13-16_girlsArduino.PNG", 0);

		//Clothes


		gift aG4girlsHoodies = new gift("Hoodie", "girl", "13-16", 36.35, "clothes", "/13-16_girlsHoodie.PNG", 0);

		gift aG4girlsSocks = new gift("Socks", "girl", "13-16", 9.48, "clothes", "/13-16_girlsSocks.PNG", 0);

		gift aG4girlsTShirt = new gift("T-Shirt", "girl", "13-16", 6.57, "clothes", "/13-16_girlsTShirt.PNG", 0);

		gift aG4girlsDress = new gift("Dress", "girl","13-16", 37.99, "clothes", "/13-16_girlsDress.PNG", 0);

		gift aG4girlsHat = new gift("Hat", "girl","13-16", 15.96, "clothes", "/13-16_girlsHat.PNG", 0);

		gift aG4girlsScarf = new gift("Scarf", "girl","13-16", 18.99, "clothes", "/13-16_girlsScarf.PNG", 0);

		//Accessories
		gift aG4girlsShoes = new gift("Shoes", "girl","13-16", 100.74, "accessories", "/13-16_girlsShoes.PNG", 0);

		gift aG4girlsBoots = new gift("Boots", "girl","13-16", 298.77, "accessories", "/13-16_girlsBoots.PNG", 0);

		gift aG4girlsMakeupSet = new gift("Makeup Set", "girl","13-16", 23.13, "accessories", "/13-16_girlsMakeupSet.PNG", 0);

		gift aG4girlsCream = new gift("Skin Cream Set", "girl","13-16", 49.75, "accessories", "/13-16_girlsCream.PNG", 0);

		gift aG4girlsScentedCandles = new gift("Scented Candles", "girl","13-16", 47.08, "accessories", "/13-16_girlsCandles.PNG", 0);

		gift aG4girlsLipBalm = new gift("Lip Balm", "girl","13-16", 8.99, "accessories", "/13-16_girlsLipBalm.PNG", 0);

		gift aG4girlsHairTies = new gift("Hair Ties", "girl","13-16", 8.99, "accessories", "/13-16_girlsHairTies.PNG", 0);

		//Toys
		gift aG4girlsHoverboard = new gift("Hoverboard", "girl","13-16", 199.99, "toys", "/13-16_girlsHoverboard.PNG", 0);

		gift aG4girlsConnect4 = new gift("Connect 4", "girl","13-16", 14.97, "toys", "/13-16_girlsConnect4.PNG", 0);

		gift aG4girlsMonopoly = new gift("Monopoly", "girl","13-16", 19.93, "toys", "/13-16_girlsMonopoly.PNG", 0);

		gift aG4girlsUNO = new gift("UNO", "girl","13-16", 6.93, "toys", "/13-16_girlsUNO.PNG", 0);

		gift aG4girlsPlush = new gift("Stuffed Rabbit", "girl","13-16", 30.00, "toys", "/13-16_girlsPlushDoll.PNG", 0);

		gift aG4girlsTableTennis = new gift("Table Tennis Table", "girl","13-16", 383.82, "toys", "/13-16_girlsTableTennisTable.PNG", 0);

		//Music
		gift aG4girlsPiano = new gift("Piano", "girl","13-16", 1820.00, "music", "/13-16_girlsPiano.PNG", 0);

		gift aG4girlsGuitar = new gift("Guitar", "girl","13-16", 179.99, "music", "/13-16_girlsGuitar.PNG", 0);

		//Education
		gift aG4girlsPencils = new gift("Pencils", "girl","13-16", 11.99, "educational", "/13-16_girlsPencils.PNG", 0);

		gift aG4girlsNotebook = new gift("Notebook", "girl","13-16", 46.99, "educational", "/13-16_girlsNotebook.PNG", 0);

		//17-25 Boys
		//Electronics
		gift aG5boysHeadphones = new gift("Headphones", "boy","17-25", 79.99, "electronics", "/17-25_boysHeadphones.PNG", 0);

		gift aG5boysEarbuds = new gift("Earbuds", "boy","17-25", 16.98, "electronics", "/17-25_boysEarbuds.PNG", 0);

		gift aG5boysAirPods = new gift("AirPods", "boy","17-25", 219.99, "electronics", "/17-25_boysAirPods.PNG", 0);

		gift aG5boysPhone = new gift("iPhone 11", "boy","17-25", 979.99, "electronics", "/17-25_boysiPhone.PNG", 0);

		gift aG5boysLaptop = new gift("Macbook", "boy","17-25", 1199.99, "electronics", "/17-25_boysLaptop.PNG", 0);

		gift aG5boysCamera = new gift("Camera", "boy","17-25", 468.98, "electronics", "/17-25_boysCamera.PNG", 0);

		//Clothes
		gift aG5boysShoes = new gift("Shoes", "boy","17-25", 74.64, "clothes", "/17-25_boysShoes.PNG", 0);

		gift aG5boysTShirt = new gift("T-Shirt", "boy","17-25", 32.99, "clothes", "/17-25_boysTShirt.PNG", 0);

		gift aG5boysHoodie = new gift("Hoodies", "boy","17-25", 65.00, "clothes", "/17-25_boysHoodies.PNG", 0);

		gift aG5boysTies = new gift("Ties", "boy","17-25", 29.99, "clothes", "/17-25_boysTies.PNG", 0);

		//Accessories
		gift aG5boysBackpack = new gift("Backpack", "boy","17-25", 56.99, "accessories", "/17-25_boysBackpack.PNG", 0);

		gift aG5boysFitBit = new gift("FitBit", "boy","17-25", 107.55, "accessories", "/17-25_boysFitBit.PNG", 0);

		gift aG5boysAppleWatch = new gift("Apple Watch", "boy","17-25", 219.99, "accessories", "/17-25_boysAppleWatch.PNG", 0);

		gift aG5boysPerfume = new gift("Cologne", "boy","17-25", 119.99, "accessories", "/17-25_boysPerfume.PNG", 0);

		gift aG5boysScarf = new gift("Scarf", "boy","17-25", 23.99, "accessories", "/17-25_boysScarf.PNG", 0);

		gift aG5boysDeodorant = new gift("Deodorant Pack", "boy","17-25", 42.97, "accessories", "/17-25_boysDeodorant.PNG", 0);

		gift aG5boysShavingKit = new gift("Shaving Kit", "boy","17-25", 32.99, "accessories", "/17-25_boysShavingSet.PNG", 0);

		gift aG5boysAntiques = new gift("Antique", "boy","17-25", 49.99, "accessories", "/17-25_boysAntique.PNG", 0);

		gift aG5boysPainting = new gift("Paintings", "boy","17-25", 25.90, "accessories", "/17-25_boysPaintings.PNG", 0);

		gift aG5boysMug = new gift("Mug", "boy","17-25", 20.99, "accessories", "/17-25_boysMugs.PNG", 0);

		//Music
		gift aG5boysSpeaker = new gift("Speaker", "boy","17-25", 29.99, "music", "/17-25_boysSpeaker.PNG", 0);

		gift aG5boysGuitar = new gift("Guitar", "boy","17-25", 179.99, "music", "/17-25_boysGuitar.PNG", 0);

		gift aG5boysPiano = new gift("Piano", "boy","17-25", 5000.00, "music", "/17-25_boysPiano.PNG", 0);

		//Education
		gift aG5boysNovel = new gift("Novels", "boy","17-25", 29.99, "educational", "/17-25_boysBook.PNG", 0);

		gift aG5boysStylusPen = new gift("Stylus Pen", "boy","17-25", 34.69, "educational", "/17-25_boysStylusPencil.PNG", 0);

		//17-25 Girls
		//Electronics
		gift aG5girlsHeadphones = new gift("Headphones", "girl", "17-25", 79.99, "electronics", "/17-25_girlsHeadphones.PNG", 0);

		gift aG5girlsEarbuds = new gift("Earbuds", "girl", "17-25", 16.98, "electronics", "/17-25_girlsEarbuds.PNG", 0);

		gift aG5girlsAirPods = new gift("AirPods", "girl", "17-25", 219.99, "electronics", "/17-25_girlsAirPods.PNG", 0);

		gift aG5girlsPhone = new gift("iPhone 11", "girl", "17-25", 979.99, "electronics", "/17-25_girlsiPhone.PNG", 0);

		gift aG5girlsLaptop = new gift("Macbook", "girl", "17-25", 1199.99, "electronics", "/17-25_girlsLaptop.PNG", 0);

		gift aG5girlsCamera = new gift("Camera", "girl", "17-25", 468.98, "electronics", "/17-25_girlsCamera.PNG", 0);

		//Clothes
		gift aG5girlsDress = new gift("Dress", "girl", "17-25", 154.00, "clothes", "/17-25_girlsDress.PNG", 0);

		//Accessories
		gift aG5girlsFitBit = new gift("FitBit", "girl", "17-25", 107.55, "accessories", "/17-25_girlsFitBit.PNG", 0);

		gift aG5girlsScarf = new gift("Scarf", "girl", "17-25", 11.99, "accessories", "/17-25_girlsScarves.PNG", 0);

		gift aG5girlsMakeupSet = new gift("Makeup Brushes", "girl", "17-25", 17.99, "accessories", "/17-25_girlsMakeup.PNG", 0);

		gift aG5girlsShoes = new gift("Shoes", "girl", "17-25", 33.99, "accessories", "/17-25_girlsShoes.PNG", 0);

		gift aG5girlsHandbags = new gift("Handbags", "girl", "17-25", 29.99, "accessories", "/17-25_girlsHandbags.PNG", 0);

		gift aG5girlsHandbagSet = new gift("Handbag Set", "girl", "17-25", 58.99, "accessories", "/17-25_girlsHandbagSet.PNG", 0);

		gift aG5girlsShampoo = new gift("Shampoo", "girl", "17-25", 8.98, "accessories", "/17-25_girlsShampoo.PNG", 0);

		gift aG5girlsCandles = new gift("Scented Candles", "girl", "17-25", 47.08, "accessories", "/17-25_girlsCandles.PNG", 0);

		gift aG5girlsCreams = new gift("Skin Cream Set", "girl", "17-25", 49.75, "accessories", "/17-25_girlsCream.PNG", 0);

		gift aG5girlsSoap = new gift("Soap Set", "girl", "17-25", 44.82, "accessories", "/17-25_girlsSoap.PNG", 0);

		gift aG5girlsNecklace = new gift("Necklace", "girl", "17-25", 79.99, "accessories", "/17-25_girlsNecklace.PNG", 0);

		gift aG5girlsPerfume = new gift("Perfume", "girl", "17-25", 126.00, "accessories", "/17-25_girlsPerfume.PNG", 0);

		gift aG5girlsAntique = new gift("Antique", "girl", "17-25", 59.95, "accessories", "/17-25_girlsVase.PNG", 0);

		gift aG5girlsPainting = new gift("Paintings", "girl", "17-25", 25.90, "accessories", "/17-25_girlsPaintings.PNG", 0);

		gift aG5girlsMug = new gift("Mugs", "girl", "17-25", 20.99, "accessories", "/17-25_girlsMugs.PNG", 0);

		//Music
		gift aG5girlsSpeaker = new gift("Speaker", "girl", "17-25", 29.99, "music", "/17-25_girlsSpeaker.PNG", 0);

		gift aG5girlsGuitar = new gift("Guitar", "girl", "17-25", 179.99, "music", "/17-25_girlsGuitar.PNG", 0);

		gift aG5girlsPiano = new gift("Piano", "girl", "17-25", 5000.00, "music", "/17-25_girlsPiano.PNG", 0);

		//Education
		gift aG5girlsNovel = new gift("Novel", "girl", "17-25", 21.78, "educational", "/17-25_girlsBook.PNG", 0);

		gift aG5girlsStylusPen = new gift("Stylus Pen", "girl", "17-25", 34.69, "educational", "/17-25_girlsStylusPencil.PNG", 0);

		//26-35 Boys
		//Electronics
		gift aG6boysAppleWatch = new gift("Apple Watch", "boy","26-35", 219.99, "electronics", "/26-35_boysAppleWatch.PNG", 0);

		gift aG6boysPhone = new gift("iPhone 11", "boy","26-35", 979.99, "electronics", "/26-35_boysiPhone.PNG", 0);

		gift aG6boysLaptop = new gift("Macbook", "boy","26-35", 1199.99, "electronics", "/26-35_boysLaptop.PNG", 0);

		gift aG6boysRiceCooker = new gift("Rice Cooker", "boy","26-35", 49.98, "electronics", "/26-35_boysRiceCooker.PNG", 0);

		gift aG6boysToaster = new gift("Toaster", "boy","26-35", 49.99, "electronics", "/26-35_boysToaster.PNG", 0);

		//Clothes
		gift aG6boysTies = new gift("Ties", "boy","26-35", 29.99, "clothes", "/26-35_boysTies.PNG", 0);

		gift aG6boysJersey = new gift("Jersey", "boy","26-35", 58.34, "clothes", "/26-35_boysJersey.PNG", 0);

		//Accessories
		gift aG6boysCookwareSet = new gift("Cookware Set", "boy","26-35", 71.99, "accessories", "/26-35_boysCookwareSet.PNG", 0);

		gift aG6boysShavingKit = new gift("Shaving Kit", "boy","26-35", 29.96, "accessories", "/26-35_boysShavingSet.PNG", 0);

		gift aG6boysPerfume = new gift("Cologne", "boy","26-35", 32.89, "accessories", "/26-35_boysPerfume.PNG", 0);

		gift aG6boysWallet = new gift("Wallet", "boy","26-35", 30.89, "accessories", "/26-35_boysWallet.PNG", 0);

		gift aG6boysSunglasses = new gift("Sunglasses", "boy","26-35", 213.00, "accessories", "/26-35_boysSunglasses.PNG", 0);

		gift aG6boysScarf = new gift("Scarf", "boy","26-35", 26.87, "accessories", "/26-35_boysScarves.PNG", 0);

		gift aG6boysSleepMask = new gift("Sleep Mask", "boy","26-35", 12.99, "accessories", "/26-35_boysSleepMask.PNG", 0);

		//Food
		gift aG6boysWine = new gift("Red Wine", "boy","26-35", 8.45, "food", "/26-35_boysWine.PNG", 0);

		gift aG6boysChocolate = new gift("Chocolate", "boy","26-35", 9.98, "food", "/26-35_boysChocolate.PNG", 0);

		//House Items
		gift aG6boysPainting = new gift("Painting", "boy","26-35", 74.99, "house items", "/26-35_boysPainting.PNG", 0);

		gift aG6boysAntique = new gift("Antique", "boy","26-35", 19.99, "house items", "/26-35_boysAntique.PNG", 0);

		gift aG6boysCookingDish = new gift("Cooking Dish", "boy","26-35", 60.29, "house items", "/26-35_boysCookingDish.PNG", 0);

		gift aG6boysHeater = new gift("Heater", "boy","26-35", 38.99, "house items", "/26-35_boysHeater.PNG", 0);

		gift aG6boysGlassSet = new gift("Glass Set", "boy","26-35", 18.95, "house items", "/26-35_boysGlassSet.PNG", 0);

		gift aG6boysGlassware = new gift("Glassware", "boy","26-35", 44.16, "house items", "/26-35_boysGlassware.PNG", 0);

		gift aG6boysCutlerySet = new gift("Cutlery Set", "boy","26-35", 28.99, "house items", "/26-35_boysCutlerySet.PNG", 0);

		gift aG6boysTableTennis = new gift("Table Tennis Table", "boy","26-35", 383.82, "house items", "/26-35_boysTableTennis.PNG", 0);

		//26-35 Girls
		//Electronics
		gift aG6girlsAppleWatch = new gift("Apple Watch", "girl","26-35", 219.99, "electronics", "/26-35_girlsAppleWatch.PNG", 0);

		gift aG6girlsPhone = new gift("iPhone 11", "girl","26-35", 979.99, "electronics", "/26-35_girlsiPhone.PNG", 0);

		gift aG6girlsLaptop = new gift("Macbook", "girl","26-35", 1199.99, "electronics", "/26-35_girlsLaptop.PNG", 0);

		gift aG6girlsRiceCooker = new gift("Rice Cooker", "girl","26-35", 49.98, "electronics", "/26-35_girlsRiceCooker.PNG", 0);

		gift aG6girlsToaster = new gift("Toaster", "girl","26-35", 49.99, "electronics", "/26-35_girlsToaster.PNG", 0);

		//Clothes
		gift aG6girlsSweatshirt = new gift("Sweatshirt", "girl","26-35", 28.99, "clothes", "/26-35_girlsSweatshirt.PNG", 0);

		//Accessories
		gift aG6girlsCookwareSet = new gift("Cookware Set", "girl","26-35", 71.99, "accessories", "/26-35_girlsCookwareSet.PNG", 0);

		gift aG6girlsMakeupSet = new gift("Makeup Set", "girl","26-35", 22.14, "accessories", "/26-35_girlsMakeupSet.PNG", 0);

		gift aG6girlsSunglasses = new gift("Sunglasses", "girl","26-35", 188.00, "accessories", "/26-35_girlsSunglasses.PNG", 0);

		gift aG6girlsHandCream = new gift("Hand Cream", "girl","26-35", 7.29, "accessories", "/26-35_girlsHandCream.PNG", 0);

		gift aG6girlsPerfume = new gift("Perfume", "girl","26-35", 23.79, "accessories", "/26-35_girlsPerfume.PNG", 0);

		gift aG6girlsToiletryBag = new gift("Toiletry Bag", "girl","26-35", 15.99, "accessories", "/26-35_girlsToiletryBag.PNG", 0);

		gift aG6girlsBoots = new gift("Boots", "girl","26-35", 49.95, "accessories", "/26-35_girlsBoots.PNG", 0);

		gift aG6girlsSleepMask = new gift("Sleep Mask", "girl","26-35", 12.99, "accessories", "/26-35_girlsSleepMask.PNG", 0);

		gift aG6girlsHandbags = new gift("Handbags", "girl","26-35", 29.99, "accessories", "/26-35_girlsHandbags.PNG", 0);

		gift aG6girlsScarf = new gift("Scarf", "girl","26-35", 13.99, "accessories", "/26-35_girlsScarves.PNG", 0);

		gift aG6girlsSkinCare = new gift("Skin Care", "girl","26-35", 26.97, "accessories", "/26-35_girlsSkinCare.PNG", 0);

		//Food
		gift aG6girlsWine = new gift("Red Wine", "girl","26-35", 8.45, "food", "/26-35_girlsWine.PNG", 0);

		gift aG6girlsChocolate = new gift("Chocolate", "girl","26-35", 9.98, "food", "/26-35_girlsChocolate.PNG", 0);

		//House Items
		gift aG6girlsPainting = new gift("Painting", "girl","26-35", 74.99, "house items", "/26-35_girlsPainting.PNG", 0);

		gift aG6girlsAntique = new gift("Antique", "girl","26-35", 19.99, "house items", "/26-35_girlsAntique.PNG", 0);

		gift aG6girlsCookingDish = new gift("Cooking Dish", "girl","26-35", 60.29, "house items", "/26-35_girlsCookingDish.PNG", 0);

		gift aG6girlsHeater = new gift("Heater", "girl","26-35", 38.99, "house items", "/26-35_girlsHeater.PNG", 0);

		gift aG6girlsGlassSet = new gift("Glass Set", "girl","26-35", 18.95, "house items", "/26-35_girlsGlassSet.PNG", 0);

		gift aG6girlsGlassware = new gift("Glassware", "girl","26-35", 44.16, "house items", "/26-35_girlsGlassware.PNG", 0);

		gift aG6girlsCutlerySet = new gift("Cutlery Set", "girl","26-35", 28.99, "house items", "/26-35_girlsCutlerySet.PNG", 0);

		gift aG6girlsTableTennis = new gift("Table Tennis Table", "girl","26-35", 383.82, "house items", "/26-35_girlsTableTennis.PNG", 0);

		//36-45 Boys

		//Electronics

		gift aG7boysPhotoPrinter = new gift("Photo Printer", "boy", "36-45", 149.99, "electronics", "/36-45_boysPhotoPrinter.JPG", 0);

		gift aG7boysHeadphones = new gift("Headphones", "boy", "36-45", 30.00, "electronics", "/36-45_boysHeadphones.JPG", 0);

		gift aG7boysFitBit = new gift("Fit Bit", "boy", "36-45", 29.99, "electronics", "/36-45_boysFitBit.JPG",0);

		gift aG7boysMonitors = new gift("PC Monitor", "boy", "36-45", 120.49, "electronics", "36-45_boysMonitors/.JPG",0);

		gift aG7boysPhones= new gift("Smart Phone", "boy", "36-45", 650.00, "electronics", "/36-45_boysPhones.JPG",0);

		gift aG7boysLaptops = new gift("Laptop", "boy", "36-45", 500.00, "electronics", "/36-45_boysLaptops.JPG",0);

		//Clothes

		gift aG7boysBlazer= new gift("Blazer", "boy", "36-45", 71.35, "clothes", "/36-45_boysBlazer.JPG",0);

		gift aG7boysDressShirt= new gift("Dress Shirt", "boy", "36-45",24.49, "clothes", "/36-45_boysDressShirt.JPG",0);

		gift aG7boysJackets= new gift("Jacket", "boy", "36-45" ,34.98, "clothes", "/36-45_boysJackets.JPG",0);

		gift aG7boysSweaters= new gift("Sweater", "boy", "36-45", 28.75, "clothes", "/36-45_boysSweaters.JPG",0);

		gift aG7boysPajamas= new gift("Pajamas", "boy", "36-45",26.99, "clothes", "/36-45_boysPajamas.JPG",0);

		gift aG7boysJeans = new gift("Jeans", "boy", "36-45", 35.49, "clothes", "/36-45_boysJeans.JPG",0);

		gift aG7boysTrackPants= new gift("Track Pants", "boy", "36-45", 39.99, "clothes", "/36-45_boysTrackPants.JPG",0);


		//accessories
		gift aG7boysTies= new gift("Ties", "boy", "36-45",24.59, "accessories", "/.36-45_boysTiesJPG",0);

		gift aG7boysShavingSet= new gift("Shaving Set", "boy", "36-45", 55.00, "accessories", "/36-45_boysShavingSet.JPG",0);

		gift aG7boysSunglasses= new gift("Sunglasses", "boy", "36-45", 17.99, "accessories", "/36-45_boysSunglasses.JPG",0);

		gift aG7boysGloves= new gift("Gloves", "boy", "36-45", 19.89, "accessories", "/36-45_boysGloves.JPG",0);

		gift aG7boysMitts= new gift("Mittons", "boy", "36-45", 25.99, "accessories", "/.36-45_boysMittsJPG",0);

		gift aG7boysScarves = new gift("Scarves", "boy", "36-45",15.99, "accessories", "/36-45_boysScarves.JPG",0);

		gift aG7boysHats= new gift("Hat", "boy", "36-45",20.00, "accessories", "/36-45_boysHats.JPG",0);

		gift aG7boysDressShoes = new gift("Dress Shoes", "boy", "36-45", 60.00 , "accessories", "/36-45_boysDressShoes.JPG",0);


		//food
		gift aG7boysBeer= new gift("Budweiser Beer", "boy", "36-45", 13.75, "food", "/36-45_boysBeer.JPG",0);

		gift aG7boysVodka= new gift("Vodka", "boy", "36-45",27.00, "food", "/36-45_boysVodkaJPG",0);

		//house items
		gift aG7boysMugs = new gift("Mug", "boy", "36-45", 14.00, "house items", "/36-45_boysMugs.JPG",0);

		gift aG7boysDishRack= new gift("Dish Rack", "boy", "36-45", 24.99, "house items", "/36-45_boysDishRack.JPG",0);

		gift aG7boysVase= new gift("Vase", "boy", "36-45",16.99, "house items", "/36-45_boysVase.JPG",0);

		gift aG7boysLamp= new gift("Lamp", "boy", "36-45", 25.99, "house items", "/36-45_boysLamp.JPG",0);

		gift aG7boysHumidifiers= new gift("Humidifier", "boy", "36-45", 69.99, "house items", "/36-45_boysHumidifiers.JPG",0);


		//36-45 Girls
		//Electronics
		gift aG7girlsPhotoPrinter = new gift("Photo Printer", "girl", "36-45", 149.99, "electronics", "/36-45_girlPhotoPrinter.JPG", 0);

		gift aG7girlsHeadphones = new gift("Headphones", "girl", "36-45", 30.00, "electronics", "/36-45_girlsHeadphones.JPG", 0);

		gift aG7girlsFitBit = new gift("Fit Bit", "girl", "36-45", 29.99, "electronics", "/36-45_girlsFitBit.JPG",0);

		gift aG7girlsMonitors = new gift("PC Monitor", "girl", "36-45", 120.49, "electronics", "36-45_girlsMonitors/.JPG",0);

		gift aG7girlsPhones= new gift("Smart Phone", "girl", "36-45", 650.00, "electronics", "/36-45_girlsPhones.JPG",0);

		gift aG7girlsLaptops = new gift("Laptop", "girl", "36-45", 500.00, "electronics", "/36-45_girlsLaptops.JPG",0);


		//clothes

		gift aG7girlsJackets= new gift("Jacket", "girl", "36-45" ,34.98, "clothes", "/36-45_girlsJackets.JPG",0);

		gift aG7girlsSweaters= new gift("Sweater", "girl", "36-45", 28.75, "clothes", "/36-45_girlsSweaters.JPG",0);

		gift aG7girlsPajamas= new gift("Pajamas", "girl", "36-45",26.99, "clothes", "/36-45_girlsPajamas.JPG",0);

		gift aG7girlsJeans = new gift("Jeans", "girl", "36-45", 35.49, "clothes", "/36-45_girlsJeans.JPG",0);

		gift aG7girlsDress= new gift("Dress", "girl", "36-45", 32.00, "clothes", "/36-45_girlsDress.JPG",0);

		gift aG7girlsLeggings= new gift("Leggings", "girl", "36-45", 14.59, "clothes", "/36-45_girlsLeggings.JPG",0);

		//accessories

		gift aG7girlsSunglasses= new gift("Sunglasses", "girl", "36-45", 17.99, "accessories", "/36-45_girlsSunglasses.JPG",0);

		gift aG7girlsGloves= new gift("Gloves", "girl", "36-45", 19.89, "accessories", "/36-45_girlsGloves.JPG",0);

		gift aG7girlsMitts= new gift("Mittons", "girl", "36-45", 25.99, "accessories", "/.36-45_girlsMittsJPG",0);

		gift aG7girlsScarves = new gift("Scarves", "girl", "36-45",15.99, "accessories", "/36-45_girlsScarves.JPG",0);

		gift aG7girlsHats= new gift("Hat", "girl", "36-45",20.00, "accessories", "/36-45_girlsHats.JPG",0);

		gift aG7girlsBlankets= new gift("Sherpa Throw Blanket", "girl", "36-45", 25.99, "accessories", "/36-45_girlsBlankets.JPG",0);

		gift aG7girlsPurses= new gift("Purse", "girl", "36-45",32.99, "accessories", "/36-45_girlsPurses.JPG",0);


		gift aG7girlsHeels= new gift("Heels", "girl", "36-45",34.67, "accessories", "/36-45_girlsHeels.JPG",0);


		gift aG7girlsWaterBottle= new gift("Water Bottle", "girl", "36-45",15.56, "accessories", "/36-45_girlsWaterBottle.JPG",0);


		gift aG7girlsMakeupSet= new gift("Makeup Set  36.78", "girl", "36-45", 25.99, "accessories", "/36-45_girlsMakeupSet.JPG",0);

		//food

		gift aG7girlsBeer= new gift("Budweiser Beer", "girl", "36-45", 13.75, "food", "/36-45_girlsBeer.JPG",0);

		gift aG7girlsVodka= new gift("Vodka", "girl", "36-45",27.00, "food", "/.36-45_girlsVodkaJPG",0);

		//house items

		gift aG7girlsMugs = new gift("Mug", "girl", "36-45", 14.00, "house items", "/36-45_girlsMugs.JPG",0);

		gift aG7girlsDishRack= new gift("Dish Rack", "girl", "36-45", 24.99, "house items", "/36-45_girlsDishRack.JPG",0);

		gift aG7girlsVase= new gift("Vase", "girl", "36-45",16.99, "house items", "/36-45_girlsVase.JPG",0);

		gift aG7girlsLamp= new gift("Lamp", "girl", "36-45", 25.99, "house items", "/36-45_girlsLamp.JPG",0);

		gift aG7girlsHumidifiers= new gift("Humidifier", "girl", "36-45", 69.99, "house items", "/36-45_girlsHumidifiers.JPG",0);

		//46-54 Boys

		//Electronics

		gift aG8boysSnowBlower= new gift("Snow Blower", "boy", "46-54", 141.45, "electronics", "/46-54_boysSnowBlower.JPG", 0);

		gift aG8boysLawnMower= new gift("Lawn Mower", "boy", "46-54", 248.00, "electronics", "/46-54_boysLawnMower.JPG", 0);

		gift aG8boysFitBit= new gift("Fit Bit", "boy", "46-54", 29.99, "electronics", "/46-54_boysFitBit.JPG", 0);

		gift aG8boysAdapter= new gift("Charging Adapters", "boy", "46-54", 26.99, "electronics", "/46-54_boysAdapter.JPG", 0);

		gift aG8boysiPad= new gift("iPad", "boy", "46-54", 441.57, "electronics", "/46-54_boysiPad.JPG", 0);

		gift aG8boysTablet= new gift("Android Tablet", "boy", "46-54", 179.99, "electronics", "/46-54_boysTablet.JPG", 0);

		gift aG8boysAmazonEcho= new gift("Amazon Echo", "boy", "46-54", 49.99, "electronics", "/46-54_boysAmazonEcho.JPG", 0);

		gift aG8boysHandToolSet= new gift("Hand Tool Set", "boy", "46-54", 21.99, "electronics", "/46-54_boysHandToolSet.JPG", 0);

		gift aG8boysMassagers= new gift("Massager", "boy", "46-54", 82.99, "electronics", "/46-54_boysMassagers.JPG", 0);

		gift aG8boysPowerDrill= new gift("Power Drill", "boy", "46-54", 49.99, "electronics", "/46-54_boysPowerDrill.JPG", 0);

		//clothes

		gift aG8boysJackets= new gift("Jacket", "boy", "46-54", 34.98, "clothes", "/46-54_boysJackets.JPG", 0);

		gift aG8boysSweaters= new gift("Sweater", "boy", "46-54", 28.75, "clothes", "/46-54_boysSweaters.JPG", 0);

		gift aG8boysPajamas= new gift("Pajamas", "boy", "46-54", 26.99, "clothes", "/46-54_boysPajamas.JPG", 0);

		// accessories 

		gift aG8boysShavingSet= new gift("Shaving Set", "boy", "46-54", 55.00, "accessories", "/46-54_boysShavingSet.JPG",0);

		gift aG8boysSunglasses= new gift("Sunglasses", "boy", "46-54", 17.99, "accessories", "/46-54_boysSunglasses.JPG",0);

		gift aG8boysGloves= new gift("Gloves", "boy", "46-54", 19.89, "accessories", "/46-54_boysGloves.JPG",0);

		gift aG8boysMitts= new gift("Mittons", "boy", "46-54", 25.99, "accessories", "/.46-54_boysMittsJPG",0);

		gift aG8boysScarves = new gift("Scarves", "boy", "46-54",15.99, "accessories", "/46-54_boysScarves.JPG",0);

		gift aG8boysHats= new gift("Hat", "boy", "46-54",20.00, "accessories", "/46-54_boysHats.JPG",0);

		//food

		gift aG8boysChocolate = new gift("Chocolates", "boy", "46-54", 8.30, "food", "/46-54_boysChocolate.JPG",0);

		gift aG8boysCoffee= new gift("Coffee", "boy", "46-54", 9.97, "food", "/46-54_boysCoffee.JPG",0);

		gift aG8boysTea= new gift("Tea", "boy", "46-54", 19.23, "food", "/46-54_boysTea.JPG",0);

		// House items

		gift aG8boysPlant= new gift("Plant", "boy", "46-54", 15.00, "house items", "/46-54_boysPlant.JPG",0);

		gift aG8boysToaster= new gift("Toaster", "boy", "46-54", 99.98, "house items", "/46-54_boysToaster.JPG",0);

		gift aG8boysAntiques= new gift("Antiques", "boy", "46-54", 22.99, "house items", "/46-54_boysAntiques.JPG",0);

		gift aG8boysGlassSets= new gift("Glass Set", "boy", "46-54", 21.99, "house items", "/46-54_boysGlassSets.JPG",0);

		gift aG8boysPuzzles= new gift("Puzzles", "boy", "46-54", 24.99, "house items", "/46-54_boysPuzzles.JPG",0);

		gift aG8boysHumidifiers= new gift("Humidifier", "boy", "46-54", 56.99, "house items", "/46-54_boysHumidifiers.JPG",0);

		gift aG8boysCutlerySet= new gift("Cutlery Set", "boy", "46-54", 24.97, "house items", "/46-54_boysCutlerySet.JPG",0);

		//46-54 Girls

		//electronics

		gift aG8girlsFitBit= new gift("Fit Bit", "girl", "46-54", 29.99, "electronics", "/46-54_girlsFitBit.JPG", 0);

		gift aG8girlsAdapter= new gift("Charging Adapters", "girl", "46-54", 26.99, "electronics", "/46-54_girlsAdapter.JPG", 0);

		gift aG8girlsiPad= new gift("iPad", "girl", "46-54", 441.57, "electronics", "/46-54_girlsiPad.JPG", 0);

		gift aG8girlsTablet= new gift("Android Tablet", "girl", "46-54", 179.99, "electronics", "/46-54_girlsTablet.JPG", 0);

		gift aG8girlsAmazonEcho= new gift("Amazon Echo", "girl", "46-54", 49.99, "electronics", "/46-54_girlsAmazonEcho.JPG", 0);

		//Tools

		gift aG8girlsMassagers= new gift("Massager", "girl", "46-54", 82.99, "tools", "/46-54_girlsAmazonEcho.JPG", 0);

		gift aG8girlsSewingKit= new gift("Sewing Kit", "girl", "46-54", 14.99, "tools", "/46-54_girlsSewingKit.JPG", 0);

		//clothes

		gift aG8girlsJackets= new gift("Jacket", "girl", "46-54", 34.98, "clothes", "/46-54_girlsJackets.JPG", 0);

		gift aG8girlsSweaters= new gift("Sweater", "girl", "46-54", 28.75, "clothes", "/46-54_girlsSweaters.JPG", 0);

		gift aG8girlsPajamas= new gift("Pajamas", "girl", "46-54", 26.99, "clothes", "/46-54_girlsPajamas.JPG", 0);

		//accessories
		gift aG8girlsGloves= new gift("Gloves", "girl", "46-54", 19.89, "accessories", "/46-54_girlsGloves.JPG",0);

		gift aG8girlsMitts= new gift("Mittons", "girl", "46-54", 25.99, "accessories", "/.46-54_girlsMittsJPG",0);

		gift aG8girlsScarves = new gift("Scarves", "girl", "46-54",15.99, "accessories", "/46-54_girlsScarves.JPG",0);

		gift aG8girlsHats= new gift("Hat", "girl", "46-54",20.00, "accessories", "/46-54_girlsHats.JPG",0);

		gift aG8girlsBlankets= new gift("Sherpa Throw Blanket", "girl", "46-54", 25.99, "accessories", "/46-54_girlsBlankets.JPG",0);

		gift aG8girlsPurses= new gift("Purse", "girl", "46-54",32.99, "accessories", "/46-54_girlsPurses.JPG",0);

		//food

		gift aG8girlsChocolate = new gift("Chocolates", "boy", "46-54", 8.30, "food", "/46-54_girlsChocolate.JPG",0);

		gift aG8girlsCoffee= new gift("Coffee", "boy", "46-54", 9.97, "food", "/46-54_girlsCoffee.JPG",0);

		gift aG8girlsTea= new gift("Tea", "boy", "46-54", 19.23, "food", "/46-54_girlsTea.JPG",0);

		// House items

		gift aG8girlsPlant= new gift("Plant", "girl", "46-54", 15.00, "house items", "/46-54_girlsPlant.JPG",0);

		gift aG8girlsToaster= new gift("Toaster", "girl", "46-54", 99.98, "house items", "/46-54_girlsToaster.JPG",0);

		gift aG8girlsAntiques= new gift("Antiques", "girl", "46-54", 22.99, "house items", "/46-54_girlsAntiques.JPG",0);

		gift aG8girlsGlassSets= new gift("Glass Set", "girl", "46-54", 21.99, "house items", "/46-54_girlsGlassSets.JPG",0);

		gift aG8girlsPuzzles= new gift("Puzzles", "girl", "46-54", 24.99, "house items", "/46-54_girlsPuzzles.JPG",0);

		gift aG8girlsHumidifiers= new gift("Humidifier", "girl", "46-54", 56.99, "house items", "/46-54_girlsHumidifiers.JPG",0);

		gift aG8girlsCutlerySet= new gift("Cutlery Set", "girl", "46-54", 24.97, "house items", "/46-54_girlsCutlerySet.JPG",0);

		gift aG8girlsPaintings = new gift("Paintings", "girl", "46-54", 25.90, "house items", "/46-54_girlsPaintings.JPG",0);

		//55+ boys

		//electronics
		gift aG9boysSnowBlower= new gift("Snow Blower", "boy", "55+", 141.45, "electronics", "55+_boysSnowBlower.JPG",0);

		gift aG9boysLawnMower= new gift("Lawn Mower", "boy", "55+", 248.00, "electronics", "55+_boysLawnMower.JPG",0);

		gift aG9boysFitbit= new gift("Fit Bit", "boy", "55+", 29.99, "electronics", "55+_boysFitbit.PNG",0);

		gift aG9boysMassagers= new gift("Massager", "boy", "55+", 82.99, "electronics", "/55+_boysMassagers.JPG", 0);

		gift aG9boysPowerDrill= new gift("Power Drill", "boy", "55+", 49.99, "electronics", "/55+_boysPowerDrill.JPG", 0);

		//clothes
		gift aG9boysJackets= new gift("Jacket", "boy", "55+", 34.98, "clothes", "/55+_boysJackets.JPG", 0);

		gift aG9boysSweaters= new gift("Sweater", "boy", "55+", 34.98, "clothes", "/55+_boysSweaters.JPG", 0);

		gift aG9boysPajamas= new gift("Sweater", "boy", "55+", 26.99, "clothes", "/55+_boysPajamas.JPG", 0);

		//accessories

		gift aG9boysFishingGear= new gift("Fishing Gear", "boy", "55+", 32.99, "accessories", "/55+_boysFishingGear.PNG", 0);

		gift aG9boysGlofClubs= new gift("Golf Clubs", "boy", "55+", 289.99, "accessories", "/55+_boysGlofClubs.PNG", 0);

		gift aG9boysWallet= new gift("Wallet", "boy", "55+", 24.21, "accessories", "/55+_boysWallet.PNG", 0);

		gift aG9boysDressShoes= new gift("Dress Shoes", "boy", "55+", 44.99, "accessories", "/55+_boysDressShoes.PNG", 0);

		//food
		gift aG9boysChocolate = new gift("Chocolate", "boy", "55+", 19.96, "food", "/55+_boysChocolate.PNG",0);

		//house items

		gift aG9boysShotGlasses = new gift("Shot Glasses", "boy", "55+", 39.96, "house items" , "/55+_boysShorGlasses.PNG", 0);

		gift aG9boysCutlerySet = new gift("Cutlery Set", "boy", "55+", 40.96, "house items" , "/55+_boysCutlerySet.PNG", 0);

		gift aG9boysAntiqueBox= new gift("Antique Box", "boy", "55+", 54.90, "house items" , "/55+_boysAntiqueBox.PNG", 0);


		//55+ girls


		//electronics

		gift aG9girlsFitBit= new gift("Fit Bit", "girl", "55+", 29.99, "electronics", "/55+_girlsFitBit.JPG", 0);

		gift aG9girlsAdapter= new gift("Charging Adapters", "girl", "55+", 26.99, "electronics", "/55+_girlsAdapter.JPG", 0);

		gift aG9girlsiPad= new gift("iPad", "girl", "55+", 441.57, "electronics", "/55+_girlsiPad.JPG", 0);

		gift aG9girlsTablet= new gift("Android Tablet", "girl", "55+", 179.99, "electronics", "/55+_girlsTablet.JPG", 0);

		gift aG9girlsAmazonEcho= new gift("Amazon Echo", "girl", "55+", 49.99, "electronics", "/55+_girlsAmazonEcho.JPG", 0);

		//Tools

		gift aG9girlsMassagers= new gift("Massager", "girl", "55+", 82.99, "tools", "/55+_girlsAmazonEcho.JPG", 0);

		gift aG9girlsSewingKit= new gift("Sewing Kit", "girl", "55+", 14.99, "tools", "/55+_girlsSewingKit.JPG", 0);

		//clothes

		gift aG9girlsJackets= new gift("Jacket", "girl", "55+", 34.98, "clothes", "/55+_girlsJackets.JPG", 0);

		gift aG9girlsSweaters= new gift("Sweater", "girl", "55+", 28.75, "clothes", "/55+_girlsSweaters.JPG", 0);

		gift aG9girlsPajamas= new gift("Pajamas", "girl", "55+", 26.99, "clothes", "/55+_girlsPajamas.JPG", 0);

		//accessories
		gift aG9girlsGloves= new gift("Gloves", "girl", "55+", 19.89, "accessories", "/55+_girlsGloves.JPG",0);

		gift aG9girlsMitts= new gift("Mittons", "girl", "55+", 25.99, "accessories", "/.55+_girlsMittsJPG",0);

		gift aG9girlsScarves = new gift("Scarves", "girl", "55+",15.99, "accessories", "/55+_girlsScarves.JPG",0);

		gift aG9girlsHats= new gift("Hat", "girl", "55+",20.00, "accessories", "/55+_girlsHats.JPG",0);

		gift aG9girlsBlankets= new gift("Sherpa Throw Blanket", "girl", "55+", 25.99, "accessories", "/55+_girlsBlankets.JPG",0);

		gift aG9girlsPurses= new gift("Purse", "girl", "55+",32.99, "accessories", "/55+_girlsPurses.JPG",0);

		//food

		gift aG9girlsChocolate = new gift("Chocolates", "boy", "55+", 8.30, "food", "/55+_girlsChocolate.JPG",0);

		gift aG9girlsCoffee= new gift("Coffee", "boy", "55+", 9.97, "food", "/55+_girlsCoffee.JPG",0);

		gift aG9girlsTea= new gift("Tea", "boy", "55+", 19.23, "food", "/55+_girlsTea.JPG",0);

		// House items

		gift aG9girlsPlant= new gift("Plant", "girl", "55+", 15.00, "house items", "/55+_girlsPlant.JPG",0);

		gift aG9girlsToaster= new gift("Toaster", "girl", "55+", 99.98, "house items", "/55+_girlsToaster.JPG",0);

		gift aG9girlsAntiques= new gift("Antiques", "girl", "55+", 22.99, "house items", "/55+_girlsAntiques.JPG",0);

		gift aG9girlsGlassSets= new gift("Glass Set", "girl", "55+", 21.99, "house items", "/55+_girlsGlassSets.JPG",0);

		gift aG9girlsPuzzles= new gift("Puzzles", "girl", "55+", 24.99, "house items", "/55+_girlsPuzzles.JPG",0);

		gift aG9girlsHumidifiers= new gift("Humidifier", "girl", "55+", 56.99, "house items", "/55+_girlsHumidifiers.JPG",0);

		gift aG9girlsCutlerySet= new gift("Cutlery Set", "girl", "55+", 24.97, "house items", "/55+_girlsCutlerySet.JPG",0);

		gift aG9girlsPaintings = new gift("Paintings", "girl", "55+", 25.90, "house items", "/55+_girlsPaintings.JPG",0);

		
		
		///////////////////////////////////////////////Add to ArrayList/////////////////////////////////////////////////////

		//0-4 boys

		gifts.add(aG1boysBlanket);
		gifts.add(aG1boysSleevedBib);
		gifts.add(aG1boysSocks);
		gifts.add(aG1boysHats);
		
		
		gifts.add(aG1boysAlphabetChart);
		gifts.add(aG1boysBedtimeStories);
		gifts.add(aG1boysWalker);
		gifts.add(aG1boysStroller);
		gifts.add(aG1boysExpensiveStroller);
		gifts.add(aG1boysInfantSeat);
		gifts.add(aG1boysCarSeat);
		gifts.add(aG1boysWagon);
		gifts.add(aG1boysStuffedToy);
		gifts.add(aG1boysTeddyBear);
		gifts.add(aG1boysInstrumentToy);
		gifts.add(aG1boysBeachToys);
		gifts.add(aG1boysPictureBook);
		gifts.add(aG1boysPacifiers);



		//0-4 girls

		gifts.add(aG1girlsBlanket);
		gifts.add(aG1girlsSleevedBib);
		gifts.add(aG1girlsSocks);
		gifts.add(aG1girlsHats);
		gifts.add(aG1girlsAlphabetChart);
		gifts.add(aG1girlsBedtimeStories);
		gifts.add(aG1girlsWalker);
		gifts.add(aG1girlsStroller);
		gifts.add(aG1girlsExpensiveStroller);
		gifts.add(aG1girlsInfantSeat);
		gifts.add(aG1girlsCarSeat);
		gifts.add(aG1girlsWagon);
		gifts.add(aG1girlsStuffedToy);
		gifts.add(aG1girlsTeddyBear);
		gifts.add(aG1girlsInstrumentToy);
		gifts.add(aG1girlsBeachToys);
		gifts.add(aG1girlsPictureBook);
		gifts.add(aG1girlsPacifiers);

		//5-7 boys

		gifts.add(aG2boysWatch);
		gifts.add(aG2boysVtech);
		gifts.add(aG2boysWalkieTalkie);
		gifts.add(aG2boysHats);
		gifts.add(aG2boysJackets);
		gifts.add(aG2boysTShirt);
		gifts.add(aG2boysPJs);
		gifts.add(aG2boysOnesies);
		gifts.add(aG2boysColouringBook);
		gifts.add(aG2boysNotebook);
		gifts.add(aG2boysPictureBook);
		gifts.add(aG2boysBedtimeStories);
		gifts.add(aG2boysTrain);
		gifts.add(aG2boysPuzzles);
		gifts.add(aG2boysBicycle);
		gifts.add(aG2boysScooter);
		gifts.add(aG2boysLEGO);
		gifts.add(aG2boysStuffedAnimal);
		gifts.add(aG2boysInflatableTub);
		gifts.add(aG2boysNerfGun);
		gifts.add(aG2boysKineticSand);


		//5-7 girls

		gifts.add(aG2girlsWatch);
		gifts.add(aG2girlsVtech);
		gifts.add(aG2girlsWalkieTalkie);
		gifts.add(aG2girlsStickers);
		gifts.add(aG2girlsWatercolourSet);
		gifts.add(aG2girlsWaterMarkers);
		gifts.add(aG2girlsScrunchie);
		gifts.add(aG2girlsHat);
		gifts.add(aG2girlsJacket);
		gifts.add(aG2girlsShoes);
		gifts.add(aG2girlsColouringBook);
		gifts.add(aG2girlsNotebook);
		gifts.add(aG2girlsPictureBook);
		gifts.add(aG2girlsBedtimeStories);
		gifts.add(aG2girlsBarbies);
		gifts.add(aG2girlsPollyPockets);
		gifts.add(aG2girlsStuffedAnimal);
		gifts.add(aG2girlsBicycle);
		gifts.add(aG2girlsScooter);
		gifts.add(aG2girlsPuzzles);
		gifts.add(aG2girlsLEGO);
		gifts.add(aG2girlsKineticSand);


		//8-12  boys

		gifts.add(aG3boysiPad);
		gifts.add(aG3boysElectricToothbrush);
		gifts.add(aG3boysArduino);
		gifts.add(aG3boysChocolate);
		gifts.add(aG3boysMazeBook);
		gifts.add(aG3boysBicycle);
		gifts.add(aG3boysToyCar);
		gifts.add(aG3boysActionFigure);
		gifts.add(aG3boysLEGO);
		gifts.add(aG3boysConnect4);
		gifts.add(aG3boysMonopoly);
		gifts.add(aG3boysUno);
		gifts.add(aG3boysSoccerBall);
		gifts.add(aG3boysBasketball);
		gifts.add(aG3boysSkateboard);
		gifts.add(aG3boysRubiksCube);
		gifts.add(aG3boysPokemonCards);
		gifts.add(aG3boysNerfGuns);
		gifts.add(aG3boysHarryPotter);
		gifts.add(aG3boysMagicTreehouse);
		gifts.add(aG3boysPercyJackson);
		gifts.add(aG3boysWimpyKid);

		//8-12 girls

		gifts.add(aG3girlsiPad);
		gifts.add(aG3girlsElectricToothbrush);
		gifts.add(aG3girlsArduino);
		gifts.add(aG3girlsChocolate);
		gifts.add(aG3girlsScrunchie);
		gifts.add(aG3girlsHairBands);
		gifts.add(aG3girlsLipBalm);
		gifts.add(aG3girlsMazeBook);
		gifts.add(aG3girlsBarbie);
		gifts.add(aG3girlsUnicorn);
		gifts.add(aG3girlsPokemonCards);
		gifts.add(aG3girlsLEGO);
		gifts.add(aG3girlsSkateboard);
		gifts.add(aG3girlsSnowGlobes);
		gifts.add(aG3girlsUNO);
		gifts.add(aG3girlsConnect4);
		gifts.add(aG3girlsMonopoly);
		gifts.add(aG3girlsToyCar);
		gifts.add(aG3girlsColouringBook);
		gifts.add(aG3girlsGlitter);
		gifts.add(aG3girlsHarryPotter);
		gifts.add(aG3girlsMagicTreeHouse);
		gifts.add(aG3girlsPercyJackson);
		gifts.add(aG3girlsWimpyKid);

		//13-16 boys

		gifts.add(aG4boysPS4);
		gifts.add(aG4boysXbox);
		gifts.add(aG4boysGoogleHome);
		gifts.add(aG4boysNintendoSwitch);
		gifts.add(aG4boysHeadphones);
		gifts.add(aG4boysEarbuds);
		gifts.add(aG4boysLaptop);
		gifts.add(aG4boysArduino);
		gifts.add(aG4boysHoodie);
		gifts.add(aG4boysShirts);
		gifts.add(aG4boysShoes);
		gifts.add(aG4boysScarves);
		gifts.add(aG4boysSunglasses);
		gifts.add(aG4boysChains);
		gifts.add(aG4boysHat);
		gifts.add(aG4boysHoverboard);
		gifts.add(aG4boysBasketball);
		gifts.add(aG4boysTableTennis);
		gifts.add(aG4boysBicycle);
		gifts.add(aG4boysConnect4);
		gifts.add(aG4boysMonopoly);
		gifts.add(aG4boysUNO);
		gifts.add(aG4boysPiano);
		gifts.add(aG4boysGuitar);
		gifts.add(aG4boysPencils);
		gifts.add(aG4boysAlexRider);
		gifts.add(aG4boysErasable);
		gifts.add(aG4boysNotebook);

		//13-16 girls

		gifts.add(aG4girlsPS4);
		gifts.add(aG4girlsXbox);
		gifts.add(aG4girlsGoogleHome);
		gifts.add(aG4girlsNintendoSwitch);
		gifts.add(aG4girlsHeadphones);
		gifts.add(aG4girlsEarbuds);
		gifts.add(aG4girlsLaptop);
		gifts.add(aG4girlsArduino);
		gifts.add(aG4girlsHoodies);
		gifts.add(aG4girlsSocks);
		gifts.add(aG4girlsTShirt);
		gifts.add(aG4girlsDress);
		gifts.add(aG4girlsHat);
		gifts.add(aG4girlsScarf);
		gifts.add(aG4girlsShoes);
		gifts.add(aG4girlsBoots);
		gifts.add(aG4girlsMakeupSet);
		gifts.add(aG4girlsCream);
		gifts.add(aG4girlsScentedCandles);
		gifts.add(aG4girlsLipBalm);
		gifts.add(aG4girlsHairTies);
		gifts.add(aG4girlsHoverboard);
		gifts.add(aG4girlsConnect4);
		gifts.add(aG4girlsMonopoly);
		gifts.add(aG4girlsUNO);
		gifts.add(aG4girlsPlush);
		gifts.add(aG4girlsTableTennis);
		gifts.add(aG4girlsPiano);
		gifts.add(aG4girlsGuitar);
		gifts.add(aG4girlsPencils);
		gifts.add(aG4girlsNotebook);

		//17-25 boys

		gifts.add(aG5boysHeadphones);
		gifts.add(aG5boysEarbuds);
		gifts.add(aG5boysAirPods);
		gifts.add(aG5boysPhone);
		gifts.add(aG5boysLaptop);
		gifts.add(aG5boysCamera);
		gifts.add(aG5boysShoes);
		gifts.add(aG5boysTShirt);
		gifts.add(aG5boysHoodie);
		gifts.add(aG5boysTies);
		gifts.add(aG5boysBackpack);
		gifts.add(aG5boysFitBit);
		gifts.add(aG5boysAppleWatch);
		gifts.add(aG5boysPerfume);
		gifts.add(aG5boysScarf);
		gifts.add(aG5boysDeodorant);
		gifts.add(aG5boysShavingKit);
		gifts.add(aG5boysAntiques);
		gifts.add(aG5boysPainting);
		gifts.add(aG5boysMug);
		gifts.add(aG5boysSpeaker);
		gifts.add(aG5boysGuitar);
		gifts.add(aG5boysPiano);
		gifts.add(aG5boysNovel);
		gifts.add(aG5boysStylusPen);

		//17-25 girls

		gifts.add(aG5girlsHeadphones);
		gifts.add(aG5girlsEarbuds);
		gifts.add(aG5girlsAirPods);
		gifts.add(aG5girlsPhone);
		gifts.add(aG5girlsLaptop);
		gifts.add(aG5girlsCamera);
		gifts.add(aG5girlsDress);
		gifts.add(aG5girlsFitBit);
		gifts.add(aG5girlsScarf);
		gifts.add(aG5girlsMakeupSet);
		gifts.add(aG5girlsShoes);
		gifts.add(aG5girlsHandbags);
		gifts.add(aG5girlsHandbagSet);
		gifts.add(aG5girlsShampoo);
		gifts.add(aG5girlsCandles);
		gifts.add(aG5girlsCreams);
		gifts.add(aG5girlsSoap);
		gifts.add(aG5girlsNecklace);
		gifts.add(aG5girlsPerfume);
		gifts.add(aG5girlsAntique);
		gifts.add(aG5girlsPainting);
		gifts.add(aG5girlsMug);
		gifts.add(aG5girlsSpeaker);
		gifts.add(aG5girlsGuitar);
		gifts.add(aG5girlsPiano);
		gifts.add(aG5girlsNovel);
		gifts.add(aG5girlsStylusPen);

		//26-35 boys

		gifts.add(aG6boysAppleWatch);
		gifts.add(aG6boysPhone);
		gifts.add(aG6boysLaptop);
		gifts.add(aG6boysRiceCooker);
		gifts.add(aG6boysToaster);
		gifts.add(aG6boysTies);
		gifts.add(aG6boysJersey);
		gifts.add(aG6boysCookwareSet);
		gifts.add(aG6boysShavingKit);
		gifts.add(aG6boysPerfume);
		gifts.add(aG6boysWallet);
		gifts.add(aG6boysSunglasses);
		gifts.add(aG6boysScarf);
		gifts.add(aG6boysSleepMask);
		gifts.add(aG6boysWine);
		gifts.add(aG6boysChocolate);
		gifts.add(aG6boysPainting);
		gifts.add(aG6boysAntique);
		gifts.add(aG6boysCookingDish);
		gifts.add(aG6boysHeater);
		gifts.add(aG6boysGlassSet);
		gifts.add(aG6boysGlassware);
		gifts.add(aG6boysCutlerySet);
		gifts.add(aG6boysTableTennis);

		//26-35 girls

		gifts.add(aG6girlsAppleWatch);
		gifts.add(aG6girlsPhone);
		gifts.add(aG6girlsLaptop);
		gifts.add(aG6girlsRiceCooker);
		gifts.add(aG6girlsToaster);
		gifts.add(aG6girlsSweatshirt);
		gifts.add(aG6girlsCookwareSet);
		gifts.add(aG6girlsMakeupSet);
		gifts.add(aG6girlsSunglasses);
		gifts.add(aG6girlsHandCream);
		gifts.add(aG6girlsPerfume);
		gifts.add(aG6girlsToiletryBag);
		gifts.add(aG6girlsBoots);
		gifts.add(aG6girlsSleepMask);
		gifts.add(aG6girlsHandbags);
		gifts.add(aG6girlsScarf);
		gifts.add(aG6girlsSkinCare);
		gifts.add(aG6girlsWine);
		gifts.add(aG6girlsChocolate);
		gifts.add(aG6girlsPainting);
		gifts.add(aG6girlsAntique);
		gifts.add(aG6girlsCookingDish);
		gifts.add(aG6girlsHeater);
		gifts.add(aG6girlsGlassSet);
		gifts.add(aG6girlsGlassware);
		gifts.add(aG6girlsCutlerySet);
		gifts.add(aG6girlsTableTennis);


		//36-45 boys

		gifts.add(aG7boysPhotoPrinter);
		gifts.add(aG7boysHeadphones);
		gifts.add(aG7boysFitBit);
		gifts.add(aG7boysMonitors);
		gifts.add(aG7boysPhones);
		gifts.add(aG7boysLaptops);
		gifts.add(aG7boysBlazer);
		gifts.add(aG7boysDressShirt);
		gifts.add(aG7boysJackets);
		gifts.add(aG7boysSweaters);
		gifts.add(aG7boysPajamas);
		gifts.add(aG7boysJeans);
		gifts.add(aG7boysTrackPants);
		gifts.add(aG7boysTies);
		gifts.add(aG7boysShavingSet);
		gifts.add(aG7boysSunglasses);
		gifts.add(aG7boysGloves);
		gifts.add(aG7boysMitts);
		gifts.add(aG7boysScarves);
		gifts.add(aG7boysHats);
		gifts.add(aG7boysDressShoes);
		gifts.add(aG7boysBeer);
		gifts.add(aG7boysVodka);
		gifts.add(aG7boysMugs);
		gifts.add(aG7boysDishRack);
		gifts.add(aG7boysVase);
		gifts.add(aG7boysLamp);
		gifts.add(aG7boysHumidifiers);

		//36-45 girls

		gifts.add(aG7girlsPhotoPrinter);
		gifts.add(aG7girlsHeadphones);
		gifts.add(aG7girlsFitBit);
		gifts.add(aG7girlsMonitors);
		gifts.add(aG7girlsPhones);
		gifts.add(aG7girlsLaptops);
		gifts.add(aG7girlsJackets);
		gifts.add(aG7girlsSweaters);
		gifts.add(aG7girlsPajamas);
		gifts.add(aG7girlsJeans);
		gifts.add(aG7girlsDress);
		gifts.add(aG7girlsLeggings);
		gifts.add(aG7girlsSunglasses);
		gifts.add(aG7girlsGloves);
		gifts.add(aG7girlsMitts);
		gifts.add(aG7girlsScarves);
		gifts.add(aG7girlsHats);
		gifts.add(aG7girlsBlankets);
		gifts.add(aG7girlsPurses);
		gifts.add(aG7girlsHeels);
		gifts.add(aG7girlsWaterBottle);
		gifts.add(aG7girlsMakeupSet);
		gifts.add(aG7girlsBeer);
		gifts.add(aG7girlsVodka);
		gifts.add(aG7girlsMugs);
		gifts.add(aG7girlsDishRack);
		gifts.add(aG7girlsVase);
		gifts.add(aG7girlsLamp);
		gifts.add(aG7girlsHumidifiers);



		//46-54 boys

		gifts.add(aG8boysSnowBlower);
		gifts.add(aG8boysLawnMower);
		gifts.add(aG8boysFitBit);
		gifts.add(aG8boysAdapter);
		gifts.add(aG8boysiPad);
		gifts.add(aG8boysTablet);
		gifts.add(aG8boysAmazonEcho);
		gifts.add(aG8boysPowerDrill);
		gifts.add(aG8boysHandToolSet);
		gifts.add(aG8boysMassagers);
		gifts.add(aG8boysJackets);
		gifts.add(aG8boysSweaters);
		gifts.add(aG8boysPajamas);
		gifts.add(aG8boysShavingSet);
		gifts.add(aG8boysSunglasses);
		gifts.add(aG8boysGloves);
		gifts.add(aG8boysMitts);
		gifts.add(aG8boysScarves);
		gifts.add(aG8boysHats);
		gifts.add(aG8boysChocolate);
		gifts.add(aG8boysCoffee);
		gifts.add(aG8boysTea);
		gifts.add(aG8boysPlant);
		gifts.add(aG8boysToaster);
		gifts.add(aG8boysAntiques);
		gifts.add(aG8boysGlassSets);
		gifts.add(aG8boysPuzzles);
		gifts.add(aG8boysHumidifiers);
		gifts.add(aG8boysCutlerySet);

		//46-54 girls

		gifts.add(aG8girlsFitBit);
		gifts.add(aG8girlsAdapter);
		gifts.add(aG8girlsiPad);
		gifts.add(aG8girlsTablet);
		gifts.add(aG8girlsAmazonEcho);
		gifts.add(aG8girlsMassagers);
		gifts.add(aG8girlsSewingKit);
		gifts.add(aG8girlsJackets);
		gifts.add(aG8girlsSweaters);
		gifts.add(aG8girlsPajamas);
		gifts.add(aG8girlsGloves);
		gifts.add(aG8girlsMitts);
		gifts.add(aG8girlsScarves);
		gifts.add(aG8girlsHats);
		gifts.add(aG8girlsBlankets);
		gifts.add(aG8girlsPurses);
		gifts.add(aG8girlsChocolate);
		gifts.add(aG8girlsCoffee);
		gifts.add(aG8girlsTea);
		gifts.add(aG8girlsPlant);
		gifts.add(aG8girlsToaster);
		gifts.add(aG8girlsAntiques);
		gifts.add(aG8girlsGlassSets);
		gifts.add(aG8girlsPuzzles);
		gifts.add(aG8girlsHumidifiers);
		gifts.add(aG8girlsCutlerySet);
		gifts.add(aG8girlsPaintings);

		//55+ boys

		gifts.add(aG9boysSnowBlower);
		gifts.add(aG9boysLawnMower);
		gifts.add(aG9boysFitbit);
		gifts.add(aG9boysMassagers);
		gifts.add(aG9boysPowerDrill);
		gifts.add(aG9boysJackets);
		gifts.add(aG9boysSweaters);
		gifts.add(aG9boysPajamas);
		gifts.add(aG9boysFishingGear);
		gifts.add(aG9boysGlofClubs);
		gifts.add(aG9boysWallet);
		gifts.add(aG9boysDressShoes);
		gifts.add(aG9boysChocolate);
		gifts.add(aG9boysShotGlasses);
		gifts.add(aG9boysCutlerySet);
		gifts.add(aG9boysAntiqueBox);

		//55+ girls

		gifts.add(aG9girlsFitBit);
		gifts.add(aG9girlsAdapter);
		gifts.add(aG9girlsiPad);
		gifts.add(aG9girlsTablet);
		gifts.add(aG9girlsAmazonEcho);
		gifts.add(aG9girlsMassagers);
		gifts.add(aG9girlsSewingKit);
		gifts.add(aG9girlsJackets);
		gifts.add(aG9girlsSweaters);
		gifts.add(aG9girlsPajamas);
		gifts.add(aG9girlsGloves);
		gifts.add(aG9girlsMitts);
		gifts.add(aG9girlsScarves);
		gifts.add(aG9girlsHats);
		gifts.add(aG9girlsBlankets);
		gifts.add(aG9girlsPurses);
		gifts.add(aG9girlsChocolate);
		gifts.add(aG9girlsCoffee);
		gifts.add(aG9girlsTea);
		gifts.add(aG9girlsPlant);
		gifts.add(aG9girlsToaster);
		gifts.add(aG9girlsAntiques);
		gifts.add(aG9girlsGlassSets);
		gifts.add(aG9girlsPuzzles);
		gifts.add(aG9girlsHumidifiers);
		gifts.add(aG9girlsCutlerySet);
		gifts.add(aG9girlsPaintings);

		
	}

	/**
	 * Create the frame.
	 */
	
	//Constructor to assign create attributes for gift
	
		public gift(String gift_name, String gift_gender, String gift_age_range, double gift_price, String gift_type, String gift_link, int gift_score) {
			name = gift_name;
			gender = gift_gender;
			age_range = gift_age_range;
			price = gift_price;
			type = gift_type;
			link = gift_link;
			score = gift_score;
			
		}
		
		//Method for sorting through gifts ArrayList and updating point values
		
		
		public int getScore() {
			return score;
		}
		
		public static Comparator<gift> compareScore = new Comparator<gift>() {
			
			public int compare(gift g1, gift g2) {
				return g1.getScore() - g2.getScore();
			}
			
			
		};
		
		
		public static void score_updater (ArrayList <gift> gifts) {
			for (int i = 0; i < gifts.size(); i++) {
				
				//GENDER
				
				if (userGender == gifts.get(i).gender) {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 10;
				}
				
				//PRICE
				
				if (minGiftPrice < gifts.get(i).price && gifts.get(i).price < maxGiftPrice) {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 100;
				}
				
				//AGE
				
				if (userAgeRange == gifts.get(i).age_range) {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 30;
				}
				
				//SPORTS
				
				if (sportsInterest == true && gifts.get(i).type == "sports") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//CLOTHES
				
				if (clothesInterest == true && gifts.get(i).type == "clothes") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//TOYS
				
				if (toysInterest == true && gifts.get(i).type == "toys") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//EDUCATION
				
				if (educationInterest == true && gifts.get(i).type == "education") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//ELECTRONICS
				
				if (electronicsInterest == true && gifts.get(i).type == "electronics") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//ACCESORIES
				
				if (accesoriesInterest == true && gifts.get(i).type == "accesories") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				//HOUSE ITEMS
				
				if (houseItemsInterest == true && gifts.get(i).type == "house items") {
					gifts.get(i).score += 0;
				}
				
				else {
					gifts.get(i).score += 5;
				}
				
				
			}
			
			Collections.sort(gifts, gift.compareScore);
			
			System.out.println("Here are your Top 15 gift results!");
			System.out.println();
			
			
			for (int m = 1; m < 16; m++) {
				System.out.println(m + " - " + gifts.get(m).name + ": $" + gifts.get(m).price);
			}
			
		}
		
	

	
	public gift() {
		setTitle("GiftSmart");
		setIconImage(Toolkit.getDefaultToolkit().getImage(gift.class.getResource("/windowBuilder/resources/present_icon_16.png")));
		
		initComponents();
		
		
		
	}

	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		//////////////////////////////////////////////SEARCH BUTTON//////////////////////////////////////////
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (minGiftPrice > maxGiftPrice) {
					JOptionPane.showMessageDialog(null, "Nice try Mr. Berardi! Max price must be GREATER than min price");
					txtf_mingiftprice.setText("");
					txtf_maxgiftprice.setText("");
				}
				
				else {
					score_updater(gifts);
				}
				
			}
		});
		btnSearch.setFont(new Font("Century Gothic", Font.PLAIN, 19));
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setBackground(Color.RED);
		
		//////////////////////////////////////////////SEARCH BUTTON/////////////////////////////////////////
		
		JLabel lblLogo2 = new JLabel("");
		Image Logo = new ImageIcon(this.getClass().getResource("/giftsmart_logo.PNG")).getImage();
		Image modifiedLogo = Logo.getScaledInstance(662, 62, java.awt.Image.SCALE_SMOOTH);
		lblLogo2.setIcon(new ImageIcon(modifiedLogo));
		
		JLabel lblRecipientAndOccasion = new JLabel("Recipient Details");
		lblRecipientAndOccasion.setFont(new Font("Century Gothic", Font.PLAIN, 21));
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		////////Male Radio Button//////////////
		
		rbMale = new JRadioButton("Male");
		rbMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbMale.isSelected()) {
					userGender = "boy";
				}
			}

		});
		rbMale.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbMale.setBackground(Color.WHITE);
		buttonGroup.add(rbMale);
		
		////////Female Radio Button////////////
		
		rbFemale = new JRadioButton("Female");
		rbFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rbFemale.isSelected()) {
					userGender = "girl";
				}
			}
		});
		rbFemale.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbFemale.setBackground(Color.WHITE);
		buttonGroup.add(rbFemale);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		//////////Age Combobox/////////////////
		
		comboAge = new JComboBox<String>();
		comboAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboAge.getSelectedItem() == "0-4") {
					userAgeRange = "0-4";
				}
				
				else if(comboAge.getSelectedItem() == "5-7") {
					userAgeRange = "5-7";
				}
				
				else if(comboAge.getSelectedItem() == "8-12") {
					userAgeRange = "8-12";
				}
				
				else if(comboAge.getSelectedItem() == "13-16") {
					userAgeRange = "13-16";
				}
				
				else if(comboAge.getSelectedItem() == "17-25") {
					userAgeRange = "17-25";
				}
				
				else if(comboAge.getSelectedItem() == "26-35") {
					userAgeRange = "26-35";
				}
				
				else if(comboAge.getSelectedItem() == "36-45") {
					userAgeRange = "36-45";
				}
				
				else if(comboAge.getSelectedItem() == "46-54") {
					userAgeRange = "46-54";
				}
				
				else if(comboAge.getSelectedItem() == "55+") {
					userAgeRange = "55+";
				}
			}
		});
		comboAge.setModel(new DefaultComboBoxModel(new String[] {"Select", "0-4", "5-7", "8-12", "13-16", "17-25", "26-35", "36-45", "46-54", "55+"}));
		comboAge.setBackground(Color.WHITE);
		comboAge.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		/////////////////////////////////////////Minimum Gift Price//////////////////////////////////////////
		
		JLabel lblMinGiftPrice = new JLabel("Minimum Gift Price:");
		lblMinGiftPrice.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		txtf_mingiftprice = new JTextField();
		txtf_mingiftprice.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				tempMinGiftPrice = txtf_mingiftprice.getText();
				minGiftPrice = Double.parseDouble(tempMinGiftPrice);
				if (minGiftPrice < 0) {
					JOptionPane.showMessageDialog(null, "Nice try Mr. Berardi! Prices are POSITIVE numbers");
					txtf_mingiftprice.setText("");
				}
			}
			
		});
		txtf_mingiftprice.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtf_mingiftprice.setColumns(10);
		
		/////////////////////////////////////////Maximum Gift Price//////////////////////////////////////////
		
		JLabel lblMaxGiftPrice = new JLabel("Maximum Gift Price:");
		lblMaxGiftPrice.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		txtf_maxgiftprice = new JTextField();
		txtf_maxgiftprice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempMaxGiftPrice = txtf_maxgiftprice.getText();
				maxGiftPrice = Double.parseDouble(tempMaxGiftPrice);
				if (maxGiftPrice < 0) {
					JOptionPane.showMessageDialog(null, "Nice try Mr. Berardi! Prices are POSITIVE numbers");
					txtf_maxgiftprice.setText("");
				}
			}
		});
		txtf_maxgiftprice.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		txtf_maxgiftprice.setColumns(10);
		
		JLabel lblTypeOfOccasion = new JLabel("Type of Occasion:");
		lblTypeOfOccasion.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		JRadioButton rbBirthday = new JRadioButton("Birthday/Christmas");
		buttonGroup_1.add(rbBirthday);
		rbBirthday.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rbBirthday.setBackground(Color.WHITE);
		
		JRadioButton rdbtnJobPromotion = new JRadioButton("Job Promotion");
		buttonGroup_1.add(rdbtnJobPromotion);
		rdbtnJobPromotion.setBackground(Color.WHITE);
		rdbtnJobPromotion.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		JRadioButton rdbtnValentinesDayanniversary = new JRadioButton("Valentine's Day/Anniversary");
		buttonGroup_1.add(rdbtnValentinesDayanniversary);
		rdbtnValentinesDayanniversary.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		rdbtnValentinesDayanniversary.setBackground(Color.WHITE);
		
		JLabel lblInterests = new JLabel("Interests:");
		lblInterests.setFont(new Font("Century Gothic", Font.BOLD, 16));
		
		////////////////CHECKBOXES////////////////////
		
		cbSports = new JCheckBox("Sports");
		cbSports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbSports.isSelected()) {
					sportsInterest = true;

				}
				/*
				 * for (int i = 1; i < gifts.size(); i++) {
					
					if (sportsInterest == true && gifts.get(i).type == "sports") {
						gifts.get(i).score += 1;
				}
				}
				*/
					
					
			}
				
		});
		cbSports.setBackground(Color.WHITE);
		cbSports.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbClothes = new JCheckBox("Clothes");
		cbClothes.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(cbClothes.isSelected()) {
						clothesInterest = true;
						/*for (int i = 1; i < gifts.size(); i++) {
						if (clothesInterest == true && gifts.get(i).type == "clothes") {
							gifts.get(i).score += 1;
						}
				}
				*/
				
			}
			}
			

		});
		cbClothes.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbClothes.setBackground(Color.WHITE);
		
		cbToys = new JCheckBox("Toys");
		cbToys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbToys.isSelected()) {
					toysInterest = true;
				}
				/*for (int i = 1; i < gifts.size(); i++) {
					if (toysInterest == true && gifts.get(i).type == "toys") {
						gifts.get(i).score += 1;
					}
				
			}
			*/
			}
		});
		cbToys.setBackground(Color.WHITE);
		cbToys.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbEducation = new JCheckBox("Education/School/Arts");
		cbEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbEducation.isSelected()) {
					educationInterest = true;
				}
			}
		});
		cbEducation.setBackground(Color.WHITE);
		cbEducation.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		
		cbElectronics = new JCheckBox("Electronics");
		cbElectronics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbElectronics.isSelected()) {
					electronicsInterest = true;
				}
			}
		});
		cbElectronics.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbElectronics.setBackground(Color.WHITE);
		
		cbAccesories = new JCheckBox("Accesories");
		cbAccesories.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbAccesories.isSelected()) {
					accesoriesInterest = true;
				}
			}
		});
		cbAccesories.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbAccesories.setBackground(Color.WHITE);
		
		cbHouseItems = new JCheckBox("House Items");
		cbHouseItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cbHouseItems.isSelected()) {
					houseItemsInterest = true;
				}
			}
		});
		cbHouseItems.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		cbHouseItems.setBackground(Color.WHITE);
		
		
		///////////////////END OF CHECKBOXES//////////////////
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblLogo2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTypeOfOccasion, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(rbMale, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblMinGiftPrice))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(0)
										.addComponent(rbFemale)
										.addGap(98)
										.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(comboAge, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(rbBirthday, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(rdbtnJobPromotion, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtf_mingiftprice, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
												.addGap(185)
												.addComponent(txtf_maxgiftprice, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
											.addComponent(rdbtnValentinesDayanniversary, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(114)
										.addComponent(lblMaxGiftPrice)))
								.addPreferredGap(ComponentPlacement.RELATED))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblInterests, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(cbElectronics)
										.addGap(18)
										.addComponent(cbAccesories, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(cbHouseItems, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(cbSports, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbClothes, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbToys, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(cbEducation, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addGap(101))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(241, Short.MAX_VALUE)
					.addComponent(lblRecipientAndOccasion, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(233))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(276)
					.addComponent(btnSearch)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblLogo2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblRecipientAndOccasion, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbMale, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbFemale))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMinGiftPrice, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtf_mingiftprice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMaxGiftPrice, GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
						.addComponent(txtf_maxgiftprice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTypeOfOccasion)
						.addComponent(rbBirthday, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnJobPromotion))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnValentinesDayanniversary, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblInterests, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbSports)
								.addComponent(cbClothes)
								.addComponent(cbToys)
								.addComponent(cbEducation))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(cbElectronics)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(cbHouseItems)
							.addComponent(cbAccesories)))
					.addGap(18)
					.addComponent(btnSearch)
					.addGap(29))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
}
