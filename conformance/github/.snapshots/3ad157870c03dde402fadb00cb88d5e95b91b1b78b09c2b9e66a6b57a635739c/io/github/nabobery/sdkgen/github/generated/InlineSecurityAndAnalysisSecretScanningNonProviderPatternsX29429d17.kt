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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_non_provider_patter
 * ns.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_non_provider_patter
 * ns
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17(
  public val status:
      InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328? =
        null

    public fun build(): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17 = InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningNonProviderPatternsStatusX32ce8328>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17(block: InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17 = InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17.build(block)
