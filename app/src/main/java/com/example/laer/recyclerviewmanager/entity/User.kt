package com.example.laer.recyclerviewmanager.entity

/**
 * Created by laer on 2017/7/3.
 */
class User(var position: Int, var imagePath: String, var name:String){
    companion object {
        fun init():ArrayList<User>{
            var datas = ArrayList<User>()
            var i=1
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201505/04/20150504155117_8i4Rk.thumb.700_0.jpeg", "美女1"))
            datas.add(User(i++, "http://cdnq.duitang.com/uploads/item/201505/04/20150504155014_irFvu.thumb.700_0.jpeg", "美女2"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg", "美女3"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201505/04/20150504155137_JWcRK.thumb.700_0.jpeg", "美女4"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201505/04/20150504155036_zNrPT.thumb.700_0.jpeg", "美女5"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201504/26/201504262026_weMcT.thumb.700_0.jpeg", "美女6"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201504/26/201504261920_HsSm3.thumb.700_0.jpeg", "美女7"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg", "美女8"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg", "美女9"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg", "美女10"))
            datas.add(User(i++, "http://img5q.duitang.com/uploads/item/201309/17/20130917032356_hdGjF.thumb.700_0.jpeg", "美女11"))
            return datas
        }
    }

}