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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a/properties/issue_field_values/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues/post/requestBody/content/application~1json/schem
 * a/properties/issue_field_values/items
 */
@Serializable(with = InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03.Serializer::class)
public class InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03(
  /**
   * The ID of the issue field to set
   */
  public val fieldId: Int,
  /**
   * The value to set for the field. For multi-select fields, provide an array of option names.
   */
  public val `value`: InlineReposIssuesPostRequestJsonIssueFieldValuesItemValueX041986f9,
) {
  public class Builder {
    private var fieldIdValue: Int? = null

    public var fieldId: Int
      get() = requireNotNull(fieldIdValue) { "fieldId is required" }
      set(`value`) {
        fieldIdValue = value
      }

    private var valueValue: InlineReposIssuesPostRequestJsonIssueFieldValuesItemValueX041986f9? =
        null

    public var `value`: InlineReposIssuesPostRequestJsonIssueFieldValuesItemValueX041986f9
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 {
      check(fieldIdValue != null) { "fieldId is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03(
        fieldId = fieldId,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 must be a JSON object")
      val fieldId = json.decodeRequired<Int>(rawObject, "field_id")
      val value = json.decodeRequired<InlineReposIssuesPostRequestJsonIssueFieldValuesItemValueX041986f9>(rawObject, "value")
      return InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03(
        fieldId = fieldId,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_id", json.encodeToJsonElement(value.fieldId))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03(block: InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03.Builder.() -> Unit): InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 = InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesPostRequestJsonIssueFieldValuesItemX21b2fa03 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
