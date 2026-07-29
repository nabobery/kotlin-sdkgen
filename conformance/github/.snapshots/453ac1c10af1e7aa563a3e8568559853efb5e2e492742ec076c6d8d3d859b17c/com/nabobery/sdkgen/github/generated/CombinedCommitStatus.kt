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
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Combined Commit Status
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/combined-commit-status
 */
@Serializable(with = CombinedCommitStatus.Serializer::class)
public class CombinedCommitStatus(
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val commitUrl: String,
  public val repository: MinimalRepository,
  public val sha: String,
  public val state: String,
  statuses: List<SimpleCommitStatus>,
  public val totalCount: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
) {
  public val statuses: List<SimpleCommitStatus> = statuses.toList()

  public class Builder {
    private var commitUrlValue: String? = null

    public var commitUrl: String
      get() = requireNotNull(commitUrlValue) { "commitUrl is required" }
      set(`value`) {
        commitUrlValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var statusesValue: List<SimpleCommitStatus>? = null

    public var statuses: List<SimpleCommitStatus>
      get() = requireNotNull(statusesValue) { "statuses is required" }.toList()
      set(`value`) {
        statusesValue = value.toList()
      }

    private var totalCountValue: Int? = null

    public var totalCount: Int
      get() = requireNotNull(totalCountValue) { "totalCount is required" }
      set(`value`) {
        totalCountValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): CombinedCommitStatus {
      check(commitUrlValue != null) { "commitUrl is required" }
      check(repositoryValue != null) { "repository is required" }
      check(shaValue != null) { "sha is required" }
      check(stateValue != null) { "state is required" }
      check(statusesValue != null) { "statuses is required" }
      check(totalCountValue != null) { "totalCount is required" }
      check(urlValue != null) { "url is required" }
      return CombinedCommitStatus(
        commitUrl = commitUrl,
        repository = repository,
        sha = sha,
        state = state,
        statuses = statuses,
        totalCount = totalCount,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CombinedCommitStatus = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CombinedCommitStatus> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CombinedCommitStatus {
      val jsonDecoder = decoder.requireJsonDecoder("CombinedCommitStatus")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CombinedCommitStatus must be a JSON object")
      val commitUrl = json.decodeRequired<String>(rawObject, "commit_url")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val state = json.decodeRequired<String>(rawObject, "state")
      val statuses = json.decodeRequired<List<SimpleCommitStatus>>(rawObject, "statuses")
      val totalCount = json.decodeRequired<Int>(rawObject, "total_count")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CombinedCommitStatus(
        commitUrl = commitUrl,
        repository = repository,
        sha = sha,
        state = state,
        statuses = statuses,
        totalCount = totalCount,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CombinedCommitStatus) {
      val jsonEncoder = encoder.requireJsonEncoder("CombinedCommitStatus")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit_url", value.commitUrl)
        put("repository", json.encodeToJsonElement(value.repository))
        put("sha", value.sha)
        put("state", value.state)
        put("statuses", json.encodeToJsonElement(value.statuses))
        put("total_count", json.encodeToJsonElement(value.totalCount))
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun combinedCommitStatus(block: CombinedCommitStatus.Builder.() -> Unit): CombinedCommitStatus = CombinedCommitStatus.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CombinedCommitStatus is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
