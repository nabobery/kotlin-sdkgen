package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items~1{item_id}/patch/request
 * Body/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items~1{item_id}/patch/request
 * Body/content/application~1json/schema
 */
@Serializable(with = InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e.Serializer::class)
public class InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e(
  fields: List<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0>,
) {
  /**
   * A list of field updates to apply.
   */
  public val fields: List<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0> =
      fields.toList()

  public class Builder {
    private var fieldsValue: List<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0>? =
        null

    public var fields: List<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0>
      get() = requireNotNull(fieldsValue) { "fields is required" }.toList()
      set(`value`) {
        fieldsValue = value.toList()
      }

    public fun build(): InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e {
      check(fieldsValue != null) { "fields is required" }
      return InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e(
        fields = fields,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e must be a JSON object")
      val fields = json.decodeRequired<List<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0>>(rawObject, "fields")
      return InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e(
        fields = fields,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("fields", json.encodeToJsonElement(value.fields))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersProjectsV2ItemsPatchRequestJsonX6053813e(block: InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e.Builder.() -> Unit): InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e = InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonX6053813e property '" + name + "' is not nullable")
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
