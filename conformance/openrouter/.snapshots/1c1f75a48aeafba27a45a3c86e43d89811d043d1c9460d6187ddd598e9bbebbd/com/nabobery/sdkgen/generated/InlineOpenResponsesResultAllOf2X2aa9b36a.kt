package com.nabobery.sdkgen.generated

import kotlin.String
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesResult/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenResponsesResult/allOf/1
 */
@Serializable(with = InlineOpenResponsesResultAllOf2X2aa9b36a.Serializer::class)
public class InlineOpenResponsesResultAllOf2X2aa9b36a(
  public val errorType: ApiErrorType? = null,
  public val openrouterMetadata: OpenRouterMetadata? = null,
  output: List<OutputItems>? = null,
  public val serviceTier: String? = null,
  public val text: TextExtendedConfig? = null,
  public val usage: Usage? = null,
) {
  public val output: List<OutputItems>? = output?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var errorType: ApiErrorType? = null

    public var openrouterMetadata: OpenRouterMetadata? = null

    private var outputValue: List<OutputItems>? = null

    public var output: List<OutputItems>?
      get() = outputValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        outputValue = value?.let { collection0 -> collection0.toList() }
      }

    public var serviceTier: String? = null

    public var text: TextExtendedConfig? = null

    public var usage: Usage? = null

    public fun build(): InlineOpenResponsesResultAllOf2X2aa9b36a = InlineOpenResponsesResultAllOf2X2aa9b36a(
      errorType = errorType,
      openrouterMetadata = openrouterMetadata,
      output = output,
      serviceTier = serviceTier,
      text = text,
      usage = usage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOpenResponsesResultAllOf2X2aa9b36a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOpenResponsesResultAllOf2X2aa9b36a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenResponsesResultAllOf2X2aa9b36a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenResponsesResultAllOf2X2aa9b36a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOpenResponsesResultAllOf2X2aa9b36a must be a JSON object")
      return InlineOpenResponsesResultAllOf2X2aa9b36a(
        errorType = rawObject["error_type"]?.let { json.decodeFromJsonElement<ApiErrorType>(it) },
        openrouterMetadata = rawObject["openrouter_metadata"]?.let { json.decodeFromJsonElement<OpenRouterMetadata>(it) },
        output = rawObject["output"]?.let { json.decodeFromJsonElement<List<OutputItems>>(it) },
        serviceTier = rawObject["service_tier"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<TextExtendedConfig>(it) },
        usage = rawObject["usage"]?.let { json.decodeFromJsonElement<Usage>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenResponsesResultAllOf2X2aa9b36a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOpenResponsesResultAllOf2X2aa9b36a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.errorType?.let { put("error_type", json.encodeToJsonElement(it)) }
        value.openrouterMetadata?.let { put("openrouter_metadata", json.encodeToJsonElement(it)) }
        value.output?.let { put("output", json.encodeToJsonElement(it)) }
        value.serviceTier?.let { put("service_tier", it) }
        value.text?.let { put("text", json.encodeToJsonElement(it)) }
        value.usage?.let { put("usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOpenResponsesResultAllOf2X2aa9b36a(block: InlineOpenResponsesResultAllOf2X2aa9b36a.Builder.() -> Unit): InlineOpenResponsesResultAllOf2X2aa9b36a = InlineOpenResponsesResultAllOf2X2aa9b36a.build(block)
