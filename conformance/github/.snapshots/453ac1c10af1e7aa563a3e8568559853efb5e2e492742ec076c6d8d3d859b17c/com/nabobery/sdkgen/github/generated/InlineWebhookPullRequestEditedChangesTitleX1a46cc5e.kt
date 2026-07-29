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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/title.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-pull-request-edited/properties/changes/properties/title
 */
@Serializable(with = InlineWebhookPullRequestEditedChangesTitleX1a46cc5e.Serializer::class)
public class InlineWebhookPullRequestEditedChangesTitleX1a46cc5e(
  /**
   * The previous version of the title if the action was `edited`.
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

    public fun build(): InlineWebhookPullRequestEditedChangesTitleX1a46cc5e {
      check(fromValue != null) { "from is required" }
      return InlineWebhookPullRequestEditedChangesTitleX1a46cc5e(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookPullRequestEditedChangesTitleX1a46cc5e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookPullRequestEditedChangesTitleX1a46cc5e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookPullRequestEditedChangesTitleX1a46cc5e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookPullRequestEditedChangesTitleX1a46cc5e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookPullRequestEditedChangesTitleX1a46cc5e must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookPullRequestEditedChangesTitleX1a46cc5e(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookPullRequestEditedChangesTitleX1a46cc5e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookPullRequestEditedChangesTitleX1a46cc5e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookPullRequestEditedChangesTitleX1a46cc5e(block: InlineWebhookPullRequestEditedChangesTitleX1a46cc5e.Builder.() -> Unit): InlineWebhookPullRequestEditedChangesTitleX1a46cc5e = InlineWebhookPullRequestEditedChangesTitleX1a46cc5e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookPullRequestEditedChangesTitleX1a46cc5e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
