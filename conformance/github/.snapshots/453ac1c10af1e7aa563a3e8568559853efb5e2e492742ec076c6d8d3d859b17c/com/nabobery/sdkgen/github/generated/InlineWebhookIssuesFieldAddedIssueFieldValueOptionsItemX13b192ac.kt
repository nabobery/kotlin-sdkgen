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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field_value/properties/o
 * ptions/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field_value/properties/o
 * ptions/items
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac.Serializer::class)
public class InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac(
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

    public fun build(): InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac = InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac(
      color = color,
      description = description,
      id = id,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac must be a JSON object")
      return InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac")
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

public fun inlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac(block: InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac.Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac = InlineWebhookIssuesFieldAddedIssueFieldValueOptionsItemX13b192ac.build(block)
