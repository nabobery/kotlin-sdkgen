package com.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-instance-list.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-alert-instance-list
 */
@Serializable(with = CodeScanningAlertInstanceList.Serializer::class)
public class CodeScanningAlertInstanceList(
  public val analysisKey: String? = null,
  public val category: String? = null,
  /**
   * Classifications that have been applied to the file that triggered the alert.
   * For example identifying it as documentation, or a generated file.
   */
  public val classifications: List<CodeScanningAlertClassification?>? = null,
  public val commitSha: String? = null,
  public val environment: String? = null,
  public val htmlUrl: String? = null,
  public val location: CodeScanningAlertLocation? = null,
  public val message: InlineCodeScanningAlertInstanceListMessageX89cb2191? = null,
  public val ref: String? = null,
  public val state: CodeScanningAlertInstanceState? = null,
) {
  public class Builder {
    public var analysisKey: String? = null

    public var category: String? = null

    /**
     * Classifications that have been applied to the file that triggered the alert.
     * For example identifying it as documentation, or a generated file.
     */
    public var classifications: List<CodeScanningAlertClassification?>? = null

    public var commitSha: String? = null

    public var environment: String? = null

    public var htmlUrl: String? = null

    public var location: CodeScanningAlertLocation? = null

    public var message: InlineCodeScanningAlertInstanceListMessageX89cb2191? = null

    public var ref: String? = null

    public var state: CodeScanningAlertInstanceState? = null

    public fun build(): CodeScanningAlertInstanceList = CodeScanningAlertInstanceList(
      analysisKey = analysisKey,
      category = category,
      classifications = classifications,
      commitSha = commitSha,
      environment = environment,
      htmlUrl = htmlUrl,
      location = location,
      message = message,
      ref = ref,
      state = state,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAlertInstanceList = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAlertInstanceList> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAlertInstanceList {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAlertInstanceList")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAlertInstanceList must be a JSON object")
      return CodeScanningAlertInstanceList(
        analysisKey = rawObject["analysis_key"]?.let { json.decodeFromJsonElement<String>(it) },
        category = rawObject["category"]?.let { json.decodeFromJsonElement<String>(it) },
        classifications = rawObject["classifications"]?.let { json.decodeFromJsonElement<List<CodeScanningAlertClassification?>>(it) },
        commitSha = rawObject["commit_sha"]?.let { json.decodeFromJsonElement<String>(it) },
        environment = rawObject["environment"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        location = rawObject["location"]?.let { json.decodeFromJsonElement<CodeScanningAlertLocation>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<InlineCodeScanningAlertInstanceListMessageX89cb2191>(it) },
        ref = rawObject["ref"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningAlertInstanceState?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAlertInstanceList) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAlertInstanceList")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.analysisKey?.let { put("analysis_key", it) }
        value.category?.let { put("category", it) }
        value.classifications?.let { put("classifications", json.encodeToJsonElement(it)) }
        value.commitSha?.let { put("commit_sha", it) }
        value.environment?.let { put("environment", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.location?.let { put("location", json.encodeToJsonElement(it)) }
        value.message?.let { put("message", json.encodeToJsonElement(it)) }
        value.ref?.let { put("ref", it) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAlertInstanceList(block: CodeScanningAlertInstanceList.Builder.() -> Unit): CodeScanningAlertInstanceList = CodeScanningAlertInstanceList.build(block)
