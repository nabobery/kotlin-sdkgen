package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items~1{item_id}/patch/requestBody/c
 * ontent/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items~1{item_id}/patch/requestBody/c
 * ontent/application~1json/schema
 */
@Serializable(with = InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e.Serializer::class)
public class InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e(
  fields: List<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06>,
) {
  /**
   * A list of field updates to apply.
   */
  public val fields: List<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06> =
      fields.toList()

  public class Builder {
    private var fieldsValue: List<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06>? =
        null

    public var fields: List<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06>
      get() = requireNotNull(fieldsValue) { "fields is required" }
      set(`value`) {
        fieldsValue = value
      }

    public fun build(): InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e {
      check(fieldsValue != null) { "fields is required" }
      return InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e(
        fields = fields,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e must be a JSON object")
      val fields = json.decodeRequired<List<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06>>(rawObject, "fields")
      return InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e(
        fields = fields,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("fields", json.encodeToJsonElement(value.fields))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e(block: InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e.Builder.() -> Unit): InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e = InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonX49bdef4e property '" + name + "' is not nullable")
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
