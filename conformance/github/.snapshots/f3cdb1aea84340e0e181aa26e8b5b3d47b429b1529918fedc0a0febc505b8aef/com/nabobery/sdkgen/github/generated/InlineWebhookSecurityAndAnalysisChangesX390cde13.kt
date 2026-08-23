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
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis/properties/changes.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/webhook-security-and-analysis/properties/changes
 */
@Serializable(with = InlineWebhookSecurityAndAnalysisChangesX390cde13.Serializer::class)
public class InlineWebhookSecurityAndAnalysisChangesX390cde13(
  public val from: InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1? = null,
) {
  public class Builder {
    public var from: InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1? = null

    public fun build(): InlineWebhookSecurityAndAnalysisChangesX390cde13 = InlineWebhookSecurityAndAnalysisChangesX390cde13(
      from = from,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookSecurityAndAnalysisChangesX390cde13 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineWebhookSecurityAndAnalysisChangesX390cde13> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookSecurityAndAnalysisChangesX390cde13 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookSecurityAndAnalysisChangesX390cde13")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookSecurityAndAnalysisChangesX390cde13 must be a JSON object")
      return InlineWebhookSecurityAndAnalysisChangesX390cde13(
        from = rawObject["from"]?.let { json.decodeFromJsonElement<InlineWebhookSecurityAndAnalysisChangesFromXd345f1a1>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookSecurityAndAnalysisChangesX390cde13) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookSecurityAndAnalysisChangesX390cde13")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.from?.let { put("from", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookSecurityAndAnalysisChangesX390cde13(block: InlineWebhookSecurityAndAnalysisChangesX390cde13.Builder.() -> Unit): InlineWebhookSecurityAndAnalysisChangesX390cde13 = InlineWebhookSecurityAndAnalysisChangesX390cde13.build(block)
