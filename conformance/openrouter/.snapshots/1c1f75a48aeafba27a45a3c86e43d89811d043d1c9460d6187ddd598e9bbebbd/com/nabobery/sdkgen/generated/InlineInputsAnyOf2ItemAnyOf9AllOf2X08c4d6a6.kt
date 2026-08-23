package com.nabobery.sdkgen.generated

import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/8/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/Inputs/anyOf/1/items/anyOf/8/allOf/1
 */
@Serializable(with = InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6.Serializer::class)
public class InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6(
  summary: List<ReasoningSummaryText>? = null,
) {
  public val summary: List<ReasoningSummaryText>? =
      summary?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var summaryValue: List<ReasoningSummaryText>? = null

    public var summary: List<ReasoningSummaryText>?
      get() = summaryValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        summaryValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6 = InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6(
      summary = summary,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6 must be a JSON object")
      return InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6(
        summary = rawObject["summary"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<ReasoningSummaryText>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.summary?.let { put("summary", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6(block: InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6.Builder.() -> Unit): InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6 = InlineInputsAnyOf2ItemAnyOf9AllOf2X08c4d6a6.build(block)
