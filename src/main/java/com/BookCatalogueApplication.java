package com;

import com.models.AppUser;
import com.models.Book;
import com.models.Genre;
import com.models.Role;
import com.services.AppUserService;
import com.services.BookService;
import com.services.GenreService;
import com.services.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class BookCatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogueApplication.class, args);
	}

	@Bean
	CommandLineRunner run(AppUserService userService, RoleService roleService, GenreService genreService, BookService bookService){
		return args -> {
//			roleService.saveRole(new Role(null,"ROLE_USER"));
//			roleService.saveRole(new Role(null, "ROLE_ADMIN"));
//
//			userService.saveAppUser(new AppUser(null, "Jesse", "fries", "12345", new ArrayList<>(), new ArrayList<>()));
//
//			userService.addRoleToUser("fries","ROLE_ADMIN");
//			userService.addRoleToUser("fries", "ROLE_USER");

//			genreService.saveGenre(new Genre(null,"Fantasy"));
//			genreService.saveGenre(new Genre(null, "Science Fiction"));
//			genreService.saveGenre(new Genre(null, "Action & Adventure"));
//			genreService.saveGenre(new Genre(null, "Mystery"));
//			genreService.saveGenre(new Genre(null, "Horror"));
//			genreService.saveGenre(new Genre(null,"Thriller and Suspense"));
//			genreService.saveGenre(new Genre(null, "Romance"));
//			genreService.saveGenre(new Genre(null, "LGBTQIA+"));
//			genreService.saveGenre(new Genre(null,"Biography"));
//			genreService.saveGenre(new Genre(null,"Memoir & Autobiography"));
//			genreService.saveGenre(new Genre(null,"Food & Drink"));
//			genreService.saveGenre(new Genre(null,"Self-Help"));
//			genreService.saveGenre(new Genre(null,"History"));
//			genreService.saveGenre(new Genre(null,"Religion & Spirituality"));
//			genreService.saveGenre(new Genre(null,"Science & Technology"));
//
//			bookService.saveBook(new Book(null,"Sufficiently Advanced Magic", "Andrew Rowe", new ArrayList<>(), true, "Arcane Ascension"));
//			bookService.addGenreToBook("Fantasy", "Sufficiently Advanced Magic");
//			bookService.saveBook(new Book(null, "On the Shoulders of Titans", "Andrew Rowe", new ArrayList<>(), true, "Arcane Ascension"));
//			bookService.addGenreToBook("Fantasy", "On the Shoulders of Titans");

			genreService.saveGenre(new Genre(null,"Light Novel"));
			genreService.saveGenre(new Genre(null,"Non-Fiction"));

			bookService.saveBook(new Book(null,"The Torch that Ignites the Stars", "Andrew Rowe", new ArrayList<>(), false, "Arcane Ascension"));
			bookService.addGenreToBook("Fantasy", "The Torch that Ignites the Stars");

			bookService.saveBook(new Book(null, "Six Sacred Swords", "Andrew Rowe", new ArrayList<>(), true, "Weapons and Wielders"));
			bookService.addGenreToBook("Fantasy", "Six Sacred Swords");
			bookService.saveBook(new Book(null, "Diamantine", "Andrew Rowe", new ArrayList<>(), true, "Weapons and Wielders"));
			bookService.addGenreToBook("Fantasy", "Diamantine");
			bookService.saveBook(new Book(null, "Soulbrand", "Andrew Rowe", new ArrayList<>(), true, "Weapons and Wielders"));
			bookService.addGenreToBook("Fantasy", "Soulbrand");

			bookService.saveBook(new Book(null, "The Red Knight", "Miles Cameron", new ArrayList<>(), true, "The Traitor Son Cycle"));
			bookService.addGenreToBook("Fantasy", "The Red Knight");
			bookService.saveBook(new Book(null, "The Fell Sword", "Miles Cameron", new ArrayList<>(), true, "The Traitor Son Cycle"));
			bookService.addGenreToBook("Fantasy", "The Fell Sword");
			bookService.saveBook(new Book(null, "The Dread Wyrm", "Miles Cameron", new ArrayList<>(), true, "The Traitor Son Cycle"));
			bookService.addGenreToBook("Fantasy", "The Dread Wyrm");
			bookService.saveBook(new Book(null, "The Plague of Swords", "Miles Cameron", new ArrayList<>(), true, "The Traitor Son Cycle"));
			bookService.addGenreToBook("Fantasy", "The Plague of Swords");
			bookService.saveBook(new Book(null, "The Fall of Dragons", "Miles Cameron", new ArrayList<>(), true, "The Traitor Son Cycle"));
			bookService.addGenreToBook("Fantasy", "The Fall of Dragons");

			bookService.saveBook(new Book(null, "Forsaken House", "Richard Baker", new ArrayList<>(), true, "The Last Mythal"));
			bookService.addGenreToBook("Fantasy", "Forsaken House");
			bookService.saveBook(new Book(null, "Farthest Reach", "Richard Baker", new ArrayList<>(), true, "The Last Mythal"));
			bookService.addGenreToBook("Fantasy", "Farthest Reach");
			bookService.saveBook(new Book(null, "Final Gate", "Richard Baker", new ArrayList<>(), true, "The Last Mythal"));
			bookService.addGenreToBook("Fantasy", "Final Gate");

			bookService.saveBook(new Book(null, "Kings of the Wyld", "Nicholas Eames", new ArrayList<>(), true, null));
			bookService.addGenreToBook("Fantasy", "Kings of the Wyld");

			bookService.saveBook(new Book(null, "The Way of Kings", "Brandon Sanderson", new ArrayList<>(), true, "The Stormlight Archive"));
			bookService.addGenreToBook("Fantasy", "The Way of Kings");
			bookService.saveBook(new Book(null, "Words of Radiance", "Brandon Sanderson", new ArrayList<>(), true, "The Stormlight Archive"));
			bookService.addGenreToBook("Fantasy", "Words of Radiance");
			bookService.saveBook(new Book(null, "Oathbringer", "Brandon Sanderson", new ArrayList<>(), false, "The Stormlight Archive"));
			bookService.addGenreToBook("Fantasy", "Oathbringer");

			bookService.saveBook(new Book(null, "The Wolf of the North", "Duncan M.Hamilton", new ArrayList<>(), true, "The Wolf of the North Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Wolf ofthe North");
			bookService.saveBook(new Book(null, "Jorundyr's Path", "Duncan M.Hamilton", new ArrayList<>(), true, "The Wolf of the North Trilogy"));
			bookService.addGenreToBook("Fantasy", "Jorundyr's Path");
			bookService.saveBook(new Book(null, "The Blood Debt", "Duncan M.Hamilton", new ArrayList<>(), true, "The Wolf of the North Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Blood Debt");

			bookService.saveBook(new Book(null, "DragonSpell", "Donita K. Paul", new ArrayList<>(), true, "The Dragon Keeper Chronicles"));
			bookService.addGenreToBook("Fantasy", "DragonSpell");
			bookService.saveBook(new Book(null, "DragonQuest", "Donita K. Paul", new ArrayList<>(), true, "The Dragon Keeper Chronicles"));
			bookService.addGenreToBook("Fantasy", "DragonQuest");

			bookService.saveBook(new Book(null, "The Fifth Season", "N. K. Jemisin", new ArrayList<>(), false, "The Broken Earth"));
			bookService.addGenreToBook("Fantasy", "The Fifth Season");
			bookService.saveBook(new Book(null, "The Obelisk Gate", "N. K. Jemisin", new ArrayList<>(), false, "The Broken Earth"));
			bookService.addGenreToBook("Fantasy", "The Obelisk Gate");
			bookService.saveBook(new Book(null, "The Stone Sky", "N. K. Jemisin", new ArrayList<>(), false, "The Broken Earth"));
			bookService.addGenreToBook("Fantasy", "The Stone Sky");

			bookService.saveBook(new Book(null, "The Summoning", "Troy Denning", new ArrayList<>(), true, "The Return of the Archwizards"));
			bookService.addGenreToBook("Fantasy", "The Summoning");
			bookService.saveBook(new Book(null, "The Siege", "Troy Denning", new ArrayList<>(), true, "The Return of the Archwizards"));
			bookService.addGenreToBook("Fantasy", "The Siege");
			bookService.saveBook(new Book(null, "The Sorcerer", "Troy Denning", new ArrayList<>(), true, "The Return of the Archwizards"));
			bookService.addGenreToBook("Fantasy", "The Sorcerer");

			bookService.saveBook(new Book(null, "Swords of Eveningstar", "Ed Greenwood", new ArrayList<>(), true, "The Knights of Myth Drannor"));
			bookService.addGenreToBook("Fantasy", "Swords of Eveningstar");
			bookService.saveBook(new Book(null, "Swords of Dragonfire", "Ed Greenwood", new ArrayList<>(), true, "The Knights of Myth Drannor"));
			bookService.addGenreToBook("Fantasy", "Swords of Dragonfire");
			bookService.saveBook(new Book(null, "The Sword Never Sleeps", "Ed Greenwood", new ArrayList<>(), true, "The Knights of Myth Drannor"));
			bookService.addGenreToBook("Fantasy", "The Sword Never Sleeps");

			bookService.saveBook(new Book(null, "The Crystal Shard", "R. A. Salvatore", new ArrayList<>(), true, "The Icewind Dale Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Crystal Shard");
			bookService.saveBook(new Book(null, "Streams of Silver", "R. A. Salvatore", new ArrayList<>(), true, "The Icewind Dale Trilogy"));
			bookService.addGenreToBook("Fantasy", "Streams of Silver");
			bookService.saveBook(new Book(null, "The Halfling's Gem", "R. A. Salvatore", new ArrayList<>(), true, "The Icewind Dale Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Halfling's Gem");

			bookService.saveBook(new Book(null, "Homeland", "R. A. Salvatore", new ArrayList<>(), true, "The Dark Elf Trilogy"));
			bookService.addGenreToBook("Fantasy", "Homeland");
			bookService.saveBook(new Book(null, "Exile", "R. A. Salvatore", new ArrayList<>(), true, "The Dark Elf Trilogy"));
			bookService.addGenreToBook("Fantasy", "Exile");
			bookService.saveBook(new Book(null, "Sojourn", "R. A. Salvatore", new ArrayList<>(), true, "The Dark Elf Trilogy"));
			bookService.addGenreToBook("Fantasy", "Sojourn");

			bookService.saveBook(new Book(null, "The Silent Blade", "R. A. Salvatore", new ArrayList<>(), true, "Paths of Darkness"));
			bookService.addGenreToBook("Fantasy", "The Silent Blade");
			bookService.saveBook(new Book(null, "The Spine of the World", "R. A. Salvatore", new ArrayList<>(), true, "Paths of Darkness"));
			bookService.addGenreToBook("Fantasy", "The Spine of the World");
			bookService.saveBook(new Book(null, "Servant of the Shard", "R. A. Salvatore", new ArrayList<>(), true, "Paths of Darkness, The Sellswords"));
			bookService.addGenreToBook("Fantasy", "Servant of the Shard");
			bookService.saveBook(new Book(null, "Sea of Swords", "R. A. Salvatore", new ArrayList<>(), true, "Paths of Darkness"));
			bookService.addGenreToBook("Fantasy", "Sea of Swords");

			bookService.saveBook(new Book(null, "The Legacy", "R. A. Salvatore", new ArrayList<>(), true, "Legacy of the Drow"));
			bookService.addGenreToBook("Fantasy", "The Legacy");
			bookService.saveBook(new Book(null, "Starless Night", "R. A. Salvatore", new ArrayList<>(), true, "Legacy of the Drow"));
			bookService.addGenreToBook("Fantasy", "Starless Night");
			bookService.saveBook(new Book(null, "Siege of Darkness", "R. A. Salvatore", new ArrayList<>(), true, "Legacy of the Drow"));
			bookService.addGenreToBook("Fantasy", "Siege of Darkness");
			bookService.saveBook(new Book(null, "Passage to Dawn", "R. A. Salvatore", new ArrayList<>(), true, "Legacy of the Drow"));
			bookService.addGenreToBook("Fantasy", "Passage to Dawn");

			bookService.saveBook(new Book(null, "The Thousand Orcs", "R. A. Salvatore", new ArrayList<>(), true, "The Hunter's Blades Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Thousand Orcs");
			bookService.saveBook(new Book(null, "The Lone Drow", "R. A. Salvatore", new ArrayList<>(), true, "The Hunter's Blades Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Lone Drow");
			bookService.saveBook(new Book(null, "The Two Swords", "R. A. Salvatore", new ArrayList<>(), true, "The Hunter's Blades Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Two Swords");

			bookService.saveBook(new Book(null, "Canticle", "R. A. Salvatore", new ArrayList<>(), true, "The Cleric Quintet"));
			bookService.addGenreToBook("Fantasy", "Canticle");
			bookService.saveBook(new Book(null, "In Sylvan Shadows", "R. A. Salvatore", new ArrayList<>(), true, "The Cleric Quintet"));
			bookService.addGenreToBook("Fantasy", "In Sylvan Shadows");
			bookService.saveBook(new Book(null, "Night Masks", "R. A. Salvatore", new ArrayList<>(), true, "The Cleric Quintet"));
			bookService.addGenreToBook("Fantasy", "Night Masks");
			bookService.saveBook(new Book(null, "The Fallen Fortress", "R. A. Salvatore", new ArrayList<>(), true, "The Cleric Quintet"));
			bookService.addGenreToBook("Fantasy", "The Fallen Fortress");
			bookService.saveBook(new Book(null, "The Chaos Curse", "R. A. Salvatore", new ArrayList<>(), true, "The Cleric Quintet"));
			bookService.addGenreToBook("Fantasy", "The Chaos Curse");

			bookService.saveBook(new Book(null, "Gauntlgrym", "R. A. Salvatore", new ArrayList<>(), true, "Neverwinter Saga"));
			bookService.addGenreToBook("Fantasy", "Gauntlgrym");
			bookService.saveBook(new Book(null, "Neverwinter", "R. A. Salvatore", new ArrayList<>(), true, "Neverwinter Saga"));
			bookService.addGenreToBook("Fantasy", "Neverwinter");
			bookService.saveBook(new Book(null, "Charon's Claw", "R. A. Salvatore", new ArrayList<>(), true, "Neverwinter Saga"));
			bookService.addGenreToBook("Fantasy", "Charon's Claw");
			bookService.saveBook(new Book(null, "The Last Threshold", "R. A. Salvatore", new ArrayList<>(), true, "Neverwinter Saga"));
			bookService.addGenreToBook("Fantasy", "The Last Threshold");

			bookService.saveBook(new Book(null, "Promise of the Witch-King", "R. A. Salvatore", new ArrayList<>(), true, "The Sellswords"));
			bookService.addGenreToBook("Fantasy", "Promise of the Witch-King");
			bookService.saveBook(new Book(null, "Road of the Patriarch", "R. A. Salvatore", new ArrayList<>(), true, "The Sellswords"));
			bookService.addGenreToBook("Fantasy", "Road of the Patriarch");

			bookService.saveBook(new Book(null, "The Hundred Thousand Kingdoms", "N. K. Jemisin", new ArrayList<>(), true, "The Inheritance Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Hundred Thousand Kingdoms");
			bookService.saveBook(new Book(null, "The Broken Kingdoms", "N. K. Jemisin", new ArrayList<>(), true, "The Inheritance Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Broken Kingdoms");
			bookService.saveBook(new Book(null, "The Kingdom of Gods", "N. K. Jemisin", new ArrayList<>(), false, "The Inheritance Trilogy"));
			bookService.addGenreToBook("Fantasy", "The Kingdom of Gods");

			bookService.saveBook(new Book(null, "A Silent Voice 1", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 1");
			bookService.saveBook(new Book(null, "A Silent Voice 2", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 2");
			bookService.saveBook(new Book(null, "A Silent Voice 3", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 3");
			bookService.saveBook(new Book(null, "A Silent Voice 4", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 4");
			bookService.saveBook(new Book(null, "A Silent Voice 5", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 5");
			bookService.saveBook(new Book(null, "A Silent Voice 6", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 6");
			bookService.saveBook(new Book(null, "A Silent Voice 7", "Yoshitoki Oima", new ArrayList<>(), true, "A Silent Voice"));
			bookService.addGenreToBook("Manga", "A Silent Voice 7");

			bookService.saveBook(new Book(null, "Deadman Wonderland 1", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 1");
			bookService.saveBook(new Book(null, "Deadman Wonderland 2", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 2");
			bookService.saveBook(new Book(null, "Deadman Wonderland 3", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 3");
			bookService.saveBook(new Book(null, "Deadman Wonderland 4", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 4");
			bookService.saveBook(new Book(null, "Deadman Wonderland 5", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 5");
			bookService.saveBook(new Book(null, "Deadman Wonderland 6", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 6");
			bookService.saveBook(new Book(null, "Deadman Wonderland 7", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 7");
			bookService.saveBook(new Book(null, "Deadman Wonderland 8", "Jinsei Kataoka, Kazuma Kondou", new ArrayList<>(), true, "Deadman Wonderland"));
			bookService.addGenreToBook("Manga", "Deadman Wonderland 8");

			bookService.saveBook(new Book(null, "Nisekoi 1", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 1");
			bookService.saveBook(new Book(null, "Nisekoi 2", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 2");
			bookService.saveBook(new Book(null, "Nisekoi 3", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 3");
			bookService.saveBook(new Book(null, "Nisekoi 4", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 4");
			bookService.saveBook(new Book(null, "Nisekoi 5", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 5");
			bookService.saveBook(new Book(null, "Nisekoi 6", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 6");
			bookService.saveBook(new Book(null, "Nisekoi 7", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 7");
			bookService.saveBook(new Book(null, "Nisekoi 8", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 8");
			bookService.saveBook(new Book(null, "Nisekoi 9", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 9");
			bookService.saveBook(new Book(null, "Nisekoi 10", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 10");
			bookService.saveBook(new Book(null, "Nisekoi 11", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 11");
			bookService.saveBook(new Book(null, "Nisekoi 12", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 12");
			bookService.saveBook(new Book(null, "Nisekoi 13", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 13");
			bookService.saveBook(new Book(null, "Nisekoi 14", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 14");
			bookService.saveBook(new Book(null, "Nisekoi 15", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 15");
			bookService.saveBook(new Book(null, "Nisekoi 16", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 16");
			bookService.saveBook(new Book(null, "Nisekoi 17", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 17");
			bookService.saveBook(new Book(null, "Nisekoi 18", "Naoshi Komi", new ArrayList<>(), true, "Nisekoi"));
			bookService.addGenreToBook("Manga", "Nisekoi 18");

			bookService.saveBook(new Book(null, "Tokyo Ghoul 1", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 1");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 2", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 2");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 3", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 3");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 4", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 4");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 5", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 5");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 6", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 6");
			bookService.saveBook(new Book(null, "Tokyo Ghoul 7", "Sui Ishida", new ArrayList<>(), true, "Tokyo Ghoul"));
			bookService.addGenreToBook("Manga", "Tokyo Ghoul 7");

			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 1", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 1");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 2", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 2");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 3", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 3");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 4", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 4");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 5", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 5");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 6", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 6");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 7", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 7");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 8", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 8");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 9", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 9");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 10", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 10");
			bookService.saveBook(new Book(null, "Is It Wrong to Try to Pick Up Girls in a Dungeon? 11", "Sui Ishida", new ArrayList<>(), true, "Is It Wrong to Try to Pick Up Girls in a Dungeon?"));
			bookService.addGenreToBook("Light Novel", "Is It Wrong to Try to Pick Up Girls in a Dungeon? 11");

			bookService.saveBook(new Book(null, "Black Clover 1", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 1");
			bookService.saveBook(new Book(null, "Black Clover 2", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 2");
			bookService.saveBook(new Book(null, "Black Clover 3", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 3");
			bookService.saveBook(new Book(null, "Black Clover 4", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 4");
			bookService.saveBook(new Book(null, "Black Clover 5", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 5");
			bookService.saveBook(new Book(null, "Black Clover 6", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 6");
			bookService.saveBook(new Book(null, "Black Clover 7", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 7");
			bookService.saveBook(new Book(null, "Black Clover 8", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 8");
			bookService.saveBook(new Book(null, "Black Clover 9", "Yuki Tabata", new ArrayList<>(), true, "Black Clover"));
			bookService.addGenreToBook("Manga", "Black Clover 9");

			bookService.saveBook(new Book(null, "The Irregular at Magic Highschool 1", "Tsutomu Sato", new ArrayList<>(), true, "The Irregular at Magic Highschool"));
			bookService.addGenreToBook("Light Novel", "The Irregular at Magic Highschool 1");
			bookService.saveBook(new Book(null, "The Irregular at Magic Highschool 2", "Tsutomu Sato", new ArrayList<>(), true, "The Irregular at Magic Highschool"));
			bookService.addGenreToBook("Light Novel", "The Irregular at Magic Highschool 2");
			bookService.saveBook(new Book(null, "The Irregular at Magic Highschool 3", "Tsutomu Sato", new ArrayList<>(), true, "The Irregular at Magic Highschool"));
			bookService.addGenreToBook("Light Novel", "The Irregular at Magic Highschool 3");
			bookService.saveBook(new Book(null, "The Irregular at Magic Highschool 4", "Tsutomu Sato", new ArrayList<>(), true, "The Irregular at Magic Highschool"));
			bookService.addGenreToBook("Light Novel", "The Irregular at Magic Highschool 4");

			bookService.saveBook(new Book(null, "The Demon Prince of Momochi House 1", "Aya Shouoto", new ArrayList<>(), true, "The Demon Prince of Momochi House"));
			bookService.addGenreToBook("Manga", "The Demon Prince of Momochi House 1");
			bookService.saveBook(new Book(null, "The Demon Prince of Momochi House 2", "Aya Shouoto", new ArrayList<>(), true, "The Demon Prince of Momochi House"));
			bookService.addGenreToBook("Manga", "The Demon Prince of Momochi House 2");
			bookService.saveBook(new Book(null, "The Demon Prince of Momochi House 3", "Aya Shouoto", new ArrayList<>(), true, "The Demon Prince of Momochi House"));
			bookService.addGenreToBook("Manga", "The Demon Prince of Momochi House 3");
			bookService.saveBook(new Book(null, "The Demon Prince of Momochi House 4", "Aya Shouoto", new ArrayList<>(), true, "The Demon Prince of Momochi House"));
			bookService.addGenreToBook("Manga", "The Demon Prince of Momochi House 4");

			bookService.saveBook(new Book(null, "Soul Eater 1", "Atsushi Ohkubo", new ArrayList<>(), true, "Soul Eater"));
			bookService.addGenreToBook("Manga", "Soul Eater 1");
			bookService.saveBook(new Book(null, "Soul Eater 2", "Atsushi Ohkubo", new ArrayList<>(), true, "Soul Eater"));
			bookService.addGenreToBook("Manga", "Soul Eater 2");

			bookService.saveBook(new Book(null, "The Seven Deadly Sins 1", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 1");
			bookService.saveBook(new Book(null, "The Seven Deadly Sins 2", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 2");
			bookService.saveBook(new Book(null, "The Seven Deadly Sins 3", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 3");
			bookService.saveBook(new Book(null, "The Seven Deadly Sins 4", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 4");
			bookService.saveBook(new Book(null, "The Seven Deadly Sins 5", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 5");
			bookService.saveBook(new Book(null, "The Seven Deadly Sins 6", "Nakaba Suzuki", new ArrayList<>(), true, "The Seven Deadly Sins"));
			bookService.addGenreToBook("Manga", "The Seven Deadly Sins 6");

			bookService.saveBook(new Book(null, "Black Lagoon 1", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 1");
			bookService.saveBook(new Book(null, "Black Lagoon 2", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 2");
			bookService.saveBook(new Book(null, "Black Lagoon 4", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 4");
			bookService.saveBook(new Book(null, "Black Lagoon 5", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 5");
			bookService.saveBook(new Book(null, "Black Lagoon 7", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 7");
			bookService.saveBook(new Book(null, "Black Lagoon 8", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 8");
			bookService.saveBook(new Book(null, "Black Lagoon 10", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 10");
			bookService.saveBook(new Book(null, "Black Lagoon 11", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 11");
			bookService.saveBook(new Book(null, "Black Lagoon 12", "Rei Hiroe", new ArrayList<>(), true, "Black Lagoon"));
			bookService.addGenreToBook("Manga", "Black Lagoon 12");

			bookService.saveBook(new Book(null, "Unmasking Autism", "Devon Price", new ArrayList<>(), false, null));
			bookService.addGenreToBook("Non-Fiction", "Unmasking Autism");

			bookService.saveBook(new Book(null, "The Power of Neurodiversity: Unleashing the Advantages of Your Differently Wired Brain", "Thomas Armstrong", new ArrayList<>(), false, null));
			bookService.addGenreToBook("Non-Fiction", "The Power of Neurodiversity: Unleashing the Advantages of Your Differently Wired Brain");

			bookService.saveBook(new Book(null, "The Color of Law", "Richard Rothstein", new ArrayList<>(), false, null));
			bookService.addGenreToBook("Non-Fiction", "The Color of Law");

			bookService.saveBook(new Book(null, "Therapy Game 1", "Meguru Hinohara", new ArrayList<>(), true, "Therapy Game"));
			bookService.addGenreToBook("Manga", "Therapy Game 1");
			bookService.saveBook(new Book(null, "Therapy Game 2", "Meguru Hinohara", new ArrayList<>(), true, "Therapy Game"));
			bookService.addGenreToBook("Manga", "Therapy Game 2");

			bookService.saveBook(new Book(null, "Thigh High Reiwa Hanamaru Academy 1", "Kotobuki", new ArrayList<>(), true, "Thigh High Reiwa Hanamaru Academy"));
			bookService.addGenreToBook("Manga", "Thigh High Reiwa Hanamaru Academy 1");
			bookService.saveBook(new Book(null, "Thigh High Reiwa Hanamaru Academy 2", "Kotobuki", new ArrayList<>(), true, "Thigh High Reiwa Hanamaru Academy"));
			bookService.addGenreToBook("Manga", "Thigh High Reiwa Hanamaru Academy 2");
			bookService.saveBook(new Book(null, "Thigh High Reiwa Hanamaru Academy 3", "Kotobuki", new ArrayList<>(), true, "Thigh High Reiwa Hanamaru Academy"));
			bookService.addGenreToBook("Manga", "Thigh High Reiwa Hanamaru Academy 3");

			bookService.saveBook(new Book(null, "Frieren 1", "Kotobuki", new ArrayList<>(), true, "Frieren"));
			bookService.addGenreToBook("Manga", "Frieren 1");

		};
	}
}
