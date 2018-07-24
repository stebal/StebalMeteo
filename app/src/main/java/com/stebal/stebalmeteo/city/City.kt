package com.stebal.stebalmeteo.city

class City(var id: Long,
           var name: String)
{
    constructor(name: String) : this(-1, name)
}