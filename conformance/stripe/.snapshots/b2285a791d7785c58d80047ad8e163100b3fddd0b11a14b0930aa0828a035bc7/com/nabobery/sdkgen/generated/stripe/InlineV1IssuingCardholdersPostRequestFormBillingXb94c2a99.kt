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
 * The cardholder's billing address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/billing
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99(
  public val address: InlineV1IssuingCardholdersPostRequestFormBillingAddressX055670a8,
) {
  public class Builder {
    private var addressValue: InlineV1IssuingCardholdersPostRequestFormBillingAddressX055670a8? =
        null

    public var address: InlineV1IssuingCardholdersPostRequestFormBillingAddressX055670a8
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    public fun build(): InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 {
      check(addressValue != null) { "address is required" }
      return InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99(
        address = address,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 must be a JSON object")
      val address = json.decodeRequired<InlineV1IssuingCardholdersPostRequestFormBillingAddressX055670a8>(rawObject, "address")
      return InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99(
        address = address,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99(block: InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 = InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormBillingXb94c2a99 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
