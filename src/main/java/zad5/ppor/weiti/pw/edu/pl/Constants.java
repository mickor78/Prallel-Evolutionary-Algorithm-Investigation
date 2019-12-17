package zad5.ppor.weiti.pw.edu.pl;

public class Constants {

    public static class Range {
        public static final double MAX_FEATURE_IN_GENOTYPE = 40;
        public static final double MIN_FEATURE_IN_GENOTYPE = -40;
        Range() {
            throw new AssertionError();
        }
    }
    public static class Genotype {

        public static final int FEATURES_NUM_IN_2_FT_GENOTYPE = 2;
        public static final int FEATURES_NUM_IN_10_FT_GENOTYPE = 10;
        public static final int FEATURES_NUM_IN_20_FT_GENOTYPE = 20;
        public static final int FEATURES_NUM_IN_50_FT_GENOTYPE = 50;
        public static final int FEATURES_NUM_IN_100_FT_GENOTYPE = 100;
        public static final int FEATURES_NUM_IN_1000_FT_GENOTYPE = 1000;
        Genotype() {
            throw new AssertionError();
        }
    }
    public static class Population {

        public static final int POPULATION_SIZE_10 = 10;
        public static final int POPULATION_SIZE_50 = 50;
        public static final int POPULATION_SIZE_100 = 100;
        public static final int POPULATION_SIZE_500 = 500;
        public static final int POPULATION_SIZE_1000 = 1000;
        public static final int POPULATION_SIZE_5000 = 5000;
        public Population() {
            throw new AssertionError();
        }
    }
    public static class Algorothm {
        public static final long NANOSEC_PER_SEC = 1000l*1000*1000;
        public static final double NUMBER_OF_LAMBDA_POPULATION = 0.3;
        public static final double PROBABILITY_OF_GENE_MUTATION = 0.05;
        public static final double NUMBER_OF_GENOTYPES_TO_EXCHANGE = 0.1;
        public static final double NUMBER_OF_POPULATION_TO_CROSSOVER = 0.6;
        public static final double NUMBER_OF_ITERATION_BEFORE_CROSOVER = 100;


        public Algorothm() {
            throw new AssertionError();
        }

    }
    public static class Presentation{
        public static final boolean MODE = true;
    }
}
