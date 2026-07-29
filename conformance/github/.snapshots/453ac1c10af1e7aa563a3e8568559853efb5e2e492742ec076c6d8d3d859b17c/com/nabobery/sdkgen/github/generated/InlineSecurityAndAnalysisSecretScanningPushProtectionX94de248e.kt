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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_push_protection.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_push_protection
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e(
  public val status: InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e = InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningPushProtectionStatusX7a06657b>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e(block: InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e = InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e.build(block)
