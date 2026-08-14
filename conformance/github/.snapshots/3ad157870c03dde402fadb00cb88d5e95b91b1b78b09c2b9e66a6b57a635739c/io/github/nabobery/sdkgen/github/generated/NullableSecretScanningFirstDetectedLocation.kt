package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

public sealed class NullableSecretScanningFirstDetectedLocationDecodingException(
  message: String,
) : SerializationException(message)

public class NullableSecretScanningFirstDetectedLocationNoMatchException(
  message: String,
) : NullableSecretScanningFirstDetectedLocationDecodingException(message)

public class NullableSecretScanningFirstDetectedLocationAmbiguityException(
  message: String,
) : NullableSecretScanningFirstDetectedLocationDecodingException(message)

public class NullableSecretScanningFirstDetectedLocationBranchValidationException(
  message: String,
) : NullableSecretScanningFirstDetectedLocationDecodingException(message)

/**
 * Details on the location where the token was initially detected. This can be a commit, wiki commit, issue, discussion,
 * pull request.
 *
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-secret-scanning-first-detected-location
 */
@Serializable(with = NullableSecretScanningFirstDetectedLocationSerializer::class)
public sealed interface NullableSecretScanningFirstDetectedLocation {
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonObject

  public class SecretScanningLocationCommit internal constructor(
    public val blobSha: String,
    public val blobUrl: String,
    public val commitSha: String,
    public val commitUrl: String,
    public val endColumn: Double,
    public val endLine: Double,
    public val path: String,
    public val startColumn: Double,
    public val startLine: Double,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        blobSha: String,
        blobUrl: String,
        commitSha: String,
        commitUrl: String,
        endColumn: Double,
        endLine: Double,
        path: String,
        startColumn: Double,
        startLine: Double,
      ): SecretScanningLocationCommit {
        val raw = buildJsonObject {
          put("blob_sha", blobSha)
          put("blob_url", blobUrl)
          put("commit_sha", commitSha)
          put("commit_url", commitUrl)
          put("end_column", SdkJson.encodeToJsonElement(endColumn))
          put("end_line", SdkJson.encodeToJsonElement(endLine))
          put("path", path)
          put("start_column", SdkJson.encodeToJsonElement(startColumn))
          put("start_line", SdkJson.encodeToJsonElement(startLine))
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationCommitMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationCommit factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationCommit(
          blobSha = blobSha,
          blobUrl = blobUrl,
          commitSha = commitSha,
          commitUrl = commitUrl,
          endColumn = endColumn,
          endLine = endLine,
          path = path,
          startColumn = startColumn,
          startLine = startLine,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationWikiCommit internal constructor(
    public val blobSha: String,
    public val commitSha: String,
    public val commitUrl: String,
    public val endColumn: Double,
    public val endLine: Double,
    public val pageUrl: String,
    public val path: String,
    public val startColumn: Double,
    public val startLine: Double,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(
        blobSha: String,
        commitSha: String,
        commitUrl: String,
        endColumn: Double,
        endLine: Double,
        pageUrl: String,
        path: String,
        startColumn: Double,
        startLine: Double,
      ): SecretScanningLocationWikiCommit {
        val raw = buildJsonObject {
          put("blob_sha", blobSha)
          put("commit_sha", commitSha)
          put("commit_url", commitUrl)
          put("end_column", SdkJson.encodeToJsonElement(endColumn))
          put("end_line", SdkJson.encodeToJsonElement(endLine))
          put("page_url", pageUrl)
          put("path", path)
          put("start_column", SdkJson.encodeToJsonElement(startColumn))
          put("start_line", SdkJson.encodeToJsonElement(startLine))
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationWikiCommitMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationWikiCommit factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationWikiCommit(
          blobSha = blobSha,
          commitSha = commitSha,
          commitUrl = commitUrl,
          endColumn = endColumn,
          endLine = endLine,
          pageUrl = pageUrl,
          path = path,
          startColumn = startColumn,
          startLine = startLine,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationIssueTitle internal constructor(
    public val issueTitleUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(issueTitleUrl: String): SecretScanningLocationIssueTitle {
        val raw = buildJsonObject {
          put("issue_title_url", issueTitleUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationIssueTitleMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationIssueTitle factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationIssueTitle(
          issueTitleUrl = issueTitleUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationIssueBody internal constructor(
    public val issueBodyUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(issueBodyUrl: String): SecretScanningLocationIssueBody {
        val raw = buildJsonObject {
          put("issue_body_url", issueBodyUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationIssueBodyMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationIssueBody factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationIssueBody(
          issueBodyUrl = issueBodyUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationIssueComment internal constructor(
    public val issueCommentUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(issueCommentUrl: String): SecretScanningLocationIssueComment {
        val raw = buildJsonObject {
          put("issue_comment_url", issueCommentUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationIssueCommentMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationIssueComment factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationIssueComment(
          issueCommentUrl = issueCommentUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationDiscussionTitle internal constructor(
    public val discussionTitleUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(discussionTitleUrl: String): SecretScanningLocationDiscussionTitle {
        val raw = buildJsonObject {
          put("discussion_title_url", discussionTitleUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationDiscussionTitleMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationDiscussionTitle factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationDiscussionTitle(
          discussionTitleUrl = discussionTitleUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationDiscussionBody internal constructor(
    public val discussionBodyUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(discussionBodyUrl: String): SecretScanningLocationDiscussionBody {
        val raw = buildJsonObject {
          put("discussion_body_url", discussionBodyUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationDiscussionBodyMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationDiscussionBody factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationDiscussionBody(
          discussionBodyUrl = discussionBodyUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationDiscussionComment internal constructor(
    public val discussionCommentUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(discussionCommentUrl: String): SecretScanningLocationDiscussionComment {
        val raw = buildJsonObject {
          put("discussion_comment_url", discussionCommentUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationDiscussionCommentMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationDiscussionComment factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationDiscussionComment(
          discussionCommentUrl = discussionCommentUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationPullRequestTitle internal constructor(
    public val pullRequestTitleUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(pullRequestTitleUrl: String): SecretScanningLocationPullRequestTitle {
        val raw = buildJsonObject {
          put("pull_request_title_url", pullRequestTitleUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationPullRequestTitleMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationPullRequestTitle factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationPullRequestTitle(
          pullRequestTitleUrl = pullRequestTitleUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationPullRequestBody internal constructor(
    public val pullRequestBodyUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(pullRequestBodyUrl: String): SecretScanningLocationPullRequestBody {
        val raw = buildJsonObject {
          put("pull_request_body_url", pullRequestBodyUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationPullRequestBodyMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationPullRequestBody factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationPullRequestBody(
          pullRequestBodyUrl = pullRequestBodyUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationPullRequestComment internal constructor(
    public val pullRequestCommentUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(pullRequestCommentUrl: String): SecretScanningLocationPullRequestComment {
        val raw = buildJsonObject {
          put("pull_request_comment_url", pullRequestCommentUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationPullRequestCommentMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationPullRequestComment factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationPullRequestComment(
          pullRequestCommentUrl = pullRequestCommentUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationPullRequestReview internal constructor(
    public val pullRequestReviewUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(pullRequestReviewUrl: String): SecretScanningLocationPullRequestReview {
        val raw = buildJsonObject {
          put("pull_request_review_url", pullRequestReviewUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationPullRequestReviewMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationPullRequestReview factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationPullRequestReview(
          pullRequestReviewUrl = pullRequestReviewUrl,
          raw = raw,
        )
      }
    }
  }

  public class SecretScanningLocationPullRequestReviewComment internal constructor(
    public val pullRequestReviewCommentUrl: String,
    /**
     * Raw JSON retained as the serialization authority.
     */
    public override val raw: JsonObject,
  ) : NullableSecretScanningFirstDetectedLocation {
    public companion object {
      /**
       * Creates this branch and its canonical raw JSON representation.
       */
      public fun of(pullRequestReviewCommentUrl: String): SecretScanningLocationPullRequestReviewComment {
        val raw = buildJsonObject {
          put("pull_request_review_comment_url", pullRequestReviewCommentUrl)
        }
        val inspection = inspectNullableSecretScanningFirstDetectedLocation(raw)
        if (inspection.size == 0) {
          throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + inspection.failures.joinToString("; "))
        }
        if (!inspection.secretScanningLocationPullRequestReviewCommentMatches) {
          throw NullableSecretScanningFirstDetectedLocationBranchValidationException("SecretScanningLocationPullRequestReviewComment factory arguments do not satisfy the selected JSON Schema branch")
        }
        if (inspection.size > 1) {
          throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + inspection.size + " branches; expected exactly 1: " + inspection.names.joinToString())
        }
        return SecretScanningLocationPullRequestReviewComment(
          pullRequestReviewCommentUrl = pullRequestReviewCommentUrl,
          raw = raw,
        )
      }
    }
  }
}

internal object NullableSecretScanningFirstDetectedLocationSerializer : KSerializer<NullableSecretScanningFirstDetectedLocation> {
  override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

  override fun deserialize(decoder: Decoder): NullableSecretScanningFirstDetectedLocation {
    val jsonDecoder = decoder.requireJsonDecoder("NullableSecretScanningFirstDetectedLocation")
    val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: expected JSON object")
    val matches = inspectNullableSecretScanningFirstDetectedLocation(rawObject)
    if (matches.size == 0) {
      throw NullableSecretScanningFirstDetectedLocationNoMatchException("NullableSecretScanningFirstDetectedLocation matched 0 branches: " + matches.failures.joinToString("; "))
    }
    if (matches.size > 1) {
      throw NullableSecretScanningFirstDetectedLocationAmbiguityException("NullableSecretScanningFirstDetectedLocation matched " + matches.size + " branches; expected exactly 1: " + matches.names.joinToString())
    }
    return when {
      matches.secretScanningLocationCommitMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationCommit(blobSha = requireNotNull(matches.blobSha), blobUrl = requireNotNull(matches.blobUrl), commitSha = requireNotNull(matches.commitSha), commitUrl = requireNotNull(matches.commitUrl), endColumn = requireNotNull(matches.endColumn), endLine = requireNotNull(matches.endLine), path = requireNotNull(matches.path), startColumn = requireNotNull(matches.startColumn), startLine = requireNotNull(matches.startLine), raw = rawObject)
      matches.secretScanningLocationWikiCommitMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationWikiCommit(blobSha = requireNotNull(matches.blobSha), commitSha = requireNotNull(matches.commitSha), commitUrl = requireNotNull(matches.commitUrl), endColumn = requireNotNull(matches.endColumn), endLine = requireNotNull(matches.endLine), pageUrl = requireNotNull(matches.pageUrl), path = requireNotNull(matches.path), startColumn = requireNotNull(matches.startColumn), startLine = requireNotNull(matches.startLine), raw = rawObject)
      matches.secretScanningLocationIssueTitleMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationIssueTitle(issueTitleUrl = requireNotNull(matches.issueTitleUrl), raw = rawObject)
      matches.secretScanningLocationIssueBodyMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationIssueBody(issueBodyUrl = requireNotNull(matches.issueBodyUrl), raw = rawObject)
      matches.secretScanningLocationIssueCommentMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationIssueComment(issueCommentUrl = requireNotNull(matches.issueCommentUrl), raw = rawObject)
      matches.secretScanningLocationDiscussionTitleMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationDiscussionTitle(discussionTitleUrl = requireNotNull(matches.discussionTitleUrl), raw = rawObject)
      matches.secretScanningLocationDiscussionBodyMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationDiscussionBody(discussionBodyUrl = requireNotNull(matches.discussionBodyUrl), raw = rawObject)
      matches.secretScanningLocationDiscussionCommentMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationDiscussionComment(discussionCommentUrl = requireNotNull(matches.discussionCommentUrl), raw = rawObject)
      matches.secretScanningLocationPullRequestTitleMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationPullRequestTitle(pullRequestTitleUrl = requireNotNull(matches.pullRequestTitleUrl), raw = rawObject)
      matches.secretScanningLocationPullRequestBodyMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationPullRequestBody(pullRequestBodyUrl = requireNotNull(matches.pullRequestBodyUrl), raw = rawObject)
      matches.secretScanningLocationPullRequestCommentMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationPullRequestComment(pullRequestCommentUrl = requireNotNull(matches.pullRequestCommentUrl), raw = rawObject)
      matches.secretScanningLocationPullRequestReviewMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationPullRequestReview(pullRequestReviewUrl = requireNotNull(matches.pullRequestReviewUrl), raw = rawObject)
      matches.secretScanningLocationPullRequestReviewCommentMatches -> NullableSecretScanningFirstDetectedLocation.SecretScanningLocationPullRequestReviewComment(pullRequestReviewCommentUrl = requireNotNull(matches.pullRequestReviewCommentUrl), raw = rawObject)
      else -> error("unreachable")
    }
  }

  override fun serialize(encoder: Encoder, `value`: NullableSecretScanningFirstDetectedLocation) {
    encoder.requireJsonEncoder("NullableSecretScanningFirstDetectedLocation").encodeJsonElement(value.raw)
  }
}

internal data class NullableSecretScanningFirstDetectedLocationInspection(
  public val blobSha: String?,
  public val blobShaDecoded: Boolean,
  public val blobUrl: String?,
  public val blobUrlDecoded: Boolean,
  public val commitSha: String?,
  public val commitShaDecoded: Boolean,
  public val commitUrl: String?,
  public val commitUrlDecoded: Boolean,
  public val endColumn: Double?,
  public val endColumnDecoded: Boolean,
  public val endLine: Double?,
  public val endLineDecoded: Boolean,
  public val path: String?,
  public val pathDecoded: Boolean,
  public val startColumn: Double?,
  public val startColumnDecoded: Boolean,
  public val startLine: Double?,
  public val startLineDecoded: Boolean,
  public val pageUrl: String?,
  public val pageUrlDecoded: Boolean,
  public val issueTitleUrl: String?,
  public val issueTitleUrlDecoded: Boolean,
  public val issueBodyUrl: String?,
  public val issueBodyUrlDecoded: Boolean,
  public val issueCommentUrl: String?,
  public val issueCommentUrlDecoded: Boolean,
  public val discussionTitleUrl: String?,
  public val discussionTitleUrlDecoded: Boolean,
  public val discussionBodyUrl: String?,
  public val discussionBodyUrlDecoded: Boolean,
  public val discussionCommentUrl: String?,
  public val discussionCommentUrlDecoded: Boolean,
  public val pullRequestTitleUrl: String?,
  public val pullRequestTitleUrlDecoded: Boolean,
  public val pullRequestBodyUrl: String?,
  public val pullRequestBodyUrlDecoded: Boolean,
  public val pullRequestCommentUrl: String?,
  public val pullRequestCommentUrlDecoded: Boolean,
  public val pullRequestReviewUrl: String?,
  public val pullRequestReviewUrlDecoded: Boolean,
  public val pullRequestReviewCommentUrl: String?,
  public val pullRequestReviewCommentUrlDecoded: Boolean,
  public val secretScanningLocationCommitMatches: Boolean,
  public val secretScanningLocationWikiCommitMatches: Boolean,
  public val secretScanningLocationIssueTitleMatches: Boolean,
  public val secretScanningLocationIssueBodyMatches: Boolean,
  public val secretScanningLocationIssueCommentMatches: Boolean,
  public val secretScanningLocationDiscussionTitleMatches: Boolean,
  public val secretScanningLocationDiscussionBodyMatches: Boolean,
  public val secretScanningLocationDiscussionCommentMatches: Boolean,
  public val secretScanningLocationPullRequestTitleMatches: Boolean,
  public val secretScanningLocationPullRequestBodyMatches: Boolean,
  public val secretScanningLocationPullRequestCommentMatches: Boolean,
  public val secretScanningLocationPullRequestReviewMatches: Boolean,
  public val secretScanningLocationPullRequestReviewCommentMatches: Boolean,
  public val rawEmpty: Boolean,
  public val failures: List<String>,
) {
  public val names: List<String>
    get() = buildList {
      if (secretScanningLocationCommitMatches) add("SecretScanningLocationCommit")
      if (secretScanningLocationWikiCommitMatches) add("SecretScanningLocationWikiCommit")
      if (secretScanningLocationIssueTitleMatches) add("SecretScanningLocationIssueTitle")
      if (secretScanningLocationIssueBodyMatches) add("SecretScanningLocationIssueBody")
      if (secretScanningLocationIssueCommentMatches) add("SecretScanningLocationIssueComment")
      if (secretScanningLocationDiscussionTitleMatches) add("SecretScanningLocationDiscussionTitle")
      if (secretScanningLocationDiscussionBodyMatches) add("SecretScanningLocationDiscussionBody")
      if (secretScanningLocationDiscussionCommentMatches) add("SecretScanningLocationDiscussionComment")
      if (secretScanningLocationPullRequestTitleMatches) add("SecretScanningLocationPullRequestTitle")
      if (secretScanningLocationPullRequestBodyMatches) add("SecretScanningLocationPullRequestBody")
      if (secretScanningLocationPullRequestCommentMatches) add("SecretScanningLocationPullRequestComment")
      if (secretScanningLocationPullRequestReviewMatches) add("SecretScanningLocationPullRequestReview")
      if (secretScanningLocationPullRequestReviewCommentMatches) add("SecretScanningLocationPullRequestReviewComment")
    }

  public val size: Int
    get() = names.size
}

private fun inspectNullableSecretScanningFirstDetectedLocation(rawObject: JsonObject): NullableSecretScanningFirstDetectedLocationInspection {
  val blobShaResult = rawObject["blob_sha"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val blobSha = blobShaResult?.getOrNull()
  val blobShaDecoded = blobShaResult?.isSuccess == true
  val blobUrlResult = rawObject["blob_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val blobUrl = blobUrlResult?.getOrNull()
  val blobUrlDecoded = blobUrlResult?.isSuccess == true
  val commitShaResult = rawObject["commit_sha"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val commitSha = commitShaResult?.getOrNull()
  val commitShaDecoded = commitShaResult?.isSuccess == true
  val commitUrlResult = rawObject["commit_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val commitUrl = commitUrlResult?.getOrNull()
  val commitUrlDecoded = commitUrlResult?.isSuccess == true
  val endColumnResult = rawObject["end_column"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val endColumn = endColumnResult?.getOrNull()
  val endColumnDecoded = endColumnResult?.isSuccess == true
  val endLineResult = rawObject["end_line"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val endLine = endLineResult?.getOrNull()
  val endLineDecoded = endLineResult?.isSuccess == true
  val pathResult = rawObject["path"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val path = pathResult?.getOrNull()
  val pathDecoded = pathResult?.isSuccess == true
  val startColumnResult = rawObject["start_column"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val startColumn = startColumnResult?.getOrNull()
  val startColumnDecoded = startColumnResult?.isSuccess == true
  val startLineResult = rawObject["start_line"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<Double>(element) } }
  val startLine = startLineResult?.getOrNull()
  val startLineDecoded = startLineResult?.isSuccess == true
  val pageUrlResult = rawObject["page_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pageUrl = pageUrlResult?.getOrNull()
  val pageUrlDecoded = pageUrlResult?.isSuccess == true
  val issueTitleUrlResult = rawObject["issue_title_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val issueTitleUrl = issueTitleUrlResult?.getOrNull()
  val issueTitleUrlDecoded = issueTitleUrlResult?.isSuccess == true
  val issueBodyUrlResult = rawObject["issue_body_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val issueBodyUrl = issueBodyUrlResult?.getOrNull()
  val issueBodyUrlDecoded = issueBodyUrlResult?.isSuccess == true
  val issueCommentUrlResult = rawObject["issue_comment_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val issueCommentUrl = issueCommentUrlResult?.getOrNull()
  val issueCommentUrlDecoded = issueCommentUrlResult?.isSuccess == true
  val discussionTitleUrlResult = rawObject["discussion_title_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val discussionTitleUrl = discussionTitleUrlResult?.getOrNull()
  val discussionTitleUrlDecoded = discussionTitleUrlResult?.isSuccess == true
  val discussionBodyUrlResult = rawObject["discussion_body_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val discussionBodyUrl = discussionBodyUrlResult?.getOrNull()
  val discussionBodyUrlDecoded = discussionBodyUrlResult?.isSuccess == true
  val discussionCommentUrlResult = rawObject["discussion_comment_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val discussionCommentUrl = discussionCommentUrlResult?.getOrNull()
  val discussionCommentUrlDecoded = discussionCommentUrlResult?.isSuccess == true
  val pullRequestTitleUrlResult = rawObject["pull_request_title_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pullRequestTitleUrl = pullRequestTitleUrlResult?.getOrNull()
  val pullRequestTitleUrlDecoded = pullRequestTitleUrlResult?.isSuccess == true
  val pullRequestBodyUrlResult = rawObject["pull_request_body_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pullRequestBodyUrl = pullRequestBodyUrlResult?.getOrNull()
  val pullRequestBodyUrlDecoded = pullRequestBodyUrlResult?.isSuccess == true
  val pullRequestCommentUrlResult = rawObject["pull_request_comment_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pullRequestCommentUrl = pullRequestCommentUrlResult?.getOrNull()
  val pullRequestCommentUrlDecoded = pullRequestCommentUrlResult?.isSuccess == true
  val pullRequestReviewUrlResult = rawObject["pull_request_review_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pullRequestReviewUrl = pullRequestReviewUrlResult?.getOrNull()
  val pullRequestReviewUrlDecoded = pullRequestReviewUrlResult?.isSuccess == true
  val pullRequestReviewCommentUrlResult = rawObject["pull_request_review_comment_url"]?.let { element -> runCatching { SdkJson.decodeFromJsonElement<String>(element) } }
  val pullRequestReviewCommentUrl = pullRequestReviewCommentUrlResult?.getOrNull()
  val pullRequestReviewCommentUrlDecoded = pullRequestReviewCommentUrlResult?.isSuccess == true
  val rawEmpty = rawObject.isEmpty()
  val secretScanningLocationCommitMatches = blobShaDecoded && blobUrlDecoded && commitShaDecoded && commitUrlDecoded && endColumnDecoded && endLineDecoded && pathDecoded && startColumnDecoded && startLineDecoded
  val secretScanningLocationWikiCommitMatches = blobShaDecoded && commitShaDecoded && commitUrlDecoded && endColumnDecoded && endLineDecoded && pageUrlDecoded && pathDecoded && startColumnDecoded && startLineDecoded
  val secretScanningLocationIssueTitleMatches = issueTitleUrlDecoded
  val secretScanningLocationIssueBodyMatches = issueBodyUrlDecoded
  val secretScanningLocationIssueCommentMatches = issueCommentUrlDecoded
  val secretScanningLocationDiscussionTitleMatches = discussionTitleUrlDecoded
  val secretScanningLocationDiscussionBodyMatches = discussionBodyUrlDecoded
  val secretScanningLocationDiscussionCommentMatches = discussionCommentUrlDecoded
  val secretScanningLocationPullRequestTitleMatches = pullRequestTitleUrlDecoded
  val secretScanningLocationPullRequestBodyMatches = pullRequestBodyUrlDecoded
  val secretScanningLocationPullRequestCommentMatches = pullRequestCommentUrlDecoded
  val secretScanningLocationPullRequestReviewMatches = pullRequestReviewUrlDecoded
  val secretScanningLocationPullRequestReviewCommentMatches = pullRequestReviewCommentUrlDecoded
  return NullableSecretScanningFirstDetectedLocationInspection(
    blobSha = blobSha,
    blobShaDecoded = blobShaDecoded,
    blobUrl = blobUrl,
    blobUrlDecoded = blobUrlDecoded,
    commitSha = commitSha,
    commitShaDecoded = commitShaDecoded,
    commitUrl = commitUrl,
    commitUrlDecoded = commitUrlDecoded,
    endColumn = endColumn,
    endColumnDecoded = endColumnDecoded,
    endLine = endLine,
    endLineDecoded = endLineDecoded,
    path = path,
    pathDecoded = pathDecoded,
    startColumn = startColumn,
    startColumnDecoded = startColumnDecoded,
    startLine = startLine,
    startLineDecoded = startLineDecoded,
    pageUrl = pageUrl,
    pageUrlDecoded = pageUrlDecoded,
    issueTitleUrl = issueTitleUrl,
    issueTitleUrlDecoded = issueTitleUrlDecoded,
    issueBodyUrl = issueBodyUrl,
    issueBodyUrlDecoded = issueBodyUrlDecoded,
    issueCommentUrl = issueCommentUrl,
    issueCommentUrlDecoded = issueCommentUrlDecoded,
    discussionTitleUrl = discussionTitleUrl,
    discussionTitleUrlDecoded = discussionTitleUrlDecoded,
    discussionBodyUrl = discussionBodyUrl,
    discussionBodyUrlDecoded = discussionBodyUrlDecoded,
    discussionCommentUrl = discussionCommentUrl,
    discussionCommentUrlDecoded = discussionCommentUrlDecoded,
    pullRequestTitleUrl = pullRequestTitleUrl,
    pullRequestTitleUrlDecoded = pullRequestTitleUrlDecoded,
    pullRequestBodyUrl = pullRequestBodyUrl,
    pullRequestBodyUrlDecoded = pullRequestBodyUrlDecoded,
    pullRequestCommentUrl = pullRequestCommentUrl,
    pullRequestCommentUrlDecoded = pullRequestCommentUrlDecoded,
    pullRequestReviewUrl = pullRequestReviewUrl,
    pullRequestReviewUrlDecoded = pullRequestReviewUrlDecoded,
    pullRequestReviewCommentUrl = pullRequestReviewCommentUrl,
    pullRequestReviewCommentUrlDecoded = pullRequestReviewCommentUrlDecoded,
    secretScanningLocationCommitMatches = secretScanningLocationCommitMatches,
    secretScanningLocationWikiCommitMatches = secretScanningLocationWikiCommitMatches,
    secretScanningLocationIssueTitleMatches = secretScanningLocationIssueTitleMatches,
    secretScanningLocationIssueBodyMatches = secretScanningLocationIssueBodyMatches,
    secretScanningLocationIssueCommentMatches = secretScanningLocationIssueCommentMatches,
    secretScanningLocationDiscussionTitleMatches = secretScanningLocationDiscussionTitleMatches,
    secretScanningLocationDiscussionBodyMatches = secretScanningLocationDiscussionBodyMatches,
    secretScanningLocationDiscussionCommentMatches = secretScanningLocationDiscussionCommentMatches,
    secretScanningLocationPullRequestTitleMatches = secretScanningLocationPullRequestTitleMatches,
    secretScanningLocationPullRequestBodyMatches = secretScanningLocationPullRequestBodyMatches,
    secretScanningLocationPullRequestCommentMatches = secretScanningLocationPullRequestCommentMatches,
    secretScanningLocationPullRequestReviewMatches = secretScanningLocationPullRequestReviewMatches,
    secretScanningLocationPullRequestReviewCommentMatches = secretScanningLocationPullRequestReviewCommentMatches,
    rawEmpty = rawEmpty,
    failures = buildList {
      if (!secretScanningLocationCommitMatches) add("SecretScanningLocationCommit: branch predicate did not match properties 'blob_sha' and 'blob_url' and 'commit_sha' and 'commit_url' and 'end_column' and 'end_line' and 'path' and 'start_column' and 'start_line'")
      if (!secretScanningLocationWikiCommitMatches) add("SecretScanningLocationWikiCommit: branch predicate did not match properties 'blob_sha' and 'commit_sha' and 'commit_url' and 'end_column' and 'end_line' and 'page_url' and 'path' and 'start_column' and 'start_line'")
      if (!secretScanningLocationIssueTitleMatches) add("SecretScanningLocationIssueTitle: branch predicate did not match properties 'issue_title_url'")
      if (!secretScanningLocationIssueBodyMatches) add("SecretScanningLocationIssueBody: branch predicate did not match properties 'issue_body_url'")
      if (!secretScanningLocationIssueCommentMatches) add("SecretScanningLocationIssueComment: branch predicate did not match properties 'issue_comment_url'")
      if (!secretScanningLocationDiscussionTitleMatches) add("SecretScanningLocationDiscussionTitle: branch predicate did not match properties 'discussion_title_url'")
      if (!secretScanningLocationDiscussionBodyMatches) add("SecretScanningLocationDiscussionBody: branch predicate did not match properties 'discussion_body_url'")
      if (!secretScanningLocationDiscussionCommentMatches) add("SecretScanningLocationDiscussionComment: branch predicate did not match properties 'discussion_comment_url'")
      if (!secretScanningLocationPullRequestTitleMatches) add("SecretScanningLocationPullRequestTitle: branch predicate did not match properties 'pull_request_title_url'")
      if (!secretScanningLocationPullRequestBodyMatches) add("SecretScanningLocationPullRequestBody: branch predicate did not match properties 'pull_request_body_url'")
      if (!secretScanningLocationPullRequestCommentMatches) add("SecretScanningLocationPullRequestComment: branch predicate did not match properties 'pull_request_comment_url'")
      if (!secretScanningLocationPullRequestReviewMatches) add("SecretScanningLocationPullRequestReview: branch predicate did not match properties 'pull_request_review_url'")
      if (!secretScanningLocationPullRequestReviewCommentMatches) add("SecretScanningLocationPullRequestReviewComment: branch predicate did not match properties 'pull_request_review_comment_url'")
    },
  )
}

private fun JsonObject.stringValue(name: String): String? {
  val primitive = this[name] as? JsonPrimitive ?: return null
  return primitive.takeIf { it.isString }?.content
}
