package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesInProgressEvent/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesInProgressEvent/allOf/1
 */
@Serializable(with = InlineOpenResponsesInProgressEventAllOf2Xbfe13091.Serializer::class)
public class InlineOpenResponsesInProgressEventAllOf2Xbfe13091(
  public val response: OpenResponsesResult? = null,
) {
  public class Builder {
    public var response: OpenResponsesResult? = null

    public fun build(): InlineOpenResponsesInProgressEventAllOf2Xbfe13091 = InlineOpenResponsesInProgressEventAllOf2Xbfe13091(
      response = response,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenResponsesInProgressEventAllOf2Xbfe13091 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenResponsesInProgressEventAllOf2Xbfe13091> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenResponsesInProgressEventAllOf2Xbfe13091 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenResponsesInProgressEventAllOf2Xbfe13091")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenResponsesInProgressEventAllOf2Xbfe13091 must be a JSON object")
      return InlineOpenResponsesInProgressEventAllOf2Xbfe13091(
        response = rawObject["response"]?.let { json.decodeFromJsonElement<OpenResponsesResult>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenResponsesInProgressEventAllOf2Xbfe13091) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenResponsesInProgressEventAllOf2Xbfe13091")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.response?.let { put("response", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenResponsesInProgressEventAllOf2Xbfe13091(block: InlineOpenResponsesInProgressEventAllOf2Xbfe13091.Builder.() -> Unit): InlineOpenResponsesInProgressEventAllOf2Xbfe13091 = InlineOpenResponsesInProgressEventAllOf2Xbfe13091.build(block)
