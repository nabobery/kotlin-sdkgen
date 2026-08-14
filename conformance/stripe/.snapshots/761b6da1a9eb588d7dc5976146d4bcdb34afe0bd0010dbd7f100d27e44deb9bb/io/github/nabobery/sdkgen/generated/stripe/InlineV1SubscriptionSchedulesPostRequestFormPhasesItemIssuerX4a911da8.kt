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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings/properties/issuer.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings/properties/issuer
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8(
  public val type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX6bda21a9,
  public val account: String? = null,
) {
  public class Builder {
    private var typeValue: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX6bda21a9? =
        null

    public var type: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX6bda21a9
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var account: String? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 {
      check(typeValue != null) { "type is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8(
        type = type,
        account = account,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 must be a JSON object")
      val type = json.decodeRequired<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemTypeX6bda21a9>(rawObject, "type")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8(
        type = type,
        account = rawObject["account"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.account?.let { put("account", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemIssuerX4a911da8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
