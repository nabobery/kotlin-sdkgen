package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Long
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
 * A value assigned to an issue field
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/issue-field-value
 */
@Serializable(with = IssueFieldValue.Serializer::class)
public class IssueFieldValue internal constructor(
  /**
   * The data type of the issue field
   */
  public val dataType: InlineIssueFieldValueDataTypeX687b3d7a,
  /**
   * Unique identifier for the issue field.
   */
  public val issueFieldId: Long,
  public val nodeId: String,
  /**
   * The value of the issue field
   */
  public val `value`: InlineIssueFieldValueValueX38411dec?,
  private val issueFieldNameState: FieldState<String>,
  multiSelectOptionsState: FieldState<List<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3>?>,
  private val singleSelectOptionState:
      FieldState<InlineIssueFieldValueSingleSelectOptionXe5d761a0?>,
) {
  private val multiSelectOptionsState:
      FieldState<List<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3>?> =
      multiSelectOptionsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  /**
   * The human-readable name of the issue field.
   */
  public val issueFieldName: String?
    get() = issueFieldNameState.valueOrNull()

  /**
   * Details about the selected options
   */
  public val multiSelectOptions: List<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3>?
    get() = multiSelectOptionsState.valueOrNull()

  /**
   * Details about the selected option (only present for single_select fields)
   */
  public val singleSelectOption: InlineIssueFieldValueSingleSelectOptionXe5d761a0?
    get() = singleSelectOptionState.valueOrNull()

  public constructor(
    dataType: InlineIssueFieldValueDataTypeX687b3d7a,
    issueFieldId: Long,
    nodeId: String,
    `value`: InlineIssueFieldValueValueX38411dec?,
  ) : this(dataType = dataType,
  issueFieldId = issueFieldId,
  nodeId = nodeId,
  value = value,
  issueFieldNameState = FieldState.Absent,
  multiSelectOptionsState = FieldState.Absent,
  singleSelectOptionState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `issue_field_name`.
   */
  public fun issueFieldNamePresence(): FieldPresence = issueFieldNameState.presence

  /**
   * Returns the wire presence of `multi_select_options`.
   */
  public fun multiSelectOptionsPresence(): FieldPresence = multiSelectOptionsState.presence

  /**
   * Returns the wire presence of `single_select_option`.
   */
  public fun singleSelectOptionPresence(): FieldPresence = singleSelectOptionState.presence

  public class Builder {
    private var dataTypeValue: InlineIssueFieldValueDataTypeX687b3d7a? = null

    public var dataType: InlineIssueFieldValueDataTypeX687b3d7a
      get() = requireNotNull(dataTypeValue) { "dataType is required" }
      set(`value`) {
        dataTypeValue = value
      }

    private var issueFieldIdValue: Long? = null

    public var issueFieldId: Long
      get() = requireNotNull(issueFieldIdValue) { "issueFieldId is required" }
      set(`value`) {
        issueFieldIdValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var valueState: FieldState<InlineIssueFieldValueValueX38411dec?> = FieldState.Absent

    /**
     * The value of the issue field
     * Required nullable field; assigning `null` records present-null.
     */
    public var `value`: InlineIssueFieldValueValueX38411dec?
      get() = valueState.valueOrNull()
      set(`value`) {
        valueState = value.toNullableFieldState()
      }

    private var issueFieldNameState: FieldState<String> = FieldState.Absent

    /**
     * The human-readable name of the issue field.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var issueFieldName: String?
      get() = issueFieldNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "issueFieldName is not nullable; call unsetIssueFieldName() to omit it" }
        issueFieldNameState = FieldState.Value(present)
      }

    private var multiSelectOptionsState:
        FieldState<List<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3>?> = FieldState.Absent

    /**
     * Details about the selected options
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var multiSelectOptions: List<InlineIssueFieldValueMultiSelectOptionsItemX5190a2a3>?
      get() = multiSelectOptionsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        multiSelectOptionsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var singleSelectOptionState:
        FieldState<InlineIssueFieldValueSingleSelectOptionXe5d761a0?> = FieldState.Absent

    /**
     * Details about the selected option (only present for single_select fields)
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var singleSelectOption: InlineIssueFieldValueSingleSelectOptionXe5d761a0?
      get() = singleSelectOptionState.valueOrNull()
      set(`value`) {
        singleSelectOptionState = value.toNullableFieldState()
      }

    /**
     * Omits `issue_field_name` from serialized output.
     */
    public fun unsetIssueFieldName() {
      issueFieldNameState = FieldState.Absent
    }

    /**
     * Omits `multi_select_options` from serialized output.
     */
    public fun unsetMultiSelectOptions() {
      multiSelectOptionsState = FieldState.Absent
    }

    /**
     * Omits `single_select_option` from serialized output.
     */
    public fun unsetSingleSelectOption() {
      singleSelectOptionState = FieldState.Absent
    }

    public fun build(): IssueFieldValue {
      check(dataTypeValue != null) { "dataType is required" }
      check(issueFieldIdValue != null) { "issueFieldId is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(valueState !== FieldState.Absent) { "value is required, even when null" }
      return IssueFieldValue(
        dataType = dataType,
        issueFieldId = issueFieldId,
        nodeId = nodeId,
        value = valueState.valueOrNull(),
        issueFieldNameState = issueFieldNameState,
        multiSelectOptionsState = multiSelectOptionsState,
        singleSelectOptionState = singleSelectOptionState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssueFieldValue = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssueFieldValue> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssueFieldValue {
      val jsonDecoder = decoder.requireJsonDecoder("IssueFieldValue")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssueFieldValue must be a JSON object")
      val dataType = json.decodeRequired<InlineIssueFieldValueDataTypeX687b3d7a>(rawObject, "data_type")
      val issueFieldId = json.decodeRequired<Long>(rawObject, "issue_field_id")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      if (!rawObject.containsKey("value")) {
        throw SerializationException("IssueFieldValue is missing required property 'value'")
      }
      val value = rawObject["value"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssueFieldValueValueX38411dec?>(requireNotNull(element)) }
      return IssueFieldValue(
        dataType = dataType,
        issueFieldId = issueFieldId,
        nodeId = nodeId,
        value = value,
        issueFieldNameState = json.decodeOptional(rawObject, "issue_field_name", nullable = false),
        multiSelectOptionsState = json.decodeOptional(rawObject, "multi_select_options", nullable = true),
        singleSelectOptionState = json.decodeOptional(rawObject, "single_select_option", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssueFieldValue) {
      val jsonEncoder = encoder.requireJsonEncoder("IssueFieldValue")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_type", json.encodeToJsonElement(value.dataType))
        put("issue_field_id", json.encodeToJsonElement(value.issueFieldId))
        put("node_id", value.nodeId)
        put("value", value.value?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("issue_field_name", value.issueFieldNameState, json::encodeToJsonElement)
        putState("multi_select_options", value.multiSelectOptionsState, json::encodeToJsonElement)
        putState("single_select_option", value.singleSelectOptionState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issueFieldValue(block: IssueFieldValue.Builder.() -> Unit): IssueFieldValue = IssueFieldValue.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IssueFieldValue is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("IssueFieldValue property '" + name + "' is not nullable")
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
