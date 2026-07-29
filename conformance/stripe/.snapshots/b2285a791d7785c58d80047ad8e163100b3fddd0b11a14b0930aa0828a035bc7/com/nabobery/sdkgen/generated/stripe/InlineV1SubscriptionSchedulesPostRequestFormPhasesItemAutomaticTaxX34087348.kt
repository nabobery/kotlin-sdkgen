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
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/automatic_tax.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules~1{schedule}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/phases/items/properties/automatic_tax
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348(
  public val enabled: Boolean,
  public val liability:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f? = null,
) {
  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    public var liability: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f?
        = null

    public fun build(): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 {
      check(enabledValue != null) { "enabled is required" }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348(
        enabled = enabled,
        liability = liability,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348(
        enabled = enabled,
        liability = rawObject["liability"]?.let { json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemLiabilityXc3764f5f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.liability?.let { put("liability", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348(block: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348.Builder.() -> Unit): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAutomaticTaxX34087348 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
