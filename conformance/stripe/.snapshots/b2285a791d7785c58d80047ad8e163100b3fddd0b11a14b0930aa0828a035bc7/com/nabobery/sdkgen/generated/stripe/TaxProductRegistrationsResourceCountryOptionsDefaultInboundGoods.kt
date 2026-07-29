package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_registrations_resource_country_options_default_inbound_g
 * oods
 */
@Serializable(with = TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods.Serializer::class)
public class TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods(
  /**
   * Type of registration in `country`.
   */
  public val type: InlineTaxProductRegistratic1c1TypeX979aebb4,
  public val standard: TaxProductRegistrationsResourceCountryOptionsDefaultStandard? = null,
) {
  public class Builder {
    private var typeValue: InlineTaxProductRegistratic1c1TypeX979aebb4? = null

    public var type: InlineTaxProductRegistratic1c1TypeX979aebb4
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var standard: TaxProductRegistrationsResourceCountryOptionsDefaultStandard? = null

    public fun build(): TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods {
      check(typeValue != null) { "type is required" }
      return TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods(
        type = type,
        standard = standard,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods must be a JSON object")
      val type = json.decodeRequired<InlineTaxProductRegistratic1c1TypeX979aebb4>(rawObject, "type")
      return TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods(
        type = type,
        standard = rawObject["standard"]?.let { json.decodeFromJsonElement<TaxProductRegistrationsResourceCountryOptionsDefaultStandard>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.standard?.let { put("standard", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductRegistrationsResourceCountryOptionsDefaultInboundGoods(block: TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods.Builder.() -> Unit): TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods = TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductRegistrationsResourceCountryOptionsDefaultInboundGoods is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
