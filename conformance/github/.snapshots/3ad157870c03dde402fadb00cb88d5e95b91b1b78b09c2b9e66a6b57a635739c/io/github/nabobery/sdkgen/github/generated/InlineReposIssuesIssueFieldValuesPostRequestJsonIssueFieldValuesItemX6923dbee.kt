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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/post/request
 * Body/content/application~1json/schema/properties/issue_field_values/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1issue-field-values/post/request
 * Body/content/application~1json/schema/properties/issue_field_values/items
 */
@Serializable(with = InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee.Serializer::class)
public class InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee(
  /**
   * The ID of the issue field to set
   */
  public val fieldId: Int,
  /**
   * The value to set for the field. The type depends on the field's data type:
   * - For text fields: provide a string value
   * - For single_select fields: provide the option name as a string (must match an existing option)
   * - For number fields: provide a numeric value
   * - For multi_select fields: provide an array of option names (must match existing options)
   * - For date fields: provide an ISO 8601 date string
   */
  public val `value`:
      InlineReposIssuesIssueFiel0401PostRequestJsonIssueFieldValuesItemValueX7343cd42,
) {
  public class Builder {
    private var fieldIdValue: Int? = null

    public var fieldId: Int
      get() = requireNotNull(fieldIdValue) { "fieldId is required" }
      set(`value`) {
        fieldIdValue = value
      }

    private var valueValue:
        InlineReposIssuesIssueFiel0401PostRequestJsonIssueFieldValuesItemValueX7343cd42? = null

    public var `value`:
        InlineReposIssuesIssueFiel0401PostRequestJsonIssueFieldValuesItemValueX7343cd42
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee {
      check(fieldIdValue != null) { "fieldId is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee(
        fieldId = fieldId,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee must be a JSON object")
      val fieldId = json.decodeRequired<Int>(rawObject, "field_id")
      val value = json.decodeRequired<InlineReposIssuesIssueFiel0401PostRequestJsonIssueFieldValuesItemValueX7343cd42>(rawObject, "value")
      return InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee(
        fieldId = fieldId,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_id", json.encodeToJsonElement(value.fieldId))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee(block: InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee.Builder.() -> Unit): InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee = InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesIssueFieldValuesPostRequestJsonIssueFieldValuesItemX6923dbee is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
