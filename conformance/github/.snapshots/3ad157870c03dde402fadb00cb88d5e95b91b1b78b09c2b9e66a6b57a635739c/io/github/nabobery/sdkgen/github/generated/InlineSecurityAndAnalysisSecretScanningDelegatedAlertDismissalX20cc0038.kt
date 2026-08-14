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
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_alert_dis
 * missal.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/secret_scanning_delegated_alert_dis
 * missal
 */
@Serializable(with = InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038.Serializer::class)
public class InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038(
  public val status:
      InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7? = null,
) {
  public class Builder {
    public var status:
        InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7? = null

    public fun build(): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038 = InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038 must be a JSON object")
      return InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalStatusX814333d7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038(block: InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038.Builder.() -> Unit): InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038 = InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038.build(block)
