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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/code_security.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis/properties/code_security
 */
@Serializable(with = InlineSecurityAndAnalysisCodeSecurityX778175bb.Serializer::class)
public class InlineSecurityAndAnalysisCodeSecurityX778175bb(
  public val status: InlineSecurityAndAnalysisCodeSecurityStatusX173ec206? = null,
) {
  public class Builder {
    public var status: InlineSecurityAndAnalysisCodeSecurityStatusX173ec206? = null

    public fun build(): InlineSecurityAndAnalysisCodeSecurityX778175bb = InlineSecurityAndAnalysisCodeSecurityX778175bb(
      status = status,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSecurityAndAnalysisCodeSecurityX778175bb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSecurityAndAnalysisCodeSecurityX778175bb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSecurityAndAnalysisCodeSecurityX778175bb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSecurityAndAnalysisCodeSecurityX778175bb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSecurityAndAnalysisCodeSecurityX778175bb must be a JSON object")
      return InlineSecurityAndAnalysisCodeSecurityX778175bb(
        status = rawObject["status"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisCodeSecurityStatusX173ec206>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSecurityAndAnalysisCodeSecurityX778175bb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSecurityAndAnalysisCodeSecurityX778175bb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.status?.let { put("status", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSecurityAndAnalysisCodeSecurityX778175bb(block: InlineSecurityAndAnalysisCodeSecurityX778175bb.Builder.() -> Unit): InlineSecurityAndAnalysisCodeSecurityX778175bb = InlineSecurityAndAnalysisCodeSecurityX778175bb.build(block)
