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
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}~1accept/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1quotes~1{quote}~1accept/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema
 */
@Serializable(with = InlineV1QuotesAcceptPostRequestFormXaa798ec4.Serializer::class)
public class InlineV1QuotesAcceptPostRequestFormXaa798ec4(
  expand: List<String>? = null,
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

    public fun build(): InlineV1QuotesAcceptPostRequestFormXaa798ec4 = InlineV1QuotesAcceptPostRequestFormXaa798ec4(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1QuotesAcceptPostRequestFormXaa798ec4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1QuotesAcceptPostRequestFormXaa798ec4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1QuotesAcceptPostRequestFormXaa798ec4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1QuotesAcceptPostRequestFormXaa798ec4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1QuotesAcceptPostRequestFormXaa798ec4 must be a JSON object")
      return InlineV1QuotesAcceptPostRequestFormXaa798ec4(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1QuotesAcceptPostRequestFormXaa798ec4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1QuotesAcceptPostRequestFormXaa798ec4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1QuotesAcceptPostRequestFormXaa798ec4(block: InlineV1QuotesAcceptPostRequestFormXaa798ec4.Builder.() -> Unit): InlineV1QuotesAcceptPostRequestFormXaa798ec4 = InlineV1QuotesAcceptPostRequestFormXaa798ec4.build(block)
