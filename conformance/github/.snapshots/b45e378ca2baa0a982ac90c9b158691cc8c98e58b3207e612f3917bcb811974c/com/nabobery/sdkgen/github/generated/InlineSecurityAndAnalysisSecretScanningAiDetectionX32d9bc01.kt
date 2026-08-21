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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_ai_detection.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_ai_detection
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01(
  public val status: InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01 = InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningAiDetectionStatusX08004b6e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01(block: InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01 = InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01.build(block)
