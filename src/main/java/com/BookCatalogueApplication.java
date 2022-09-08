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
		};
	}
}
