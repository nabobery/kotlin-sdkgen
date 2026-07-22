package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass_op
 * tions
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8(
  /**
   * The bypass reviewers for secret scanning delegated bypass
   */
  public val reviewers:
      List<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8>? = null,
) {
  public class Builder {
    /**
     * The bypass reviewers for secret scanning delegated bypass
     */
    public var reviewers:
        List<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8>? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8 = InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8(
      reviewers = reviewers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8(
        reviewers = rawObject["reviewers"]?.let { json.decodeFromJsonElement<List<InlineSecurityAndAnalysisSecretScanningDelega7d2cReviewersItemXb1cfc6f8>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewers?.let { put("reviewers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8(block: InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8 = InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8.build(block)
