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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/billing_mode
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba(
  public val type: InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77,
  public val flexible:
      InlineV1SubscriptionSchedulesPostRequestFormBillingModeFlexibleXc680c9d8? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77? =
        null

    public var type: InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var flexible: InlineV1SubscriptionSchedulesPostRequestFormBillingModeFlexibleXc680c9d8? =
        null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba(
        type = type,
        flexible = flexible,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormBillingModeTypeX63b10d77>(rawObject, "type")
      return InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba(
        type = type,
        flexible = rawObject["flexible"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormBillingModeFlexibleXc680c9d8>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.flexible?.let { put("flexible", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba(block: InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba = InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormBillingModeXd1fd61ba is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
