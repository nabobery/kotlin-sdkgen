package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A suite of checks performed on the code of a given code change
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-check-suite
 */
@Serializable(with = SimpleCheckSuite.Serializer::class)
public class SimpleCheckSuite(
  public val after: String? = null,
  public val app: Integration? = null,
  public val before: String? = null,
  public val conclusion: InlineSimpleCheckSuiteConclusionX83f76907? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val headBranch: String? = null,
  /**
   * The SHA of the head commit that is being checked.
   */
  public val headSha: String? = null,
  public val id: Int? = null,
  public val nodeId: String? = null,
  pullRequests: List<PullRequestMinimal>? = null,
  public val repository: MinimalRepository? = null,
  public val status: InlineSimpleCheckSuiteStatusX6c8c0d43? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  public val url: String? = null,
) {
  public val pullRequests: List<PullRequestMinimal>? =
      pullRequests?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var after: String? = null

    public var app: Integration? = null

    public var before: String? = null

    public var conclusion: InlineSimpleCheckSuiteConclusionX83f76907? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var headBranch: String? = null

    /**
     * The SHA of the head commit that is being checked.
     */
    public var headSha: String? = null

    public var id: Int? = null

    public var nodeId: String? = null

    private var pullRequestsValue: List<PullRequestMinimal>? = null

    public var pullRequests: List<PullRequestMinimal>?
      get() = pullRequestsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        pullRequestsValue = value?.let { collection0 -> collection0.toList() }
      }

    public var repository: MinimalRepository? = null

    public var status: InlineSimpleCheckSuiteStatusX6c8c0d43? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public var url: String? = null

    public fun build(): SimpleCheckSuite = SimpleCheckSuite(
      after = after,
      app = app,
      before = before,
      conclusion = conclusion,
      createdAt = createdAt,
      headBranch = headBranch,
      headSha = headSha,
      id = id,
      nodeId = nodeId,
      pullRequests = pullRequests,
      repository = repository,
      status = status,
      updatedAt = updatedAt,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SimpleCheckSuite = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SimpleCheckSuite> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SimpleCheckSuite {
      val jsonDecoder = decoder.requireJsonDecoder("SimpleCheckSuite")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SimpleCheckSuite must be a JSON object")
      return SimpleCheckSuite(
        after = rawObject["after"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        app = rawObject["app"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Integration?>(element) },
        before = rawObject["before"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        conclusion = rawObject["conclusion"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineSimpleCheckSuiteConclusionX83f76907?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        headBranch = rawObject["head_branch"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        headSha = rawObject["head_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
        pullRequests = rawObject["pull_requests"]?.let { json.decodeFromJsonElement<List<PullRequestMinimal>>(it) },
        repository = rawObject["repository"]?.let { json.decodeFromJsonElement<MinimalRepository>(it) },
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSimpleCheckSuiteStatusX6c8c0d43>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SimpleCheckSuite) {
      val jsonEncoder = encoder.requireJsonEncoder("SimpleCheckSuite")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.after?.let { put("after", it) }
        value.app?.let { put("app", json.encodeToJsonElement(it)) }
        value.before?.let { put("before", it) }
        value.conclusion?.let { put("conclusion", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.headBranch?.let { put("head_branch", it) }
        value.headSha?.let { put("head_sha", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.nodeId?.let { put("node_id", it) }
        value.pullRequests?.let { put("pull_requests", json.encodeToJsonElement(it)) }
        value.repository?.let { put("repository", json.encodeToJsonElement(it)) }
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun simpleCheckSuite(block: SimpleCheckSuite.Builder.() -> Unit): SimpleCheckSuite = SimpleCheckSuite.build(block)
