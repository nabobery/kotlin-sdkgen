package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/0/propertie
 * s/field_value.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/0/propertie
 * s/field_value
 */
@Serializable(with = InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d.Serializer::class)
public class InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d(
  public val fieldName: String? = null,
  public val fieldNodeId: String? = null,
  public val fieldType: String? = null,
  public val from: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueFromX90f40c0e? = null,
  public val projectNumber: Int? = null,
  public val to: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueToX43a95cde? = null,
) {
  public class Builder {
    public var fieldName: String? = null

    public var fieldNodeId: String? = null

    public var fieldType: String? = null

    public var from: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueFromX90f40c0e? = null

    public var projectNumber: Int? = null

    public var to: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueToX43a95cde? = null

    public fun build(): InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d = InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d(
      fieldName = fieldName,
      fieldNodeId = fieldNodeId,
      fieldType = fieldType,
      from = from,
      projectNumber = projectNumber,
      to = to,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d must be a JSON object")
      return InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d(
        fieldName = rawObject["field_name"]?.let { json.decodeFromJsonElement<String>(it) },
        fieldNodeId = rawObject["field_node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        fieldType = rawObject["field_type"]?.let { json.decodeFromJsonElement<String>(it) },
        from = rawObject["from"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueFromX90f40c0e?>(element) },
        projectNumber = rawObject["project_number"]?.let { json.decodeFromJsonElement<Int>(it) },
        to = rawObject["to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueToX43a95cde?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fieldName?.let { put("field_name", it) }
        value.fieldNodeId?.let { put("field_node_id", it) }
        value.fieldType?.let { put("field_type", it) }
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
        value.projectNumber?.let { put("project_number", json.encodeToJsonElement(it)) }
        value.to?.let { put("to", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d(block: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d.Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d = InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d.build(block)
