package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad,
}

public sealed class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/payment_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/transfer_data/properties/payment_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad) add(InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Branch.InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61NoMatchException("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61(element: JsonElement): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad>()
  return InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXd9062f61Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad = matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad) add("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad: value does not match InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2X0b4176ad")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
