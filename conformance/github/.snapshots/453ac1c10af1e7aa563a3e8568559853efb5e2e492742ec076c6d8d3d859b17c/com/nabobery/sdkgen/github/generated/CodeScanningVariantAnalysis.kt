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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A run of a CodeQL query against one or more repositories.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-variant-analysis
 */
@Serializable(with = CodeScanningVariantAnalysis.Serializer::class)
public class CodeScanningVariantAnalysis(
  public val actor: SimpleUser,
  public val controllerRepo: SimpleRepository,
  /**
   * The ID of the variant analysis.
   */
  public val id: Int,
  public val queryLanguage: CodeScanningVariantAnalysisLanguage,
  /**
   * The download url for the query pack.
   */
  public val queryPackUrl: String,
  public val status: InlineCodeScanningVariantAnalysisStatusX6c63f8f8,
  /**
   * The GitHub Actions workflow run used to execute this variant analysis. This is only available if the workflow run
   * has started.
   */
  public val actionsWorkflowRunId: Int? = null,
  /**
   * The date and time at which the variant analysis was completed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be
   * null if the variant analysis has not yet completed or this information is not available.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val completedAt: String? = null,
  /**
   * The date and time at which the variant analysis was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.
   */
  public val failureReason: InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400? = null,
  scannedRepositories: List<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8>? = null,
  /**
   * Information about repositories that were skipped from processing. This information is only available to the user
   * that initiated the variant analysis.
   */
  public val skippedRepositories:
      InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6? = null,
  /**
   * The date and time at which the variant analysis was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  public val scannedRepositories:
      List<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8>? =
      scannedRepositories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var actorValue: SimpleUser? = null

    public var actor: SimpleUser
      get() = requireNotNull(actorValue) { "actor is required" }
      set(`value`) {
        actorValue = value
      }

    private var controllerRepoValue: SimpleRepository? = null

    public var controllerRepo: SimpleRepository
      get() = requireNotNull(controllerRepoValue) { "controllerRepo is required" }
      set(`value`) {
        controllerRepoValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var queryLanguageValue: CodeScanningVariantAnalysisLanguage? = null

    public var queryLanguage: CodeScanningVariantAnalysisLanguage
      get() = requireNotNull(queryLanguageValue) { "queryLanguage is required" }
      set(`value`) {
        queryLanguageValue = value
      }

    private var queryPackUrlValue: String? = null

    public var queryPackUrl: String
      get() = requireNotNull(queryPackUrlValue) { "queryPackUrl is required" }
      set(`value`) {
        queryPackUrlValue = value
      }

    private var statusValue: InlineCodeScanningVariantAnalysisStatusX6c63f8f8? = null

    public var status: InlineCodeScanningVariantAnalysisStatusX6c63f8f8
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * The GitHub Actions workflow run used to execute this variant analysis. This is only available if the workflow run
     * has started.
     */
    public var actionsWorkflowRunId: Int? = null

    /**
     * The date and time at which the variant analysis was completed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will
     * be null if the variant analysis has not yet completed or this information is not available.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var completedAt: String? = null

    /**
     * The date and time at which the variant analysis was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The reason for a failure of the variant analysis. This is only available if the variant analysis has failed.
     */
    public var failureReason: InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400? = null

    private var scannedRepositoriesValue:
        List<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8>? = null

    public var scannedRepositories:
        List<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8>?
      get() = scannedRepositoriesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        scannedRepositoriesValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Information about repositories that were skipped from processing. This information is only available to the user
     * that initiated the variant analysis.
     */
    public var skippedRepositories: InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6? =
        null

    /**
     * The date and time at which the variant analysis was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): CodeScanningVariantAnalysis {
      check(actorValue != null) { "actor is required" }
      check(controllerRepoValue != null) { "controllerRepo is required" }
      check(idValue != null) { "id is required" }
      check(queryLanguageValue != null) { "queryLanguage is required" }
      check(queryPackUrlValue != null) { "queryPackUrl is required" }
      check(statusValue != null) { "status is required" }
      return CodeScanningVariantAnalysis(
        actor = actor,
        controllerRepo = controllerRepo,
        id = id,
        queryLanguage = queryLanguage,
        queryPackUrl = queryPackUrl,
        status = status,
        actionsWorkflowRunId = actionsWorkflowRunId,
        completedAt = completedAt,
        createdAt = createdAt,
        failureReason = failureReason,
        scannedRepositories = scannedRepositories,
        skippedRepositories = skippedRepositories,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningVariantAnalysis = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningVariantAnalysis> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningVariantAnalysis {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningVariantAnalysis")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningVariantAnalysis must be a JSON object")
      val actor = json.decodeRequired<SimpleUser>(rawObject, "actor")
      val controllerRepo = json.decodeRequired<SimpleRepository>(rawObject, "controller_repo")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val queryLanguage = json.decodeRequired<CodeScanningVariantAnalysisLanguage>(rawObject, "query_language")
      val queryPackUrl = json.decodeRequired<String>(rawObject, "query_pack_url")
      val status = json.decodeRequired<InlineCodeScanningVariantAnalysisStatusX6c63f8f8>(rawObject, "status")
      return CodeScanningVariantAnalysis(
        actor = actor,
        controllerRepo = controllerRepo,
        id = id,
        queryLanguage = queryLanguage,
        queryPackUrl = queryPackUrl,
        status = status,
        actionsWorkflowRunId = rawObject["actions_workflow_run_id"]?.let { json.decodeFromJsonElement<Int>(it) },
        completedAt = rawObject["completed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        failureReason = rawObject["failure_reason"]?.let { json.decodeFromJsonElement<InlineCodeScanningVariantAnalysisFailureReasonXe8c9a400>(it) },
        scannedRepositories = rawObject["scanned_repositories"]?.let { json.decodeFromJsonElement<List<InlineCodeScanningVariantAnalysisScannedRepositoriesItemX14c84ef8>>(it) },
        skippedRepositories = rawObject["skipped_repositories"]?.let { json.decodeFromJsonElement<InlineCodeScanningVariantAnalysisSkippedRepositoriesX485656b6>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningVariantAnalysis) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningVariantAnalysis")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("actor", json.encodeToJsonElement(value.actor))
        put("controller_repo", json.encodeToJsonElement(value.controllerRepo))
        put("id", json.encodeToJsonElement(value.id))
        put("query_language", json.encodeToJsonElement(value.queryLanguage))
        put("query_pack_url", value.queryPackUrl)
        put("status", json.encodeToJsonElement(value.status))
        value.actionsWorkflowRunId?.let { put("actions_workflow_run_id", json.encodeToJsonElement(it)) }
        value.completedAt?.let { put("completed_at", it) }
        value.createdAt?.let { put("created_at", it) }
        value.failureReason?.let { put("failure_reason", json.encodeToJsonElement(it)) }
        value.scannedRepositories?.let { put("scanned_repositories", json.encodeToJsonElement(it)) }
        value.skippedRepositories?.let { put("skipped_repositories", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningVariantAnalysis(block: CodeScanningVariantAnalysis.Builder.() -> Unit): CodeScanningVariantAnalysis = CodeScanningVariantAnalysis.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningVariantAnalysis is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
