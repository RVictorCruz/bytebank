package br.com.alura.bytebank.teste

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Raimundo", "Victor", "Luis", "Antonio", "Victorino")
    val assistiramCursoKotlin: Set<String> = setOf("Victor", "Vinicius", "Victorino")
    //val assistiramAmbos =assistiramCursoAndroid + assistiramCursoKotlin
    //println(assistiramAmbos.distinct()) mostra elementos unicos de duas listas, sem repetição

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.add("Cardoso")
    assistiramAmbos.add("Victor")
    assistiramAmbos.add("victor") //v é minusculo por isso foi possível repetir
    println(assistiramAmbos)

    println(assistiramCursoKotlin + assistiramCursoAndroid)
    println(assistiramCursoKotlin union assistiramCursoAndroid)

    println(assistiramCursoKotlin - assistiramCursoAndroid)
    println(assistiramCursoKotlin subtract assistiramCursoAndroid)

    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Victor")
    println(assistiramList)
    println(assistiramList.toSet())
}
