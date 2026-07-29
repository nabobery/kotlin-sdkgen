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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}~1comments~1{comment_id}/patch/requestBody/content/application~
 * 1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1gists~1{gist_id}~1comments~1{comment_id}/patch/requestBody/content/application~
 * 1json/schema
 */
@Serializable(with = InlineGistsCommentsPatchRequestJsonX6ff66047.Serializer::class)
public class InlineGistsCommentsPatchRequestJsonX6ff66047(
  /**
   * The comment text.
   */
  public val body: String,
) {
  public class Builder {
    private var bodyValue: String? = null

    public var body: String
      get() = requireNotNull(bodyValue) { "body is required" }
      set(`value`) {
        bodyValue = value
      }

    public fun build(): InlineGistsCommentsPatchRequestJsonX6ff66047 {
      check(bodyValue != null) { "body is required" }
      return InlineGistsCommentsPatchRequestJsonX6ff66047(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGistsCommentsPatchRequestJsonX6ff66047 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGistsCommentsPatchRequestJsonX6ff66047> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGistsCommentsPatchRequestJsonX6ff66047 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGistsCommentsPatchRequestJsonX6ff66047")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGistsCommentsPatchRequestJsonX6ff66047 must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineGistsCommentsPatchRequestJsonX6ff66047(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGistsCommentsPatchRequestJsonX6ff66047) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGistsCommentsPatchRequestJsonX6ff66047")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGistsCommentsPatchRequestJsonX6ff66047(block: InlineGistsCommentsPatchRequestJsonX6ff66047.Builder.() -> Unit): InlineGistsCommentsPatchRequestJsonX6ff66047 = InlineGistsCommentsPatchRequestJsonX6ff66047.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGistsCommentsPatchRequestJsonX6ff66047 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineGistsCommentsPatchRequestJsonX6ff66047 property '" + name + "' is not nullable")
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
