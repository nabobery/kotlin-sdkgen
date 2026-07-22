package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix-commits-response.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix-commits-response
 */
@Serializable(with = CodeScanningAutofixCommitsResponse.Serializer::class)
public class CodeScanningAutofixCommitsResponse(
  /**
   * SHA of commit with autofix.
   */
  public val sha: String? = null,
  /**
   * The Git reference of target branch for the commit. For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   */
  public val targetRef: String? = null,
) {
  public class Builder {
    /**
     * SHA of commit with autofix.
     */
    public var sha: String? = null

    /**
     * The Git reference of target branch for the commit. For more information, see "[Git
     * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
     */
    public var targetRef: String? = null

    public fun build(): CodeScanningAutofixCommitsResponse = CodeScanningAutofixCommitsResponse(
      sha = sha,
      targetRef = targetRef,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAutofixCommitsResponse = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAutofixCommitsResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAutofixCommitsResponse {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAutofixCommitsResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAutofixCommitsResponse must be a JSON object")
      return CodeScanningAutofixCommitsResponse(
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        targetRef = rawObject["target_ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAutofixCommitsResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAutofixCommitsResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.sha?.let { put("sha", it) }
        value.targetRef?.let { put("target_ref", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAutofixCommitsResponse(block: CodeScanningAutofixCommitsResponse.Builder.() -> Unit): CodeScanningAutofixCommitsResponse = CodeScanningAutofixCommitsResponse.build(block)
