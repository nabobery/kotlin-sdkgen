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
 * Details about why an issue comment was minimized.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-issue-comment-minimized
 */
@Serializable(with = NullableIssueCommentMinimized.Serializer::class)
public class NullableIssueCommentMinimized(
  /**
   * The reason the comment was minimized.
   */
  public val reason: String?,
) {
  public class Builder {
    private var reasonState: FieldState<String?> = FieldState.Absent

    /**
     * The reason the comment was minimized.
     * Required nullable field; assigning `null` records present-null.
     */
    public var reason: String?
      get() = reasonState.valueOrNull()
      set(`value`) {
        reasonState = value.toNullableFieldState()
      }

    public fun build(): NullableIssueCommentMinimized {
      check(reasonState !== FieldState.Absent) { "reason is required, even when null" }
      return NullableIssueCommentMinimized(
        reason = reasonState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableIssueCommentMinimized = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NullableIssueCommentMinimized> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableIssueCommentMinimized {
      val jsonDecoder = decoder.requireJsonDecoder("NullableIssueCommentMinimized")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableIssueCommentMinimized must be a JSON object")
      if (!rawObject.containsKey("reason")) {
        throw SerializationException("NullableIssueCommentMinimized is missing required property 'reason'")
      }
      val reason = rawObject["reason"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return NullableIssueCommentMinimized(
        reason = reason,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableIssueCommentMinimized) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableIssueCommentMinimized")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("reason", value.reason?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableIssueCommentMinimized(block: NullableIssueCommentMinimized.Builder.() -> Unit): NullableIssueCommentMinimized = NullableIssueCommentMinimized.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("NullableIssueCommentMinimized property '" + name + "' is not nullable")
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
