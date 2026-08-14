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
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items~1{item_id}/patch/request
 * Body/content/application~1json/schema/properties/fields/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1projectsV2~1{project_number}~1items~1{item_id}/patch/request
 * Body/content/application~1json/schema/properties/fields/items
 */
@Serializable(with = InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0.Serializer::class)
public class InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0(
  /**
   * The ID of the project field to update.
   */
  public val id: Int,
  /**
   * The new value for the field:
   * - For text, number, and date fields, provide the new value directly.
   * - For single select and iteration fields, provide the ID of the option or iteration.
   * - To clear the field, set this to null.
   */
  public val `value`: InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba?,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var valueState:
        FieldState<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba?> =
        FieldState.Absent

    /**
     * The new value for the field:
     * - For text, number, and date fields, provide the new value directly.
     * - For single select and iteration fields, provide the ID of the option or iteration.
     * - To clear the field, set this to null.
     * Required nullable field; assigning `null` records present-null.
     */
    public var `value`: InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba?
      get() = valueState.valueOrNull()
      set(`value`) {
        valueState = value.toNullableFieldState()
      }

    public fun build(): InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 {
      check(idValue != null) { "id is required" }
      check(valueState !== FieldState.Absent) { "value is required, even when null" }
      return InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0(
        id = id,
        value = valueState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      if (!rawObject.containsKey("value")) {
        throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 is missing required property 'value'")
      }
      val value = rawObject["value"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemValueXa6dfecba?>(requireNotNull(element)) }
      return InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0(
        id = id,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("value", value.value?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0(block: InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0.Builder.() -> Unit): InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 = InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineUsersProjectsV2ItemsPatchRequestJsonFieldsItemX5eb2a7d0 property '" + name + "' is not nullable")
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
