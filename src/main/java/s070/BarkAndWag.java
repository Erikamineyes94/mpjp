package s070;

interface BarkAndWag extends Barker {//fa extend di barker
    int AVG_WAGGING_SPEED = 12;

    int tailWaggingSpeed();//metodo -- per implementare barkandwag,vanno definiti entrambi i metodi sia bark che wag
}