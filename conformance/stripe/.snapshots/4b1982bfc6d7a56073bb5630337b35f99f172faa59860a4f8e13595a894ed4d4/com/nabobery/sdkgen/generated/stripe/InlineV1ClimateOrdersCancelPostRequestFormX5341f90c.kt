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
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}~1cancel/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}~1cancel/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema
 */
@Serializable(with = InlineV1ClimateOrdersCancelPostRequestFormX5341f90c.Serializer::class)
public class InlineV1ClimateOrdersCancelPostRequestFormX5341f90c(
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

    public fun build(): InlineV1ClimateOrdersCancelPostRequestFormX5341f90c = InlineV1ClimateOrdersCancelPostRequestFormX5341f90c(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ClimateOrdersCancelPostRequestFormX5341f90c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ClimateOrdersCancelPostRequestFormX5341f90c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersCancelPostRequestFormX5341f90c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersCancelPostRequestFormX5341f90c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ClimateOrdersCancelPostRequestFormX5341f90c must be a JSON object")
      return InlineV1ClimateOrdersCancelPostRequestFormX5341f90c(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersCancelPostRequestFormX5341f90c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ClimateOrdersCancelPostRequestFormX5341f90c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ClimateOrdersCancelPostRequestFormX5341f90c(block: InlineV1ClimateOrdersCancelPostRequestFormX5341f90c.Builder.() -> Unit): InlineV1ClimateOrdersCancelPostRequestFormX5341f90c = InlineV1ClimateOrdersCancelPostRequestFormX5341f90c.build(block)
