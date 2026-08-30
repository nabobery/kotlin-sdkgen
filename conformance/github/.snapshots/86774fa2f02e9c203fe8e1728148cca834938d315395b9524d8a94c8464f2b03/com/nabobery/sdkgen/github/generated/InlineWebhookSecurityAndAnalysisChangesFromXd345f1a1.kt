package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis/properties/changes/properties/from.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis/properties/changes/properties/from
 */
@Serializable(with = InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1.Serializer::class)
public class InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1(
  public val securityAndAnalysis: SecurityAndAnalysis? = null,
) {
  public class Builder {
    public var securityAndAnalysis: SecurityAndAnalysis? = null

    public fun build(): InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1 = InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1(
      securityAndAnalysis = securityAndAnalysis,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1 must be a JSON object")
      return InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1(
        securityAndAnalysis = rawObject["security_and_analysis"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SecurityAndAnalysis?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.securityAndAnalysis?.let { put("security_and_analysis", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAndAnalysisChangesFromXd345f1a1(block: InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1.Builder.() -> Unit): InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1 = InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1.build(block)
