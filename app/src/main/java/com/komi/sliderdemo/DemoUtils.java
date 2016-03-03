package com.komi.sliderdemo;

import com.komi.slider.position.SliderPosition;

import java.util.Random;

/**
 * Created by Komi on 2016-02-22.
 */
public class DemoUtils {
    private static DemoUtils ourInstance = new DemoUtils();

    public static DemoUtils getInstance() {
        return ourInstance;
    }

    private DemoUtils() {
    }

    public static final int[] PIC_ARRAY_RES = {R.mipmap.pic1, R.mipmap.pic2, R.mipmap.pic3, R.mipmap.pic4, R.mipmap.pic5, R.mipmap.pic6, R.mipmap.pic7, R.mipmap.pic8, R.mipmap.pic9};
    public static final int[] PIC_ARRAY_RES_2 = {R.mipmap.a1, R.mipmap.a2, R.mipmap.a3, R.mipmap.a4, R.mipmap.a5, R.mipmap.a6, R.mipmap.a7};

    public static Random random=new Random();

    public static int getRandomPicRes()
    {
        int index=random.nextInt(PIC_ARRAY_RES.length);
        return PIC_ARRAY_RES[index];
    }

    public static int getRandomPicRes2()
    {
        int index=random.nextInt(PIC_ARRAY_RES_2.length);
        return PIC_ARRAY_RES_2[index];
    }

    public static boolean getRandomBoolean()
    {
        return random.nextBoolean();
    }

    public static SliderPosition getRandomPosition()
    {
        int position = random.nextInt(SliderPosition.sPositionChildren.length);

        return SliderPosition.sPositionChildren[position];
    }

}
