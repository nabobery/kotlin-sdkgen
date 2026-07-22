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
 * A check performed on the code of a given code change
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-run-with-simple-check-suite
 */
@Serializable(with = CheckRunWithSimpleCheckSuite.Serializer::class)
public class CheckRunWithSimpleCheckSuite internal constructor(
  public val app: Integration?,
  public val checkSuite: SimpleCheckSuite,
  public val completedAt: String?,
  public val conclusion: InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5?,
  public val detailsUrl: String,
  public val externalId: String,
  /**
   * The SHA of the commit that is being checked.
   */
  public val headSha: String,
  public val htmlUrl: String,
  /**
   * The id of the check.
   */
  public val id: Int,
  /**
   * The name of the check.
   */
  public val name: String,
  public val nodeId: String,
  public val output: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78,
  pullRequests: List<PullRequestMinimal>,
  public val startedAt: String,
  /**
   * The phase of the lifecycle that the check is currently in.
   */
  public val status: InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd,
  public val url: String,
  private val deploymentState: FieldState<DeploymentSimple>,
) {
  public val pullRequests: List<PullRequestMinimal> = pullRequests.toList()

  public val deployment: DeploymentSimple?
    get() = deploymentState.valueOrNull()

  public constructor(
    app: Integration?,
    checkSuite: SimpleCheckSuite,
    completedAt: String?,
    conclusion: InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5?,
    detailsUrl: String,
    externalId: String,
    headSha: String,
    htmlUrl: String,
    id: Int,
    name: String,
    nodeId: String,
    output: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78,
    pullRequests: List<PullRequestMinimal>,
    startedAt: String,
    status: InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd,
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
    private var checkSuiteValue: SimpleCheckSuite? = null

    public var checkSuite: SimpleCheckSuite
      get() = requireNotNull(checkSuiteValue) { "checkSuite is required" }
      set(`value`) {
        checkSuiteValue = value
      }

    private var detailsUrlValue: String? = null

    public var detailsUrl: String
      get() = requireNotNull(detailsUrlValue) { "detailsUrl is required" }
      set(`value`) {
        detailsUrlValue = value
      }

    private var externalIdValue: String? = null

    public var externalId: String
      get() = requireNotNull(externalIdValue) { "externalId is required" }
      set(`value`) {
        externalIdValue = value
      }

    private var headShaValue: String? = null

    public var headSha: String
      get() = requireNotNull(headShaValue) { "headSha is required" }
      set(`value`) {
        headShaValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
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

    private var outputValue: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78? = null

    public var output: InlineCheckRunWithSimpleCheckSuiteOutputX62517e78
      get() = requireNotNull(outputValue) { "output is required" }
      set(`value`) {
        outputValue = value
      }

    private var pullRequestsValue: List<PullRequestMinimal>? = null

    public var pullRequests: List<PullRequestMinimal>
      get() = requireNotNull(pullRequestsValue) { "pullRequests is required" }
      set(`value`) {
        pullRequestsValue = value
      }

    private var startedAtValue: String? = null

    public var startedAt: String
      get() = requireNotNull(startedAtValue) { "startedAt is required" }
      set(`value`) {
        startedAtValue = value
      }

    private var statusValue: InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd? = null

    public var status: InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd
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

    private var appState: FieldState<Integration?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var app: Integration?
      get() = appState.valueOrNull()
      set(`value`) {
        appState = value.toNullableFieldState()
      }

    private var completedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var completedAt: String?
      get() = completedAtState.valueOrNull()
      set(`value`) {
        completedAtState = value.toNullableFieldState()
      }

    private var conclusionState: FieldState<InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5?>
        = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var conclusion: InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5?
      get() = conclusionState.valueOrNull()
      set(`value`) {
        conclusionState = value.toNullableFieldState()
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

    public fun build(): CheckRunWithSimpleCheckSuite {
      check(checkSuiteValue != null) { "checkSuite is required" }
      check(detailsUrlValue != null) { "detailsUrl is required" }
      check(externalIdValue != null) { "externalId is required" }
      check(headShaValue != null) { "headSha is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(nameValue != null) { "name is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(outputValue != null) { "output is required" }
      check(pullRequestsValue != null) { "pullRequests is required" }
      check(startedAtValue != null) { "startedAt is required" }
      check(statusValue != null) { "status is required" }
      check(urlValue != null) { "url is required" }
      check(appState !== FieldState.Absent) { "app is required, even when null" }
      check(completedAtState !== FieldState.Absent) { "completedAt is required, even when null" }
      check(conclusionState !== FieldState.Absent) { "conclusion is required, even when null" }
      return CheckRunWithSimpleCheckSuite(
        app = appState.valueOrNull(),
        checkSuite = checkSuite,
        completedAt = completedAtState.valueOrNull(),
        conclusion = conclusionState.valueOrNull(),
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
        deploymentState = deploymentState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckRunWithSimpleCheckSuite = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CheckRunWithSimpleCheckSuite> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckRunWithSimpleCheckSuite {
      val jsonDecoder = decoder.requireJsonDecoder("CheckRunWithSimpleCheckSuite")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckRunWithSimpleCheckSuite must be a JSON object")
      val checkSuite = json.decodeRequired<SimpleCheckSuite>(rawObject, "check_suite")
      val detailsUrl = json.decodeRequired<String>(rawObject, "details_url")
      val externalId = json.decodeRequired<String>(rawObject, "external_id")
      val headSha = json.decodeRequired<String>(rawObject, "head_sha")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val name = json.decodeRequired<String>(rawObject, "name")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val output = json.decodeRequired<InlineCheckRunWithSimpleCheckSuiteOutputX62517e78>(rawObject, "output")
      val pullRequests = json.decodeRequired<List<PullRequestMinimal>>(rawObject, "pull_requests")
      val startedAt = json.decodeRequired<String>(rawObject, "started_at")
      val status = json.decodeRequired<InlineCheckRunWithSimpleCheckSuiteStatusX9e6cb8dd>(rawObject, "status")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("app")) {
        throw SerializationException("CheckRunWithSimpleCheckSuite is missing required property 'app'")
      }
      val app = rawObject["app"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Integration?>(requireNotNull(element)) }
      if (!rawObject.containsKey("completed_at")) {
        throw SerializationException("CheckRunWithSimpleCheckSuite is missing required property 'completed_at'")
      }
      val completedAt = rawObject["completed_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("conclusion")) {
        throw SerializationException("CheckRunWithSimpleCheckSuite is missing required property 'conclusion'")
      }
      val conclusion = rawObject["conclusion"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCheckRunWithSimpleCheckSuiteConclusionXa406f2e5?>(requireNotNull(element)) }
      return CheckRunWithSimpleCheckSuite(
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

    override fun serialize(encoder: Encoder, `value`: CheckRunWithSimpleCheckSuite) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckRunWithSimpleCheckSuite")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("app", value.app?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("check_suite", json.encodeToJsonElement(value.checkSuite))
        put("completed_at", value.completedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("conclusion", value.conclusion?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("details_url", value.detailsUrl)
        put("external_id", value.externalId)
        put("head_sha", value.headSha)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("name", value.name)
        put("node_id", value.nodeId)
        put("output", json.encodeToJsonElement(value.output))
        put("pull_requests", json.encodeToJsonElement(value.pullRequests))
        put("started_at", value.startedAt)
        put("status", json.encodeToJsonElement(value.status))
        put("url", value.url)
        putState("deployment", value.deploymentState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkRunWithSimpleCheckSuite(block: CheckRunWithSimpleCheckSuite.Builder.() -> Unit): CheckRunWithSimpleCheckSuite = CheckRunWithSimpleCheckSuite.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckRunWithSimpleCheckSuite is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("CheckRunWithSimpleCheckSuite property '" + name + "' is not nullable")
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
