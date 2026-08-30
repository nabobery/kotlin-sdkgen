package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The previous field value, present when an existing value was updated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes
 */
@Serializable(with = InlineWebhookIssuesFieldAddedChangesXfcb973ea.Serializer::class)
public class InlineWebhookIssuesFieldAddedChangesXfcb973ea(
  /**
   * The previous issue field value data.
   */
  public val issueFieldValue: InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50? = null,
) {
  public class Builder {
    /**
     * The previous issue field value data.
     */
    public var issueFieldValue: InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50? = null

    public fun build(): InlineWebhookIssuesFieldAddedChangesXfcb973ea = InlineWebhookIssuesFieldAddedChangesXfcb973ea(
      issueFieldValue = issueFieldValue,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesXfcb973ea = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedChangesXfcb973ea> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedChangesXfcb973ea {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedChangesXfcb973ea")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesXfcb973ea must be a JSON object")
      return InlineWebhookIssuesFieldAddedChangesXfcb973ea(
        issueFieldValue = rawObject["issue_field_value"]?.let { json.decodeFromJsonElement<InlineWebhookIssuesFieldAddedChangesIssueFieldValueX199e3f50>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedChangesXfcb973ea) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedChangesXfcb973ea")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.issueFieldValue?.let { put("issue_field_value", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesFieldAddedChangesXfcb973ea(block: InlineWebhookIssuesFieldAddedChangesXfcb973ea.Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesXfcb973ea = InlineWebhookIssuesFieldAddedChangesXfcb973ea.build(block)
