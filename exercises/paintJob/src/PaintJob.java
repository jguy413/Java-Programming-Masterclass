public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        else {

            double wallArea = width * height;
            int buckets_needed = (int) Math.ceil((wallArea/areaPerBucket) - extraBuckets);
            return buckets_needed;
        }

    }


    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {
            double wallArea = width * height;
            int buckets_needed = (int) Math.ceil(wallArea/areaPerBucket);
            return buckets_needed;
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        else {
            int buckets_needed = (int) Math.ceil(area/areaPerBucket);
            return buckets_needed;
        }

    }

}
