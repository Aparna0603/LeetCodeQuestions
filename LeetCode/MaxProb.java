public class MaxProb {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
    double prob[] = new double[n];
    prob[start_node] = 1.0;



    //bellmanford 
    for(int i=0; i<n-1; i++) {
      
        boolean isChanged = false;
        int j=0;
        for(int edge[] : edges) {
        
       
            int u = edge[0];
            int v = edge[1];
            double sp = succProb[j];
            if(prob[u]* sp > prob[v]) {
                prob[v] = prob[u]*sp;
                isChanged = true;
            }
            if(prob[v]* sp> prob[u]) {
prob[u] = prob[v] * sp;
isChanged = true;
            }
        
            j++;
        }
        if(!isChanged) {
            break;
        }
    }
        return prob[end_node];
    }
    
    public static void main(String args[]) {
        MaxProb mp = new MaxProb();
        int n = 3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5,0.5,0.2};
        int start_node = 0;
        int end_node = 2;

        double result = mp.maxProbability(n, edges, succProb, start_node, end_node);

        System.out.println("Maximum probability starting from" + " "+ start_node + " "+ "to" + " "+ end_node +" "+ "is" +" "+ result);

    }
}

