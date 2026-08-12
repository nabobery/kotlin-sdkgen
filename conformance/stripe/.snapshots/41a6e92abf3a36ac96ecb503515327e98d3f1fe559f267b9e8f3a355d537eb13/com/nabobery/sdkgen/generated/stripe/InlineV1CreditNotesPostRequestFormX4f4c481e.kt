package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1{id}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1{id}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema
 */
@Serializable(with = InlineV1CreditNotesPostRequestFormX4f4c481e.Serializer::class)
public class InlineV1CreditNotesPostRequestFormX4f4c481e(
  expand: List<String>? = null,
  /**
   * Credit note memo.
   */
  public val memo: String? = null,
  metadata: Map<String, String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

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
     * Credit note memo.
     */
    public var memo: String? = null

    private var metadataValue: Map<String, String>? = null

    /**
     * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be
     * useful for storing additional information about the object in a structured format. Individual keys can be unset
     * by posting an empty value to them. All keys can be unset by posting an empty value to `metadata`.
     */
    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public fun build(): InlineV1CreditNotesPostRequestFormX4f4c481e = InlineV1CreditNotesPostRequestFormX4f4c481e(
      expand = expand,
      memo = memo,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPostRequestFormX4f4c481e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPostRequestFormX4f4c481e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPostRequestFormX4f4c481e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPostRequestFormX4f4c481e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPostRequestFormX4f4c481e must be a JSON object")
      return InlineV1CreditNotesPostRequestFormX4f4c481e(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        memo = rawObject["memo"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPostRequestFormX4f4c481e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPostRequestFormX4f4c481e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.memo?.let { put("memo", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPostRequestFormX4f4c481e(block: InlineV1CreditNotesPostRequestFormX4f4c481e.Builder.() -> Unit): InlineV1CreditNotesPostRequestFormX4f4c481e = InlineV1CreditNotesPostRequestFormX4f4c481e.build(block)
