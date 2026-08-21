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

public enum class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118,
}

public sealed class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/properties/payment_data/properties/metadata.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/transfer_data/properties/payment_data/properties/metadata
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118:
      InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118) add(InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bBranch.InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bNoMatchException("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835b(element: JsonElement): InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118>()
  return InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataMetadataXc9df835bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118 = matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118) add("InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118: value does not match InlineV1PaymentIntentsPostRequestFormTransferDataPaymentDataAnyOf2Xd18ff118")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
