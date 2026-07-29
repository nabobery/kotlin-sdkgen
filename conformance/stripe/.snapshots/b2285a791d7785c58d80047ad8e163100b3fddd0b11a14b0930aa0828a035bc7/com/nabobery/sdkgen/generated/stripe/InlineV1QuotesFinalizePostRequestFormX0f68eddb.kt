package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}~1finalize/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}~1finalize/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema
 */
@Serializable(with = InlineV1QuotesFinalizePostRequestFormX0f68eddb.Serializer::class)
public class InlineV1QuotesFinalizePostRequestFormX0f68eddb(
  expand: List<String>? = null,
  /**
   * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
   * the Unix epoch.
   */
  public val expiresAt: Int? = null,
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
     * A future timestamp on which the quote will be canceled if in `open` or `draft` status. Measured in seconds since
     * the Unix epoch.
     */
    public var expiresAt: Int? = null

    public fun build(): InlineV1QuotesFinalizePostRequestFormX0f68eddb = InlineV1QuotesFinalizePostRequestFormX0f68eddb(
      expand = expand,
      expiresAt = expiresAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesFinalizePostRequestFormX0f68eddb = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesFinalizePostRequestFormX0f68eddb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesFinalizePostRequestFormX0f68eddb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesFinalizePostRequestFormX0f68eddb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesFinalizePostRequestFormX0f68eddb must be a JSON object")
      return InlineV1QuotesFinalizePostRequestFormX0f68eddb(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesFinalizePostRequestFormX0f68eddb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesFinalizePostRequestFormX0f68eddb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesFinalizePostRequestFormX0f68eddb(block: InlineV1QuotesFinalizePostRequestFormX0f68eddb.Builder.() -> Unit): InlineV1QuotesFinalizePostRequestFormX0f68eddb = InlineV1QuotesFinalizePostRequestFormX0f68eddb.build(block)
