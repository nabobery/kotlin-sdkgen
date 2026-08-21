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
 * Enable or disable GitHub Advanced Security for the repository.
 *
 * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
 *
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/advanced_security
 */
@Serializable(with = InlineSecurityAndAnalysisAdvancedSecurityX6054040d.Serializer::class)
public class InlineSecurityAndAnalysisAdvancedSecurityX6054040d(
  public val status: InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5? = null

    public fun build(): InlineSecurityAndAnalysisAdvancedSecurityX6054040d = InlineSecurityAndAnalysisAdvancedSecurityX6054040d(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisAdvancedSecurityX6054040d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSecurityAndAnalysisAdvancedSecurityX6054040d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisAdvancedSecurityX6054040d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisAdvancedSecurityX6054040d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisAdvancedSecurityX6054040d must be a JSON object")
      return InlineSecurityAndAnalysisAdvancedSecurityX6054040d(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisAdvancedSecurityStatusX30d610a5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisAdvancedSecurityX6054040d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisAdvancedSecurityX6054040d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisAdvancedSecurityX6054040d(block: InlineSecurityAndAnalysisAdvancedSecurityX6054040d.Builder.() -> Unit): InlineSecurityAndAnalysisAdvancedSecurityX6054040d = InlineSecurityAndAnalysisAdvancedSecurityX6054040d.build(block)
