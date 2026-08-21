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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}~1return/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_payments~1{id}~1return/post/requestBody/co
 * ntent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d.Serializer::class)
public class InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d(
  expand: List<String>? = null,
  /**
   * Optional hash to set the return code.
   */
  public val returnedDetails:
      InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3? = null,
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
     * Optional hash to set the return code.
     */
    public var returnedDetails:
        InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3? = null

    public fun build(): InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d = InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d(
      expand = expand,
      returnedDetails = returnedDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d must be a JSON object")
      return InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        returnedDetails = rawObject["returned_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasur931cPostRequestFormReturnedDetailsX9c8d26d3>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.returnedDetails?.let { put("returned_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d(block: InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d.Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d = InlineV1TestHelpersTreasuryOutboundPaymentsReturnPostRequestFormXb0417a1d.build(block)
