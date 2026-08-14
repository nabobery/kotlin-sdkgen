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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1cards~1{card}~1shipping~1ship/post/requestBody/conte
 * nt/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1cards~1{card}~1shipping~1ship/post/requestBody/conte
 * nt/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c.Serializer::class)
public class InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c(
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

    public fun build(): InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c = InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c(
      expand = expand,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c must be a JSON object")
      return InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c(block: InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c.Builder.() -> Unit): InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c = InlineV1TestHelpersIssuingCardsShippingShipPostRequestFormX2cec938c.build(block)
