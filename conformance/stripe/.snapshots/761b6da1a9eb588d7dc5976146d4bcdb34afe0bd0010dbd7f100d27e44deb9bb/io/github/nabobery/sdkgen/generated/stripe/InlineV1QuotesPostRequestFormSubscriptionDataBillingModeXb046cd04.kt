package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/subscription_data/properties/billing_mode
 */
@Serializable(with = InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04.Serializer::class)
public class InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04(
  public val type: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c,
  public val flexible:
      InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06? = null,
) {
  public class Builder {
    private var typeValue: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c? =
        null

    public var type: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06?
        = null

    public fun build(): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 {
      check(typeValue != null) { "type is required" }
      return InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 must be a JSON object")
      val type = json.decodeRequired<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeTypeXc9d0ae5c>(rawObject, "type")
      return InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1QuotesPostRequestFormSubscriptionDataBillingModeFlexibleXa2ea0e06>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04(block: InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04.Builder.() -> Unit): InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 = InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1QuotesPostRequestFormSubscriptionDataBillingModeXb046cd04 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
