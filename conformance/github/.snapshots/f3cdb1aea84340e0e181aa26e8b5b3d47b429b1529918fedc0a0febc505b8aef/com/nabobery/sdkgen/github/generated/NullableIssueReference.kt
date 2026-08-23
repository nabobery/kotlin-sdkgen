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
 * A minimal reference to an issue linked from a timeline event (e.g. sub-issue, parent-issue, or dependency events).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-issue-reference
 */
@Serializable(with = NullableIssueReference.Serializer::class)
public class NullableIssueReference internal constructor(
  /**
   * The type of the referenced issue.
   */
  public val issueType: InlineNullableIssueReferenceIssueTypeX36162583?,
  /**
   * The number of the referenced issue.
   */
  public val number: Int,
  public val repository: SimpleRepository,
  /**
   * The state of the referenced issue.
   */
  public val state: String,
  /**
   * The title of the referenced issue.
   */
  public val title: String,
  private val stateReasonState: FieldState<String?>,
) {
  /**
   * The reason for the referenced issue's state.
   */
  public val stateReason: String?
    get() = stateReasonState.valueOrNull()

  public constructor(
    issueType: InlineNullableIssueReferenceIssueTypeX36162583?,
    number: Int,
    repository: SimpleRepository,
    state: String,
    title: String,
  ) : this(issueType = issueType,
  number = number,
  repository = repository,
  state = state,
  title = title,
  stateReasonState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `state_reason`.
   */
  public fun stateReasonPresence(): FieldPresence = stateReasonState.presence

  public class Builder {
    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var repositoryValue: SimpleRepository? = null

    public var repository: SimpleRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var issueTypeState: FieldState<InlineNullableIssueReferenceIssueTypeX36162583?> =
        FieldState.Absent

    /**
     * The type of the referenced issue.
     * Required nullable field; assigning `null` records present-null.
     */
    public var issueType: InlineNullableIssueReferenceIssueTypeX36162583?
      get() = issueTypeState.valueOrNull()
      set(`value`) {
        issueTypeState = value.toNullableFieldState()
      }

    private var stateReasonState: FieldState<String?> = FieldState.Absent

    /**
     * The reason for the referenced issue's state.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var stateReason: String?
      get() = stateReasonState.valueOrNull()
      set(`value`) {
        stateReasonState = value.toNullableFieldState()
      }

    /**
     * Omits `state_reason` from serialized output.
     */
    public fun unsetStateReason() {
      stateReasonState = FieldState.Absent
    }

    public fun build(): NullableIssueReference {
      check(numberValue != null) { "number is required" }
      check(repositoryValue != null) { "repository is required" }
      check(stateValue != null) { "state is required" }
      check(titleValue != null) { "title is required" }
      check(issueTypeState !== FieldState.Absent) { "issueType is required, even when null" }
      return NullableIssueReference(
        issueType = issueTypeState.valueOrNull(),
        number = number,
        repository = repository,
        state = state,
        title = title,
        stateReasonState = stateReasonState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): NullableIssueReference = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<NullableIssueReference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): NullableIssueReference {
      val jsonDecoder = decoder.requireJsonDecoder("NullableIssueReference")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("NullableIssueReference must be a JSON object")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val repository = json.decodeRequired<SimpleRepository>(rawObject, "repository")
      val state = json.decodeRequired<String>(rawObject, "state")
      val title = json.decodeRequired<String>(rawObject, "title")
      if (!rawObject.containsKey("issue_type")) {
        throw SerializationException("NullableIssueReference is missing required property 'issue_type'")
      }
      val issueType = rawObject["issue_type"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineNullableIssueReferenceIssueTypeX36162583?>(requireNotNull(element)) }
      return NullableIssueReference(
        issueType = issueType,
        number = number,
        repository = repository,
        state = state,
        title = title,
        stateReasonState = json.decodeOptional(rawObject, "state_reason", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: NullableIssueReference) {
      val jsonEncoder = encoder.requireJsonEncoder("NullableIssueReference")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("issue_type", value.issueType?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("number", json.encodeToJsonElement(value.number))
        put("repository", json.encodeToJsonElement(value.repository))
        put("state", value.state)
        put("title", value.title)
        putState("state_reason", value.stateReasonState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun nullableIssueReference(block: NullableIssueReference.Builder.() -> Unit): NullableIssueReference = NullableIssueReference.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("NullableIssueReference is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("NullableIssueReference property '" + name + "' is not nullable")
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
