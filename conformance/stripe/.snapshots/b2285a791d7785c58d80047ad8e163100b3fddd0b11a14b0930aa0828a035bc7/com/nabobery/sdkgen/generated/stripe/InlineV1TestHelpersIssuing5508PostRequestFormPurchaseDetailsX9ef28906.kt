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
 * Additional purchase information that is optionally provided by the merchant.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1capture/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/purchase_details
 */
@Serializable(with = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906.Serializer::class)
public class InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906(
  public val fleet:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd? = null,
  public val flight:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9? = null,
  public val fuel:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4? = null,
  public val lodging:
      InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsLodgingX4f0424cd? = null,
  receipt: List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsReceiptItemXbbc72993>? = null,
  public val reference: String? = null,
) {
  public val receipt:
      List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsReceiptItemXbbc72993>? =
      receipt?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var fleet: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd? =
        null

    public var flight: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9?
        = null

    public var fuel: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4? =
        null

    public var lodging:
        InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsLodgingX4f0424cd? = null

    private var receiptValue:
        List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsReceiptItemXbbc72993>? =
        null

    public var receipt:
        List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsReceiptItemXbbc72993>?
      get() = receiptValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        receiptValue = value?.let { collection0 -> collection0.toList() }
      }

    public var reference: String? = null

    public fun build(): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906 = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906(
      fleet = fleet,
      flight = flight,
      fuel = fuel,
      lodging = lodging,
      receipt = receipt,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906 must be a JSON object")
      return InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906(
        fleet = rawObject["fleet"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFleetX49190ddd>(it) },
        flight = rawObject["flight"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFlightXa8888ae9>(it) },
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsFuelX95e3e8a4>(it) },
        lodging = rawObject["lodging"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsLodgingX4f0424cd>(it) },
        receipt = rawObject["receipt"]?.let { json.decodeFromJsonElement<List<InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsReceiptItemXbbc72993>>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906")
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

public fun inlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906(block: InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906.Builder.() -> Unit): InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906 = InlineV1TestHelpersIssuing5508PostRequestFormPurchaseDetailsX9ef28906.build(block)
