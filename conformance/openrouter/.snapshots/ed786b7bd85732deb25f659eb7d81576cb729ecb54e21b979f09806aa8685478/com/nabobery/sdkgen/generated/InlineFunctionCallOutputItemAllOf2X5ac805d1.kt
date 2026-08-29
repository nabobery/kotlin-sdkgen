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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/FunctionCallOutputItem/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/FunctionCallOutputItem/allOf/1
 */
@Serializable(with = InlineFunctionCallOutputItemAllOf2X5ac805d1.Serializer::class)
public class InlineFunctionCallOutputItemAllOf2X5ac805d1(
  public val output: InlineFunctionCallOutputItemAllOf2OutputX846f1c28? = null,
) {
  public class Builder {
    public var output: InlineFunctionCallOutputItemAllOf2OutputX846f1c28? = null

    public fun build(): InlineFunctionCallOutputItemAllOf2X5ac805d1 = InlineFunctionCallOutputItemAllOf2X5ac805d1(
      output = output,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFunctionCallOutputItemAllOf2X5ac805d1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFunctionCallOutputItemAllOf2X5ac805d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFunctionCallOutputItemAllOf2X5ac805d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFunctionCallOutputItemAllOf2X5ac805d1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFunctionCallOutputItemAllOf2X5ac805d1 must be a JSON object")
      return InlineFunctionCallOutputItemAllOf2X5ac805d1(
        output = rawObject["output"]?.let { json.decodeFromJsonElement<InlineFunctionCallOutputItemAllOf2OutputX846f1c28>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFunctionCallOutputItemAllOf2X5ac805d1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFunctionCallOutputItemAllOf2X5ac805d1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.output?.let { put("output", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFunctionCallOutputItemAllOf2X5ac805d1(block: InlineFunctionCallOutputItemAllOf2X5ac805d1.Builder.() -> Unit): InlineFunctionCallOutputItemAllOf2X5ac805d1 = InlineFunctionCallOutputItemAllOf2X5ac805d1.build(block)
