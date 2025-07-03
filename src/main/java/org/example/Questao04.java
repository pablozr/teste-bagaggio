import java.util.HashMap;

public class EncontraSoma {
    public static int[] doisNum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];

            if (mapa.containsKey(complemento)) {
                return new int[] { mapa.get(complemento), i };
            }

            mapa.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] resultado1 = doisNum(new int[] {2, 7, 11, 15}, 9);
        System.out.println("Resultado: [" + resultado1[0] + ", " + resultado1[1] + "]");

        int[] resultado2 = doisNum(new int[] {3, 2, 4}, 6);
        System.out.println("Resultado: [" + resultado2[0] + ", " + resultado2[1] + "]");
    }
}
