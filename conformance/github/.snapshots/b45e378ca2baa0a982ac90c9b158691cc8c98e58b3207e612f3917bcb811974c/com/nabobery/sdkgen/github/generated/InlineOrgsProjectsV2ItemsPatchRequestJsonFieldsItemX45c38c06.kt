package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items~1{item_id}/patch/requestBody/c
 * ontent/application~1json/schema/properties/fields/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1projectsV2~1{project_number}~1items~1{item_id}/patch/requestBody/c
 * ontent/application~1json/schema/properties/fields/items
 */
@Serializable(with = InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06.Serializer::class)
public class InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06(
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
  public val `value`: InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemValueX575128de?,
) {
  public class Builder {
    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var valueState:
        FieldState<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemValueX575128de?> =
        FieldState.Absent

    /**
     * The new value for the field:
     * - For text, number, and date fields, provide the new value directly.
     * - For single select and iteration fields, provide the ID of the option or iteration.
     * - To clear the field, set this to null.
     * Required nullable field; assigning `null` records present-null.
     */
    public var `value`: InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemValueX575128de?
      get() = valueState.valueOrNull()
      set(`value`) {
        valueState = value.toNullableFieldState()
      }

    public fun build(): InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 {
      check(idValue != null) { "id is required" }
      check(valueState !== FieldState.Absent) { "value is required, even when null" }
      return InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06(
        id = id,
        value = valueState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 must be a JSON object")
      val id = json.decodeRequired<Int>(rawObject, "id")
      if (!rawObject.containsKey("value")) {
        throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 is missing required property 'value'")
      }
      val value = rawObject["value"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemValueX575128de?>(requireNotNull(element)) }
      return InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06(
        id = id,
        value = value,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        put("value", value.value?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06(block: InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06.Builder.() -> Unit): InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 = InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineOrgsProjectsV2ItemsPatchRequestJsonFieldsItemX45c38c06 property '" + name + "' is not nullable")
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
