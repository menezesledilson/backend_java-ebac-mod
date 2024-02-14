public class BackupSystem {
    public interface Batch {
        int[] getFileSizes();

        int getTapeSize();
    }

    public int getMinimumTapeCount(final Batch batch) {
        // Implement your logic here to calculate the minimum tape count
        int[] fileSizes = batch.getFileSizes();
        int tapeSize = batch.getTapeSize();

        int totalFileSize = 0;
        for (int fileSize : fileSizes) {
            totalFileSize += fileSize;
        }
        return (int) Math.ceil((double) totalFileSize / tapeSize);
    }

    private static class NewBatch implements Batch {
        @Override
        public int[] getFileSizes() {
            return new int[]{70, 10, 20};
        }

        @Override
        public int getTapeSize() {
            return 100;
        }
    }

    public static void main(String[] args) {
        BackupSystem backupSystem = new BackupSystem();
        Batch batch = new NewBatch();

        System.out.println(backupSystem.getMinimumTapeCount(batch));
    }
}
