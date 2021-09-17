#define PIN_LED 7
unsigned int toggle, toggle_update;

void setup(){
  pinMode(PIN_LED, OUTPUT);
  toggle = 0;
  digitalWrite(PIN_LED, toggle); //turn on LED.
  delay(1000); //wait for 1,000 milliseconds
  
  toggle = 1;
  while(toggle <= 10){
    toggle_update = toggle_state(toggle); //toggle LED value.
    digitalWrite(PIN_LED, toggle_update); //update LED status.
    delay(200); //wait for 200 milliseconds
    toggle++;
  }
}

int toggle_state(int toggle){
  return toggle%2;
}

void loop(){
   digitalWrite(PIN_LED, 1); //turn off LED.
}
