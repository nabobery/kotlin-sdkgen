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
 * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/billing_mode
 */
@Serializable(with = InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93.Serializer::class)
public class InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93(
  public val type: InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2,
  public val flexible:
      InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2? =
        null

    public var type: InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54? =
        null

    public fun build(): InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionsMigratePostRequestFormBillingModeTypeXa7ac80a2>(rawObject, "type")
      return InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionsMigratePostRequestFormBillingModeFlexibleXa67b5a54>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93(block: InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93.Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 = InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
