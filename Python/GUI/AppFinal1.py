import tkinter as tk

class Makanan:
    hargaBurgerAyam = 14000
    hargaBurgerSapi = 16000
    hargaSoda = 6000
    hargaAirMineral = 4000

    def __init__(self, burgerAyam=0, burgerSapi=0, soda=0, air=0):
        self.jmlBurgerA = burgerAyam
        self.jmlBurgerS = burgerSapi
        self.jmlSoda = soda
        self.jmlair = air

    def totalMakanan(self):
        return (self.jmlBurgerA * Makanan.hargaBurgerAyam + self.jmlBurgerS * Makanan.hargaBurgerSapi)
    
    def totalMakananTambahan(self):
        return (self.jmlSoda * Makanan.hargaSoda + self.jmlair * Makanan.hargaAirMineral)

    def setJumlahMakan(self, burgerAyam=0, burgerSapi=0):
        self.jmlBurgerA = burgerAyam
        self.jmlBurgerS = burgerSapi

    def setJumlahMakananTambahan(self, soda=0, airMineral=0):
        self.jmlSoda = soda
        self.jmlair = airMineral

    def total(self):
        return self.totalMakanan() + self.totalMakananTambahan()

entryAir = 0
entrySoda = 0
pesanan = Makanan()
root= tk.Tk()
root.title("Airestau")
root.resizable(width = False, height = False)


lblRestaurant = tk.Label(root, text = "AiRestau")
lblRestaurant.grid(row = 0, column = 3)

lblBurgerSapi = tk.Label(root, text = "Burger Sapi ")
lblBurgerSapi.grid(row=1, column = 1)
lblHargaBurgerSapi = tk.Label(root, text =" Rp. 16.000")
lblHargaBurgerSapi.grid(row = 1, column = 4)

lblBurgerAyam = tk.Label(root, text ="Burger Ayam")
lblBurgerAyam.grid(row = 2, column = 1)
lblHargaburgerAyam = tk.Label(root, text =" Rp. 14.000")
lblHargaburgerAyam.grid(row=2, column = 4)

entryBurgerSapi = tk.Entry(root, width = 3) 
entryBurgerSapi.grid(row = 1, column = 2)
entryBurgerAyam = tk.Entry(root, width = 3)
entryBurgerAyam.grid(row = 2, column = 2)


def submitAction():
    

    root2 = tk.Tk()
    root2.resizable(width = False, height = False)

    lblText = tk.Label(root2,text = "mau menu tambahan?")
    lblText.grid(row = 1, column = 1)

    btnYes = tk.Button(root2, text = "yes", command = yesAction)
    btnYes.grid(row = 2, column = 0)

    btnNo = tk.Button(root2, text = "no", command = noAction)
    btnNo.grid(row = 2, column = 2)

    root2.mainloop()
    
def noAction():
    root4 = tk.Tk()
    root4.resizable(width = False, height = False)

    pesanan.setJumlahMakan(int(entryBurgerAyam.get()), int(entryBurgerSapi.get()))

    total = pesanan.total()
    lblTotal = tk.Label(root4, text = "total = " + str(total))
    lblTotal.grid(row = 1, column = 1)

    root4.mainloop()

def yesAction():
    global entrySoda
    global entryAir
    
    root3 = tk.Tk()

    lblTambahan = tk.Label(root3, text = "tambahan")
    lblTambahan.grid(row = 0, column = 3)

    lblSoda = tk.Label(root3, text = "soda")
    lblSoda.grid(row = 1, column = 1)

    entrySoda = tk.Entry(root3, width = 3)
    entrySoda.grid(row = 1, column = 2)

    lblHargaSoda = tk.Label(root3, text = "6000")
    lblHargaSoda.grid(row = 1, column = 4)
    
    lblAirMineral = tk.Label(root3, text = "air mineral")
    lblAirMineral.grid(row = 2, column = 1)

    entryAir = tk.Entry(root3, width = 3)
    entryAir.grid(row = 2, column = 2)

    lblHargaAirMineral = tk.Label(root3, text = "4000")
    lblHargaAirMineral.grid(row = 2, column = 4)    
    
    btnSubmitAfterYes = tk.Button(root3, text = "submit", command = submitAfterYesAction)
    btnSubmitAfterYes.grid(row = 3, column = 4)


    root3.mainloop()

def submitAfterYesAction():
    root5 = tk.Tk()
    root5.resizable(width = False, height = False)

    print(entryAir.get(), entrySoda.get())
    print(pesanan.totalMakanan, pesanan.totalMakananTambahan)
    pesanan.setJumlahMakananTambahan(int(entrySoda.get()), int(entryAir.get()))

    total = pesanan.total()
    lblTotal = tk.Label(root5, text = "total = " + str(total))
    lblTotal.grid(row = 1, column = 1)

    root5.mainloop()

btnSubmit = tk.Button(root, text = "submit", command = submitAction)
btnSubmit.grid(row = 3, column = 4)



root.mainloop()
