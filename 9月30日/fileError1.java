package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileError1 {
    public static void main(String[] args){
        //ファイルのパスを設定する
        File file = new File("ssss");


        try {
            FileReader fileReader = null;
            fileReader  = new FileReader(file);

            // FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する。
            //readメソッドは終わったら読み込み終わったらー1を返す。

            int data;
            while ((data = fileReader.read()) != -1 ){
                System.out.print((char)data);
            }

            //ファイルを閉じて終了
            if (fileReader != null) {
                fileReader.close();
            }


            //入出力エラーを設定
            } catch (IOException e){
                System.out.println("ファイルが読み込めません");
            }

    }
}