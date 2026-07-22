package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1sarifs/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1sarifs/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b.Serializer::class)
public class InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b(
  public val commitSha: String,
  public val ref: String,
  public val sarif: String,
  /**
   * The base directory used in the analysis, as it appears in the SARIF file.
   * This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their
   * correct location in the repository.
   */
  public val checkoutUri: String? = null,
  /**
   * The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
   * format: `YYYY-MM-DDTHH:MM:SSZ`.
   */
  public val startedAt: String? = null,
  /**
   * The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name
   * defaults to "API". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the
   * `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`.
   */
  public val toolName: String? = null,
  /**
   * Whether the SARIF file will be validated according to the code scanning specifications.
   * This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by code
   * scanning.
   */
  public val validate: Boolean? = null,
) {
  public class Builder {
    private var commitShaValue: String? = null

    public var commitSha: String
      get() = requireNotNull(commitShaValue) { "commitSha is required" }
      set(`value`) {
        commitShaValue = value
      }

    private var refValue: String? = null

    public var ref: String
      get() = requireNotNull(refValue) { "ref is required" }
      set(`value`) {
        refValue = value
      }

    private var sarifValue: String? = null

    public var sarif: String
      get() = requireNotNull(sarifValue) { "sarif is required" }
      set(`value`) {
        sarifValue = value
      }

    /**
     * The base directory used in the analysis, as it appears in the SARIF file.
     * This property is used to convert file paths from absolute to relative, so that alerts can be mapped to their
     * correct location in the repository.
     */
    public var checkoutUri: String? = null

    /**
     * The time that the analysis run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format: `YYYY-MM-DDTHH:MM:SSZ`.
     */
    public var startedAt: String? = null

    /**
     * The name of the tool used to generate the code scanning analysis. If this parameter is not used, the tool name
     * defaults to "API". If the uploaded SARIF contains a tool GUID, this will be available for filtering using the
     * `tool_guid` parameter of operations such as `GET /repos/{owner}/{repo}/code-scanning/alerts`.
     */
    public var toolName: String? = null

    /**
     * Whether the SARIF file will be validated according to the code scanning specifications.
     * This parameter is intended to help integrators ensure that the uploaded SARIF files are correctly rendered by
     * code scanning.
     */
    public var validate: Boolean? = null

    public fun build(): InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b {
      check(commitShaValue != null) { "commitSha is required" }
      check(refValue != null) { "ref is required" }
      check(sarifValue != null) { "sarif is required" }
      return InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b(
        commitSha = commitSha,
        ref = ref,
        sarif = sarif,
        checkoutUri = checkoutUri,
        startedAt = startedAt,
        toolName = toolName,
        validate = validate,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b must be a JSON object")
      val commitSha = json.decodeRequired<String>(rawObject, "commit_sha")
      val ref = json.decodeRequired<String>(rawObject, "ref")
      val sarif = json.decodeRequired<String>(rawObject, "sarif")
      return InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b(
        commitSha = commitSha,
        ref = ref,
        sarif = sarif,
        checkoutUri = rawObject["checkout_uri"]?.let { json.decodeFromJsonElement<String>(it) },
        startedAt = rawObject["started_at"]?.let { json.decodeFromJsonElement<String>(it) },
        toolName = rawObject["tool_name"]?.let { json.decodeFromJsonElement<String>(it) },
        validate = rawObject["validate"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("commit_sha", value.commitSha)
        put("ref", value.ref)
        put("sarif", value.sarif)
        value.checkoutUri?.let { put("checkout_uri", it) }
        value.startedAt?.let { put("started_at", it) }
        value.toolName?.let { put("tool_name", it) }
        value.validate?.let { put("validate", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposCodeScanningSarifsPostRequestJsonXf4fec50b(block: InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b.Builder.() -> Unit): InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b = InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposCodeScanningSarifsPostRequestJsonXf4fec50b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
