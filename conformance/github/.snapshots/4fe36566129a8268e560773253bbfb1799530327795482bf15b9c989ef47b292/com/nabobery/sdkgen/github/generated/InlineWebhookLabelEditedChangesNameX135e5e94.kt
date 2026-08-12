package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/name.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-label-edited/properties/changes/properties/name
 */
@Serializable(with = InlineWebhookLabelEditedChangesNameX135e5e94.Serializer::class)
public class InlineWebhookLabelEditedChangesNameX135e5e94(
  /**
   * The previous version of the name if the action was `edited`.
   */
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookLabelEditedChangesNameX135e5e94 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookLabelEditedChangesNameX135e5e94(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookLabelEditedChangesNameX135e5e94 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookLabelEditedChangesNameX135e5e94> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookLabelEditedChangesNameX135e5e94 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookLabelEditedChangesNameX135e5e94")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookLabelEditedChangesNameX135e5e94 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookLabelEditedChangesNameX135e5e94(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookLabelEditedChangesNameX135e5e94) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookLabelEditedChangesNameX135e5e94")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookLabelEditedChangesNameX135e5e94(block: InlineWebhookLabelEditedChangesNameX135e5e94.Builder.() -> Unit): InlineWebhookLabelEditedChangesNameX135e5e94 = InlineWebhookLabelEditedChangesNameX135e5e94.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookLabelEditedChangesNameX135e5e94 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
