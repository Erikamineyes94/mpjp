package s070;

public class Dog implements BarkAndWag {
    @Override //me la devi andare a prendere in bark and wag
    public String bark() {
        return "woof!";
    }

    public String bark(int count) { //metodo bark che me la fa abbaiare più volte
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());// per tot volte bark
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}