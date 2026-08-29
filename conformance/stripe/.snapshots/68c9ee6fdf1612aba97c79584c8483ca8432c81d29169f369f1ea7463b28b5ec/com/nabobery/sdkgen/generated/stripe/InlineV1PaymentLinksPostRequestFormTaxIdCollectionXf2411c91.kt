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
 * Controls tax ID collection during checkout.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/tax_id_collection
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91(
  public val enabled: Boolean,
  public val required: InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredXe4429009? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var required: InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredXe4429009? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91(
        enabled = enabled,
        required = required,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91(
        enabled = enabled,
        required = rawObject["required"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormTaxIdCollectionRequiredXe4429009>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.required?.let { put("required", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91(block: InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 = InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormTaxIdCollectionXf2411c91 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
