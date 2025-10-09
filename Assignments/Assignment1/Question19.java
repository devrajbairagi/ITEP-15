 class Question19 {
    public static void main(String[] args) {
        int cubeSide = 7;
        int cuboidLength = 7, cuboidBreadth = 4, cuboidHeight = 8;

        int cubeVolume = cubeSide * cubeSide * cubeSide;
        int cuboidVolume = cuboidLength * cuboidBreadth * cuboidHeight;

        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume: " + cubeVolume + " cm³");
        } else {
            System.out.println("Cuboid has more volume: " + cuboidVolume + " cm³");
        }
    }
}