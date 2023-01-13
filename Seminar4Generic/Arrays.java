public class Arrays<T extends Number>{// элемент расширяется от Number
    private T[] nums;//массив Т
    /**
     * Констрктор перечеслияю объекты Т nums раз
     * @param nums
     */
        public Arrays(T... nums) {
            this.nums = nums;
        }
        /**
         * Cреднее значение
         * @return
         */
    public double avg(){
        double sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }

    public boolean sameAvg(Arrays<?> arrays) {
        return Math.abs(this.avg() - arrays.avg()) < 0.0001;
    }
}
