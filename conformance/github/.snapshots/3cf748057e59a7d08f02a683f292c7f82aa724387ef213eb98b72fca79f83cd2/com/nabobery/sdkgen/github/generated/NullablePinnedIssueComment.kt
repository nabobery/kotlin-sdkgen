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
 * Context around who pinned an issue comment and when it was pinned.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-pinned-issue-comment
 */
@Serializable(with = NullablePinnedIssueComment.Serializer::class)
public class NullablePinnedIssueComment(
  public val pinnedAt: String,
  public val pinnedBy: NullableSimpleUser?,
) {
  public class Builder {
    private var pinnedAtValue: String? = null

    public var pinnedAt: String
      get() = requireNotNull(pinnedAtValue) { "pinnedAt is required" }
      set(`value`) {
        pinnedAtValue = value
      }

    private var pinnedByState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pinnedBy: NullableSimpleUser?
      get() = pinnedByState.valueOrNull()
      set(`value`) {
        pinnedByState = value.toNullableFieldState()
      }

    public fun build(): NullablePinnedIssueComment {
      check(pinnedAtValue != null) { "pinnedAt is required" }
      check(pinnedByState !== FieldState.Absent) { "pinnedBy is required, even when null" }
      return NullablePinnedIssueComment(
        pinnedAt = pinnedAt,
        pinnedBy = pinnedByState.valueOrNull(),
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullablePinnedIssueComment = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<NullablePinnedIssueComment> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullablePinnedIssueComment {
      val jsonDecoder = decoder.requireJsonDecoder("NullablePinnedIssueComment")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullablePinnedIssueComment must be a JSON object")
      val pinnedAt = json.decodeRequired<String>(rawObject, "pinned_at")
      if (!rawObject.containsKey("pinned_by")) {
        throw SerializationException("NullablePinnedIssueComment is missing required property 'pinned_by'")
      }
      val pinnedBy = rawObject["pinned_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return NullablePinnedIssueComment(
        pinnedAt = pinnedAt,
        pinnedBy = pinnedBy,
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullablePinnedIssueComment) {
      val jsonEncoder = encoder.requireJsonEncoder("NullablePinnedIssueComment")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("pinned_at", value.pinnedAt)
        put("pinned_by", value.pinnedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullablePinnedIssueComment(block: NullablePinnedIssueComment.Builder.() -> Unit): NullablePinnedIssueComment = NullablePinnedIssueComment.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullablePinnedIssueComment is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("NullablePinnedIssueComment property '" + name + "' is not nullable")
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
