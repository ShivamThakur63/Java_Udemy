public class S06_74_EX29 {
        
        public static int getBucketCount(double width,double height,double areaPerBucket,int extraBuckets){
            double area=(height*width);
            double remainingarea = area-extraBuckets*areaPerBucket;
            
            if(width<=0||height<=0||areaPerBucket<=0||extraBuckets<0){
                return -1;
            }
            return getBucketCount(remainingarea,areaPerBucket);
        }
        public static int getBucketCount(double width,double height,double areaPerBucket){
             double area=(height*width);
             double Bucketsneeded=(area/areaPerBucket);
         
         if(width<=0||height<=0||areaPerBucket<=0){
             return -1;
         }
         return (int)Math.ceil(Bucketsneeded);
        }
         public static int getBucketCount(double area,double areaPerBucket){
             if(areaPerBucket<=0||area<=0){
                 return -1;
             }
             double bucketneeded=(area/areaPerBucket);
        
        return (int)Math.ceil(bucketneeded);
    }
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(3.4, 0.00, 1.5));
        System.out.println(getBucketCount(6.12, 3.11, 1.25, 2));
    }
    
}
