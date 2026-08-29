package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptions.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptions(
  public val ae: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val al: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val am: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ao: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val at: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val au: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val aw: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val az: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ba: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val bb: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val bd: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val be: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val bf: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val bg: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val bh: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val bj: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val bs: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val `by`: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ca: TaxProductRegistrationsResourceCountryOptionsCanada? = null,
  public val cd: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val ch: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val cl: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val cm: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val co: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val cr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val cv: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val cy: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val cz: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val de: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val dk: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val ec: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ee: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val eg: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val es: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val et: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val fi: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val fr: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val gb: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val ge: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val gn: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val gr: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val hr: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val hu: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val id: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ie: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val inValue: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val isValue: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val it: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val jp: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val ke: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val kg: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val kh: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val kr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val kz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val la: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val lk: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val lt: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val lu: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val lv: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val ma: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val md: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val me: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val mk: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val mr: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val mt: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val mx: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val my: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ng: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val nl: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val no: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val np: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val nz: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val om: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val pe: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ph: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val pl: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val pt: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val ro: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val rs: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val ru: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val sa: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val se: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val sg: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null,
  public val si: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val sk: TaxProductRegistrationsResourceCountryOptionsEurope? = null,
  public val sn: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val sr: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val th: TaxProductRegistrationsResourceCountryOptionsThailand? = null,
  public val tj: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val tr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val tw: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val tz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ua: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val ug: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val us: TaxProductRegistrationsResourceCountryOptionsUnitedStates? = null,
  public val uy: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val uz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val vn: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val za: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
  public val zm: TaxProductRegistrationsResourceCountryOptionsSimplified? = null,
  public val zw: TaxProductRegistrationsResourceCountryOptionsDefault? = null,
) {
  public class Builder {
    public var ae: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var al: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var am: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ao: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var at: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var au: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var aw: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var az: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ba: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var bb: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var bd: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var be: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var bf: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var bg: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var bh: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var bj: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var bs: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var `by`: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ca: TaxProductRegistrationsResourceCountryOptionsCanada? = null

    public var cd: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var ch: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var cl: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var cm: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var co: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var cr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var cv: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var cy: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var cz: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var de: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var dk: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var ec: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ee: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var eg: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var es: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var et: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var fi: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var fr: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var gb: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var ge: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var gn: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var gr: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var hr: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var hu: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var id: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ie: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var inValue: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var isValue: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var it: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var jp: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var ke: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var kg: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var kh: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var kr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var kz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var la: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var lk: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var lt: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var lu: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var lv: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var ma: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var md: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var me: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var mk: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var mr: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var mt: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var mx: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var my: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ng: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var nl: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var no: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var np: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var nz: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var om: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var pe: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ph: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var pl: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var pt: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var ro: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var rs: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var ru: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var sa: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var se: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var sg: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods? = null

    public var si: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var sk: TaxProductRegistrationsResourceCountryOptionsEurope? = null

    public var sn: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var sr: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var th: TaxProductRegistrationsResourceCountryOptionsThailand? = null

    public var tj: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var tr: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var tw: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var tz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ua: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var ug: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var us: TaxProductRegistrationsResourceCountryOptionsUnitedStates? = null

    public var uy: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var uz: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var vn: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var za: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public var zm: TaxProductRegistrationsResourceCountryOptionsSimplified? = null

    public var zw: TaxProductRegistrationsResourceCountryOptionsDefault? = null

    public fun build(): TaxProductRegistrationsResourceCountryOptions = TaxProductRegistrationsResourceCountryOptions(
      ae = ae,
      al = al,
      am = am,
      ao = ao,
      at = at,
      au = au,
      aw = aw,
      az = az,
      ba = ba,
      bb = bb,
      bd = bd,
      be = be,
      bf = bf,
      bg = bg,
      bh = bh,
      bj = bj,
      bs = bs,
      by = by,
      ca = ca,
      cd = cd,
      ch = ch,
      cl = cl,
      cm = cm,
      co = co,
      cr = cr,
      cv = cv,
      cy = cy,
      cz = cz,
      de = de,
      dk = dk,
      ec = ec,
      ee = ee,
      eg = eg,
      es = es,
      et = et,
      fi = fi,
      fr = fr,
      gb = gb,
      ge = ge,
      gn = gn,
      gr = gr,
      hr = hr,
      hu = hu,
      id = id,
      ie = ie,
      inValue = inValue,
      isValue = isValue,
      it = it,
      jp = jp,
      ke = ke,
      kg = kg,
      kh = kh,
      kr = kr,
      kz = kz,
      la = la,
      lk = lk,
      lt = lt,
      lu = lu,
      lv = lv,
      ma = ma,
      md = md,
      me = me,
      mk = mk,
      mr = mr,
      mt = mt,
      mx = mx,
      my = my,
      ng = ng,
      nl = nl,
      no = no,
      np = np,
      nz = nz,
      om = om,
      pe = pe,
      ph = ph,
      pl = pl,
      pt = pt,
      ro = ro,
      rs = rs,
      ru = ru,
      sa = sa,
      se = se,
      sg = sg,
      si = si,
      sk = sk,
      sn = sn,
      sr = sr,
      th = th,
      tj = tj,
      tr = tr,
      tw = tw,
      tz = tz,
      ua = ua,
      ug = ug,
      us = us,
      uy = uy,
      uz = uz,
      vn = vn,
      za = za,
      zm = zm,
      zw = zw,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptions {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptions must be a JSON object")
      return TaxProductRegistrationsResourceCountryOptions(
        ae = rawObject["ae"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        al = rawObject["al"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        am = rawObject["am"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ao = rawObject["ao"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        at = rawObject["at"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        au = rawObject["au"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        aw = rawObject["aw"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        az = rawObject["az"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ba = rawObject["ba"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        bb = rawObject["bb"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        bd = rawObject["bd"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        be = rawObject["be"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        bf = rawObject["bf"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        bg = rawObject["bg"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        bh = rawObject["bh"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        bj = rawObject["bj"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        bs = rawObject["bs"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        by = rawObject["by"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ca = rawObject["ca"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsCanada>(it) },
        cd = rawObject["cd"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        ch = rawObject["ch"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        cl = rawObject["cl"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        cm = rawObject["cm"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        co = rawObject["co"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        cr = rawObject["cr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        cv = rawObject["cv"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        cy = rawObject["cy"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        cz = rawObject["cz"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        de = rawObject["de"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        dk = rawObject["dk"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        ec = rawObject["ec"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ee = rawObject["ee"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        eg = rawObject["eg"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        es = rawObject["es"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        et = rawObject["et"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        fi = rawObject["fi"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        fr = rawObject["fr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        gb = rawObject["gb"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        ge = rawObject["ge"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        gn = rawObject["gn"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        gr = rawObject["gr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        hr = rawObject["hr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        hu = rawObject["hu"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ie = rawObject["ie"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        inValue = rawObject["in"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        isValue = rawObject["is"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        it = rawObject["it"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        jp = rawObject["jp"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        ke = rawObject["ke"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        kg = rawObject["kg"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        kh = rawObject["kh"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        kr = rawObject["kr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        kz = rawObject["kz"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        la = rawObject["la"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        lk = rawObject["lk"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        lt = rawObject["lt"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        lu = rawObject["lu"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        lv = rawObject["lv"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        ma = rawObject["ma"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        md = rawObject["md"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        me = rawObject["me"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        mk = rawObject["mk"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        mr = rawObject["mr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        mt = rawObject["mt"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        mx = rawObject["mx"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        my = rawObject["my"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ng = rawObject["ng"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        nl = rawObject["nl"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        no = rawObject["no"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        np = rawObject["np"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        nz = rawObject["nz"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        om = rawObject["om"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        pe = rawObject["pe"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ph = rawObject["ph"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        pl = rawObject["pl"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        pt = rawObject["pt"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        ro = rawObject["ro"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        rs = rawObject["rs"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        ru = rawObject["ru"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        sa = rawObject["sa"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        se = rawObject["se"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        sg = rawObject["sg"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods>(it) },
        si = rawObject["si"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        sk = rawObject["sk"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsEurope>(it) },
        sn = rawObject["sn"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        sr = rawObject["sr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        th = rawObject["th"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsThailand>(it) },
        tj = rawObject["tj"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        tr = rawObject["tr"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        tw = rawObject["tw"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        tz = rawObject["tz"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ua = rawObject["ua"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        ug = rawObject["ug"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        us = rawObject["us"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsUnitedStates>(it) },
        uy = rawObject["uy"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        uz = rawObject["uz"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        vn = rawObject["vn"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        za = rawObject["za"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
        zm = rawObject["zm"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsSimplified>(it) },
        zw = rawObject["zw"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefault>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.ae?.let { put("ae", json.encodeToJsonElement(it)) }
        value.al?.let { put("al", json.encodeToJsonElement(it)) }
        value.am?.let { put("am", json.encodeToJsonElement(it)) }
        value.ao?.let { put("ao", json.encodeToJsonElement(it)) }
        value.at?.let { put("at", json.encodeToJsonElement(it)) }
        value.au?.let { put("au", json.encodeToJsonElement(it)) }
        value.aw?.let { put("aw", json.encodeToJsonElement(it)) }
        value.az?.let { put("az", json.encodeToJsonElement(it)) }
        value.ba?.let { put("ba", json.encodeToJsonElement(it)) }
        value.bb?.let { put("bb", json.encodeToJsonElement(it)) }
        value.bd?.let { put("bd", json.encodeToJsonElement(it)) }
        value.be?.let { put("be", json.encodeToJsonElement(it)) }
        value.bf?.let { put("bf", json.encodeToJsonElement(it)) }
        value.bg?.let { put("bg", json.encodeToJsonElement(it)) }
        value.bh?.let { put("bh", json.encodeToJsonElement(it)) }
        value.bj?.let { put("bj", json.encodeToJsonElement(it)) }
        value.bs?.let { put("bs", json.encodeToJsonElement(it)) }
        value.by?.let { put("by", json.encodeToJsonElement(it)) }
        value.ca?.let { put("ca", json.encodeToJsonElement(it)) }
        value.cd?.let { put("cd", json.encodeToJsonElement(it)) }
        value.ch?.let { put("ch", json.encodeToJsonElement(it)) }
        value.cl?.let { put("cl", json.encodeToJsonElement(it)) }
        value.cm?.let { put("cm", json.encodeToJsonElement(it)) }
        value.co?.let { put("co", json.encodeToJsonElement(it)) }
        value.cr?.let { put("cr", json.encodeToJsonElement(it)) }
        value.cv?.let { put("cv", json.encodeToJsonElement(it)) }
        value.cy?.let { put("cy", json.encodeToJsonElement(it)) }
        value.cz?.let { put("cz", json.encodeToJsonElement(it)) }
        value.de?.let { put("de", json.encodeToJsonElement(it)) }
        value.dk?.let { put("dk", json.encodeToJsonElement(it)) }
        value.ec?.let { put("ec", json.encodeToJsonElement(it)) }
        value.ee?.let { put("ee", json.encodeToJsonElement(it)) }
        value.eg?.let { put("eg", json.encodeToJsonElement(it)) }
        value.es?.let { put("es", json.encodeToJsonElement(it)) }
        value.et?.let { put("et", json.encodeToJsonElement(it)) }
        value.fi?.let { put("fi", json.encodeToJsonElement(it)) }
        value.fr?.let { put("fr", json.encodeToJsonElement(it)) }
        value.gb?.let { put("gb", json.encodeToJsonElement(it)) }
        value.ge?.let { put("ge", json.encodeToJsonElement(it)) }
        value.gn?.let { put("gn", json.encodeToJsonElement(it)) }
        value.gr?.let { put("gr", json.encodeToJsonElement(it)) }
        value.hr?.let { put("hr", json.encodeToJsonElement(it)) }
        value.hu?.let { put("hu", json.encodeToJsonElement(it)) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.ie?.let { put("ie", json.encodeToJsonElement(it)) }
        value.inValue?.let { put("in", json.encodeToJsonElement(it)) }
        value.isValue?.let { put("is", json.encodeToJsonElement(it)) }
        value.it?.let { put("it", json.encodeToJsonElement(it)) }
        value.jp?.let { put("jp", json.encodeToJsonElement(it)) }
        value.ke?.let { put("ke", json.encodeToJsonElement(it)) }
        value.kg?.let { put("kg", json.encodeToJsonElement(it)) }
        value.kh?.let { put("kh", json.encodeToJsonElement(it)) }
        value.kr?.let { put("kr", json.encodeToJsonElement(it)) }
        value.kz?.let { put("kz", json.encodeToJsonElement(it)) }
        value.la?.let { put("la", json.encodeToJsonElement(it)) }
        value.lk?.let { put("lk", json.encodeToJsonElement(it)) }
        value.lt?.let { put("lt", json.encodeToJsonElement(it)) }
        value.lu?.let { put("lu", json.encodeToJsonElement(it)) }
        value.lv?.let { put("lv", json.encodeToJsonElement(it)) }
        value.ma?.let { put("ma", json.encodeToJsonElement(it)) }
        value.md?.let { put("md", json.encodeToJsonElement(it)) }
        value.me?.let { put("me", json.encodeToJsonElement(it)) }
        value.mk?.let { put("mk", json.encodeToJsonElement(it)) }
        value.mr?.let { put("mr", json.encodeToJsonElement(it)) }
        value.mt?.let { put("mt", json.encodeToJsonElement(it)) }
        value.mx?.let { put("mx", json.encodeToJsonElement(it)) }
        value.my?.let { put("my", json.encodeToJsonElement(it)) }
        value.ng?.let { put("ng", json.encodeToJsonElement(it)) }
        value.nl?.let { put("nl", json.encodeToJsonElement(it)) }
        value.no?.let { put("no", json.encodeToJsonElement(it)) }
        value.np?.let { put("np", json.encodeToJsonElement(it)) }
        value.nz?.let { put("nz", json.encodeToJsonElement(it)) }
        value.om?.let { put("om", json.encodeToJsonElement(it)) }
        value.pe?.let { put("pe", json.encodeToJsonElement(it)) }
        value.ph?.let { put("ph", json.encodeToJsonElement(it)) }
        value.pl?.let { put("pl", json.encodeToJsonElement(it)) }
        value.pt?.let { put("pt", json.encodeToJsonElement(it)) }
        value.ro?.let { put("ro", json.encodeToJsonElement(it)) }
        value.rs?.let { put("rs", json.encodeToJsonElement(it)) }
        value.ru?.let { put("ru", json.encodeToJsonElement(it)) }
        value.sa?.let { put("sa", json.encodeToJsonElement(it)) }
        value.se?.let { put("se", json.encodeToJsonElement(it)) }
        value.sg?.let { put("sg", json.encodeToJsonElement(it)) }
        value.si?.let { put("si", json.encodeToJsonElement(it)) }
        value.sk?.let { put("sk", json.encodeToJsonElement(it)) }
        value.sn?.let { put("sn", json.encodeToJsonElement(it)) }
        value.sr?.let { put("sr", json.encodeToJsonElement(it)) }
        value.th?.let { put("th", json.encodeToJsonElement(it)) }
        value.tj?.let { put("tj", json.encodeToJsonElement(it)) }
        value.tr?.let { put("tr", json.encodeToJsonElement(it)) }
        value.tw?.let { put("tw", json.encodeToJsonElement(it)) }
        value.tz?.let { put("tz", json.encodeToJsonElement(it)) }
        value.ua?.let { put("ua", json.encodeToJsonElement(it)) }
        value.ug?.let { put("ug", json.encodeToJsonElement(it)) }
        value.us?.let { put("us", json.encodeToJsonElement(it)) }
        value.uy?.let { put("uy", json.encodeToJsonElement(it)) }
        value.uz?.let { put("uz", json.encodeToJsonElement(it)) }
        value.vn?.let { put("vn", json.encodeToJsonElement(it)) }
        value.za?.let { put("za", json.encodeToJsonElement(it)) }
        value.zm?.let { put("zm", json.encodeToJsonElement(it)) }
        value.zw?.let { put("zw", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptions(block: TaxProductRegistrationsResourceCountryOptions.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptions = TaxProductRegistrationsResourceCountryOptions.build(block)
