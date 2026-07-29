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
 * Settings related to subscription trials.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/trial_settings
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9(
  public val endBehavior: InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412,
) {
  public class Builder {
    private var endBehaviorValue:
        InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412? = null

    public var endBehavior: InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412
      get() = requireNotNull(endBehaviorValue) { "endBehavior is required" }
      set(`value`) {
        endBehaviorValue = value
      }

    public fun build(): InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 {
      check(endBehaviorValue != null) { "endBehavior is required" }
      return InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9(
        endBehavior = endBehavior,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 must be a JSON object")
      val endBehavior = json.decodeRequired<InlineV1SubscriptionsPostRequestFormTrialSettingsEndBehaviorX2373f412>(rawObject, "end_behavior")
      return InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9(
        endBehavior = endBehavior,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_behavior", json.encodeToJsonElement(value.endBehavior))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9(block: InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9.Builder.() -> Unit): InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 = InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1SubscriptionsPostRequestFormTrialSettingsXe20b5ab9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
