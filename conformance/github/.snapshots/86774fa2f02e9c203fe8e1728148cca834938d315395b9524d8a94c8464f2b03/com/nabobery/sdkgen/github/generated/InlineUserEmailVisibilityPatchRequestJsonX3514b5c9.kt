package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * sdkgen://source/openapi.yaml#/paths/~1user~1email~1visibility/patch/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1email~1visibility/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUserEmailVisibilityPatchRequestJsonX3514b5c9.Serializer::class)
public class InlineUserEmailVisibilityPatchRequestJsonX3514b5c9(
  /**
   * Denotes whether an email is publicly visible.
   */
  public val visibility: InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a,
) {
  public class Builder {
    private var visibilityValue: InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a? =
        null

    public var visibility: InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    public fun build(): InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 {
      check(visibilityValue != null) { "visibility is required" }
      return InlineUserEmailVisibilityPatchRequestJsonX3514b5c9(
        visibility = visibility,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUserEmailVisibilityPatchRequestJsonX3514b5c9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserEmailVisibilityPatchRequestJsonX3514b5c9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 must be a JSON object")
      val visibility = json.decodeRequired<InlineUserEmailVisibilityPatchRequestJsonVisibilityX8cc7323a>(rawObject, "visibility")
      return InlineUserEmailVisibilityPatchRequestJsonX3514b5c9(
        visibility = visibility,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserEmailVisibilityPatchRequestJsonX3514b5c9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserEmailVisibilityPatchRequestJsonX3514b5c9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("visibility", json.encodeToJsonElement(value.visibility))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserEmailVisibilityPatchRequestJsonX3514b5c9(block: InlineUserEmailVisibilityPatchRequestJsonX3514b5c9.Builder.() -> Unit): InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 = InlineUserEmailVisibilityPatchRequestJsonX3514b5c9.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineUserEmailVisibilityPatchRequestJsonX3514b5c9 property '" + name + "' is not nullable")
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
