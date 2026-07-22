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
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items/prope
 * rties/group_members/items.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/concurrency-group-run-list/properties/concurrency_groups/items/prope
 * rties/group_members/items
 */
@Serializable(with = InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909.Serializer::class)
public class InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 internal constructor(
  /**
   * Queue position. 0 means the item holds the concurrency lease (in_progress), 1 or higher means queued (pending).
   */
  public val position: Int,
  /**
   * API URL to get items ahead of this item in the concurrency group.
   */
  public val positionUrl: String,
  /**
   * Web URL for the workflow run.
   */
  public val runHtmlUrl: String?,
  /**
   * The ID of the workflow run.
   */
  public val runId: Int,
  /**
   * The name of the workflow run.
   */
  public val runName: String,
  /**
   * API URL for the workflow run.
   */
  public val runUrl: String?,
  public val status: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5,
  private val jobHtmlUrlState: FieldState<String?>,
  private val jobIdState: FieldState<Int?>,
  private val jobNameState: FieldState<String?>,
  private val jobUrlState: FieldState<String?>,
) {
  /**
   * Web URL for the job.
   */
  public val jobHtmlUrl: String?
    get() = jobHtmlUrlState.valueOrNull()

  /**
   * The ID of the job, when the item represents a job-level or reusable-workflow-level lease.
   */
  public val jobId: Int?
    get() = jobIdState.valueOrNull()

  /**
   * The display name of the job, when the item represents a job-level or reusable-workflow-level lease.
   */
  public val jobName: String?
    get() = jobNameState.valueOrNull()

  /**
   * API URL for the job.
   */
  public val jobUrl: String?
    get() = jobUrlState.valueOrNull()

  public constructor(
    position: Int,
    positionUrl: String,
    runHtmlUrl: String?,
    runId: Int,
    runName: String,
    runUrl: String?,
    status: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5,
  ) : this(position = position,
  positionUrl = positionUrl,
  runHtmlUrl = runHtmlUrl,
  runId = runId,
  runName = runName,
  runUrl = runUrl,
  status = status,
  jobHtmlUrlState = FieldState.Absent,
  jobIdState = FieldState.Absent,
  jobNameState = FieldState.Absent,
  jobUrlState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `job_html_url`.
   */
  public fun jobHtmlUrlPresence(): FieldPresence = jobHtmlUrlState.presence

  /**
   * Returns the wire presence of `job_id`.
   */
  public fun jobIdPresence(): FieldPresence = jobIdState.presence

  /**
   * Returns the wire presence of `job_name`.
   */
  public fun jobNamePresence(): FieldPresence = jobNameState.presence

  /**
   * Returns the wire presence of `job_url`.
   */
  public fun jobUrlPresence(): FieldPresence = jobUrlState.presence

  public class Builder {
    private var positionValue: Int? = null

    public var position: Int
      get() = requireNotNull(positionValue) { "position is required" }
      set(`value`) {
        positionValue = value
      }

    private var positionUrlValue: String? = null

    public var positionUrl: String
      get() = requireNotNull(positionUrlValue) { "positionUrl is required" }
      set(`value`) {
        positionUrlValue = value
      }

    private var runIdValue: Int? = null

    public var runId: Int
      get() = requireNotNull(runIdValue) { "runId is required" }
      set(`value`) {
        runIdValue = value
      }

    private var runNameValue: String? = null

    public var runName: String
      get() = requireNotNull(runNameValue) { "runName is required" }
      set(`value`) {
        runNameValue = value
      }

    private var statusValue:
        InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5? = null

    public var status: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var runHtmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Web URL for the workflow run.
     * Required nullable field; assigning `null` records present-null.
     */
    public var runHtmlUrl: String?
      get() = runHtmlUrlState.valueOrNull()
      set(`value`) {
        runHtmlUrlState = value.toNullableFieldState()
      }

    private var runUrlState: FieldState<String?> = FieldState.Absent

    /**
     * API URL for the workflow run.
     * Required nullable field; assigning `null` records present-null.
     */
    public var runUrl: String?
      get() = runUrlState.valueOrNull()
      set(`value`) {
        runUrlState = value.toNullableFieldState()
      }

    private var jobHtmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Web URL for the job.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var jobHtmlUrl: String?
      get() = jobHtmlUrlState.valueOrNull()
      set(`value`) {
        jobHtmlUrlState = value.toNullableFieldState()
      }

    private var jobIdState: FieldState<Int?> = FieldState.Absent

    /**
     * The ID of the job, when the item represents a job-level or reusable-workflow-level lease.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var jobId: Int?
      get() = jobIdState.valueOrNull()
      set(`value`) {
        jobIdState = value.toNullableFieldState()
      }

    private var jobNameState: FieldState<String?> = FieldState.Absent

    /**
     * The display name of the job, when the item represents a job-level or reusable-workflow-level lease.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var jobName: String?
      get() = jobNameState.valueOrNull()
      set(`value`) {
        jobNameState = value.toNullableFieldState()
      }

    private var jobUrlState: FieldState<String?> = FieldState.Absent

    /**
     * API URL for the job.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var jobUrl: String?
      get() = jobUrlState.valueOrNull()
      set(`value`) {
        jobUrlState = value.toNullableFieldState()
      }

    /**
     * Omits `job_html_url` from serialized output.
     */
    public fun unsetJobHtmlUrl() {
      jobHtmlUrlState = FieldState.Absent
    }

    /**
     * Omits `job_id` from serialized output.
     */
    public fun unsetJobId() {
      jobIdState = FieldState.Absent
    }

    /**
     * Omits `job_name` from serialized output.
     */
    public fun unsetJobName() {
      jobNameState = FieldState.Absent
    }

    /**
     * Omits `job_url` from serialized output.
     */
    public fun unsetJobUrl() {
      jobUrlState = FieldState.Absent
    }

    public fun build(): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 {
      check(positionValue != null) { "position is required" }
      check(positionUrlValue != null) { "positionUrl is required" }
      check(runIdValue != null) { "runId is required" }
      check(runNameValue != null) { "runName is required" }
      check(statusValue != null) { "status is required" }
      check(runHtmlUrlState !== FieldState.Absent) { "runHtmlUrl is required, even when null" }
      check(runUrlState !== FieldState.Absent) { "runUrl is required, even when null" }
      return InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909(
        position = position,
        positionUrl = positionUrl,
        runHtmlUrl = runHtmlUrlState.valueOrNull(),
        runId = runId,
        runName = runName,
        runUrl = runUrlState.valueOrNull(),
        status = status,
        jobHtmlUrlState = jobHtmlUrlState,
        jobIdState = jobIdState,
        jobNameState = jobNameState,
        jobUrlState = jobUrlState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 must be a JSON object")
      val position = json.decodeRequired<Int>(rawObject, "position")
      val positionUrl = json.decodeRequired<String>(rawObject, "position_url")
      val runId = json.decodeRequired<Int>(rawObject, "run_id")
      val runName = json.decodeRequired<String>(rawObject, "run_name")
      val status = json.decodeRequired<InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersStatusX89aa68d5>(rawObject, "status")
      if (!rawObject.containsKey("run_html_url")) {
        throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 is missing required property 'run_html_url'")
      }
      val runHtmlUrl = rawObject["run_html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("run_url")) {
        throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 is missing required property 'run_url'")
      }
      val runUrl = rawObject["run_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909(
        position = position,
        positionUrl = positionUrl,
        runHtmlUrl = runHtmlUrl,
        runId = runId,
        runName = runName,
        runUrl = runUrl,
        status = status,
        jobHtmlUrlState = json.decodeOptional(rawObject, "job_html_url", nullable = true),
        jobIdState = json.decodeOptional(rawObject, "job_id", nullable = true),
        jobNameState = json.decodeOptional(rawObject, "job_name", nullable = true),
        jobUrlState = json.decodeOptional(rawObject, "job_url", nullable = true),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("position", json.encodeToJsonElement(value.position))
        put("position_url", value.positionUrl)
        put("run_html_url", value.runHtmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("run_id", json.encodeToJsonElement(value.runId))
        put("run_name", value.runName)
        put("run_url", value.runUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
        putState("job_html_url", value.jobHtmlUrlState, json::encodeToJsonElement)
        putState("job_id", value.jobIdState, json::encodeToJsonElement)
        putState("job_name", value.jobNameState, json::encodeToJsonElement)
        putState("job_url", value.jobUrlState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909(block: InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909.Builder.() -> Unit): InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 = InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineConcurrencyGroupRunListConcurrencyGroupsItemGroupMembersItemX7ef87909 property '" + name + "' is not nullable")
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
