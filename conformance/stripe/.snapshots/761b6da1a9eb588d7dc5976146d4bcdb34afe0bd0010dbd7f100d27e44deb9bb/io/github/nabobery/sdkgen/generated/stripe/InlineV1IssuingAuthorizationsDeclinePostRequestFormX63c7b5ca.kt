package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1decline/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1authorizations~1{authorization}~1decline/post/requestBody/content/
 * application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca.Serializer::class)
public class InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca(
  expand: List<String>? = null,
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
   * for storing additional information about the object in a structured format. Individual keys can be unset by posting
   * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
   */
  public val metadata: InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca? = null,
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
    public var metadata: InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca? =
        null

    public fun build(): InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca = InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca(
      expand = expand,
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca must be a JSON object")
      return InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1IssuingAuthorizationsDeclinePostRequestFormMetadataX10fdf7ca>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca(block: InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca.Builder.() -> Unit): InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca = InlineV1IssuingAuthorizationsDeclinePostRequestFormX63c7b5ca.build(block)
