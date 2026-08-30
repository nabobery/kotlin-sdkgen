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
 * Specific options for a registration in the specified `country`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/country_options
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f(
  public val ae: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAeX4a371c34? = null,
  public val al: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAlX5d937e7d? = null,
  public val am: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAmX9de82f79? = null,
  public val ao: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562? = null,
  public val at: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAtX3448af85? = null,
  public val au: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAuX90206ae9? = null,
  public val aw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9? = null,
  public val az: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAzXbf1d5ac3? = null,
  public val ba: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBaX022f55a3? = null,
  public val bb: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971? = null,
  public val bd: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db? = null,
  public val be: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBeXbbbd5394? = null,
  public val bf: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea? = null,
  public val bg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBgX5250be7d? = null,
  public val bh: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBhX9505241a? = null,
  public val bj: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBjXf32e2c77? = null,
  public val bs: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf? = null,
  public val `by`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsByX937da932? = null,
  public val ca: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898? = null,
  public val cd: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdX8544aa07? = null,
  public val ch: InlineV1TaxRegistrationsPostRequestFormCountryOptionsChXee182dcf? = null,
  public val cl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsClX163c339d? = null,
  public val cm: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCmX9fa0d695? = null,
  public val co: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoX9369899a? = null,
  public val cr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrX3031e896? = null,
  public val cv: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCvXe5cfa34b? = null,
  public val cy: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCyXc29a3821? = null,
  public val cz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c? = null,
  public val de: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919? = null,
  public val dk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkX1d61896a? = null,
  public val ec: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076? = null,
  public val ee: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c? = null,
  public val eg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEgX65bb55f0? = null,
  public val es: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsX38daea55? = null,
  public val et: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEtX5df896f1? = null,
  public val fi: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFiX473f840a? = null,
  public val fr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb? = null,
  public val gb: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd? = null,
  public val ge: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGeX84c8bd9c? = null,
  public val gn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c? = null,
  public val gr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGrX8b2978c4? = null,
  public val hr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrX3149287e? = null,
  public val hu: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuXcabe40a7? = null,
  public val id: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIdXce269fac? = null,
  public val ie: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4? = null,
  public val inValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2? = null,
  public val isValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIsValueX898ebfc3? = null,
  public val it: InlineV1TaxRegistrationsPostRequestFormCountryOptionsItX110877a5? = null,
  public val jp: InlineV1TaxRegistrationsPostRequestFormCountryOptionsJpX2da4f362? = null,
  public val ke: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeXd5bb3a6b? = null,
  public val kg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKgX2111e400? = null,
  public val kh: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKhX60d48d83? = null,
  public val kr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKrX34c01240? = null,
  public val kz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420? = null,
  public val la: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLaXea61ab24? = null,
  public val lk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLkX8fc9c26f? = null,
  public val lt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8? = null,
  public val lu: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLuX49a06c92? = null,
  public val lv: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6? = null,
  public val ma: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a? = null,
  public val md: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMdX141d00aa? = null,
  public val me: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb? = null,
  public val mk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMkX7cdaab79? = null,
  public val mr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc? = null,
  public val mt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526? = null,
  public val mx: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxXab96b987? = null,
  public val my: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyXec30ce6d? = null,
  public val ng: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc? = null,
  public val nl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNlX79ba8edf? = null,
  public val no: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNoX739993a4? = null,
  public val np: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNpXade1c160? = null,
  public val nz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzX61832d1e? = null,
  public val om: InlineV1TaxRegistrationsPostRequestFormCountryOptionsOmXd1efc86b? = null,
  public val pe: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPeXd675dc3f? = null,
  public val ph: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPhXd8a91a84? = null,
  public val pl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPlX6d6f9312? = null,
  public val pt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPtX419f8cb1? = null,
  public val ro: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a? = null,
  public val rs: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsX42af46e6? = null,
  public val ru: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRuX2a33e159? = null,
  public val sa: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSaX6fb8998d? = null,
  public val se: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b? = null,
  public val sg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSgX61a30942? = null,
  public val si: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68? = null,
  public val sk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950? = null,
  public val sn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSnXa398808c? = null,
  public val sr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrX41805b17? = null,
  public val th: InlineV1TaxRegistrationsPostRequestFormCountryOptionsThX0eac37f1? = null,
  public val tj: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjX88e65f38? = null,
  public val tr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTrXb43b5199? = null,
  public val tw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTwXf7ca1c3b? = null,
  public val tz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTzXa8612bc9? = null,
  public val ua: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUaXc13bf01a? = null,
  public val ug: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUgXcfbab590? = null,
  public val us: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63? = null,
  public val uy: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25? = null,
  public val uz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUzXe654460d? = null,
  public val vn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsVnX4ce511d0? = null,
  public val za: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaX2acbc344? = null,
  public val zm: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZmX72d0d00f? = null,
  public val zw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95? = null,
) {
  public class Builder {
    public var ae: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAeX4a371c34? = null

    public var al: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAlX5d937e7d? = null

    public var am: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAmX9de82f79? = null

    public var ao: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562? = null

    public var at: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAtX3448af85? = null

    public var au: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAuX90206ae9? = null

    public var aw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9? = null

    public var az: InlineV1TaxRegistrationsPostRequestFormCountryOptionsAzXbf1d5ac3? = null

    public var ba: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBaX022f55a3? = null

    public var bb: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971? = null

    public var bd: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db? = null

    public var be: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBeXbbbd5394? = null

    public var bf: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea? = null

    public var bg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBgX5250be7d? = null

    public var bh: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBhX9505241a? = null

    public var bj: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBjXf32e2c77? = null

    public var bs: InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf? = null

    public var `by`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsByX937da932? = null

    public var ca: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898? = null

    public var cd: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdX8544aa07? = null

    public var ch: InlineV1TaxRegistrationsPostRequestFormCountryOptionsChXee182dcf? = null

    public var cl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsClX163c339d? = null

    public var cm: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCmX9fa0d695? = null

    public var co: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoX9369899a? = null

    public var cr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrX3031e896? = null

    public var cv: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCvXe5cfa34b? = null

    public var cy: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCyXc29a3821? = null

    public var cz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c? = null

    public var de: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919? = null

    public var dk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkX1d61896a? = null

    public var ec: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076? = null

    public var ee: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c? = null

    public var eg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEgX65bb55f0? = null

    public var es: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsX38daea55? = null

    public var et: InlineV1TaxRegistrationsPostRequestFormCountryOptionsEtX5df896f1? = null

    public var fi: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFiX473f840a? = null

    public var fr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb? = null

    public var gb: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd? = null

    public var ge: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGeX84c8bd9c? = null

    public var gn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c? = null

    public var gr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsGrX8b2978c4? = null

    public var hr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrX3149287e? = null

    public var hu: InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuXcabe40a7? = null

    public var id: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIdXce269fac? = null

    public var ie: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4? = null

    public var inValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2? =
        null

    public var isValue: InlineV1TaxRegistrationsPostRequestFormCountryOptionsIsValueX898ebfc3? =
        null

    public var it: InlineV1TaxRegistrationsPostRequestFormCountryOptionsItX110877a5? = null

    public var jp: InlineV1TaxRegistrationsPostRequestFormCountryOptionsJpX2da4f362? = null

    public var ke: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeXd5bb3a6b? = null

    public var kg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKgX2111e400? = null

    public var kh: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKhX60d48d83? = null

    public var kr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKrX34c01240? = null

    public var kz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420? = null

    public var la: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLaXea61ab24? = null

    public var lk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLkX8fc9c26f? = null

    public var lt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8? = null

    public var lu: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLuX49a06c92? = null

    public var lv: InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6? = null

    public var ma: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a? = null

    public var md: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMdX141d00aa? = null

    public var me: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb? = null

    public var mk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMkX7cdaab79? = null

    public var mr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc? = null

    public var mt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526? = null

    public var mx: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxXab96b987? = null

    public var my: InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyXec30ce6d? = null

    public var ng: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc? = null

    public var nl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNlX79ba8edf? = null

    public var no: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNoX739993a4? = null

    public var np: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNpXade1c160? = null

    public var nz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzX61832d1e? = null

    public var om: InlineV1TaxRegistrationsPostRequestFormCountryOptionsOmXd1efc86b? = null

    public var pe: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPeXd675dc3f? = null

    public var ph: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPhXd8a91a84? = null

    public var pl: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPlX6d6f9312? = null

    public var pt: InlineV1TaxRegistrationsPostRequestFormCountryOptionsPtX419f8cb1? = null

    public var ro: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a? = null

    public var rs: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsX42af46e6? = null

    public var ru: InlineV1TaxRegistrationsPostRequestFormCountryOptionsRuX2a33e159? = null

    public var sa: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSaX6fb8998d? = null

    public var se: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b? = null

    public var sg: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSgX61a30942? = null

    public var si: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68? = null

    public var sk: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950? = null

    public var sn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSnXa398808c? = null

    public var sr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrX41805b17? = null

    public var th: InlineV1TaxRegistrationsPostRequestFormCountryOptionsThX0eac37f1? = null

    public var tj: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjX88e65f38? = null

    public var tr: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTrXb43b5199? = null

    public var tw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTwXf7ca1c3b? = null

    public var tz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsTzXa8612bc9? = null

    public var ua: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUaXc13bf01a? = null

    public var ug: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUgXcfbab590? = null

    public var us: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63? = null

    public var uy: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25? = null

    public var uz: InlineV1TaxRegistrationsPostRequestFormCountryOptionsUzXe654460d? = null

    public var vn: InlineV1TaxRegistrationsPostRequestFormCountryOptionsVnX4ce511d0? = null

    public var za: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaX2acbc344? = null

    public var zm: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZmX72d0d00f? = null

    public var zw: InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f = InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f(
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
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f(
        ae = rawObject["ae"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAeX4a371c34>(it) },
        al = rawObject["al"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAlX5d937e7d>(it) },
        am = rawObject["am"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAmX9de82f79>(it) },
        ao = rawObject["ao"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAoX9f7ab562>(it) },
        at = rawObject["at"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAtX3448af85>(it) },
        au = rawObject["au"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAuX90206ae9>(it) },
        aw = rawObject["aw"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAwXa682e6c9>(it) },
        az = rawObject["az"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsAzXbf1d5ac3>(it) },
        ba = rawObject["ba"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBaX022f55a3>(it) },
        bb = rawObject["bb"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBbX3c423971>(it) },
        bd = rawObject["bd"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBdXeef5a2db>(it) },
        be = rawObject["be"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBeXbbbd5394>(it) },
        bf = rawObject["bf"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBfX3813f8ea>(it) },
        bg = rawObject["bg"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBgX5250be7d>(it) },
        bh = rawObject["bh"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBhX9505241a>(it) },
        bj = rawObject["bj"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBjXf32e2c77>(it) },
        bs = rawObject["bs"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsBsXd6f999bf>(it) },
        by = rawObject["by"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsByX937da932>(it) },
        ca = rawObject["ca"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCaX9c53e898>(it) },
        cd = rawObject["cd"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCdX8544aa07>(it) },
        ch = rawObject["ch"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsChXee182dcf>(it) },
        cl = rawObject["cl"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsClX163c339d>(it) },
        cm = rawObject["cm"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCmX9fa0d695>(it) },
        co = rawObject["co"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCoX9369899a>(it) },
        cr = rawObject["cr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCrX3031e896>(it) },
        cv = rawObject["cv"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCvXe5cfa34b>(it) },
        cy = rawObject["cy"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCyXc29a3821>(it) },
        cz = rawObject["cz"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsCzX2eb93c2c>(it) },
        de = rawObject["de"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDeXd1582919>(it) },
        dk = rawObject["dk"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsDkX1d61896a>(it) },
        ec = rawObject["ec"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEcXa0b60076>(it) },
        ee = rawObject["ee"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEeXa80f8e8c>(it) },
        eg = rawObject["eg"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEgX65bb55f0>(it) },
        es = rawObject["es"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEsX38daea55>(it) },
        et = rawObject["et"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsEtX5df896f1>(it) },
        fi = rawObject["fi"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsFiX473f840a>(it) },
        fr = rawObject["fr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsFrX12ce88fb>(it) },
        gb = rawObject["gb"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGbX6b70e2dd>(it) },
        ge = rawObject["ge"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGeX84c8bd9c>(it) },
        gn = rawObject["gn"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGnX0684131c>(it) },
        gr = rawObject["gr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsGrX8b2978c4>(it) },
        hr = rawObject["hr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsHrX3149287e>(it) },
        hu = rawObject["hu"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsHuXcabe40a7>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIdXce269fac>(it) },
        ie = rawObject["ie"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIeX0dd512c4>(it) },
        inValue = rawObject["in"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsInValueX6f675bd2>(it) },
        isValue = rawObject["is"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsIsValueX898ebfc3>(it) },
        it = rawObject["it"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsItX110877a5>(it) },
        jp = rawObject["jp"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsJpX2da4f362>(it) },
        ke = rawObject["ke"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKeXd5bb3a6b>(it) },
        kg = rawObject["kg"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKgX2111e400>(it) },
        kh = rawObject["kh"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKhX60d48d83>(it) },
        kr = rawObject["kr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKrX34c01240>(it) },
        kz = rawObject["kz"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsKzXfab3d420>(it) },
        la = rawObject["la"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLaXea61ab24>(it) },
        lk = rawObject["lk"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLkX8fc9c26f>(it) },
        lt = rawObject["lt"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLtXf1eac8a8>(it) },
        lu = rawObject["lu"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLuX49a06c92>(it) },
        lv = rawObject["lv"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsLvX5a1c74d6>(it) },
        ma = rawObject["ma"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMaXd6f1c44a>(it) },
        md = rawObject["md"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMdX141d00aa>(it) },
        me = rawObject["me"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMeXf162aaeb>(it) },
        mk = rawObject["mk"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMkX7cdaab79>(it) },
        mr = rawObject["mr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMrX7ec42afc>(it) },
        mt = rawObject["mt"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMtX54e2e526>(it) },
        mx = rawObject["mx"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMxXab96b987>(it) },
        my = rawObject["my"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsMyXec30ce6d>(it) },
        ng = rawObject["ng"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNgX02a331fc>(it) },
        nl = rawObject["nl"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNlX79ba8edf>(it) },
        no = rawObject["no"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNoX739993a4>(it) },
        np = rawObject["np"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNpXade1c160>(it) },
        nz = rawObject["nz"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsNzX61832d1e>(it) },
        om = rawObject["om"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsOmXd1efc86b>(it) },
        pe = rawObject["pe"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsPeXd675dc3f>(it) },
        ph = rawObject["ph"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsPhXd8a91a84>(it) },
        pl = rawObject["pl"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsPlX6d6f9312>(it) },
        pt = rawObject["pt"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsPtX419f8cb1>(it) },
        ro = rawObject["ro"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRoX9d84d85a>(it) },
        rs = rawObject["rs"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRsX42af46e6>(it) },
        ru = rawObject["ru"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsRuX2a33e159>(it) },
        sa = rawObject["sa"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSaX6fb8998d>(it) },
        se = rawObject["se"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSeXbf7b352b>(it) },
        sg = rawObject["sg"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSgX61a30942>(it) },
        si = rawObject["si"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSiXcaafcd68>(it) },
        sk = rawObject["sk"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSkXf4ae1950>(it) },
        sn = rawObject["sn"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSnXa398808c>(it) },
        sr = rawObject["sr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsSrX41805b17>(it) },
        th = rawObject["th"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsThX0eac37f1>(it) },
        tj = rawObject["tj"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsTjX88e65f38>(it) },
        tr = rawObject["tr"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsTrXb43b5199>(it) },
        tw = rawObject["tw"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsTwXf7ca1c3b>(it) },
        tz = rawObject["tz"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsTzXa8612bc9>(it) },
        ua = rawObject["ua"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUaXc13bf01a>(it) },
        ug = rawObject["ug"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUgXcfbab590>(it) },
        us = rawObject["us"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUsXcc5d9e63>(it) },
        uy = rawObject["uy"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUyXa16d8e25>(it) },
        uz = rawObject["uz"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsUzXe654460d>(it) },
        vn = rawObject["vn"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsVnX4ce511d0>(it) },
        za = rawObject["za"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZaX2acbc344>(it) },
        zm = rawObject["zm"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZmX72d0d00f>(it) },
        zw = rawObject["zw"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormCountryOptionsZwXfee2dd95>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f")
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

public fun inlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f(block: InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f = InlineV1TaxRegistrationsPostRequestFormCountryOptionsX26279f3f.build(block)
