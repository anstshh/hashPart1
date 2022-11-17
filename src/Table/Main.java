package Table;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> set = new HashSet<>(15);
        while (set.size() <15){
            set.add(new Task());
        }
        set.forEach(t-> System.out.println(t.getTask()));
    }
    private static class Task {
        private final String sum,sum2;

        Task(){
            int task1 = (int) (Math.random() * 8 + 2);
            int task2 = (int) (Math.random() * 8 + 2);
            sum = String.format("%d*%d" , task1, task2);
            sum2 = String.format("%d*%d",task2,task1);
        }
        String getTask(){
            return sum;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task = (Task) o;
            return (sum.equals(task.sum) || sum.equals(task.sum2));
        }

        @Override
        public int hashCode() {
            return sum.hashCode() + sum2.hashCode();
        }
    }
}