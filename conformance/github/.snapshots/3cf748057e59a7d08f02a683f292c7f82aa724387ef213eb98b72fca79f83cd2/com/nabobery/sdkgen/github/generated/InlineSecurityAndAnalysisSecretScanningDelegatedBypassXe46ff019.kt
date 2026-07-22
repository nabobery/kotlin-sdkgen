package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_bypass
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019(
  public val status: InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019 = InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelegatedBypassStatusX249a21ff>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019(block: InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019 = InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019.build(block)
