package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription}~1migrate/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1SubscriptionsMigratePostRequestFormX2629eab6.Serializer::class)
public class InlineV1SubscriptionsMigratePostRequestFormX2629eab6(
  /**
   * Controls how prorations and invoices for subscriptions are calculated and orchestrated.
   */
  public val billingMode: InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var billingModeValue: InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93? =
        null

    public var billingMode: InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93
      get() = requireNotNull(billingModeValue) { "billingMode is required" }
      set(`value`) {
        billingModeValue = value
      }

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1SubscriptionsMigratePostRequestFormX2629eab6 {
      check(billingModeValue != null) { "billingMode is required" }
      return InlineV1SubscriptionsMigratePostRequestFormX2629eab6(
        billingMode = billingMode,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormX2629eab6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsMigratePostRequestFormX2629eab6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsMigratePostRequestFormX2629eab6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsMigratePostRequestFormX2629eab6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsMigratePostRequestFormX2629eab6 must be a JSON object")
      val billingMode = json.decodeRequired<InlineV1SubscriptionsMigratePostRequestFormBillingModeX61ce8d93>(rawObject, "billing_mode")
      return InlineV1SubscriptionsMigratePostRequestFormX2629eab6(
        billingMode = billingMode,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsMigratePostRequestFormX2629eab6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsMigratePostRequestFormX2629eab6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billing_mode", json.encodeToJsonElement(value.billingMode))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsMigratePostRequestFormX2629eab6(block: InlineV1SubscriptionsMigratePostRequestFormX2629eab6.Builder.() -> Unit): InlineV1SubscriptionsMigratePostRequestFormX2629eab6 = InlineV1SubscriptionsMigratePostRequestFormX2629eab6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsMigratePostRequestFormX2629eab6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
