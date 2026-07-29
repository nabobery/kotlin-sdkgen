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
 * Commit Comparison
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-comparison
 */
@Serializable(with = CommitComparison.Serializer::class)
public class CommitComparison(
  public val aheadBy: Int,
  public val baseCommit: Commit,
  public val behindBy: Int,
  commits: List<Commit>,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val diffUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String,
  public val mergeBaseCommit: Commit,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val patchUrl: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val permalinkUrl: String,
  public val status: InlineCommitComparisonStatusXa3342f22,
  public val totalCommits: Int,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  files: List<DiffEntry>? = null,
) {
  public val commits: List<Commit> = commits.toList()

  public val files: List<DiffEntry>? = files?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var aheadByValue: Int? = null

    public var aheadBy: Int
      get() = requireNotNull(aheadByValue) { "aheadBy is required" }
      set(`value`) {
        aheadByValue = value
      }

    private var baseCommitValue: Commit? = null

    public var baseCommit: Commit
      get() = requireNotNull(baseCommitValue) { "baseCommit is required" }
      set(`value`) {
        baseCommitValue = value
      }

    private var behindByValue: Int? = null

    public var behindBy: Int
      get() = requireNotNull(behindByValue) { "behindBy is required" }
      set(`value`) {
        behindByValue = value
      }

    private var commitsValue: List<Commit>? = null

    public var commits: List<Commit>
      get() = requireNotNull(commitsValue) { "commits is required" }.toList()
      set(`value`) {
        commitsValue = value.toList()
      }

    private var diffUrlValue: String? = null

    public var diffUrl: String
      get() = requireNotNull(diffUrlValue) { "diffUrl is required" }
      set(`value`) {
        diffUrlValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var mergeBaseCommitValue: Commit? = null

    public var mergeBaseCommit: Commit
      get() = requireNotNull(mergeBaseCommitValue) { "mergeBaseCommit is required" }
      set(`value`) {
        mergeBaseCommitValue = value
      }

    private var patchUrlValue: String? = null

    public var patchUrl: String
      get() = requireNotNull(patchUrlValue) { "patchUrl is required" }
      set(`value`) {
        patchUrlValue = value
      }

    private var permalinkUrlValue: String? = null

    public var permalinkUrl: String
      get() = requireNotNull(permalinkUrlValue) { "permalinkUrl is required" }
      set(`value`) {
        permalinkUrlValue = value
      }

    private var statusValue: InlineCommitComparisonStatusXa3342f22? = null

    public var status: InlineCommitComparisonStatusXa3342f22
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var totalCommitsValue: Int? = null

    public var totalCommits: Int
      get() = requireNotNull(totalCommitsValue) { "totalCommits is required" }
      set(`value`) {
        totalCommitsValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var filesValue: List<DiffEntry>? = null

    public var files: List<DiffEntry>?
      get() = filesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        filesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): CommitComparison {
      check(aheadByValue != null) { "aheadBy is required" }
      check(baseCommitValue != null) { "baseCommit is required" }
      check(behindByValue != null) { "behindBy is required" }
      check(commitsValue != null) { "commits is required" }
      check(diffUrlValue != null) { "diffUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(mergeBaseCommitValue != null) { "mergeBaseCommit is required" }
      check(patchUrlValue != null) { "patchUrl is required" }
      check(permalinkUrlValue != null) { "permalinkUrl is required" }
      check(statusValue != null) { "status is required" }
      check(totalCommitsValue != null) { "totalCommits is required" }
      check(urlValue != null) { "url is required" }
      return CommitComparison(
        aheadBy = aheadBy,
        baseCommit = baseCommit,
        behindBy = behindBy,
        commits = commits,
        diffUrl = diffUrl,
        htmlUrl = htmlUrl,
        mergeBaseCommit = mergeBaseCommit,
        patchUrl = patchUrl,
        permalinkUrl = permalinkUrl,
        status = status,
        totalCommits = totalCommits,
        url = url,
        files = files,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CommitComparison = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CommitComparison> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CommitComparison {
      val jsonDecoder = decoder.requireJsonDecoder("CommitComparison")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CommitComparison must be a JSON object")
      val aheadBy = json.decodeRequired<Int>(rawObject, "ahead_by")
      val baseCommit = json.decodeRequired<Commit>(rawObject, "base_commit")
      val behindBy = json.decodeRequired<Int>(rawObject, "behind_by")
      val commits = json.decodeRequired<List<Commit>>(rawObject, "commits")
      val diffUrl = json.decodeRequired<String>(rawObject, "diff_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val mergeBaseCommit = json.decodeRequired<Commit>(rawObject, "merge_base_commit")
      val patchUrl = json.decodeRequired<String>(rawObject, "patch_url")
      val permalinkUrl = json.decodeRequired<String>(rawObject, "permalink_url")
      val status = json.decodeRequired<InlineCommitComparisonStatusXa3342f22>(rawObject, "status")
      val totalCommits = json.decodeRequired<Int>(rawObject, "total_commits")
      val url = json.decodeRequired<String>(rawObject, "url")
      return CommitComparison(
        aheadBy = aheadBy,
        baseCommit = baseCommit,
        behindBy = behindBy,
        commits = commits,
        diffUrl = diffUrl,
        htmlUrl = htmlUrl,
        mergeBaseCommit = mergeBaseCommit,
        patchUrl = patchUrl,
        permalinkUrl = permalinkUrl,
        status = status,
        totalCommits = totalCommits,
        url = url,
        files = rawObject["files"]?.let { json.decodeFromJsonElement<List<DiffEntry>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CommitComparison) {
      val jsonEncoder = encoder.requireJsonEncoder("CommitComparison")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("ahead_by", json.encodeToJsonElement(value.aheadBy))
        put("base_commit", json.encodeToJsonElement(value.baseCommit))
        put("behind_by", json.encodeToJsonElement(value.behindBy))
        put("commits", json.encodeToJsonElement(value.commits))
        put("diff_url", value.diffUrl)
        put("html_url", value.htmlUrl)
        put("merge_base_commit", json.encodeToJsonElement(value.mergeBaseCommit))
        put("patch_url", value.patchUrl)
        put("permalink_url", value.permalinkUrl)
        put("status", json.encodeToJsonElement(value.status))
        put("total_commits", json.encodeToJsonElement(value.totalCommits))
        put("url", value.url)
        value.files?.let { put("files", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun commitComparison(block: CommitComparison.Builder.() -> Unit): CommitComparison = CommitComparison.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CommitComparison is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
