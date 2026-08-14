package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes_8/properties/tier.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhooks_changes_8/properties/tier
 */
@Serializable(with = InlineWebhooksChanges8TierX6606caa4.Serializer::class)
public class InlineWebhooksChanges8TierX6606caa4(
  /**
   * The `tier_changed` and `pending_tier_change` will include the original tier before the change or pending change.
   * For more information, see the pending tier change payload.
   */
  public val from: InlineWebhooksChanges8TierFromXf5f5676b,
) {
  public class Builder {
    private var fromValue: InlineWebhooksChanges8TierFromXf5f5676b? = null

    public var from: InlineWebhooksChanges8TierFromXf5f5676b
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhooksChanges8TierX6606caa4 {
      check(fromValue != null) { "from is required" }
      return InlineWebhooksChanges8TierX6606caa4(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhooksChanges8TierX6606caa4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhooksChanges8TierX6606caa4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhooksChanges8TierX6606caa4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhooksChanges8TierX6606caa4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhooksChanges8TierX6606caa4 must be a JSON object")
      val from = json.decodeRequired<InlineWebhooksChanges8TierFromXf5f5676b>(rawObject, "from")
      return InlineWebhooksChanges8TierX6606caa4(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhooksChanges8TierX6606caa4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhooksChanges8TierX6606caa4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhooksChanges8TierX6606caa4(block: InlineWebhooksChanges8TierX6606caa4.Builder.() -> Unit): InlineWebhooksChanges8TierX6606caa4 = InlineWebhooksChanges8TierX6606caa4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhooksChanges8TierX6606caa4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
