package io.github.nabobery.sdkgen.github.generated

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
 * A check performed on the code of a given code change
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run
 */
@Serializable(with = CheckRun.Serializer::class)
public class CheckRun internal constructor(
  public val app: NullableIntegration?,
  public val checkSuite: InlineCheckRunCheckSuiteX22423232?,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String?,
  public val conclusion: InlineCheckRunConclusionXb4bfcba3?,
  public val detailsUrl: String?,
  public val externalId: String?,
  /**
   * The SHA of the commit that is being checked.
   */
  public val headSha: String,
  public val htmlUrl: String?,
  /**
   * The id of the check.
   */
  public val id: Long,
  /**
   * The name of the check.
   */
  public val name: String,
  public val nodeId: String,
  public val output: InlineCheckRunOutputX552fa2b7,
  pullRequests: List<PullRequestMinimal>,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startedAt: String?,
  /**
   * The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved
   * for GitHub Actions check runs.
   */
  public val status: InlineCheckRunStatusX21c79aef,
  public val url: String,
  private val deploymentState: FieldState<DeploymentSimple>,
) {
  /**
   * Pull requests that are open with a `head_sha` or `head_branch` that matches the check. The returned pull requests
   * do not necessarily indicate pull requests that triggered the check.
   */
  public val pullRequests: List<PullRequestMinimal> = pullRequests.toList()

  public val deployment: DeploymentSimple?
    get() = deploymentState.valueOrNull()

  public constructor(
    app: NullableIntegration?,
    checkSuite: InlineCheckRunCheckSuiteX22423232?,
    completedAt: String?,
    conclusion: InlineCheckRunConclusionXb4bfcba3?,
    detailsUrl: String?,
    externalId: String?,
    headSha: String,
    htmlUrl: String?,
    id: Long,
    name: String,
    nodeId: String,
    output: InlineCheckRunOutputX552fa2b7,
    pullRequests: List<PullRequestMinimal>,
    startedAt: String?,
    status: InlineCheckRunStatusX21c79aef,
    url: String,
  ) : this(app = app,
  checkSuite = checkSuite,
  completedAt = completedAt,
  conclusion = conclusion,
  detailsUrl = detailsUrl,
  externalId = externalId,
  headSha = headSha,
  htmlUrl = htmlUrl,
  id = id,
  name = name,
  nodeId = nodeId,
  output = output,
  pullRequests = pullRequests,
  startedAt = startedAt,
  status = status,
  url = url,
  deploymentState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `deployment`.
   */
  public fun deploymentPresence(): FieldPresence = deploymentState.presence

  public class Builder {
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

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var outputValue: InlineCheckRunOutputX552fa2b7? = null

    public var output: InlineCheckRunOutputX552fa2b7
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var pullRequestsValue: List<PullRequestMinimal>? = null

    public var pullRequests: List<PullRequestMinimal>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }.toList()
      set(`value`) {
        pullRequestsValue = value.toList()
      }

    private var statusValue: InlineCheckRunStatusX21c79aef? = null

    public var status: InlineCheckRunStatusX21c79aef
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
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

    private var checkSuiteState: FieldState<InlineCheckRunCheckSuiteX22423232?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var checkSuite: InlineCheckRunCheckSuiteX22423232?
      get() = checkSuiteState.valueOrNull()
      set(`value`) {
        checkSuiteState = value.toNullableFieldState()
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState: FieldState<InlineCheckRunConclusionXb4bfcba3?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineCheckRunConclusionXb4bfcba3?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
      }

    private var detailsUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var detailsUrl: String?
      get() = detailsUrlState.valueOrNull()
      set(`value`) {
        detailsUrlState = value.toNullableFieldState()
      }

    private var externalIdState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var externalId: String?
      get() = externalIdState.valueOrNull()
      set(`value`) {
        externalIdState = value.toNullableFieldState()
      }

    private var htmlUrlState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var htmlUrl: String?
      get() = htmlUrlState.valueOrNull()
      set(`value`) {
        htmlUrlState = value.toNullableFieldState()
      }

    private var startedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var startedAt: String?
      get() = startedAtState.valueOrNull()
      set(`value`) {
        startedAtState = value.toNullableFieldState()
      }

    private var deploymentState: FieldState<DeploymentSimple> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deployment: DeploymentSimple?
      get() = deploymentState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deployment is not nullable; call unsetDeployment() to omit it" }
        deploymentState = FieldState.Value(present)
      }

    /**
     * Omits `deployment` from serialized output.
     */
    public fun unsetDeployment() {
      deploymentState = FieldState.Absent
    }

    public fun build(): CheckRun {
      check(headShaValue != null) { "headSha is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(outputValue != null) { "output is required" }
      check(pullRequestsValue != null) { "pullRequests is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      check(appState !== FieldState.Absent) { "app is required, even when null" }
      check(checkSuiteState !== FieldState.Absent) { "checkSuite is required, even when null" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      check(detailsUrlState !== FieldState.Absent) { "detailsUrl is required, even when null" }
      check(externalIdState !== FieldState.Absent) { "externalId is required, even when null" }
      check(htmlUrlState !== FieldState.Absent) { "htmlUrl is required, even when null" }
      check(startedAtState !== FieldState.Absent) { "startedAt is required, even when null" }
      return CheckRun(
        app = appState.valueOrNull(),
        checkSuite = checkSuiteState.valueOrNull(),
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
        detailsUrl = detailsUrlState.valueOrNull(),
        externalId = externalIdState.valueOrNull(),
        headSha = headSha,
        htmlUrl = htmlUrlState.valueOrNull(),
        id = id,
        name = name,
        nodeId = nodeId,
        output = output,
        pullRequests = pullRequests,
        startedAt = startedAtState.valueOrNull(),
        status = status,
        url = url,
        deploymentState = deploymentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckRun = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckRun> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckRun {
      val jsonDecoder = decoder.requireJsonDecoder("CheckRun")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckRun must be a JSON object")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val output = json.decodeRequired<InlineCheckRunOutputX552fa2b7>(rawObject, "output")
      val pullRequests = json.decodeRequired<List<PullRequestMinimal>>(rawObject, "pull_requests")
      val status = json.decodeRequired<InlineCheckRunStatusX21c79aef>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("app")) {
        throw SerializationException("CheckRun is missing required property 'app'")
      }
      val app = rawObject["app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableIntegration?>(requireNotNull(element)) }
      if (!rawObject.containsKey("check_suite")) {
        throw SerializationException("CheckRun is missing required property 'check_suite'")
      }
      val checkSuite = rawObject["check_suite"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckRunCheckSuiteX22423232?>(requireNotNull(element)) }
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("CheckRun is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("CheckRun is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckRunConclusionXb4bfcba3?>(requireNotNull(element)) }
      if (!rawObject.containsKey("details_url")) {
        throw SerializationException("CheckRun is missing required property 'details_url'")
      }
      val detailsUrl = rawObject["details_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("external_id")) {
        throw SerializationException("CheckRun is missing required property 'external_id'")
      }
      val externalId = rawObject["external_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("html_url")) {
        throw SerializationException("CheckRun is missing required property 'html_url'")
      }
      val htmlUrl = rawObject["html_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("started_at")) {
        throw SerializationException("CheckRun is missing required property 'started_at'")
      }
      val startedAt = rawObject["started_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CheckRun(
        app = app,
        checkSuite = checkSuite,
        completedAt = completedAt,
        conclusion = conclusion,
        detailsUrl = detailsUrl,
        externalId = externalId,
        headSha = headSha,
        htmlUrl = htmlUrl,
        id = id,
        name = name,
        nodeId = nodeId,
        output = output,
        pullRequests = pullRequests,
        startedAt = startedAt,
        status = status,
        url = url,
        deploymentState = json.decodeOptional(rawObject, "deployment", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckRun) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckRun")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app", value.app?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("check_suite", value.checkSuite?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("details_url", value.detailsUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("external_id", value.externalId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("output", json.encodeToJsonElement(value.output))
        put("pull_requests", json.encodeToJsonElement(value.pullRequests))
        put("started_at", value.startedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("status", json.encodeToJsonElement(value.status))
        put("url", value.url)
        putState("deployment", value.deploymentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkRun(block: CheckRun.Builder.() -> Unit): CheckRun = CheckRun.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckRun is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CheckRun property '" + name + "' is not nullable")
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
