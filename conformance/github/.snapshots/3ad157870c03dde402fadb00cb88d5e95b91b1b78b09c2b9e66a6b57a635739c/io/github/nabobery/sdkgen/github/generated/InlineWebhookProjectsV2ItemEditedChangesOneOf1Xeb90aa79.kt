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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-projects-v2-item-edited/properties/changes/oneOf/0
 */
@Serializable(with = InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79.Serializer::class)
public class InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(
  public val fieldValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d,
) {
  public class Builder {
    private var fieldValueValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d?
        = null

    public var fieldValue: InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d
      get() = requireNotNull(fieldValueValue) { "fieldValue is required" }
      set(`value`) {
        fieldValueValue = value
      }

    public fun build(): InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 {
      check(fieldValueValue != null) { "fieldValue is required" }
      return InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(
        fieldValue = fieldValue,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 must be a JSON object")
      val fieldValue = json.decodeRequired<InlineWebhookProjectsV2ItemEditedChangesOneOf1FieldValueX7bdec00d>(rawObject, "field_value")
      return InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(
        fieldValue = fieldValue,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_value", json.encodeToJsonElement(value.fieldValue))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79(block: InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79.Builder.() -> Unit): InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 = InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookProjectsV2ItemEditedChangesOneOf1Xeb90aa79 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
