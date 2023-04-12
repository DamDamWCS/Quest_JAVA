public class Movies {
    public static void main(String[] args) {
        String[] filmTitles = {"Indiana Jones and the Kingdom of the Crystal Skull", "Indiana Jones and the Last Crusade", "Indiana Jones and the Temple of Doom"};
        String[][] actors = {{"Harrison Ford", "Cate Blanchett", "Shia LaBeouf"}, {"Harrison Ford", "Sean Connery", "Denholm Elliott"}, {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"}};
        
        for (int i = 0; i < filmTitles.length; i++) {
            System.out.print("Dans le film " + filmTitles[i] + ", les principaux acteurs sont : ");
            for (int j = 0; j < actors[i].length; j++) {
                System.out.print(actors[i][j]);
                if (j != actors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
