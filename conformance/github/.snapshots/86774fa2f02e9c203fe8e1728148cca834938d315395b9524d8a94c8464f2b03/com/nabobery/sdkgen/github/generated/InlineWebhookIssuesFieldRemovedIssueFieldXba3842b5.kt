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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * The issue field whose value was cleared from the issue.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-issues-field-removed/properties/issue_field
 */
@Serializable(with = InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5.Serializer::class)
public class InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5(
  /**
   * The data type of the issue field.
   */
  public val fieldType: InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9,
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
    private var fieldTypeValue: InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9? = null

    public var fieldType: InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9
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

    public fun build(): InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 {
      check(fieldTypeValue != null) { "fieldType is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      return InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5(
        fieldType = fieldType,
        id = id,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 must be a JSON object")
      val fieldType = json.decodeRequired<InlineWebhookIssuesFieldRemovedIssueFieldFieldTypeX5f0cb0e9>(rawObject, "field_type")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5(
        fieldType = fieldType,
        id = id,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5")
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

public fun inlineWebhookIssuesFieldRemovedIssueFieldXba3842b5(block: InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5.Builder.() -> Unit): InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 = InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookIssuesFieldRemovedIssueFieldXba3842b5 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
