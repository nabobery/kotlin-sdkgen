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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/tipping/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/tipping/anyOf/0
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd(
  public val aed: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedXdadd99de? = null,
  public val aud: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX3fc9e173? = null,
  public val cad: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX56412023? = null,
  public val chf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX955d18c2? = null,
  public val czk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXa086a156? = null,
  public val dkk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkXc8f944c7? = null,
  public val eur: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX6704c1e5? = null,
  public val gbp: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpX02b10404? = null,
  public val gip: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipXea6a099f? = null,
  public val hkd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdXb6390650? = null,
  public val huf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX72796a0c? = null,
  public val jpy: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXc030b81b? = null,
  public val mxn: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXe18ef375? = null,
  public val myr: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXeeb16cc0? = null,
  public val nok: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokX7eecafed? = null,
  public val nzd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXf408d8c1? = null,
  public val pln: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX585545f7? = null,
  public val ron: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXb06b7086? = null,
  public val sek: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX364eb790? = null,
  public val sgd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdX82b25119? = null,
  public val usd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX945c1b6b? = null,
) {
  public class Builder {
    public var aed: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedXdadd99de? = null

    public var aud: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX3fc9e173? = null

    public var cad: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX56412023? = null

    public var chf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX955d18c2? = null

    public var czk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXa086a156? = null

    public var dkk: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkXc8f944c7? = null

    public var eur: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX6704c1e5? = null

    public var gbp: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpX02b10404? = null

    public var gip: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipXea6a099f? = null

    public var hkd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdXb6390650? = null

    public var huf: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX72796a0c? = null

    public var jpy: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXc030b81b? = null

    public var mxn: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXe18ef375? = null

    public var myr: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXeeb16cc0? = null

    public var nok: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokX7eecafed? = null

    public var nzd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXf408d8c1? = null

    public var pln: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX585545f7? = null

    public var ron: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXb06b7086? = null

    public var sek: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX364eb790? = null

    public var sgd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdX82b25119? = null

    public var usd: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX945c1b6b? = null

    public fun build(): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd(
      aed = aed,
      aud = aud,
      cad = cad,
      chf = chf,
      czk = czk,
      dkk = dkk,
      eur = eur,
      gbp = gbp,
      gip = gip,
      hkd = hkd,
      huf = huf,
      jpy = jpy,
      mxn = mxn,
      myr = myr,
      nok = nok,
      nzd = nzd,
      pln = pln,
      ron = ron,
      sek = sek,
      sgd = sgd,
      usd = usd,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd must be a JSON object")
      return InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd(
        aed = rawObject["aed"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AedXdadd99de>(it) },
        aud = rawObject["aud"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1AudX3fc9e173>(it) },
        cad = rawObject["cad"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CadX56412023>(it) },
        chf = rawObject["chf"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1ChfX955d18c2>(it) },
        czk = rawObject["czk"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1CzkXa086a156>(it) },
        dkk = rawObject["dkk"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1DkkXc8f944c7>(it) },
        eur = rawObject["eur"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1EurX6704c1e5>(it) },
        gbp = rawObject["gbp"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GbpX02b10404>(it) },
        gip = rawObject["gip"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1GipXea6a099f>(it) },
        hkd = rawObject["hkd"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HkdXb6390650>(it) },
        huf = rawObject["huf"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1HufX72796a0c>(it) },
        jpy = rawObject["jpy"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1JpyXc030b81b>(it) },
        mxn = rawObject["mxn"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MxnXe18ef375>(it) },
        myr = rawObject["myr"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1MyrXeeb16cc0>(it) },
        nok = rawObject["nok"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NokX7eecafed>(it) },
        nzd = rawObject["nzd"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1NzdXf408d8c1>(it) },
        pln = rawObject["pln"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1PlnX585545f7>(it) },
        ron = rawObject["ron"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1RonXb06b7086>(it) },
        sek = rawObject["sek"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SekX364eb790>(it) },
        sgd = rawObject["sgd"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1SgdX82b25119>(it) },
        usd = rawObject["usd"]?.let { json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1UsdX945c1b6b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.aed?.let { put("aed", json.encodeToJsonElement(it)) }
        value.aud?.let { put("aud", json.encodeToJsonElement(it)) }
        value.cad?.let { put("cad", json.encodeToJsonElement(it)) }
        value.chf?.let { put("chf", json.encodeToJsonElement(it)) }
        value.czk?.let { put("czk", json.encodeToJsonElement(it)) }
        value.dkk?.let { put("dkk", json.encodeToJsonElement(it)) }
        value.eur?.let { put("eur", json.encodeToJsonElement(it)) }
        value.gbp?.let { put("gbp", json.encodeToJsonElement(it)) }
        value.gip?.let { put("gip", json.encodeToJsonElement(it)) }
        value.hkd?.let { put("hkd", json.encodeToJsonElement(it)) }
        value.huf?.let { put("huf", json.encodeToJsonElement(it)) }
        value.jpy?.let { put("jpy", json.encodeToJsonElement(it)) }
        value.mxn?.let { put("mxn", json.encodeToJsonElement(it)) }
        value.myr?.let { put("myr", json.encodeToJsonElement(it)) }
        value.nok?.let { put("nok", json.encodeToJsonElement(it)) }
        value.nzd?.let { put("nzd", json.encodeToJsonElement(it)) }
        value.pln?.let { put("pln", json.encodeToJsonElement(it)) }
        value.ron?.let { put("ron", json.encodeToJsonElement(it)) }
        value.sek?.let { put("sek", json.encodeToJsonElement(it)) }
        value.sgd?.let { put("sgd", json.encodeToJsonElement(it)) }
        value.usd?.let { put("usd", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd(block: InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd.Builder.() -> Unit): InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd = InlineV1TerminalConfigurationsPostRequestFormTippingAnyOf1Xe73e82cd.build(block)
