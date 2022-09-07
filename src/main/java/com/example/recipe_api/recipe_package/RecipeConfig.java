package com.example.recipe_api.recipe_package;

import java.sql.Time;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecipeConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecipeRepository recipeRepository) {
        return args -> {
            Recipe r1 = new Recipe(
                    "Roasted Squash with Black Lentils, Feta & Cavolo Nero Pesto",
                    "https://lh3.googleusercontent.com/MPVpp11sxRlxt8svQb3zkYi_Mm7wuKrLPmSlzgifHmXKUFsM0HGXjsPS3TiyLfR-64fIc4Y_6NYCR2kP4tlj=s360",
                    5,
                    Time.valueOf("00:45:00"),
                    "Ad eiusmod sint tempor duis veniam. Commodo est eiusmod anim officia aliqua enim. Reprehenderit minim sit proident voluptate incididunt exercitation duis ad laborum sint aute sit. Commodo dolore aliquip nostrud amet elit exercitation reprehenderit elit amet exercitation mollit est. Ullamco cupidatat consequat proident ea cillum. Cillum ut et duis mollit commodo irure elit occaecat cillum occaecat laboris.");
            Recipe r2 = new Recipe(
                    "Burrata with Berries and Honey",
                    "https://lh3.googleusercontent.com/pCirTD1FS_oRxKK9JaiqexhCX2ENFEU-4FBKyvebqlCmuwwgDfK2lQ6BYDPz-9AiE1aZeLipU1wEu7aAbjNZGe6UnyduTJ6n4jk=s360",
                    2,
                    Time.valueOf("01:45:00"),
                    "Enim non aliqua excepteur incididunt sint ea fugiat anim dolor do deserunt ex nostrud. Quis deserunt id et cupidatat incididunt ea Lorem ea anim magna sit aute. Tempor id in voluptate laborum in incididunt esse aute ullamco. Excepteur proident est enim excepteur esse enim eiusmod nostrud consequat fugiat ut do excepteur.");
            Recipe r3 = new Recipe(
                    "Oaxaca Cheese and Black Bean Quesadilla",
                    "https://lh3.googleusercontent.com/j4j-KhJH6oLGJiLV1_ZNmxsGf_gvhHpTLzG8To09Jv8RK-Vg0bRcrMb3bdU7jycyUfn0xd_gEfmFD1c7phKllAo03kSFSbpcfg",
                    3,
                    Time.valueOf("00:48:00"),
                    "Ut deserunt sint anim veniam dolore ut incididunt reprehenderit. Occaecat Lorem fugiat excepteur veniam ex qui sunt mollit proident mollit anim. Amet nostrud non fugiat culpa culpa qui ad proident incididunt qui laboris deserunt velit non. Deserunt consectetur sint qui culpa.");
            Recipe r4 = new Recipe(
                    "Ramen Party Salad",
                    "https://lh3.googleusercontent.com/h1Xii8Pso9-TRulTfSvikyHOhXMXXkb-E0XUceC8lPKc8hCVwX_epRRrqYKxb90tl3xWvxpjScnzBrFDGJw-K9joKBWXQF068Yg",
                    4,
                    Time.valueOf("01:25:00"),
                    "Ea reprehenderit qui est cillum anim nisi. Sunt esse non tempor eiusmod velit. Consequat magna occaecat sit magna aliqua enim aliqua fugiat amet nulla id. Dolor ipsum officia incididunt id excepteur. Excepteur pariatur consequat occaecat ullamco proident dolore id sit eu. Labore non sint et ullamco minim nostrud laboris id do et eiusmod dolore. Nostrud sunt et et adipisicing aliquip quis id.");
            Recipe r5 = new Recipe(
                    "Perfect New York Cheesecake",
                    "https://lh3.googleusercontent.com/97vM-Fw3FFFuJ_3gx_xkz_PXuVlw0vMhhNprq6NECO-6YZ3EIVjBHVhXiB_8u33ygmtirgD-f8rYhoWYxMdcYw",
                    4,
                    Time.valueOf("01:10:00"),
                    "Voluptate sit velit ex elit minim cillum ea exercitation deserunt. Sint dolor nulla labore reprehenderit aliquip est. Dolor ea irure id officia ex duis exercitation. Duis sint eiusmod Lorem eu aliquip id mollit consequat est consequat incididunt reprehenderit. Veniam mollit proident aute aliqua eu dolore mollit ex deserunt est. Labore labore deserunt labore eu do mollit sit elit officia.");
            Recipe r6 = new Recipe(
                    "Ham Bone Soup",
                    "https://lh3.googleusercontent.com/ZhqeoG_nD8ylXOurp2GpvZ7MFlvBjrHnRHeXOpFpSgiTD3CxkyJeCjfNc-Uy7oBt-v9t9O813sOjxvIzG54zSw",
                    5,
                    Time.valueOf("00:50:00"),
                    "Ullamco esse magna quis labore amet cillum veniam aliqua deserunt veniam est dolore eu. Mollit elit fugiat eiusmod mollit laborum sint reprehenderit enim. Pariatur ipsum mollit tempor ut aliqua id Lorem ad elit duis sint. Deserunt tempor amet nulla culpa ullamco laborum ut. Incididunt esse in duis nisi esse pariatur adipisicing. Nisi aute nisi ut eiusmod ad dolore consequat esse.");
            Recipe r7 = new Recipe(
                    "How to Cook Bacon in the Oven",
                    "https://images.ctfassets.net/3vz37y2qhojh/6lAYHhaWqUKLZI4RjtnhEw/4ec75add57f098d62cb90fa773cbfdc8/How-To-Cook-Bacon-In-The-Oven-Hero-Horizontal.jpg",
                    1,
                    Time.valueOf("01:15:00"),
                    "Minim commodo ut id in. Non excepteur officia in nostrud esse adipisicing velit qui ipsum ipsum culpa nulla. Ipsum consectetur pariatur ad ad ut tempor proident fugiat proident nulla nulla deserunt est. Et culpa sit ad sit. Veniam labore aliqua laboris nulla eu amet exercitation dolor consequat nostrud. Mollit proident laborum culpa voluptate esse excepteur pariatur consectetur sunt. Lorem id adipisicing cupidatat ad fugiat voluptate in aliquip excepteur fugiat in.");
            Recipe r8 = new Recipe(
                    "The Best Fire Roasted Salsa with Divine Flavor Tomatoes",
                    "https://lh3.googleusercontent.com/lnMrR54CwAaGhkbg8PjAZCoZfg3-4vAXEUGQoaR8GuR1qFAJal8YD7-4XDAnd0rTWY_bqGWnZ85q5XdYnWDuZA",
                    5,
                    Time.valueOf("01:05:00"),
                    "Mollit anim est laborum ex adipisicing magna incididunt adipisicing anim. Est voluptate incididunt ullamco magna ea anim laborum excepteur culpa mollit minim non. Culpa tempor amet velit quis sint velit cillum sint Lorem id proident. Ea veniam officia commodo enim occaecat enim exercitation officia dolore quis pariatur. Enim adipisicing do velit adipisicing mollit et. Eu fugiat pariatur proident cupidatat elit amet velit officia.");
            Recipe r9 = new Recipe(
                    "18 Essential Summer Cocktail Recipes",
                    "https://images.ctfassets.net/3vz37y2qhojh/2sXgqihcjj4Zr7p8ZhIiVN/677da543a8937f9eeef84a53a2fe9564/pepper-delight-peach-margarita-1-hero.jpg",
                    5,
                    Time.valueOf("02:45:00"),
                    "Laborum exercitation commodo magna ipsum eiusmod sunt labore ipsum aliqua. Eu dolor ut exercitation est labore. Eiusmod pariatur ullamco nostrud aute fugiat elit velit ad elit id in proident reprehenderit.");
            Recipe r10 = new Recipe(
                    "Keto Low Carb Peanut Butter Protein Balls",
                    "https://lh3.googleusercontent.com/iQ5s10M4pZiBeT3gc_lNmDwMXi9NUDLm5Um-4rCW0gl4RaQQyO4AsJXivkEQs0RhjlbmWA6WD_aFunNOYYHpEr4",
                    2,
                    Time.valueOf("01:30:00"),
                    "Tempor enim sint quis ullamco duis duis tempor. Ad nostrud ea ipsum laborum irure sunt sint esse adipisicing nulla ipsum reprehenderit. Ut ullamco cupidatat non labore qui ullamco sunt eu in veniam laboris. Laborum cillum tempor elit fugiat aute non anim. Cillum excepteur labore magna sint laborum anim dolore sint officia enim. Enim ea consequat magna amet dolore. Adipisicing deserunt duis enim duis ipsum sit anim.");
            Recipe r11 = new Recipe(
                    "Drunken Noodles",
                    "https://lh3.googleusercontent.com/1q3MdfPjBTAq-9myoPlPZpE8TK3fBhaL2s2XTtcbm1cOYph7MD5qaBFYmTjL4FXFL1zhX2m6VtSifaYTBthjb-k",
                    3,
                    Time.valueOf("03:45:00"),
                    "Consequat excepteur quis proident proident aute Lorem sit consectetur. Nulla magna elit minim in voluptate excepteur fugiat ullamco laboris culpa mollit exercitation. Commodo non cillum minim Lorem tempor ipsum pariatur labore in pariatur. Enim labore duis sunt occaecat commodo cillum commodo do enim consequat reprehenderit.");
            Recipe r12 = new Recipe(
                    "Chess Pie",
                    "https://lh3.googleusercontent.com/50PkIwNjLzcDoI51P3UKS1dxUIp-aLIo5rdPDVhRTcp6wdgEsdc89cSN_fkVuYEgAB9AhYL4V07_u-Sskqs4VA",
                    5,
                    Time.valueOf("02:30:00"),
                    "Veniam eu enim labore ullamco consequat ipsum Lorem qui est nisi. Aliqua ipsum laborum veniam enim deserunt officia mollit est laboris in aute aliquip incididunt. Velit commodo aute aliquip sit.");
            Recipe r13 = new Recipe(
                    "Apple Cobbler",
                    "https://lh3.googleusercontent.com/82k0Ha3oUbIF1izMdkBG6JhKTjnr_VyAuhufo_QI-xZ5-3oVsdpM4-yk0Vc0oSMLb6JoNbI3pdFsEluj3NnqQA",
                    5,
                    Time.valueOf("04:00:00"),
                    "Fugiat occaecat occaecat minim officia officia nostrud eiusmod ad do amet consequat. Amet voluptate et duis magna quis occaecat. Aliquip ad aute amet do proident cillum. Cillum consequat irure est excepteur aliquip aute magna ex. Est in aute tempor magna aliqua sint reprehenderit consequat sunt laboris ut mollit pariatur anim. Exercitation ad reprehenderit ea ipsum velit voluptate cillum irure.");
            Recipe r14 = new Recipe(
                    "Orange Olive Oil Cake",
                    "https://lh3.googleusercontent.com/o3ws4P_T5E53HU-ambQ-dw15KEMCYyIY8ze_TbiXnmHy8pOO1GjBnqyYRAwEGdi4JMWGTKtVIv3JxOkwdE-gPcw",
                    4,
                    Time.valueOf("00:20:00"),
                    "Fugiat esse do elit in mollit ut culpa quis in elit laborum. Pariatur culpa eu voluptate anim elit. Voluptate id in commodo sunt. Non excepteur mollit velit in do reprehenderit nisi consequat fugiat sit veniam irure cupidatat. Aliqua magna magna sint ut ullamco fugiat nostrud eiusmod magna non nulla mollit.");
            Recipe r15 = new Recipe(
                    "Kick It Cali-style Over Labor Day Weekend With Summer’s Best Produce",
                    "https://images.ctfassets.net/3vz37y2qhojh/4yZd7x9rWe4rHH2W0nlYy9/385ff4ac7deb7fce38aa80e922bbf7f8/Sliced-Wines_MothersDayCake.jpg",
                    5,
                    Time.valueOf("03:40:00"),
                    "Incididunt dolor occaecat ea adipisicing est irure anim anim aute amet in amet sunt consectetur. Ex nisi pariatur eu voluptate. Ullamco pariatur sint enim id ea. Exercitation officia culpa irure deserunt est enim in.");

            recipeRepository.saveAll(List.of(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15));
        };
    }
}
