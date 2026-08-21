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
 * The selected option details. Present for single_select field types.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field_value/properties/o
 * ption
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401.Serializer::class)
public class InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401(
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

    public fun build(): InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401 = InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401(
      color = color,
      description = description,
      id = id,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401 must be a JSON object")
      return InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401(
        color = rawObject["color"]?.let { json.decodeFromJsonElement<String>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401")
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

public fun inlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401(block: InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401.Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401 = InlineWebhookIssuesFieldAddedIssueFieldValueOptionX9be85401.build(block)
