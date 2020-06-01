import tkinter as tk
import pywhatkit as kit
from tkinter import messagebox

#penting !
#sebelum running install module pywhatkit terlebih dahulu
#cara = pip install pywhatkit
#dan pastikan kamu telah login di whatsapp web

#aturan penggunaan = pesan yang di kirim harus lebih dari 3 menit dari waktu yang ada
#contoh pengisian
#number = +6269696969696
#waktu sekarang = 19:12
#hour = 19
#minute = 18
#message = hello

#setelah wa web terbuka otomatis, jangan sentuh apapun hingga pesan terkirim

root = tk.Tk()
root.title("WhatsApp Messager 0.1 V")
root.geometry("800x200")

frame = tk.Frame(root)

lblNumber = tk.Label(frame, text = "add number")

entryNumber = tk.Entry(frame, width = 20)

lblZonk = tk.Label(frame, text = "\t ")

lblTime = tk.Label(frame, text = "enter time : hh : mm")
entryHour = tk.Entry(frame, width = 5)
entryMinute = tk.Entry(frame, width = 5)

lblText = tk.Label(frame, text = "write your message")
entryMessage = tk.Entry(frame, width = 50)


lblNumber.grid(row = 1, column = 1)
entryNumber.grid(row = 2, column = 1)
lblZonk.grid(row = 2 , column = 2)

lblTime.grid(row = 1, column = 4)
entryHour.grid(row = 2, column = 3)
entryMinute.grid(row = 2, column = 5)

lblText.grid(row = 4, column = 1)
entryMessage.grid(row = 5, column = 1)


def action():
    root2 = tk.Tk()
    root2.title("sending")
    root2.geometry("400x100")
    root2.resizable(width = False, height = False)
    # if(entryNumber is None and entryMessage is None and entryHour is None and entryMinute is None):
    #     showAlert("no number", "enter a number")
    # else :
    lblSucces = tk.Label(root2, text = "do not close this before the time")
    lblSucces.grid(row = 1, column = 1)
    btnOk = tk.Button(root2, text = "ok", command = sendingMessage)
    btnOk.grid(row = 2, column = 1)
    root2.mainloop()
    
def sendingMessage():
    
    number = entryNumber.get()
    hour = entryHour.get()
    minute = entryMinute.get()
    message = entryMessage.get()
    kit.sendwhatmsg(str(number), str(message), int(hour), int(minute))


def showAlert(title, message):
    return tk.messagebox.showwarning(title, message)

btnSubmit = tk.Button(frame, text = "submit", command = action)
btnSubmit.grid(row = 5, column = 5)
frame.pack()

root.mainloop()