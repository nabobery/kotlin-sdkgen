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
 * Commit an autofix for a code scanning alert
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-autofix-commits
 */
@Serializable(with = CodeScanningAutofixCommits.Serializer::class)
public class CodeScanningAutofixCommits(
  /**
   * Commit message to be used.
   */
  public val message: String? = null,
  /**
   * The Git reference of target branch for the commit. Branch needs to already exist.  For more information, see "[Git
   * References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
   */
  public val targetRef: String? = null,
) {
  public class Builder {
    /**
     * Commit message to be used.
     */
    public var message: String? = null

    /**
     * The Git reference of target branch for the commit. Branch needs to already exist.  For more information, see
     * "[Git References](https://git-scm.com/book/en/v2/Git-Internals-Git-References)" in the Git documentation.
     */
    public var targetRef: String? = null

    public fun build(): CodeScanningAutofixCommits = CodeScanningAutofixCommits(
      message = message,
      targetRef = targetRef,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAutofixCommits = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAutofixCommits> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAutofixCommits {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAutofixCommits")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAutofixCommits must be a JSON object")
      return CodeScanningAutofixCommits(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        targetRef = rawObject["target_ref"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAutofixCommits) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAutofixCommits")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
        value.targetRef?.let { put("target_ref", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAutofixCommits(block: CodeScanningAutofixCommits.Builder.() -> Unit): CodeScanningAutofixCommits = CodeScanningAutofixCommits.build(block)
