package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/issue_field_values/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}/patch/requestBody/content/applic
 * ation~1json/schema/properties/issue_field_values/items
 */
@Serializable(with = InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17.Serializer::class)
public class InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17(
  /**
   * The ID of the issue field to set
   */
  public val fieldId: Int,
  /**
   * The value to set for the field. For multi-select fields, provide an array of option names.
   */
  public val `value`: InlineReposIssuesPatchRequestJsonIssueFieldValuesItemValueXbec30eef,
) {
  public class Builder {
    private var fieldIdValue: Int? = null

    public var fieldId: Int
      get() = requireNotNull(fieldIdValue) { "fieldId is required" }
      set(`value`) {
        fieldIdValue = value
      }

    private var valueValue: InlineReposIssuesPatchRequestJsonIssueFieldValuesItemValueXbec30eef? =
        null

    public var `value`: InlineReposIssuesPatchRequestJsonIssueFieldValuesItemValueXbec30eef
      get() = requireNotNull(valueValue) { "value is required" }
      set(`value`) {
        valueValue = value
      }

    public fun build(): InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 {
      check(fieldIdValue != null) { "fieldId is required" }
      check(valueValue != null) { "value is required" }
      return InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17(
        fieldId = fieldId,
        value = value,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 must be a JSON object")
      val fieldId = json.decodeRequired<Int>(rawObject, "field_id")
      val value = json.decodeRequired<InlineReposIssuesPatchRequestJsonIssueFieldValuesItemValueXbec30eef>(rawObject, "value")
      return InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17(
        fieldId = fieldId,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("field_id", json.encodeToJsonElement(value.fieldId))
        put("value", json.encodeToJsonElement(value.value))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17(block: InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17.Builder.() -> Unit): InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 = InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposIssuesPatchRequestJsonIssueFieldValuesItemX6c8e2c17 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
