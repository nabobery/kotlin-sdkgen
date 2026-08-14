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
import kotlinx.serialization.json.put

/**
 * Fields that specify how to calculate a meter event's value.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1meters/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/value_settings
 */
@Serializable(with = InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3.Serializer::class)
public class InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3(
  public val eventPayloadKey: String,
) {
  public class Builder {
    private var eventPayloadKeyValue: String? = null

    public var eventPayloadKey: String
      get() = requireNotNull(eventPayloadKeyValue) { "eventPayloadKey is required" }
      set(`value`) {
        eventPayloadKeyValue = value
      }

    public fun build(): InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 {
      check(eventPayloadKeyValue != null) { "eventPayloadKey is required" }
      return InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3(
        eventPayloadKey = eventPayloadKey,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 must be a JSON object")
      val eventPayloadKey = json.decodeRequired<String>(rawObject, "event_payload_key")
      return InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3(
        eventPayloadKey = eventPayloadKey,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("event_payload_key", value.eventPayloadKey)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3(block: InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3.Builder.() -> Unit): InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 = InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1BillingMetersPostRequestFormValueSettingsXc9016ea3 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
