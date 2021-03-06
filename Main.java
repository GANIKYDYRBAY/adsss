import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyWeightedGraph<String> graph = new MyWeightedGraph<>(true);

        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

        System.out.println("Dijkstra:");
        MySearch<String> djk = new MyDijkstraSearch<>(graph, "Almaty");
        outputPath(djk, "Kyzylorda");

        System.out.println("DFS:");
        MySearch<String> dfs = new MyDFS<>(graph, "Almaty");
        outputPath(dfs, "Kyzylorda");

        System.out.println("\n--------------------------------");

        System.out.println("BFS:");
        MySearch<String> bfs = new MyBFS<>(graph, "Almaty");
        outputPath(bfs, "Kyzylorda");
    }
    public static void outputPath(MySearch<String> search,String key){
        for(String v: search.pathTo(key)){
            System.out.print(v+" -> ");
        }
        System.out.println();
    }
}