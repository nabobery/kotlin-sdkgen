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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/body.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookPullRequestEditedChangesBodyX6940571d.Serializer::class)
public class InlineWebhookPullRequestEditedChangesBodyX6940571d(
  /**
   * The previous version of the body if the action was `edited`.
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

    public fun build(): InlineWebhookPullRequestEditedChangesBodyX6940571d {
      check(fromValue != null) { "from is required" }
      return InlineWebhookPullRequestEditedChangesBodyX6940571d(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEditedChangesBodyX6940571d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEditedChangesBodyX6940571d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEditedChangesBodyX6940571d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEditedChangesBodyX6940571d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEditedChangesBodyX6940571d must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookPullRequestEditedChangesBodyX6940571d(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEditedChangesBodyX6940571d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEditedChangesBodyX6940571d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEditedChangesBodyX6940571d(block: InlineWebhookPullRequestEditedChangesBodyX6940571d.Builder.() -> Unit): InlineWebhookPullRequestEditedChangesBodyX6940571d = InlineWebhookPullRequestEditedChangesBodyX6940571d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEditedChangesBodyX6940571d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
