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
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_cardholder_address
 */
@Serializable(with = IssuingCardholderAddress.Serializer::class)
public class IssuingCardholderAddress(
  public val address: Address,
) {
  public class Builder {
    private var addressValue: Address? = null

    public var address: Address
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    public fun build(): IssuingCardholderAddress {
      check(addressValue != null) { "address is required" }
      return IssuingCardholderAddress(
        address = address,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingCardholderAddress = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingCardholderAddress> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingCardholderAddress {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingCardholderAddress")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingCardholderAddress must be a JSON object")
      val address = json.decodeRequired<Address>(rawObject, "address")
      return IssuingCardholderAddress(
        address = address,
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingCardholderAddress) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingCardholderAddress")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingCardholderAddress(block: IssuingCardholderAddress.Builder.() -> Unit): IssuingCardholderAddress = IssuingCardholderAddress.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssuingCardholderAddress is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
