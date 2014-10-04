package leetCode;

import java.util.*;

public class CopyGraph {
	public static UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		if (node == null){
			return null;
		}
		Stack<UndirectedGraphNode> visit = new Stack<UndirectedGraphNode>();
		UndirectedGraphNode copyCur = new UndirectedGraphNode(node.label);
		HashMap<UndirectedGraphNode,UndirectedGraphNode> copyMap = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
		copyMap.put(node, copyCur);
		visit.push(node);
		while (!visit.isEmpty()){
			UndirectedGraphNode cur = visit.pop();
			for (UndirectedGraphNode neighbor : cur.neighbors){
				if (!copyMap.containsKey(neighbor)){
					visit.add(neighbor);
					UndirectedGraphNode copyNeighbor = new UndirectedGraphNode(neighbor.label);
					copyCur.neighbors.add(copyNeighbor);
					copyMap.put(neighbor, copyNeighbor);
				}
				else{
					copyMap.get(cur).neighbors.add(copyMap.get(neighbor));
				}
			}
		}
		return copyCur;
		
		
		
	}
}
