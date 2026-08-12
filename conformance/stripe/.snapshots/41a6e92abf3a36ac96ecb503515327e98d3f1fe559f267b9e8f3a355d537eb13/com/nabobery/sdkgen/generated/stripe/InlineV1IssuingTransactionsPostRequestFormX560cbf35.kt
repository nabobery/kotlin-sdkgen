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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions~1{transaction}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1transactions~1{transaction}/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingTransactionsPostRequestFormX560cbf35.Serializer::class)
public class InlineV1IssuingTransactionsPostRequestFormX560cbf35(
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d? = null,
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
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d? = null

    public fun build(): InlineV1IssuingTransactionsPostRequestFormX560cbf35 = InlineV1IssuingTransactionsPostRequestFormX560cbf35(
      expand = expand,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingTransactionsPostRequestFormX560cbf35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingTransactionsPostRequestFormX560cbf35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingTransactionsPostRequestFormX560cbf35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingTransactionsPostRequestFormX560cbf35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingTransactionsPostRequestFormX560cbf35 must be a JSON object")
      return InlineV1IssuingTransactionsPostRequestFormX560cbf35(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1IssuingTransactionsPostRequestFormMetadataX51b8c14d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTransactionsPostRequestFormX560cbf35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingTransactionsPostRequestFormX560cbf35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingTransactionsPostRequestFormX560cbf35(block: InlineV1IssuingTransactionsPostRequestFormX560cbf35.Builder.() -> Unit): InlineV1IssuingTransactionsPostRequestFormX560cbf35 = InlineV1IssuingTransactionsPostRequestFormX560cbf35.build(block)
