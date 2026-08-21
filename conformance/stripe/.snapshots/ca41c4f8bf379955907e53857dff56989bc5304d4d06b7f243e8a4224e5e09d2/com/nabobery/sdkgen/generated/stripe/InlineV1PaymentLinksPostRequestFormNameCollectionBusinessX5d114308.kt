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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/name_collection/properties/business.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/name_collection/properties/business
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308(
  public val enabled: Boolean,
  public val optional: Boolean? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var optional: Boolean? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308(
        enabled = enabled,
        optional = optional,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308(
        enabled = enabled,
        optional = rawObject["optional"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.optional?.let { put("optional", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308(block: InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 = InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormNameCollectionBusinessX5d114308 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
