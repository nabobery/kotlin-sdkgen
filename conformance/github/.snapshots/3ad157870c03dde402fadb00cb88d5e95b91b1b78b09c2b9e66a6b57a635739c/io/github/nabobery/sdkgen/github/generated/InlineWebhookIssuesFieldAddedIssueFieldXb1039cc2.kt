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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The issue field whose value was set or updated on the issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-added/properties/issue_field
 */
@Serializable(with = InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2.Serializer::class)
public class InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2(
  /**
   * The data type of the issue field.
   */
  public val fieldType: InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28,
  /**
   * The unique identifier of the issue field.
   */
  public val id: Int,
  /**
   * The name of the issue field.
   */
  public val name: String,
) {
  public class Builder {
    private var fieldTypeValue: InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28? = null

    public var fieldType: InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28
      get() = requireNotNull(fieldTypeValue) { "fieldType is required" }
      set(`value`) {
        fieldTypeValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    public fun build(): InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 {
      check(fieldTypeValue != null) { "fieldType is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2(
        fieldType = fieldType,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 must be a JSON object")
      val fieldType = json.decodeRequired<InlineWebhookIssuesFieldAddedIssueFieldFieldTypeX6573fd28>(rawObject, "field_type")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2(
        fieldType = fieldType,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_type", json.encodeToJsonElement(value.fieldType))
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookIssuesFieldAddedIssueFieldXb1039cc2(block: InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2.Builder.() -> Unit): InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 = InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldAddedIssueFieldXb1039cc2 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
