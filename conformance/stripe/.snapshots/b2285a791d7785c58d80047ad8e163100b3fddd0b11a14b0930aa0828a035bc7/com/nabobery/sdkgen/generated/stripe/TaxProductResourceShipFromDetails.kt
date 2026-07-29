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

@Serializable
public data class TaxProductResourceShipFromDetailsView(
  public val address: TaxProductResourcePostalAddress,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_product_resource_ship_from_details
 */
@Serializable(with = TaxProductResourceShipFromDetails.Serializer::class)
public class TaxProductResourceShipFromDetails(
  public val address: TaxProductResourcePostalAddress,
) {
  public class Builder {
    private var addressValue: TaxProductResourcePostalAddress? = null

    public var address: TaxProductResourcePostalAddress
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    public fun build(): TaxProductResourceShipFromDetails {
      check(addressValue != null) { "address is required" }
      return TaxProductResourceShipFromDetails(
        address = address,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceShipFromDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<TaxProductResourceShipFromDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceShipFromDetails {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceShipFromDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceShipFromDetails must be a JSON object")
      val address = json.decodeRequired<TaxProductResourcePostalAddress>(rawObject, "address")
      return TaxProductResourceShipFromDetails(
        address = address,
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceShipFromDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceShipFromDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceShipFromDetails(block: TaxProductResourceShipFromDetails.Builder.() -> Unit): TaxProductResourceShipFromDetails = TaxProductResourceShipFromDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("TaxProductResourceShipFromDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
