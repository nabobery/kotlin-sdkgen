package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningX2f854b26.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningX2f854b26(
  public val status: InlineSecurityAndAnalysisSecretScanningStatusX798885e6? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisSecretScanningStatusX798885e6? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningX2f854b26 = InlineSecurityAndAnalysisSecretScanningX2f854b26(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningX2f854b26 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningX2f854b26> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningX2f854b26 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningX2f854b26")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningX2f854b26 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningX2f854b26(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningStatusX798885e6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningX2f854b26) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningX2f854b26")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningX2f854b26(block: InlineSecurityAndAnalysisSecretScanningX2f854b26.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningX2f854b26 = InlineSecurityAndAnalysisSecretScanningX2f854b26.build(block)
