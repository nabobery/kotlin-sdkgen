package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * A suite of checks performed on the code of a given code change
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-suite
 */
@Serializable(with = CheckSuite.Serializer::class)
public class CheckSuite internal constructor(
  public val after: String?,
  public val app: NullableIntegration?,
  public val before: String?,
  public val checkRunsUrl: String,
  public val conclusion: InlineCheckSuiteConclusionX6b51f45d?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String?,
  public val headBranch: String?,
  public val headCommit: SimpleCommit,
  /**
   * The SHA of the head commit that is being checked.
   */
  public val headSha: String,
  public val id: Long,
  public val latestCheckRunsCount: Int,
  public val nodeId: String,
  pullRequests: List<PullRequestMinimal>?,
  public val repository: MinimalRepository,
  /**
   * The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are
   * reserved for GitHub Actions check suites.
   */
  public val status: InlineCheckSuiteStatusX0c93b457?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String?,
  public val url: String?,
  private val rerequestableState: FieldState<Boolean>,
  private val runsRerequestableState: FieldState<Boolean>,
) {
  public val pullRequests: List<PullRequestMinimal>? =
      pullRequests?.let { collection0 -> collection0.toList() }

  public val rerequestable: Boolean?
    get() = rerequestableState.valueOrNull()

  public val runsRerequestable: Boolean?
    get() = runsRerequestableState.valueOrNull()

  public constructor(
    after: String?,
    app: NullableIntegration?,
    before: String?,
    checkRunsUrl: String,
    conclusion: InlineCheckSuiteConclusionX6b51f45d?,
    createdAt: String?,
    headBranch: String?,
    headCommit: SimpleCommit,
    headSha: String,
    id: Long,
    latestCheckRunsCount: Int,
    nodeId: String,
    pullRequests: List<PullRequestMinimal>?,
    repository: MinimalRepository,
    status: InlineCheckSuiteStatusX0c93b457?,
    updatedAt: String?,
    url: String?,
  ) : this(after = after,
  app = app,
  before = before,
  checkRunsUrl = checkRunsUrl,
  conclusion = conclusion,
  createdAt = createdAt,
  headBranch = headBranch,
  headCommit = headCommit,
  headSha = headSha,
  id = id,
  latestCheckRunsCount = latestCheckRunsCount,
  nodeId = nodeId,
  pullRequests = pullRequests,
  repository = repository,
  status = status,
  updatedAt = updatedAt,
  url = url,
  rerequestableState = FieldState.Absent,
  runsRerequestableState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `rerequestable`.
   */
  public fun rerequestablePresence(): FieldPresence = rerequestableState.presence

  /**
   * Returns the wire presence of `runs_rerequestable`.
   */
  public fun runsRerequestablePresence(): FieldPresence = runsRerequestableState.presence

  public class Builder {
    private var checkRunsUrlValue: String? = null

    public var checkRunsUrl: String
      get() = requireNotNull(checkRunsUrlValue) { "checkRunsUrl is required" }
      set(`value`) {
        checkRunsUrlValue = value
      }

    private var headCommitValue: SimpleCommit? = null

    public var headCommit: SimpleCommit
      get() = requireNotNull(headCommitValue) { "headCommit is required" }
      set(`value`) {
        headCommitValue = value
      }

    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var latestCheckRunsCountValue: Int? = null

    public var latestCheckRunsCount: Int
      get() = requireNotNull(latestCheckRunsCountValue) { "latestCheckRunsCount is required" }
      set(`value`) {
        latestCheckRunsCountValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var afterState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var after: String?
      get() = afterState.valueOrNull()
      set(`value`) {
        afterState = value.toNullableFieldState()
      }

    private var appState: FieldState<NullableIntegration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var app: NullableIntegration?
      get() = appState.valueOrNull()
      set(`value`) {
        appState = value.toNullableFieldState()
      }

    private var beforeState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var before: String?
      get() = beforeState.valueOrNull()
      set(`value`) {
        beforeState = value.toNullableFieldState()
      }

    private var conclusionState: FieldState<InlineCheckSuiteConclusionX6b51f45d?> =
        FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineCheckSuiteConclusionX6b51f45d?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var createdAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var createdAt: String?
      get() = createdAtState.valueOrNull()
      set(`value`) {
        createdAtState = value.toNullableFieldState()
      }

    private var headBranchState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var headBranch: String?
      get() = headBranchState.valueOrNull()
      set(`value`) {
        headBranchState = value.toNullableFieldState()
      }

    private var pullRequestsState: FieldState<List<PullRequestMinimal>?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullRequests: List<PullRequestMinimal>?
      get() = pullRequestsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pullRequestsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var statusState: FieldState<InlineCheckSuiteStatusX0c93b457?> = FieldState.Absent

    /**
     * The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are
     * reserved for GitHub Actions check suites.
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: InlineCheckSuiteStatusX0c93b457?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
      }

    private var updatedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var updatedAt: String?
      get() = updatedAtState.valueOrNull()
      set(`value`) {
        updatedAtState = value.toNullableFieldState()
      }

    private var urlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        urlState = value.toNullableFieldState()
      }

    private var rerequestableState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var rerequestable: Boolean?
      get() = rerequestableState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "rerequestable is not nullable; call unsetRerequestable() to omit it" }
        rerequestableState = FieldState.Value(present)
      }

    private var runsRerequestableState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runsRerequestable: Boolean?
      get() = runsRerequestableState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runsRerequestable is not nullable; call unsetRunsRerequestable() to omit it" }
        runsRerequestableState = FieldState.Value(present)
      }

    /**
     * Omits `rerequestable` from serialized output.
     */
    public fun unsetRerequestable() {
      rerequestableState = FieldState.Absent
    }

    /**
     * Omits `runs_rerequestable` from serialized output.
     */
    public fun unsetRunsRerequestable() {
      runsRerequestableState = FieldState.Absent
    }

    public fun build(): CheckSuite {
      check(checkRunsUrlValue != null) { "checkRunsUrl is required" }
      check(headCommitValue != null) { "headCommit is required" }
      check(headShaValue != null) { "headSha is required" }
      check(idValue != null) { "id is required" }
      check(latestCheckRunsCountValue != null) { "latestCheckRunsCount is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(repositoryValue != null) { "repository is required" }
      check(afterState !== FieldState.Absent) { "after is required, even when null" }
      check(appState !== FieldState.Absent) { "app is required, even when null" }
      check(beforeState !== FieldState.Absent) { "before is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(createdAtState !== FieldState.Absent) { "createdAt is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(pullRequestsState !== FieldState.Absent) { "pullRequests is required, even when null" }
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      check(updatedAtState !== FieldState.Absent) { "updatedAt is required, even when null" }
      check(urlState !== FieldState.Absent) { "url is required, even when null" }
      return CheckSuite(
        after = afterState.valueOrNull(),
        app = appState.valueOrNull(),
        before = beforeState.valueOrNull(),
        checkRunsUrl = checkRunsUrl,
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAtState.valueOrNull(),
        headBranch = headBranchState.valueOrNull(),
        headCommit = headCommit,
        headSha = headSha,
        id = id,
        latestCheckRunsCount = latestCheckRunsCount,
        nodeId = nodeId,
        pullRequests = pullRequestsState.valueOrNull(),
        repository = repository,
        status = statusState.valueOrNull(),
        updatedAt = updatedAtState.valueOrNull(),
        url = urlState.valueOrNull(),
        rerequestableState = rerequestableState,
        runsRerequestableState = runsRerequestableState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckSuite = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckSuite> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckSuite {
      val jsonDecoder = decoder.requireJsonDecoder("CheckSuite")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckSuite must be a JSON object")
      val checkRunsUrl = json.decodeRequired<String>(rawObject, "check_runs_url")
      val headCommit = json.decodeRequired<SimpleCommit>(rawObject, "head_commit")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val latestCheckRunsCount = json.decodeRequired<Int>(rawObject, "latest_check_runs_count")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      if (!rawObject.containsKey("after")) {
        throw SerializationException("CheckSuite is missing required property 'after'")
      }
      val after = rawObject["after"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("app")) {
        throw SerializationException("CheckSuite is missing required property 'app'")
      }
      val app = rawObject["app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(requireNotNull(element)) }
      if (!rawObject.containsKey("before")) {
        throw SerializationException("CheckSuite is missing required property 'before'")
      }
      val before = rawObject["before"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("CheckSuite is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckSuiteConclusionX6b51f45d?>(requireNotNull(element)) }
      if (!rawObject.containsKey("created_at")) {
        throw SerializationException("CheckSuite is missing required property 'created_at'")
      }
      val createdAt = rawObject["created_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("CheckSuite is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pull_requests")) {
        throw SerializationException("CheckSuite is missing required property 'pull_requests'")
      }
      val pullRequests = rawObject["pull_requests"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PullRequestMinimal>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("CheckSuite is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckSuiteStatusX0c93b457?>(requireNotNull(element)) }
      if (!rawObject.containsKey("updated_at")) {
        throw SerializationException("CheckSuite is missing required property 'updated_at'")
      }
      val updatedAt = rawObject["updated_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("url")) {
        throw SerializationException("CheckSuite is missing required property 'url'")
      }
      val url = rawObject["url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CheckSuite(
        after = after,
        app = app,
        before = before,
        checkRunsUrl = checkRunsUrl,
        conclusion = conclusion,
        createdAt = createdAt,
        headBranch = headBranch,
        headCommit = headCommit,
        headSha = headSha,
        id = id,
        latestCheckRunsCount = latestCheckRunsCount,
        nodeId = nodeId,
        pullRequests = pullRequests,
        repository = repository,
        status = status,
        updatedAt = updatedAt,
        url = url,
        rerequestableState = json.decodeOptional(rawObject, "rerequestable", nullable = false),
        runsRerequestableState = json.decodeOptional(rawObject, "runs_rerequestable", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckSuite) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckSuite")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after", value.after?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("app", value.app?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("before", value.before?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("check_runs_url", value.checkRunsUrl)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_commit", json.encodeToJsonElement(value.headCommit))
        put("head_sha", value.headSha)
        put("id", json.encodeToJsonElement(value.id))
        put("latest_check_runs_count", json.encodeToJsonElement(value.latestCheckRunsCount))
        put("node_id", value.nodeId)
        put("pull_requests", value.pullRequests?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository", json.encodeToJsonElement(value.repository))
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("url", value.url?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        putState("rerequestable", value.rerequestableState, json::encodeToJsonElement)
        putState("runs_rerequestable", value.runsRerequestableState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkSuite(block: CheckSuite.Builder.() -> Unit): CheckSuite = CheckSuite.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckSuite is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CheckSuite property '" + name + "' is not nullable")
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
