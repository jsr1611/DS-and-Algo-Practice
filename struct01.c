//Calculating and displaying the intersection between two rectangles

#include <stdio.h>
#include <graphics.h>

struct Rect {

int left;
int bottom;
int right;
int top; };

int main(){

// gm is Graphics mode which is a computer display mode that generates image using pixels. 
// DETECT is a macro defined in "graphics.h" header file 
int gdriver = DETECT, gmode; 

//Instantiating the structures 
struct Rect rect_t;
struct Rect rect_tx;
struct Rect rect_ty;

//first rectangle
rect_t.left = 275;
rect_t.top = 80;
rect_t.right = 190;
rect_t.bottom = 150;

//second rectangle
rect_tx.left = 50;
rect_tx.top = 50;
rect_tx.right = 200;
rect_tx.bottom = 200;

// initgraph initializes the graphics system by loading a graphics driver from disk 
initgraph(&gdriver, &gmode, NULL); 

//drawing rectangles
rectangle(rect_t.left, rect_t.top, rect_t.right, rect_t.bottom);
printf("First rectangle: (%d,%d) (%d,%d)\n", rect_t.left, rect_t.top, rect_t.right, rect_t.bottom);

rectangle(rect_tx.left, rect_tx.top, rect_tx.right, rect_tx.bottom);
printf("Second rectangle: (%d,%d) (%d,%d)\n",rect_tx.left, rect_tx.top, rect_tx.right, rect_tx.bottom);

//third rectangle = intersection of the two
if(rect_t.left < rect_tx.left) { rect_ty.left = rect_tx.left; }
else{ 
if(rect_t.left>rect_t.right){rect_ty.left = rect_tx.right;}
else{rect_ty.left = rect_t.left; }}

if(rect_t.top < rect_tx.top){ rect_ty.top = rect_tx.top; }
else{ 
if(rect_t.left < rect_tx.left && rect_t.top>rect_tx.top){rect_ty.top = rect_t.top;}
else if(rect_t.left < rect_tx.left){rect_ty.top = rect_tx.top;} 
else{ rect_ty.top = rect_t.top; }}

if(rect_t.right < rect_tx.right){ 
rect_ty.right = rect_t.right; }
else{ rect_ty.right = rect_tx.right; }

if(rect_t.bottom < rect_tx.bottom){ 
if(rect_t.bottom<rect_tx.top){rect_ty.bottom = rect_t.top;}
else{rect_ty.bottom = rect_t.bottom; }}
else{ rect_ty.bottom = rect_tx.bottom; }


setcolor(RED);
rectangle(rect_ty.left, rect_ty.top, rect_ty.right, rect_ty.bottom);

printf("Intersection: (%d,%d) (%d,%d)\n", rect_ty.left, rect_ty.top, rect_ty.right, rect_ty.bottom);
//filling the intersection with color
floodfill(rect_ty.left + (rect_ty.right - rect_ty.left)/10, rect_ty.top+(rect_ty.bottom - rect_ty.top)/10, WHITE);

printf("Center point: %d %d\n", rect_ty.top+(rect_ty.bottom - rect_ty.top)/5, rect_ty.left + (rect_ty.right - rect_ty.left)/3);

//clean up
getch();
// closegraph function closes the graphics mode and deallocates all memory allocated by graphics system . 
closegraph(); 

return 0;
}
