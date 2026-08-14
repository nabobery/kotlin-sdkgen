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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}~1return/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1outbound_transfers~1{outbound_transfer}~1return/pos
 * t/requestBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e.Serializer::class)
public class InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e(
  expand: List<String>? = null,
  /**
   * Details about a returned OutboundTransfer.
   */
  public val returnedDetails:
      InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918? = null,
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
     * Details about a returned OutboundTransfer.
     */
    public var returnedDetails:
        InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918? = null

    public fun build(): InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e = InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e(
      expand = expand,
      returnedDetails = returnedDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e must be a JSON object")
      return InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        returnedDetails = rawObject["returned_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasurfc89PostRequestFormReturnedDetailsX384b3918>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.returnedDetails?.let { put("returned_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e(block: InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e.Builder.() -> Unit): InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e = InlineV1TestHelpersTreasuryOutboundTransfersReturnPostRequestFormXb0e7593e.build(block)
