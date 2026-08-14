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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes/properties/body.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-discussion-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookDiscussionEditedChangesBodyXf4c23509.Serializer::class)
public class InlineWebhookDiscussionEditedChangesBodyXf4c23509(
  public val from: String,
) {
  public class Builder {
    private var fromValue: String? = null

    public var from: String
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookDiscussionEditedChangesBodyXf4c23509 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookDiscussionEditedChangesBodyXf4c23509(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookDiscussionEditedChangesBodyXf4c23509 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookDiscussionEditedChangesBodyXf4c23509> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookDiscussionEditedChangesBodyXf4c23509 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookDiscussionEditedChangesBodyXf4c23509")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookDiscussionEditedChangesBodyXf4c23509 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookDiscussionEditedChangesBodyXf4c23509(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookDiscussionEditedChangesBodyXf4c23509) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookDiscussionEditedChangesBodyXf4c23509")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookDiscussionEditedChangesBodyXf4c23509(block: InlineWebhookDiscussionEditedChangesBodyXf4c23509.Builder.() -> Unit): InlineWebhookDiscussionEditedChangesBodyXf4c23509 = InlineWebhookDiscussionEditedChangesBodyXf4c23509.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookDiscussionEditedChangesBodyXf4c23509 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
