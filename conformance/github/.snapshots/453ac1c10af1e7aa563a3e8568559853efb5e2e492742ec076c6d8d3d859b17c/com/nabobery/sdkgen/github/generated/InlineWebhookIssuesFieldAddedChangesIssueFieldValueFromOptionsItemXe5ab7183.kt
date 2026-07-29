package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes/properties/issue_field
 * _value/properties/from/properties/options/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/changes/properties/issue_field
 * _value/properties/from/properties/options/items
 */
@Serializable(with = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183.Serializer::class)
public class InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183(
  public val color: String? = null,
  public val description: String? = null,
  public val id: Int? = null,
  public val name: String? = null,
) {
  public class Builder {
    public var color: String? = null

    public var description: String? = null

    public var id: Int? = null

    public var name: String? = null

    public fun build(): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183 = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183(
      color = color,
      description = description,
      id = id,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183 must be a JSON object")
      return InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.color?.let { put("color", it) }
        value.description?.let { put("description", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183(block: InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183.Builder.() -> Unit): InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183 = InlineWebhookIssuesFieldAddedChangesIssueFieldValueFromOptionsItemXe5ab7183.build(block)
