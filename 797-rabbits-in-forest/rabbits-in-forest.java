class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        int totalRabbits = 0;

        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (int k : map.keySet()) {
            int count = map.get(k);
            int groupSize = k + 1;
            int numGroups = (int) Math.ceil((double) count / groupSize);
            totalRabbits += numGroups * groupSize;
        }

        return totalRabbits;
    }
}