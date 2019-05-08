package com.lazybears.beartrips.model;

import javax.persistence.Entity;
import javax.persistence.Id;

public class Packages {
    @Entity
    public class pack {
        @Id
        public String packname;
        public String packid;
        public String packprice;


        public String getPackname() {
            return packname;
        }

        public void setPackname(String packname) {
            this.packname = packname;
        }

        public String getPackid() {
            return packid;
        }

        public void setPackid(String packid) {
            this.packid = packid;
        }

        public String getPackprice() {
            return packprice;
        }

        public void setPackprice(String packprice) {
            this.packprice = packprice;
        }

        @Override
        public String toString() {
            return "pack{" +
                    "packname='" + packname + '\'' +
                    ", packid='" + packid + '\'' +
                    ", packprice='" + packprice + '\'' +
                    '}';
        }
    }
}
