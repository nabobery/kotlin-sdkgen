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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/put/requestB
 * ody/content/application~1json/schema/properties/issue_field_values/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/put/requestB
 * ody/content/application~1json/schema/properties/issue_field_values/items
 */
@Serializable(with = InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf.Serializer::class)
public class InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf(
  /**
   * The ID of the issue field to set
   */
  public val fieldId: Int,
  /**
   * The value to set for the field. The type depends on the field's data type:
   * - For text fields: provide a string value
   * - For single_select fields: provide the option name as a string (must match an existing option)
   * - For number fields: provide a numeric value
   * - For date fields: provide an ISO 8601 date string
   */
  public val `value`:
      InlineReposIssuesIssueFiel0401PutRequestJsonIssueFieldValuesItemValueXfb9c5b7a,
) {
  public class Builder {
    private var fieldIdValue: Int? = null

    public var fieldId: Int
      get() = requireNotNull(fieldIdValue) { "fieldId is required" }
      set(`value`) {
        fieldIdValue = value
      }

    private var valueValue:
        InlineReposIssuesIssueFiel0401PutRequestJsonIssueFieldValuesItemValueXfb9c5b7a? = null

    public var `value`:
        InlineReposIssuesIssueFiel0401PutRequestJsonIssueFieldValuesItemValueXfb9c5b7a
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf {
      check(fieldIdValue != null) { "fieldId is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf(
        fieldId = fieldId,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf must be a JSON object")
      val fieldId = json.decodeRequired<Int>(rawObject, "field_id")
      val value = json.decodeRequired<InlineReposIssuesIssueFiel0401PutRequestJsonIssueFieldValuesItemValueXfb9c5b7a>(rawObject, "value")
      return InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf(
        fieldId = fieldId,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_id", json.encodeToJsonElement(value.fieldId))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf(block: InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf.Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf = InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPutRequestJsonIssueFieldValuesItemX6a6ef3bf is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
