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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/changes/properties/body.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-edited/properties/changes/properties/body
 */
@Serializable(with = InlineWebhookIssuesEditedChangesBodyX27d1e1f9.Serializer::class)
public class InlineWebhookIssuesEditedChangesBodyX27d1e1f9(
  /**
   * The previous version of the body.
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

    public fun build(): InlineWebhookIssuesEditedChangesBodyX27d1e1f9 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookIssuesEditedChangesBodyX27d1e1f9(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesEditedChangesBodyX27d1e1f9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesEditedChangesBodyX27d1e1f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesEditedChangesBodyX27d1e1f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesEditedChangesBodyX27d1e1f9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesEditedChangesBodyX27d1e1f9 must be a JSON object")
      val from = json.decodeRequired<String>(rawObject, "from")
      return InlineWebhookIssuesEditedChangesBodyX27d1e1f9(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesEditedChangesBodyX27d1e1f9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesEditedChangesBodyX27d1e1f9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", value.from)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesEditedChangesBodyX27d1e1f9(block: InlineWebhookIssuesEditedChangesBodyX27d1e1f9.Builder.() -> Unit): InlineWebhookIssuesEditedChangesBodyX27d1e1f9 = InlineWebhookIssuesEditedChangesBodyX27d1e1f9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesEditedChangesBodyX27d1e1f9 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
