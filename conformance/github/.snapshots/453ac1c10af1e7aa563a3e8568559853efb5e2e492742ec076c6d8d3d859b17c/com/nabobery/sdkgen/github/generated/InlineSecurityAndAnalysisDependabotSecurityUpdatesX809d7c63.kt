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
 * Enable or disable Dependabot security updates for the repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/dependabot_security_updates
 */
@Serializable(with = InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63.Serializer::class)
public class InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63(
  /**
   * The enablement status of Dependabot security updates for the repository.
   */
  public val status: InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5? = null,
) {
  public class Builder {
    /**
     * The enablement status of Dependabot security updates for the repository.
     */
    public var status: InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5? = null

    public fun build(): InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63 = InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63 must be a JSON object")
      return InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisDependabotSecurityUpdatesStatusX19a10fa5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63(block: InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63.Builder.() -> Unit): InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63 = InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63.build(block)
