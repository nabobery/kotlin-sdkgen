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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/automatic_tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/default_settings/properties/automatic_tax
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294(
  public val enabled: Boolean,
  public val liability:
      InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsLiabilityXec4e9114? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability:
        InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsLiabilityXec4e9114? = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsLiabilityXec4e9114>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294(block: InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 = InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormDefaultSettingsAutomaticTaxX38b7e294 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
