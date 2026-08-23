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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1inbound_transfers~1{id}~1fail/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1treasury~1inbound_transfers~1{id}~1fail/post/requestBody/cont
 * ent/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb.Serializer::class)
public class InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb(
  expand: List<String>? = null,
  /**
   * Details about a failed InboundTransfer.
   */
  public val failureDetails:
      InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4? = null,
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
     * Details about a failed InboundTransfer.
     */
    public var failureDetails: InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4?
        = null

    public fun build(): InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb = InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb(
      expand = expand,
      failureDetails = failureDetails,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb must be a JSON object")
      return InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb(
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        failureDetails = rawObject["failure_details"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersTreasur1a75PostRequestFormFailureDetailsXd60cfda4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.failureDetails?.let { put("failure_details", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb(block: InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb.Builder.() -> Unit): InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb = InlineV1TestHelpersTreasuryInboundTransfersFailPostRequestFormX83d91ffb.build(block)
