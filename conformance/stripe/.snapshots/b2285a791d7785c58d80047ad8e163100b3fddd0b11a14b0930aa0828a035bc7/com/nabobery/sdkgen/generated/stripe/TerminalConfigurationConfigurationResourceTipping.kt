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
 * Source: sdkgen://source/openapi.json#/components/schemas/terminal_configuration_configuration_resource_tipping
 */
@Serializable(with = TerminalConfigurationConfigurationResourceTipping.Serializer::class)
public class TerminalConfigurationConfigurationResourceTipping(
  public val aed: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val aud: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val cad: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val chf: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val czk: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val dkk: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val eur: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val gbp: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val gip: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val hkd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val huf: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val jpy: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val mxn: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val myr: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val nok: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val nzd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val pln: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val ron: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val sek: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val sgd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
  public val usd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null,
) {
  public class Builder {
    public var aed: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var aud: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var cad: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var chf: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var czk: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var dkk: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var eur: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var gbp: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var gip: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var hkd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var huf: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var jpy: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var mxn: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var myr: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var nok: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var nzd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var pln: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var ron: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var sek: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var sgd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public var usd: TerminalConfigurationConfigurationResourceCurrencySpecificConfig? = null

    public fun build(): TerminalConfigurationConfigurationResourceTipping = TerminalConfigurationConfigurationResourceTipping(
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
    public fun build(block: Builder.() -> Unit): TerminalConfigurationConfigurationResourceTipping = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TerminalConfigurationConfigurationResourceTipping> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TerminalConfigurationConfigurationResourceTipping {
      val jsonDecoder = decoder.requireJsonDecoder("TerminalConfigurationConfigurationResourceTipping")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TerminalConfigurationConfigurationResourceTipping must be a JSON object")
      return TerminalConfigurationConfigurationResourceTipping(
        aed = rawObject["aed"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        aud = rawObject["aud"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        cad = rawObject["cad"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        chf = rawObject["chf"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        czk = rawObject["czk"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        dkk = rawObject["dkk"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        eur = rawObject["eur"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        gbp = rawObject["gbp"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        gip = rawObject["gip"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        hkd = rawObject["hkd"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        huf = rawObject["huf"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        jpy = rawObject["jpy"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        mxn = rawObject["mxn"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        myr = rawObject["myr"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        nok = rawObject["nok"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        nzd = rawObject["nzd"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        pln = rawObject["pln"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        ron = rawObject["ron"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        sek = rawObject["sek"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        sgd = rawObject["sgd"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
        usd = rawObject["usd"]?.let { json.decodeFromJsonElement<TerminalConfigurationConfigurationResourceCurrencySpecificConfig>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TerminalConfigurationConfigurationResourceTipping) {
      val jsonEncoder = encoder.requireJsonEncoder("TerminalConfigurationConfigurationResourceTipping")
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

public fun terminalConfigurationConfigurationResourceTipping(block: TerminalConfigurationConfigurationResourceTipping.Builder.() -> Unit): TerminalConfigurationConfigurationResourceTipping = TerminalConfigurationConfigurationResourceTipping.build(block)
