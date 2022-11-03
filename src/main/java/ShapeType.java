public enum ShapeType {

    NoShape(new int[][]{{0, 0}, {0, 0}, {0, 0}, {0, 0}}),
    ZShape(new int[][]{{0, -1}, {0, 0}, {-1, 0}, {-1, 1}}),
    SShape(new int[][]{{0, -1}, {0, 0}, {1, 0}, {1, 1}}),
    LineShape(new int[][]{{0, -1}, {0, 0}, {0, 1}, {0, 2}}),
    TShape(new int[][]{{-1, 0}, {0, 0}, {1, 0}, {0, 1}}),
    SquareShape(new int[][]{{0, 0}, {1, 0}, {0, 1}, {1, 1}}),
    LShape(new int[][]{{-1, -1}, {0, -1}, {0, 0}, {0, 1}}),
    MirroredLShape(new int[][]{{1, -1}, {0, -1}, {0, 0}, {0, 1}});

    public int[][] getCoordsTable() {
        return coordsTable;
        //
    }

    private int[][] coordsTable;



    ShapeType(int[][] coordsTable) {
        this.coordsTable = coordsTable;
    }

}
