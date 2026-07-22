package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-analysis.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-analysis
 */
@Serializable(with = CodeScanningAnalysis.Serializer::class)
public class CodeScanningAnalysis(
  public val analysisKey: String,
  public val commitSha: String,
  public val createdAt: String,
  public val deletable: Boolean,
  public val environment: String,
  public val error: String,
  /**
   * Unique identifier for this analysis.
   */
  public val id: Int,
  public val ref: String,
  /**
   * The total number of results in the analysis.
   */
  public val resultsCount: Int,
  /**
   * The total number of rules used in the analysis.
   */
  public val rulesCount: Int,
  public val sarifId: String,
  public val tool: CodeScanningAnalysisTool,
  public val url: String,
  /**
   * Warning generated when processing the analysis
   */
  public val warning: String,
  public val category: String? = null,
) {
  public class Builder {
    private var analysisKeyValue: String? = null

    public var analysisKey: String
      get() = requireNotNull(analysisKeyValue) { "analysisKey is required" }
      set(`value`) {
        analysisKeyValue = value
      }

    private var commitShaValue: String? = null

    public var commitSha: String
      get() = requireNotNull(commitShaValue) { "commitSha is required" }
      set(`value`) {
        commitShaValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var deletableValue: Boolean? = null

    public var deletable: Boolean
      get() = requireNotNull(deletableValue) { "deletable is required" }
      set(`value`) {
        deletableValue = value
      }

    private var environmentValue: String? = null

    public var environment: String
      get() = requireNotNull(environmentValue) { "environment is required" }
      set(`value`) {
        environmentValue = value
      }

    private var errorValue: String? = null

    public var error: String
      get() = requireNotNull(errorValue) { "error is required" }
      set(`value`) {
        errorValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var resultsCountValue: Int? = null

    public var resultsCount: Int
      get() = requireNotNull(resultsCountValue) { "resultsCount is required" }
      set(`value`) {
        resultsCountValue = value
      }

    private var rulesCountValue: Int? = null

    public var rulesCount: Int
      get() = requireNotNull(rulesCountValue) { "rulesCount is required" }
      set(`value`) {
        rulesCountValue = value
      }

    private var sarifIdValue: String? = null

    public var sarifId: String
      get() = requireNotNull(sarifIdValue) { "sarifId is required" }
      set(`value`) {
        sarifIdValue = value
      }

    private var toolValue: CodeScanningAnalysisTool? = null

    public var tool: CodeScanningAnalysisTool
      get() = requireNotNull(toolValue) { "tool is required" }
      set(`value`) {
        toolValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var warningValue: String? = null

    public var warning: String
      get() = requireNotNull(warningValue) { "warning is required" }
      set(`value`) {
        warningValue = value
      }

    public var category: String? = null

    public fun build(): CodeScanningAnalysis {
      check(analysisKeyValue != null) { "analysisKey is required" }
      check(commitShaValue != null) { "commitSha is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(deletableValue != null) { "deletable is required" }
      check(environmentValue != null) { "environment is required" }
      check(errorValue != null) { "error is required" }
      check(idValue != null) { "id is required" }
      check(refValue != null) { "ref is required" }
      check(resultsCountValue != null) { "resultsCount is required" }
      check(rulesCountValue != null) { "rulesCount is required" }
      check(sarifIdValue != null) { "sarifId is required" }
      check(toolValue != null) { "tool is required" }
      check(urlValue != null) { "url is required" }
      check(warningValue != null) { "warning is required" }
      return CodeScanningAnalysis(
        analysisKey = analysisKey,
        commitSha = commitSha,
        createdAt = createdAt,
        deletable = deletable,
        environment = environment,
        error = error,
        id = id,
        ref = ref,
        resultsCount = resultsCount,
        rulesCount = rulesCount,
        sarifId = sarifId,
        tool = tool,
        url = url,
        warning = warning,
        category = category,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAnalysis = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAnalysis> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAnalysis {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAnalysis")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAnalysis must be a JSON object")
      val analysisKey = json.decodeRequired<String>(rawObject, "analysis_key")
      val commitSha = json.decodeRequired<String>(rawObject, "commit_sha")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val deletable = json.decodeRequired<Boolean>(rawObject, "deletable")
      val environment = json.decodeRequired<String>(rawObject, "environment")
      val error = json.decodeRequired<String>(rawObject, "error")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val resultsCount = json.decodeRequired<Int>(rawObject, "results_count")
      val rulesCount = json.decodeRequired<Int>(rawObject, "rules_count")
      val sarifId = json.decodeRequired<String>(rawObject, "sarif_id")
      val tool = json.decodeRequired<CodeScanningAnalysisTool>(rawObject, "tool")
      val url = json.decodeRequired<String>(rawObject, "url")
      val warning = json.decodeRequired<String>(rawObject, "warning")
      return CodeScanningAnalysis(
        analysisKey = analysisKey,
        commitSha = commitSha,
        createdAt = createdAt,
        deletable = deletable,
        environment = environment,
        error = error,
        id = id,
        ref = ref,
        resultsCount = resultsCount,
        rulesCount = rulesCount,
        sarifId = sarifId,
        tool = tool,
        url = url,
        warning = warning,
        category = rawObject["category"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAnalysis) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAnalysis")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("analysis_key", value.analysisKey)
        put("commit_sha", value.commitSha)
        put("created_at", value.createdAt)
        put("deletable", json.encodeToJsonElement(value.deletable))
        put("environment", value.environment)
        put("error", value.error)
        put("id", json.encodeToJsonElement(value.id))
        put("ref", value.ref)
        put("results_count", json.encodeToJsonElement(value.resultsCount))
        put("rules_count", json.encodeToJsonElement(value.rulesCount))
        put("sarif_id", value.sarifId)
        put("tool", json.encodeToJsonElement(value.tool))
        put("url", value.url)
        put("warning", value.warning)
        value.category?.let { put("category", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAnalysis(block: CodeScanningAnalysis.Builder.() -> Unit): CodeScanningAnalysis = CodeScanningAnalysis.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeScanningAnalysis is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
