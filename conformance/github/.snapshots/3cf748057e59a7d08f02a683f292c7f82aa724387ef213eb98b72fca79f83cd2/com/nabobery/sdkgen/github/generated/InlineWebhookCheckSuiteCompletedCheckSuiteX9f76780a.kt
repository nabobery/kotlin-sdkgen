package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-completed/properties/check_suite
 */
@Serializable(with = InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a.Serializer::class)
public class InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a internal constructor(
  public val after: String?,
  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val app: InlineWebhookCheckSuiteCompletedCheckSuiteAppX2aab6b84,
  public val before: String?,
  public val checkRunsUrl: String,
  /**
   * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the
   * check run has `completed`.
   */
  public val conclusion: InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c?,
  public val createdAt: String,
  /**
   * The head branch name the changes are on.
   */
  public val headBranch: String?,
  public val headCommit: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52,
  /**
   * The SHA of the head commit that is being checked.
   */
  public val headSha: String,
  public val id: Int,
  public val latestCheckRunsCount: Int,
  public val nodeId: String,
  pullRequests: List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>,
  /**
   * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or
   * `completed`.
   */
  public val status: InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384?,
  public val updatedAt: String,
  /**
   * URL that points to the check suite API resource.
   */
  public val url: String,
  private val rerequestableState: FieldState<Boolean>,
  private val runsRerequestableState: FieldState<Boolean>,
) {
  /**
   * An array of pull requests that match this check suite. A pull request matches a check suite if they have the same
   * `head_sha` and `head_branch`. When the check suite's `head_branch` is in a forked repository it will be `null` and
   * the `pull_requests` array will be empty.
   */
  public val pullRequests: List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>
      = pullRequests.toList()

  public val rerequestable: Boolean?
    get() = rerequestableState.valueOrNull()

  public val runsRerequestable: Boolean?
    get() = runsRerequestableState.valueOrNull()

  public constructor(
    after: String?,
    app: InlineWebhookCheckSuiteCompletedCheckSuiteAppX2aab6b84,
    before: String?,
    checkRunsUrl: String,
    conclusion: InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c?,
    createdAt: String,
    headBranch: String?,
    headCommit: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52,
    headSha: String,
    id: Int,
    latestCheckRunsCount: Int,
    nodeId: String,
    pullRequests: List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>,
    status: InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384?,
    updatedAt: String,
    url: String,
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
    private var appValue: InlineWebhookCheckSuiteCompletedCheckSuiteAppX2aab6b84? = null

    public var app: InlineWebhookCheckSuiteCompletedCheckSuiteAppX2aab6b84
      get() = requireNotNull(appValue) { "app is required" }
      set(`value`) {
        appValue = value
      }

    private var checkRunsUrlValue: String? = null

    public var checkRunsUrl: String
      get() = requireNotNull(checkRunsUrlValue) { "checkRunsUrl is required" }
      set(`value`) {
        checkRunsUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var headCommitValue: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52? =
        null

    public var headCommit: InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52
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

    private var idValue: Int? = null

    public var id: Int
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

    private var pullRequestsValue:
        List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>? = null

    public var pullRequests:
        List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }
      set(`value`) {
        pullRequestsValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
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

    private var beforeState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var before: String?
      get() = beforeState.valueOrNull()
      set(`value`) {
        beforeState = value.toNullableFieldState()
      }

    private var conclusionState:
        FieldState<InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c?> =
        FieldState.Absent

    /**
     * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the
     * check run has `completed`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var headBranchState: FieldState<String?> = FieldState.Absent

    /**
     * The head branch name the changes are on.
     * Required nullable field; assigning `null` records present-null.
     */
    public var headBranch: String?
      get() = headBranchState.valueOrNull()
      set(`value`) {
        headBranchState = value.toNullableFieldState()
      }

    private var statusState: FieldState<InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384?>
        = FieldState.Absent

    /**
     * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or
     * `completed`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384?
      get() = statusState.valueOrNull()
      set(`value`) {
        statusState = value.toNullableFieldState()
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

    public fun build(): InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a {
      check(appValue != null) { "app is required" }
      check(checkRunsUrlValue != null) { "checkRunsUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(headCommitValue != null) { "headCommit is required" }
      check(headShaValue != null) { "headSha is required" }
      check(idValue != null) { "id is required" }
      check(latestCheckRunsCountValue != null) { "latestCheckRunsCount is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(pullRequestsValue != null) { "pullRequests is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(afterState !== FieldState.Absent) { "after is required, even when null" }
      check(beforeState !== FieldState.Absent) { "before is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(headBranchState !== FieldState.Absent) { "headBranch is required, even when null" }
      check(statusState !== FieldState.Absent) { "status is required, even when null" }
      return InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a(
        after = afterState.valueOrNull(),
        app = app,
        before = beforeState.valueOrNull(),
        checkRunsUrl = checkRunsUrl,
        conclusion = conclusionState.valueOrNull(),
        createdAt = createdAt,
        headBranch = headBranchState.valueOrNull(),
        headCommit = headCommit,
        headSha = headSha,
        id = id,
        latestCheckRunsCount = latestCheckRunsCount,
        nodeId = nodeId,
        pullRequests = pullRequests,
        status = statusState.valueOrNull(),
        updatedAt = updatedAt,
        url = url,
        rerequestableState = rerequestableState,
        runsRerequestableState = runsRerequestableState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a must be a JSON object")
      val app = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuiteAppX2aab6b84>(rawObject, "app")
      val checkRunsUrl = json.decodeRequired<String>(rawObject, "check_runs_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val headCommit = json.decodeRequired<InlineWebhookCheckSuiteCompletedCheckSuiteHeadCommitX1115cf52>(rawObject, "head_commit")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val latestCheckRunsCount = json.decodeRequired<Int>(rawObject, "latest_check_runs_count")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val pullRequests = json.decodeRequired<List<InlineWebhookCheckSuiteCompletedCheckSuitePullRequestsItemX54eb770a>>(rawObject, "pull_requests")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("after")) {
        throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property 'after'")
      }
      val after = rawObject["after"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("before")) {
        throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property 'before'")
      }
      val before = rawObject["before"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteConclusionXa3b2bc3c?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCheckSuiteCompletedCheckSuiteStatusX54361384?>(requireNotNull(element)) }
      return InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a(
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
        status = status,
        updatedAt = updatedAt,
        url = url,
        rerequestableState = json.decodeOptional(rawObject, "rerequestable", nullable = false),
        runsRerequestableState = json.decodeOptional(rawObject, "runs_rerequestable", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("after", value.after?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("app", json.encodeToJsonElement(value.app))
        put("before", value.before?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("check_runs_url", value.checkRunsUrl)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("head_branch", value.headBranch?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_commit", json.encodeToJsonElement(value.headCommit))
        put("head_sha", value.headSha)
        put("id", json.encodeToJsonElement(value.id))
        put("latest_check_runs_count", json.encodeToJsonElement(value.latestCheckRunsCount))
        put("node_id", value.nodeId)
        put("pull_requests", json.encodeToJsonElement(value.pullRequests))
        put("status", value.status?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("rerequestable", value.rerequestableState, json::encodeToJsonElement)
        putState("runs_rerequestable", value.runsRerequestableState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a(block: InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a.Builder.() -> Unit): InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a = InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCheckSuiteCompletedCheckSuiteX9f76780a property '" + name + "' is not nullable")
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
