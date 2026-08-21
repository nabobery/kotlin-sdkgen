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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issues~1priority/patch/requ
 * estBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1issues~1{issue_number}~1sub_issues~1priority/patch/requ
 * estBody/content/application~1json/schema
 */
@Serializable(with = InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e.Serializer::class)
public class InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e internal constructor(
  /**
   * The id of the sub-issue to reprioritize
   */
  public val subIssueId: Int,
  private val afterIdState: FieldState<Int>,
  private val beforeIdState: FieldState<Int>,
) {
  /**
   * The id of the sub-issue to be prioritized after (either positional argument after OR before should be specified).
   */
  public val afterId: Int?
    get() = afterIdState.valueOrNull()

  /**
   * The id of the sub-issue to be prioritized before (either positional argument after OR before should be specified).
   */
  public val beforeId: Int?
    get() = beforeIdState.valueOrNull()

  public constructor(subIssueId: Int) : this(subIssueId = subIssueId,
  afterIdState = FieldState.Absent,
  beforeIdState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `after_id`.
   */
  public fun afterIdPresence(): FieldPresence = afterIdState.presence

  /**
   * Returns the wire presence of `before_id`.
   */
  public fun beforeIdPresence(): FieldPresence = beforeIdState.presence

  public class Builder {
    private var subIssueIdValue: Int? = null

    public var subIssueId: Int
      get() = requireNotNull(subIssueIdValue) { "subIssueId is required" }
      set(`value`) {
        subIssueIdValue = value
      }

    private var afterIdState: FieldState<Int> = FieldState.Absent

    /**
     * The id of the sub-issue to be prioritized after (either positional argument after OR before should be specified).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var afterId: Int?
      get() = afterIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "afterId is not nullable; call unsetAfterId() to omit it" }
        afterIdState = FieldState.Value(present)
      }

    private var beforeIdState: FieldState<Int> = FieldState.Absent

    /**
     * The id of the sub-issue to be prioritized before (either positional argument after OR before should be
     * specified).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var beforeId: Int?
      get() = beforeIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "beforeId is not nullable; call unsetBeforeId() to omit it" }
        beforeIdState = FieldState.Value(present)
      }

    /**
     * Omits `after_id` from serialized output.
     */
    public fun unsetAfterId() {
      afterIdState = FieldState.Absent
    }

    /**
     * Omits `before_id` from serialized output.
     */
    public fun unsetBeforeId() {
      beforeIdState = FieldState.Absent
    }

    public fun build(): InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e {
      check(subIssueIdValue != null) { "subIssueId is required" }
      return InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e(
        subIssueId = subIssueId,
        afterIdState = afterIdState,
        beforeIdState = beforeIdState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e must be a JSON object")
      val subIssueId = json.decodeRequired<Int>(rawObject, "sub_issue_id")
      return InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e(
        subIssueId = subIssueId,
        afterIdState = json.decodeOptional(rawObject, "after_id", nullable = false),
        beforeIdState = json.decodeOptional(rawObject, "before_id", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sub_issue_id", json.encodeToJsonElement(value.subIssueId))
        putState("after_id", value.afterIdState, json::encodeToJsonElement)
        putState("before_id", value.beforeIdState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e(block: InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e.Builder.() -> Unit): InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e = InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineReposIssuesSubIssuesPriorityPatchRequestJsonXa8b9de8e property '" + name + "' is not nullable")
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
