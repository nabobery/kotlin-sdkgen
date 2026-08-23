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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1transactions~1create_force_capture/post/requestBody/
 * content/application~1x-www-form-urlencoded/schema/properties/purchase_details
 */
@Serializable(with = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d.Serializer::class)
public class InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d(
  public val fleet:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b? = null,
  public val flight:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFlightX88bcad10? = null,
  public val fuel:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e? = null,
  public val lodging:
      InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8? = null,
  receipt: List<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e>? = null,
  public val reference: String? = null,
) {
  public val receipt:
      List<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e>? =
      receipt?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var fleet: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b? =
        null

    public var flight: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFlightX88bcad10?
        = null

    public var fuel: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e? =
        null

    public var lodging:
        InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8? = null

    private var receiptValue:
        List<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e>? =
        null

    public var receipt:
        List<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e>?
      get() = receiptValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        receiptValue = value?.let { collection0 -> collection0.toList() }
      }

    public var reference: String? = null

    public fun build(): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d(
      fleet = fleet,
      flight = flight,
      fuel = fuel,
      lodging = lodging,
      receipt = receipt,
      reference = reference,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d must be a JSON object")
      return InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d(
        fleet = rawObject["fleet"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFleetXafb0c49b>(it) },
        flight = rawObject["flight"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFlightX88bcad10>(it) },
        fuel = rawObject["fuel"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsFuelX2912229e>(it) },
        lodging = rawObject["lodging"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsLodgingX3d6752d8>(it) },
        receipt = rawObject["receipt"]?.let { json.decodeFromJsonElement<List<InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsReceiptItemX2cc6114e>>(it) },
        reference = rawObject["reference"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d")
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

public fun inlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d(block: InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d.Builder.() -> Unit): InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d = InlineV1TestHelpersIssuing6178PostRequestFormPurchaseDetailsX0e102d0d.build(block)
