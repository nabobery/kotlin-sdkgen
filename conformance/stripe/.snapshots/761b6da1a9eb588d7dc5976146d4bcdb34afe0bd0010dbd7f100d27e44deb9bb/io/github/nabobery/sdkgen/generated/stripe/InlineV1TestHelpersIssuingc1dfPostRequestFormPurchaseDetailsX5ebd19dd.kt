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
 * Additional purchase information that is optionally provided by the merchant.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_unlinked_refund/post/requestBod
 * y/content/application~1x-www-form-urlencoded/schema/properties/purchase_details
 */
@Serializable(with = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd.Serializer::class)
public class InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd(
  public val fleet:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667? = null,
  public val flight:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFlightXc1c28ba3? = null,
  public val fuel:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9? = null,
  public val lodging:
      InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsLodgingXc7692b05? = null,
  receipt: List<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsReceiptItemXf25c7b43>? = null,
  public val reference: String? = null,
) {
  public val receipt:
      List<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsReceiptItemXf25c7b43>? =
      receipt?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var fleet: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667? =
        null

    public var flight: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFlightXc1c28ba3?
        = null

    public var fuel: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9? =
        null

    public var lodging:
        InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsLodgingXc7692b05? = null

    private var receiptValue:
        List<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsReceiptItemXf25c7b43>? =
        null

    public var receipt:
        List<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsReceiptItemXf25c7b43>?
      get() = receiptValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        receiptValue = value?.let { collection0 -> collection0.toList() }
      }

    public var reference: String? = null

    public fun build(): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd(
      fleet = fleet,
      flight = flight,
      fuel = fuel,
      lodging = lodging,
      receipt = receipt,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd must be a JSON object")
      return InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd(
        fleet = rawObject["fleet"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFleetX76dc7667>(it) },
        flight = rawObject["flight"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFlightXc1c28ba3>(it) },
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsFuelXcc61a8f9>(it) },
        lodging = rawObject["lodging"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsLodgingXc7692b05>(it) },
        receipt = rawObject["receipt"]?.let { json.decodeFromJsonElement<List<InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsReceiptItemXf25c7b43>>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fleet?.let { put("fleet", json.encodeToJsonElement(it)) }
        value.flight?.let { put("flight", json.encodeToJsonElement(it)) }
        value.fuel?.let { put("fuel", json.encodeToJsonElement(it)) }
        value.lodging?.let { put("lodging", json.encodeToJsonElement(it)) }
        value.receipt?.let { put("receipt", json.encodeToJsonElement(it)) }
        value.reference?.let { put("reference", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd(block: InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd.Builder.() -> Unit): InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd = InlineV1TestHelpersIssuingc1dfPostRequestFormPurchaseDetailsX5ebd19dd.build(block)
