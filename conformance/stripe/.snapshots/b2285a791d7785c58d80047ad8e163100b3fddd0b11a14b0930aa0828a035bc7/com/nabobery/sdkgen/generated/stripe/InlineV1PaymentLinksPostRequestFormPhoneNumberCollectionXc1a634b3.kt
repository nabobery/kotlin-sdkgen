package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * Controls phone number collection settings during checkout.
 *
 * We recommend that you review your privacy policy and check with your legal contacts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/phone_number_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3(
  public val enabled: Boolean,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3(
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3(
        enabled = enabled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3(block: InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 = InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormPhoneNumberCollectionXc1a634b3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
