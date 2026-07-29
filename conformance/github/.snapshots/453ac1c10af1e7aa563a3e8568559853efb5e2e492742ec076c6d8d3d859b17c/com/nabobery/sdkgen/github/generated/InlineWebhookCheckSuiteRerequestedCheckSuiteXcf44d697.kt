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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-check-suite-rerequested/properties/check_suite
 */
@Serializable(with = InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697.Serializer::class)
public class InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 internal constructor(
  public val after: String?,
  /**
   * GitHub apps are a new way to extend GitHub. They can be installed directly on organizations and user accounts and
   * granted access to specific repositories. They come with granular permissions and built-in webhooks. GitHub apps are
   * first class actors within GitHub.
   */
  public val app: InlineWebhookCheckSuiteRerequestedCheckSuiteAppX45eafe5d,
  public val before: String?,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val checkRunsUrl: String,
  /**
   * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the
   * check run has completed.
   */
  public val conclusion: InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The head branch name the changes are on.
   */
  public val headBranch: String?,
  public val headCommit: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad,
  /**
   * The SHA of the head commit that is being checked.
   */
  public val headSha: String,
  public val id: Int,
  public val latestCheckRunsCount: Int,
  public val nodeId: String,
  pullRequests: List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525>,
  /**
   * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or
   * `completed`.
   */
  public val status: InlineWebhookCheckSuiteRerequestedCheckSuiteStatusXe9db6d86?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * URL that points to the check suite API resource.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
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
  public val pullRequests:
      List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525> =
      pullRequests.toList()

  public val rerequestable: Boolean?
    get() = rerequestableState.valueOrNull()

  public val runsRerequestable: Boolean?
    get() = runsRerequestableState.valueOrNull()

  public constructor(
    after: String?,
    app: InlineWebhookCheckSuiteRerequestedCheckSuiteAppX45eafe5d,
    before: String?,
    checkRunsUrl: String,
    conclusion: InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5?,
    createdAt: String,
    headBranch: String?,
    headCommit: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad,
    headSha: String,
    id: Int,
    latestCheckRunsCount: Int,
    nodeId: String,
    pullRequests: List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525>,
    status: InlineWebhookCheckSuiteRerequestedCheckSuiteStatusXe9db6d86?,
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
    private var appValue: InlineWebhookCheckSuiteRerequestedCheckSuiteAppX45eafe5d? = null

    public var app: InlineWebhookCheckSuiteRerequestedCheckSuiteAppX45eafe5d
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

    private var headCommitValue: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad? =
        null

    public var headCommit: InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad
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
        List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525>? = null

    public var pullRequests:
        List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }.toList()
      set(`value`) {
        pullRequestsValue = value.toList()
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
        FieldState<InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5?> =
        FieldState.Absent

    /**
     * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the
     * check run has completed.
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5?
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

    private var statusState:
        FieldState<InlineWebhookCheckSuiteRerequestedCheckSuiteStatusXe9db6d86?> = FieldState.Absent

    /**
     * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or
     * `completed`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var status: InlineWebhookCheckSuiteRerequestedCheckSuiteStatusXe9db6d86?
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

    public fun build(): InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 {
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
      return InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697(
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
    public fun build(block: Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 must be a JSON object")
      val app = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuiteAppX45eafe5d>(rawObject, "app")
      val checkRunsUrl = json.decodeRequired<String>(rawObject, "check_runs_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val headCommit = json.decodeRequired<InlineWebhookCheckSuiteRerequestedCheckSuiteHeadCommitXeed5cdad>(rawObject, "head_commit")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val latestCheckRunsCount = json.decodeRequired<Int>(rawObject, "latest_check_runs_count")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val pullRequests = json.decodeRequired<List<InlineWebhookCheckSuiteRerequestedCheckSuitePullRequestsItemXc0fa2525>>(rawObject, "pull_requests")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("after")) {
        throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property 'after'")
      }
      val after = rawObject["after"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("before")) {
        throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property 'before'")
      }
      val before = rawObject["before"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteConclusionXbc2b5ff5?>(requireNotNull(element)) }
      if (!rawObject.containsKey("head_branch")) {
        throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property 'head_branch'")
      }
      val headBranch = rawObject["head_branch"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("status")) {
        throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property 'status'")
      }
      val status = rawObject["status"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineWebhookCheckSuiteRerequestedCheckSuiteStatusXe9db6d86?>(requireNotNull(element)) }
      return InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697(
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

    override fun serialize(encoder: Encoder, `value`: InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697")
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

public fun inlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697(block: InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697.Builder.() -> Unit): InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 = InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("InlineWebhookCheckSuiteRerequestedCheckSuiteXcf44d697 property '" + name + "' is not nullable")
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
