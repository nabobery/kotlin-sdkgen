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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/tag_name.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-release-edited/properties/changes/properties/tag_name
 */
@Serializable(with = InlineWebhookReleaseEditedChangesTagNameX04005e16.Serializer::class)
public class InlineWebhookReleaseEditedChangesTagNameX04005e16(
  /**
   * The previous version of the tag_name if the action was `edited`.
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

    public fun build(): InlineWebhookReleaseEditedChangesTagNameX04005e16 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookReleaseEditedChangesTagNameX04005e16(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookReleaseEditedChangesTagNameX04005e16 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookReleaseEditedChangesTagNameX04005e16> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookReleaseEditedChangesTagNameX04005e16 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookReleaseEditedChangesTagNameX04005e16")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookReleaseEditedChangesTagNameX04005e16 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookReleaseEditedChangesTagNameX04005e16(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookReleaseEditedChangesTagNameX04005e16) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookReleaseEditedChangesTagNameX04005e16")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookReleaseEditedChangesTagNameX04005e16(block: InlineWebhookReleaseEditedChangesTagNameX04005e16.Builder.() -> Unit): InlineWebhookReleaseEditedChangesTagNameX04005e16 = InlineWebhookReleaseEditedChangesTagNameX04005e16.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookReleaseEditedChangesTagNameX04005e16 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
