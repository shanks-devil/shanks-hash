package org.shanks.hash.service;

import java.time.LocalTime;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.shanks.hash.handler.Handler;
import org.shanks.hash.model.Node;

public class ConsistencyTime {

	private List<Node> nodes;
	
	private TreeMap<Integer, Node> treeMap = null;
	
	public ConsistencyTime(List<Node> nodes) {
		this.nodes = nodes;
		distribute();
	}
	
	public Handler getTime(LocalTime localTime) {
		if (MapUtils.isNotEmpty(treeMap)) {
			Integer key  = getKey(localTime);
			SortedMap<Integer, Node> tailMap = treeMap.tailMap(key);
			if (tailMap.isEmpty()) {
	            key = treeMap.firstKey();
	        } else {
	            key = tailMap.firstKey();
	        }
	        return treeMap.get(key).getHandler();
		}
		return null;
	}
	
	private void distribute() {
		treeMap = new TreeMap<>();
		if (CollectionUtils.isNotEmpty(nodes)) {
			nodes.forEach(t -> treeMap.put(getKey(t.getLocalTime()), t));
		}
	}
	
	private Integer getKey(LocalTime localTime) {
		return Integer.valueOf(localTime.toSecondOfDay());
	}

}
