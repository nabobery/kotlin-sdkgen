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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments~1{comment_id}/patch/requestBody/content
 * /application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1pulls~1comments~1{comment_id}/patch/requestBody/content
 * /application~1json/schema
 */
@Serializable(with = InlineReposPullsCommentsPatchRequestJsonX088a1aad.Serializer::class)
public class InlineReposPullsCommentsPatchRequestJsonX088a1aad(
  /**
   * The text of the reply to the review comment.
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

    public fun build(): InlineReposPullsCommentsPatchRequestJsonX088a1aad {
      check(bodyValue != null) { "body is required" }
      return InlineReposPullsCommentsPatchRequestJsonX088a1aad(
        body = body,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPullsCommentsPatchRequestJsonX088a1aad = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPullsCommentsPatchRequestJsonX088a1aad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPullsCommentsPatchRequestJsonX088a1aad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPullsCommentsPatchRequestJsonX088a1aad")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPullsCommentsPatchRequestJsonX088a1aad must be a JSON object")
      val body = json.decodeRequired<String>(rawObject, "body")
      return InlineReposPullsCommentsPatchRequestJsonX088a1aad(
        body = body,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPullsCommentsPatchRequestJsonX088a1aad) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPullsCommentsPatchRequestJsonX088a1aad")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("body", value.body)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPullsCommentsPatchRequestJsonX088a1aad(block: InlineReposPullsCommentsPatchRequestJsonX088a1aad.Builder.() -> Unit): InlineReposPullsCommentsPatchRequestJsonX088a1aad = InlineReposPullsCommentsPatchRequestJsonX088a1aad.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposPullsCommentsPatchRequestJsonX088a1aad is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposPullsCommentsPatchRequestJsonX088a1aad property '" + name + "' is not nullable")
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
