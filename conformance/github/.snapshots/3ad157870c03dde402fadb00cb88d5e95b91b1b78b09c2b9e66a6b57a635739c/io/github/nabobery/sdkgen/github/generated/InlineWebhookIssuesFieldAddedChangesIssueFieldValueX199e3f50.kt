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
 * The previous issue field value data.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes/properties/issue_field
 * _value
 */
@Serializable(with = InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50.Serializer::class)
public class InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50(
  /**
   * The previous value of the issue field before the update.
   */
  public val from: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77,
) {
  public class Builder {
    private var fromValue: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77? = null

    public var from: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77
      get() = requireNotNull(fromValue) { "from is required" }
      set(`value`) {
        fromValue = value
      }

    public fun build(): InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 {
      check(fromValue != null) { "from is required" }
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50(
        from = from,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 must be a JSON object")
      val from = json.decodeRequired<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromX2a725d77>(rawObject, "from")
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50(
        from = from,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("from", json.encodeToJsonElement(value.from))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50(block: InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50.Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 = InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
