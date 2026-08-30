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
 * Shipping information for this ConfirmationToken.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/shipping
 */
@Serializable(with = InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20.Serializer::class)
public class InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20(
  public val address: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingAddressX7e882ad4,
  public val name: String,
  public val phone:
      InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d? = null,
) {
  public class Builder {
    private var addressValue:
        InlineV1TestHelpersConfirmationTokensPostRequestFormShippingAddressX7e882ad4? = null

    public var address: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingAddressX7e882ad4
      get() = requireNotNull(addressValue) { "address is required" }
      set(`value`) {
        addressValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public var phone: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d? =
        null

    public fun build(): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 {
      check(addressValue != null) { "address is required" }
      check(nameValue != null) { "name is required" }
      return InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20(
        address = address,
        name = name,
        phone = phone,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 must be a JSON object")
      val address = json.decodeRequired<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingAddressX7e882ad4>(rawObject, "address")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20(
        address = address,
        name = name,
        phone = rawObject["phone"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmationTokensPostRequestFormShippingPhoneX9a0c4b3d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("address", json.encodeToJsonElement(value.address))
        put("name", value.name)
        value.phone?.let { put("phone", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20(block: InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20.Builder.() -> Unit): InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 = InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersConfirmationTokensPostRequestFormShippingXaed2fc20 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
