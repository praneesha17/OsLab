package os;
class Processs implements Comparable<Processs> {
    int burstTime;
    int waitingTime;
    int turnaroundTime;

    public Processs(int burstTime) {
        this.burstTime = burstTime;
    }

    @Override
    public int compareTo(Processs o) {
        return this.burstTime - o.burstTime;
    }
}