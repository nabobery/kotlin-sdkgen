package com.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersPostRequestFormXac4d3af4.Serializer::class)
public class InlineV1TerminalReadersPostRequestFormXac4d3af4(
  expand: List<String>? = null,
  /**
   * The new label of the reader.
   */
  public val label: InlineV1TerminalReadersPostRequestFormLabelX28f772fd? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1TerminalReadersPostRequestFormMetadataXe4eddccb? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The new label of the reader.
     */
    public var label: InlineV1TerminalReadersPostRequestFormLabelX28f772fd? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1TerminalReadersPostRequestFormMetadataXe4eddccb? = null

    public fun build(): InlineV1TerminalReadersPostRequestFormXac4d3af4 = InlineV1TerminalReadersPostRequestFormXac4d3af4(
      expand = expand,
      label = label,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersPostRequestFormXac4d3af4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersPostRequestFormXac4d3af4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersPostRequestFormXac4d3af4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersPostRequestFormXac4d3af4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersPostRequestFormXac4d3af4 must be a JSON object")
      return InlineV1TerminalReadersPostRequestFormXac4d3af4(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        label = rawObject["label"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersPostRequestFormLabelX28f772fd>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersPostRequestFormMetadataXe4eddccb>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersPostRequestFormXac4d3af4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersPostRequestFormXac4d3af4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.label?.let { put("label", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersPostRequestFormXac4d3af4(block: InlineV1TerminalReadersPostRequestFormXac4d3af4.Builder.() -> Unit): InlineV1TerminalReadersPostRequestFormXac4d3af4 = InlineV1TerminalReadersPostRequestFormXac4d3af4.build(block)
